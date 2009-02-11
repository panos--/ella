// $ANTLR 3.1.1 SQLScriptWalker.g 2009-02-11 22:05:49

	package org.unbunt.sqlscript;

	import java.util.Observer;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.ArrayList;
	import java.util.Map;
	import java.util.HashMap;

	import org.unbunt.sqlscript.lang.*;
	import org.unbunt.sqlscript.statement.*;
	import org.unbunt.sqlscript.support.*;
	import org.unbunt.sqlscript.exception.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SQLScriptWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "QQUOT", "SQUOT", "STRING_CONTENT", "EMBEDDED_VARIABLE", "DQUOT", "BTICK", "QQUOT_START", "QQUOT_END", "SQUOT_FRAG", "QQUOT_DELIM", "SSTRING_CONTENT", "DSTRING_CONTENT", "BTSTRING_CONTENT", "QSTRING_CONTENT", "ATSIGN", "VARNAME", "WORD_CHAR", "BLOCK", "EVAL_CMD", "EVAL_ARG", "SQL_CMD", "ANNOT", "ANNOT_ARG", "PARAM_NAME", "PARAM_VALUE", "DECLARE_ASSIGN", "DECLARE", "ASSIGN", "FUNC_DEF", "FUNC_CALL", "ARGS", "ARG_EXPR", "ARG_TRUE", "ARG_FALSE", "IF", "IF_BLOCK", "ELSE_BLOCK", "TRY", "CATCH", "FINALLY", "THROW", "RETURN", "EXIT", "COND_EXPR", "COND_AND", "COND_OR", "COMP_EQ", "NOT", "TRUE", "FALSE", "OBJ", "SLOT", "SLOT_CALL", "SLOT_GET", "IDX_CALL", "IDX_GET", "INDEX", "CALL", "THIS", "NEW", "SEP", "LCURLY", "RCURLY", "BACKSLASH", "EQUALS", "KW_SQL", "WORD", "VARIABLE", "SQL_SPECIAL_CHAR", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "DOUBLE_BACKSLASH", "OP_DEFINE", "OP_AND", "OP_OR", "OP_EQ", "EXCLAM", "QUESTION", "COLON", "DOT", "COMMA", "KW_VAR", "KW_FUN", "KW_IF", "KW_ELSE", "KW_TRY", "KW_CATCH", "KW_FINALLY", "KW_THROW", "KW_RETURN", "KW_EXIT", "KW_NEW", "KW_THIS", "IDENTIFIER", "KW_TRUE", "KW_FALSE", "STR_SQUOT", "STR_DQUOT", "STR_BTICK", "STR_QQUOT", "WS", "NL", "COMMENT", "LINE_COMMENT"
    };
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

    // delegates
    // delegators

    protected static class Block_scope {
        StatementContainer block;
    }
    protected Stack Block_stack = new Stack();
    protected static class Scope_scope {
        Scope scope;
    }
    protected Stack Scope_stack = new Stack();


        public SQLScriptWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public SQLScriptWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return SQLScriptWalker.tokenNames; }
    public String getGrammarFileName() { return "SQLScriptWalker.g"; }


    	protected final static int POS_RHS = 1;
    	protected final static int POS_LHS = 2;

    	public Block walk() throws RecognitionException, SQLScriptRuntimeException, RuntimeException {
    		return parse();
    	}

    	public Block parse() throws RecognitionException, SQLScriptRuntimeException, RuntimeException {
    		return script();
    	}
    	
    	protected boolean verbose = false;

    	private void print(String msg) {
    		if (!verbose) {
    			return;
    		}
    		System.out.println(msg);
    	}
    	
    	public static String extractString(String s) {
    		return s.substring(1, s.length() - 1).replace("''", "'");
    	}



    // $ANTLR start "script"
    // SQLScriptWalker.g:58:1: script returns [ Block value ] : ( statement )* ;
    public final Block script() throws RecognitionException {
        Block_stack.push(new Block_scope());
        Scope_stack.push(new Scope_scope());

        Block value = null;


        	((Scope_scope)Scope_stack.peek()).scope = new Scope();
        	((Block_scope)Block_stack.peek()).block = new Block(((Scope_scope)Scope_stack.peek()).scope);

        try {
            // SQLScriptWalker.g:67:2: ( ( statement )* )
            // SQLScriptWalker.g:67:4: ( statement )*
            {
            // SQLScriptWalker.g:67:4: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRING||(LA1_0>=BLOCK && LA1_0<=EVAL_CMD)||LA1_0==SQL_CMD||(LA1_0>=DECLARE_ASSIGN && LA1_0<=FUNC_CALL)||LA1_0==IF||LA1_0==TRY||(LA1_0>=THROW && LA1_0<=SLOT)||(LA1_0>=INDEX && LA1_0<=NEW)||LA1_0==VARIABLE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // SQLScriptWalker.g:67:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_script81);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	value = (Block)((Block_scope)Block_stack.peek()).block;

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            Block_stack.pop();
            Scope_stack.pop();

        }
        return value;
    }
    // $ANTLR end "script"


    // $ANTLR start "statement"
    // SQLScriptWalker.g:70:1: statement : ( sqlStmt | evalStmt | scriptStmt | block );
    public final void statement() throws RecognitionException {
        try {
            // SQLScriptWalker.g:71:2: ( sqlStmt | evalStmt | scriptStmt | block )
            int alt2=4;
            switch ( input.LA(1) ) {
            case SQL_CMD:
                {
                alt2=1;
                }
                break;
            case EVAL_CMD:
                {
                alt2=2;
                }
                break;
            case STRING:
            case DECLARE_ASSIGN:
            case DECLARE:
            case ASSIGN:
            case FUNC_DEF:
            case FUNC_CALL:
            case IF:
            case TRY:
            case THROW:
            case RETURN:
            case EXIT:
            case COND_EXPR:
            case COND_AND:
            case COND_OR:
            case COMP_EQ:
            case NOT:
            case TRUE:
            case FALSE:
            case OBJ:
            case SLOT:
            case INDEX:
            case CALL:
            case THIS:
            case NEW:
            case VARIABLE:
                {
                alt2=3;
                }
                break;
            case BLOCK:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // SQLScriptWalker.g:71:4: sqlStmt
                    {
                    pushFollow(FOLLOW_sqlStmt_in_statement93);
                    sqlStmt();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // SQLScriptWalker.g:72:4: evalStmt
                    {
                    pushFollow(FOLLOW_evalStmt_in_statement98);
                    evalStmt();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // SQLScriptWalker.g:73:4: scriptStmt
                    {
                    pushFollow(FOLLOW_scriptStmt_in_statement103);
                    scriptStmt();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // SQLScriptWalker.g:74:4: block
                    {
                    pushFollow(FOLLOW_block_in_statement108);
                    block();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "statement"


    // $ANTLR start "block"
    // SQLScriptWalker.g:77:1: block returns [ Statement value ] : blk= blockStmt ;
    public final Statement block() throws RecognitionException {
        Statement value = null;

        Statement blk = null;


        try {
            // SQLScriptWalker.g:78:2: (blk= blockStmt )
            // SQLScriptWalker.g:78:4: blk= blockStmt
            {
            pushFollow(FOLLOW_blockStmt_in_block125);
            blk=blockStmt();

            state._fsp--;

             ((Block_scope)Block_stack.peek()).block.addStatement(blk); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "block"


    // $ANTLR start "blockStmt"
    // SQLScriptWalker.g:83:1: blockStmt returns [ Statement value ] : blk= blockStmt_ ;
    public final Statement blockStmt() throws RecognitionException {
        Scope_stack.push(new Scope_scope());

        Statement value = null;

        Statement blk = null;


         ((Scope_scope)Scope_stack.peek()).scope = new Scope(((Scope_scope)Scope_stack.elementAt(Scope_stack.size()-1-1)).scope); 
        try {
            // SQLScriptWalker.g:86:2: (blk= blockStmt_ )
            // SQLScriptWalker.g:86:4: blk= blockStmt_
            {
            pushFollow(FOLLOW_blockStmt__in_blockStmt156);
            blk=blockStmt_();

            state._fsp--;

             value = blk; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            Scope_stack.pop();

        }
        return value;
    }
    // $ANTLR end "blockStmt"


    // $ANTLR start "blockStmt_"
    // SQLScriptWalker.g:89:1: blockStmt_ returns [ Statement value ] : ^( BLOCK ( statement )* ) ;
    public final Statement blockStmt_() throws RecognitionException {
        Block_stack.push(new Block_scope());

        Statement value = null;


        	((Block_scope)Block_stack.peek()).block = new Block(((Scope_scope)Scope_stack.peek()).scope);
        	value = ((Block_scope)Block_stack.peek()).block;

        try {
            // SQLScriptWalker.g:95:2: ( ^( BLOCK ( statement )* ) )
            // SQLScriptWalker.g:95:4: ^( BLOCK ( statement )* )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_blockStmt_184); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // SQLScriptWalker.g:95:12: ( statement )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==STRING||(LA3_0>=BLOCK && LA3_0<=EVAL_CMD)||LA3_0==SQL_CMD||(LA3_0>=DECLARE_ASSIGN && LA3_0<=FUNC_CALL)||LA3_0==IF||LA3_0==TRY||(LA3_0>=THROW && LA3_0<=SLOT)||(LA3_0>=INDEX && LA3_0<=NEW)||LA3_0==VARIABLE) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // SQLScriptWalker.g:95:12: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_blockStmt_186);
                	    statement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop3;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            Block_stack.pop();

        }
        return value;
    }
    // $ANTLR end "blockStmt_"


    // $ANTLR start "evalStmt"
    // SQLScriptWalker.g:98:1: evalStmt : ^( EVAL_CMD evcmd= evalCommand (param= evalParam )* (annot= annotation )* ) ;
    public final void evalStmt() throws RecognitionException {
        String evcmd = null;

        Parameter param = null;

        AnnotationCommand annot = null;


         EvalCommand cmd = new EvalCommand(); 
        try {
            // SQLScriptWalker.g:101:2: ( ^( EVAL_CMD evcmd= evalCommand (param= evalParam )* (annot= annotation )* ) )
            // SQLScriptWalker.g:101:4: ^( EVAL_CMD evcmd= evalCommand (param= evalParam )* (annot= annotation )* )
            {
            match(input,EVAL_CMD,FOLLOW_EVAL_CMD_in_evalStmt210); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_evalCommand_in_evalStmt217);
            evcmd=evalCommand();

            state._fsp--;

             cmd.setName(evcmd); 
            // SQLScriptWalker.g:103:4: (param= evalParam )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==EVAL_ARG) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // SQLScriptWalker.g:103:5: param= evalParam
            	    {
            	    pushFollow(FOLLOW_evalParam_in_evalStmt227);
            	    param=evalParam();

            	    state._fsp--;

            	     cmd.addParam(param); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // SQLScriptWalker.g:104:4: (annot= annotation )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ANNOT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // SQLScriptWalker.g:104:5: annot= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_evalStmt239);
            	    annot=annotation();

            	    state._fsp--;

            	     annot.setSubject(cmd); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

             ((Block_scope)Block_stack.peek()).block.addStatement(cmd); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "evalStmt"


    // $ANTLR start "evalCommand"
    // SQLScriptWalker.g:108:1: evalCommand returns [ String value ] : cmd= identifier ;
    public final String evalCommand() throws RecognitionException {
        String value = null;

        String cmd = null;


        try {
            // SQLScriptWalker.g:109:2: (cmd= identifier )
            // SQLScriptWalker.g:109:4: cmd= identifier
            {
            pushFollow(FOLLOW_identifier_in_evalCommand264);
            cmd=identifier();

            state._fsp--;

             value = cmd; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "evalCommand"


    // $ANTLR start "evalParam"
    // SQLScriptWalker.g:112:1: evalParam returns [ Parameter value ] : ^( EVAL_ARG param= parameter ) ;
    public final Parameter evalParam() throws RecognitionException {
        Parameter value = null;

        Parameter param = null;


        try {
            // SQLScriptWalker.g:113:2: ( ^( EVAL_ARG param= parameter ) )
            // SQLScriptWalker.g:113:4: ^( EVAL_ARG param= parameter )
            {
            match(input,EVAL_ARG,FOLLOW_EVAL_ARG_in_evalParam282); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_parameter_in_evalParam286);
            param=parameter();

            state._fsp--;


            match(input, Token.UP, null); 
             value = param; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "evalParam"


    // $ANTLR start "sqlStmt"
    // SQLScriptWalker.g:116:1: sqlStmt : ^( SQL_CMD name= sqlStmtName (param= sqlParam )* (annot= annotation )* ) ;
    public final void sqlStmt() throws RecognitionException {
        Object name = null;

        Object param = null;

        AnnotationCommand annot = null;


         SQLStatement stmt = new SQLStatement(); 
        try {
            // SQLScriptWalker.g:119:2: ( ^( SQL_CMD name= sqlStmtName (param= sqlParam )* (annot= annotation )* ) )
            // SQLScriptWalker.g:119:4: ^( SQL_CMD name= sqlStmtName (param= sqlParam )* (annot= annotation )* )
            {
            match(input,SQL_CMD,FOLLOW_SQL_CMD_in_sqlStmt311); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_sqlStmtName_in_sqlStmt318);
            name=sqlStmtName();

            state._fsp--;

             stmt.addPart(name); 
            // SQLScriptWalker.g:121:4: (param= sqlParam )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==STRING||LA6_0==ATSIGN||(LA6_0>=BACKSLASH && LA6_0<=RPAREN)||(LA6_0>=OP_DEFINE && LA6_0<=COLON)||LA6_0==KW_VAR||(LA6_0>=KW_IF && LA6_0<=KW_ELSE)||(LA6_0>=IDENTIFIER && LA6_0<=STR_BTICK)||LA6_0==WS) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // SQLScriptWalker.g:121:5: param= sqlParam
            	    {
            	    pushFollow(FOLLOW_sqlParam_in_sqlStmt329);
            	    param=sqlParam();

            	    state._fsp--;

            	     stmt.addPart(param); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // SQLScriptWalker.g:122:4: (annot= annotation )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ANNOT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // SQLScriptWalker.g:122:5: annot= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_sqlStmt343);
            	    annot=annotation();

            	    state._fsp--;

            	     annot.setSubject(stmt); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

             ((Block_scope)Block_stack.peek()).block.addStatement(stmt); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "sqlStmt"


    // $ANTLR start "sqlStmtName"
    // SQLScriptWalker.g:126:1: sqlStmtName returns [ Object value ] : (name= WORD | var= ( VARIABLE | EMBEDDED_VARIABLE ) );
    public final Object sqlStmtName() throws RecognitionException {
        Object value = null;

        CommonTree name=null;
        CommonTree var=null;

        try {
            // SQLScriptWalker.g:127:2: (name= WORD | var= ( VARIABLE | EMBEDDED_VARIABLE ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==WORD) ) {
                alt8=1;
            }
            else if ( (LA8_0==EMBEDDED_VARIABLE||LA8_0==VARIABLE) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // SQLScriptWalker.g:127:4: name= WORD
                    {
                    name=(CommonTree)match(input,WORD,FOLLOW_WORD_in_sqlStmtName368); 
                     value = (name!=null?name.getText():null); 

                    }
                    break;
                case 2 :
                    // SQLScriptWalker.g:128:4: var= ( VARIABLE | EMBEDDED_VARIABLE )
                    {
                    var=(CommonTree)input.LT(1);
                    if ( input.LA(1)==EMBEDDED_VARIABLE||input.LA(1)==VARIABLE ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     value = ((Scope_scope)Scope_stack.peek()).scope.getVariable((var!=null?var.getText():null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "sqlStmtName"


    // $ANTLR start "sqlParam"
    // SQLScriptWalker.g:131:1: sqlParam returns [ Object value ] : (str= stringLiteral | id= identifier | chr= sqlSpecialChars | kw= keyword | ws= WS | var= VARIABLE );
    public final Object sqlParam() throws RecognitionException {
        Object value = null;

        CommonTree ws=null;
        CommonTree var=null;
        StringLiteral str = null;

        String id = null;

        String chr = null;

        String kw = null;


        try {
            // SQLScriptWalker.g:132:2: (str= stringLiteral | id= identifier | chr= sqlSpecialChars | kw= keyword | ws= WS | var= VARIABLE )
            int alt9=6;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt9=1;
                }
                break;
            case WORD:
            case IDENTIFIER:
                {
                alt9=2;
                }
                break;
            case ATSIGN:
            case BACKSLASH:
            case EQUALS:
            case SQL_SPECIAL_CHAR:
            case LPAREN:
            case RPAREN:
            case OP_DEFINE:
            case OP_AND:
            case OP_OR:
            case OP_EQ:
            case EXCLAM:
            case QUESTION:
            case COLON:
            case STR_SQUOT:
            case STR_DQUOT:
            case STR_BTICK:
                {
                alt9=3;
                }
                break;
            case KW_SQL:
            case KW_VAR:
            case KW_IF:
            case KW_ELSE:
            case KW_TRUE:
            case KW_FALSE:
                {
                alt9=4;
                }
                break;
            case WS:
                {
                alt9=5;
                }
                break;
            case VARIABLE:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // SQLScriptWalker.g:132:4: str= stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_sqlParam402);
                    str=stringLiteral();

                    state._fsp--;

                     value = str; 

                    }
                    break;
                case 2 :
                    // SQLScriptWalker.g:133:4: id= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_sqlParam415);
                    id=identifier();

                    state._fsp--;

                     value = id; 

                    }
                    break;
                case 3 :
                    // SQLScriptWalker.g:134:4: chr= sqlSpecialChars
                    {
                    pushFollow(FOLLOW_sqlSpecialChars_in_sqlParam432);
                    chr=sqlSpecialChars();

                    state._fsp--;

                     value = chr; 

                    }
                    break;
                case 4 :
                    // SQLScriptWalker.g:135:4: kw= keyword
                    {
                    pushFollow(FOLLOW_keyword_in_sqlParam443);
                    kw=keyword();

                    state._fsp--;

                     value = kw; 

                    }
                    break;
                case 5 :
                    // SQLScriptWalker.g:136:4: ws= WS
                    {
                    ws=(CommonTree)match(input,WS,FOLLOW_WS_in_sqlParam463); 
                     value = (ws!=null?ws.getText():null); 

                    }
                    break;
                case 6 :
                    // SQLScriptWalker.g:137:4: var= VARIABLE
                    {
                    var=(CommonTree)match(input,VARIABLE,FOLLOW_VARIABLE_in_sqlParam488); 
                     value = ((Scope_scope)Scope_stack.peek()).scope.getVariable((var!=null?var.getText():null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "sqlParam"


    // $ANTLR start "annotation"
    // SQLScriptWalker.g:140:1: annotation returns [ AnnotationCommand value ] : ^( ANNOT cmd= annotationCommand (param= annotationParam )* ) ;
    public final AnnotationCommand annotation() throws RecognitionException {
        AnnotationCommand value = null;

        String cmd = null;

        Parameter param = null;


         value = new AnnotationCommand(); 
        try {
            // SQLScriptWalker.g:143:2: ( ^( ANNOT cmd= annotationCommand (param= annotationParam )* ) )
            // SQLScriptWalker.g:143:4: ^( ANNOT cmd= annotationCommand (param= annotationParam )* )
            {
            match(input,ANNOT,FOLLOW_ANNOT_in_annotation526); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_annotationCommand_in_annotation533);
            cmd=annotationCommand();

            state._fsp--;

             value.setName(cmd); 
            // SQLScriptWalker.g:145:4: (param= annotationParam )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ANNOT_ARG) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // SQLScriptWalker.g:145:5: param= annotationParam
            	    {
            	    pushFollow(FOLLOW_annotationParam_in_annotation543);
            	    param=annotationParam();

            	    state._fsp--;

            	     value.addParam(param); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

             ((Block_scope)Block_stack.peek()).block.addStatement(value); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "annotation"


    // $ANTLR start "annotationCommand"
    // SQLScriptWalker.g:148:1: annotationCommand returns [ String value ] : cmd= identifier ;
    public final String annotationCommand() throws RecognitionException {
        String value = null;

        String cmd = null;


        try {
            // SQLScriptWalker.g:149:2: (cmd= identifier )
            // SQLScriptWalker.g:149:4: cmd= identifier
            {
            pushFollow(FOLLOW_identifier_in_annotationCommand565);
            cmd=identifier();

            state._fsp--;

             value = cmd; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "annotationCommand"


    // $ANTLR start "annotationParam"
    // SQLScriptWalker.g:152:1: annotationParam returns [ Parameter value ] : ^( ANNOT_ARG param= parameter ) ;
    public final Parameter annotationParam() throws RecognitionException {
        Parameter value = null;

        Parameter param = null;


        try {
            // SQLScriptWalker.g:153:2: ( ^( ANNOT_ARG param= parameter ) )
            // SQLScriptWalker.g:153:4: ^( ANNOT_ARG param= parameter )
            {
            match(input,ANNOT_ARG,FOLLOW_ANNOT_ARG_in_annotationParam583); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_parameter_in_annotationParam587);
            param=parameter();

            state._fsp--;


            match(input, Token.UP, null); 
             value = param; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "annotationParam"


    // $ANTLR start "scriptStmt"
    // SQLScriptWalker.g:156:1: scriptStmt : ( scriptIfElse | scriptTry | scriptThrow | scriptReturn | scriptExit | expressionStmt );
    public final void scriptStmt() throws RecognitionException {
        try {
            // SQLScriptWalker.g:157:2: ( scriptIfElse | scriptTry | scriptThrow | scriptReturn | scriptExit | expressionStmt )
            int alt11=6;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt11=1;
                }
                break;
            case TRY:
                {
                alt11=2;
                }
                break;
            case THROW:
                {
                alt11=3;
                }
                break;
            case RETURN:
                {
                alt11=4;
                }
                break;
            case EXIT:
                {
                alt11=5;
                }
                break;
            case STRING:
            case DECLARE_ASSIGN:
            case DECLARE:
            case ASSIGN:
            case FUNC_DEF:
            case FUNC_CALL:
            case COND_EXPR:
            case COND_AND:
            case COND_OR:
            case COMP_EQ:
            case NOT:
            case TRUE:
            case FALSE:
            case OBJ:
            case SLOT:
            case INDEX:
            case CALL:
            case THIS:
            case NEW:
            case VARIABLE:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // SQLScriptWalker.g:157:4: scriptIfElse
                    {
                    pushFollow(FOLLOW_scriptIfElse_in_scriptStmt601);
                    scriptIfElse();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // SQLScriptWalker.g:158:4: scriptTry
                    {
                    pushFollow(FOLLOW_scriptTry_in_scriptStmt606);
                    scriptTry();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // SQLScriptWalker.g:159:4: scriptThrow
                    {
                    pushFollow(FOLLOW_scriptThrow_in_scriptStmt611);
                    scriptThrow();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // SQLScriptWalker.g:160:4: scriptReturn
                    {
                    pushFollow(FOLLOW_scriptReturn_in_scriptStmt616);
                    scriptReturn();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // SQLScriptWalker.g:161:4: scriptExit
                    {
                    pushFollow(FOLLOW_scriptExit_in_scriptStmt621);
                    scriptExit();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // SQLScriptWalker.g:162:4: expressionStmt
                    {
                    pushFollow(FOLLOW_expressionStmt_in_scriptStmt626);
                    expressionStmt();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "scriptStmt"


    // $ANTLR start "scriptIfElse"
    // SQLScriptWalker.g:175:1: scriptIfElse returns [ Statement value ] : ^( IF scriptIf ( scriptElse )? ) ;
    public final Statement scriptIfElse() throws RecognitionException {
        Block_stack.push(new Block_scope());

        Statement value = null;

         ((Block_scope)Block_stack.peek()).block = new IfStatement(); value = ((Block_scope)Block_stack.peek()).block; 
        try {
            // SQLScriptWalker.g:179:2: ( ^( IF scriptIf ( scriptElse )? ) )
            // SQLScriptWalker.g:179:4: ^( IF scriptIf ( scriptElse )? )
            {
            match(input,IF,FOLLOW_IF_in_scriptIfElse667); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_scriptIf_in_scriptIfElse669);
            scriptIf();

            state._fsp--;

            // SQLScriptWalker.g:179:18: ( scriptElse )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==BLOCK||LA12_0==IF) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // SQLScriptWalker.g:179:18: scriptElse
                    {
                    pushFollow(FOLLOW_scriptElse_in_scriptIfElse671);
                    scriptElse();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

             ((Block_scope)Block_stack.elementAt(Block_stack.size()-1-1)).block.addStatement(value); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            Block_stack.pop();

        }
        return value;
    }
    // $ANTLR end "scriptIfElse"


    // $ANTLR start "scriptIf"
    // SQLScriptWalker.g:182:1: scriptIf returns [ Statement value ] : expr= expression block ;
    public final Statement scriptIf() throws RecognitionException {
        Scope_stack.push(new Scope_scope());

        Statement value = null;

        Expression expr = null;


         ((Scope_scope)Scope_stack.peek()).scope = new Scope(((Scope_scope)Scope_stack.elementAt(Scope_stack.size()-1-1)).scope); 
        try {
            // SQLScriptWalker.g:185:2: (expr= expression block )
            // SQLScriptWalker.g:185:4: expr= expression block
            {
            pushFollow(FOLLOW_expression_in_scriptIf700);
            expr=expression();

            state._fsp--;

            pushFollow(FOLLOW_block_in_scriptIf702);
            block();

            state._fsp--;

             ((Block_scope)Block_stack.peek()).block.addStatement(expr); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            Scope_stack.pop();

        }
        return value;
    }
    // $ANTLR end "scriptIf"


    // $ANTLR start "scriptElse"
    // SQLScriptWalker.g:188:1: scriptElse returns [ Statement value ] : (elseIf= scriptIfElse | elseBlock= block );
    public final Statement scriptElse() throws RecognitionException {
        Statement value = null;

        Statement elseIf = null;

        Statement elseBlock = null;


        try {
            // SQLScriptWalker.g:189:2: (elseIf= scriptIfElse | elseBlock= block )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IF) ) {
                alt13=1;
            }
            else if ( (LA13_0==BLOCK) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // SQLScriptWalker.g:189:4: elseIf= scriptIfElse
                    {
                    pushFollow(FOLLOW_scriptIfElse_in_scriptElse721);
                    elseIf=scriptIfElse();

                    state._fsp--;

                     value = elseIf; 

                    }
                    break;
                case 2 :
                    // SQLScriptWalker.g:190:4: elseBlock= block
                    {
                    pushFollow(FOLLOW_block_in_scriptElse730);
                    elseBlock=block();

                    state._fsp--;

                     value = elseBlock; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "scriptElse"


    // $ANTLR start "scriptTry"
    // SQLScriptWalker.g:193:1: scriptTry returns [ TryStatement value ] : ^( TRY blk= blockStmt (cat= scriptCatch (fin= scriptFinally )? | fin= scriptFinally ) ) ;
    public final TryStatement scriptTry() throws RecognitionException {
        TryStatement value = null;

        Statement blk = null;

        CatchStatement cat = null;

        FinallyStatement fin = null;


        try {
            // SQLScriptWalker.g:195:2: ( ^( TRY blk= blockStmt (cat= scriptCatch (fin= scriptFinally )? | fin= scriptFinally ) ) )
            // SQLScriptWalker.g:195:4: ^( TRY blk= blockStmt (cat= scriptCatch (fin= scriptFinally )? | fin= scriptFinally ) )
            {
            match(input,TRY,FOLLOW_TRY_in_scriptTry753); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_blockStmt_in_scriptTry757);
            blk=blockStmt();

            state._fsp--;

             value = new TryStatement(blk); 
            // SQLScriptWalker.g:195:67: (cat= scriptCatch (fin= scriptFinally )? | fin= scriptFinally )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==CATCH) ) {
                alt15=1;
            }
            else if ( (LA15_0==FINALLY) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // SQLScriptWalker.g:196:4: cat= scriptCatch (fin= scriptFinally )?
                    {
                    pushFollow(FOLLOW_scriptCatch_in_scriptTry768);
                    cat=scriptCatch();

                    state._fsp--;

                     value.setCatchClause(cat); 
                    // SQLScriptWalker.g:197:4: (fin= scriptFinally )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==FINALLY) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // SQLScriptWalker.g:197:5: fin= scriptFinally
                            {
                            pushFollow(FOLLOW_scriptFinally_in_scriptTry778);
                            fin=scriptFinally();

                            state._fsp--;

                             value.setFinallyClause(fin); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SQLScriptWalker.g:198:6: fin= scriptFinally
                    {
                    pushFollow(FOLLOW_scriptFinally_in_scriptTry791);
                    fin=scriptFinally();

                    state._fsp--;

                     value.setFinallyClause(fin); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

             ((Block_scope)Block_stack.peek()).block.addStatement(value); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "scriptTry"


    // $ANTLR start "scriptCatch"
    // SQLScriptWalker.g:202:1: scriptCatch returns [ CatchStatement value ] : ^( CATCH var= identifier blk= blockStmt ) ;
    public final CatchStatement scriptCatch() throws RecognitionException {
        CatchStatement value = null;

        String var = null;

        Statement blk = null;


        try {
            // SQLScriptWalker.g:203:2: ( ^( CATCH var= identifier blk= blockStmt ) )
            // SQLScriptWalker.g:203:4: ^( CATCH var= identifier blk= blockStmt )
            {
            match(input,CATCH,FOLLOW_CATCH_in_scriptCatch814); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_identifier_in_scriptCatch818);
            var=identifier();

            state._fsp--;

            pushFollow(FOLLOW_blockStmt_in_scriptCatch822);
            blk=blockStmt();

            state._fsp--;


            match(input, Token.UP, null); 

            			value = new CatchStatement(var, blk);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "scriptCatch"


    // $ANTLR start "scriptFinally"
    // SQLScriptWalker.g:208:1: scriptFinally returns [ FinallyStatement value ] : ^( FINALLY blk= blockStmt ) ;
    public final FinallyStatement scriptFinally() throws RecognitionException {
        FinallyStatement value = null;

        Statement blk = null;


        try {
            // SQLScriptWalker.g:209:2: ( ^( FINALLY blk= blockStmt ) )
            // SQLScriptWalker.g:209:4: ^( FINALLY blk= blockStmt )
            {
            match(input,FINALLY,FOLLOW_FINALLY_in_scriptFinally841); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_blockStmt_in_scriptFinally845);
            blk=blockStmt();

            state._fsp--;


            match(input, Token.UP, null); 
             value = new FinallyStatement(blk); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "scriptFinally"


    // $ANTLR start "scriptThrow"
    // SQLScriptWalker.g:212:1: scriptThrow returns [ ThrowStatement value ] : ^( THROW expr= expression ) ;
    public final ThrowStatement scriptThrow() throws RecognitionException {
        ThrowStatement value = null;

        Expression expr = null;


        try {
            // SQLScriptWalker.g:214:2: ( ^( THROW expr= expression ) )
            // SQLScriptWalker.g:214:4: ^( THROW expr= expression )
            {
            match(input,THROW,FOLLOW_THROW_in_scriptThrow869); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_scriptThrow873);
            expr=expression();

            state._fsp--;


            match(input, Token.UP, null); 
             value = new ThrowStatement(expr); 

            }

             ((Block_scope)Block_stack.peek()).block.addStatement(value); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "scriptThrow"


    // $ANTLR start "scriptReturn"
    // SQLScriptWalker.g:217:1: scriptReturn returns [ ReturnStatement value ] : ^( RETURN (expr= expression )? ) ;
    public final ReturnStatement scriptReturn() throws RecognitionException {
        ReturnStatement value = null;

        Expression expr = null;


        try {
            // SQLScriptWalker.g:218:2: ( ^( RETURN (expr= expression )? ) )
            // SQLScriptWalker.g:218:4: ^( RETURN (expr= expression )? )
            {
            match(input,RETURN,FOLLOW_RETURN_in_scriptReturn892); 

             value = new ReturnStatement(); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // SQLScriptWalker.g:218:49: (expr= expression )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==STRING||(LA16_0>=DECLARE_ASSIGN && LA16_0<=FUNC_CALL)||(LA16_0>=COND_EXPR && LA16_0<=SLOT)||(LA16_0>=INDEX && LA16_0<=NEW)||LA16_0==VARIABLE) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // SQLScriptWalker.g:218:50: expr= expression
                        {
                        pushFollow(FOLLOW_expression_in_scriptReturn899);
                        expr=expression();

                        state._fsp--;

                         value.setExpression(expr); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            			((Block_scope)Block_stack.peek()).block.addStatement(value);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "scriptReturn"


    // $ANTLR start "scriptExit"
    // SQLScriptWalker.g:223:1: scriptExit returns [ ExitStatement value ] : ^( EXIT (expr= expression )? ) ;
    public final ExitStatement scriptExit() throws RecognitionException {
        ExitStatement value = null;

        Expression expr = null;


        try {
            // SQLScriptWalker.g:224:2: ( ^( EXIT (expr= expression )? ) )
            // SQLScriptWalker.g:224:4: ^( EXIT (expr= expression )? )
            {
            match(input,EXIT,FOLLOW_EXIT_in_scriptExit923); 

             value = new ExitStatement(); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // SQLScriptWalker.g:224:45: (expr= expression )?
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==STRING||(LA17_0>=DECLARE_ASSIGN && LA17_0<=FUNC_CALL)||(LA17_0>=COND_EXPR && LA17_0<=SLOT)||(LA17_0>=INDEX && LA17_0<=NEW)||LA17_0==VARIABLE) ) {
                    alt17=1;
                }
                switch (alt17) {
                    case 1 :
                        // SQLScriptWalker.g:224:46: expr= expression
                        {
                        pushFollow(FOLLOW_expression_in_scriptExit930);
                        expr=expression();

                        state._fsp--;

                         value.setExpression(expr); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            			((Block_scope)Block_stack.peek()).block.addStatement(value);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "scriptExit"


    // $ANTLR start "expressionStmt"
    // SQLScriptWalker.g:229:1: expressionStmt : expr= expression ;
    public final void expressionStmt() throws RecognitionException {
        Expression expr = null;


        try {
            // SQLScriptWalker.g:230:2: (expr= expression )
            // SQLScriptWalker.g:230:4: expr= expression
            {
            pushFollow(FOLLOW_expression_in_expressionStmt950);
            expr=expression();

            state._fsp--;

             ((Block_scope)Block_stack.peek()).block.addStatement(expr); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expressionStmt"


    // $ANTLR start "expression"
    // SQLScriptWalker.g:233:1: expression returns [ Expression value ] : (ex= expressionNoSlotExp | st= slotExpressionRHS );
    public final Expression expression() throws RecognitionException {
        Expression value = null;

        Expression ex = null;

        SlotExpression st = null;


        try {
            // SQLScriptWalker.g:234:2: (ex= expressionNoSlotExp | st= slotExpressionRHS )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==STRING||(LA18_0>=DECLARE_ASSIGN && LA18_0<=FUNC_CALL)||(LA18_0>=COND_EXPR && LA18_0<=OBJ)||(LA18_0>=INDEX && LA18_0<=NEW)||LA18_0==VARIABLE) ) {
                alt18=1;
            }
            else if ( (LA18_0==SLOT) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // SQLScriptWalker.g:234:4: ex= expressionNoSlotExp
                    {
                    pushFollow(FOLLOW_expressionNoSlotExp_in_expression969);
                    ex=expressionNoSlotExp();

                    state._fsp--;

                     value = ex; 

                    }
                    break;
                case 2 :
                    // SQLScriptWalker.g:235:4: st= slotExpressionRHS
                    {
                    pushFollow(FOLLOW_slotExpressionRHS_in_expression978);
                    st=slotExpressionRHS();

                    state._fsp--;

                     value = st; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "expression"


    // $ANTLR start "expressionNoSlotExp"
    // SQLScriptWalker.g:238:1: expressionNoSlotExp returns [ Expression value ] : (fd= scriptFuncDef | fc= scriptFuncCall | da= scriptDeclareAndAssign | de= scriptDeclare | ae= scriptAssign | ix= indexExpressionRHS | cl= callExpression | tc= ternaryConditional | oc= orCondition | ac= andCondition | ec= eqCondition | nexp= notExpression | newx= newExpression | sexp= simpleExpression );
    public final Expression expressionNoSlotExp() throws RecognitionException {
        Expression value = null;

        FunctionDefinitionExpression fd = null;

        AbstractFunctionCallExpression fc = null;

        Expression da = null;

        DeclareVariableExpression de = null;

        Expression ae = null;

        Expression ix = null;

        Expression cl = null;

        Expression tc = null;

        Condition oc = null;

        Condition ac = null;

        Condition ec = null;

        Expression nexp = null;

        Expression newx = null;

        Expression sexp = null;


        try {
            // SQLScriptWalker.g:239:2: (fd= scriptFuncDef | fc= scriptFuncCall | da= scriptDeclareAndAssign | de= scriptDeclare | ae= scriptAssign | ix= indexExpressionRHS | cl= callExpression | tc= ternaryConditional | oc= orCondition | ac= andCondition | ec= eqCondition | nexp= notExpression | newx= newExpression | sexp= simpleExpression )
            int alt19=14;
            switch ( input.LA(1) ) {
            case FUNC_DEF:
                {
                alt19=1;
                }
                break;
            case FUNC_CALL:
                {
                alt19=2;
                }
                break;
            case DECLARE_ASSIGN:
                {
                alt19=3;
                }
                break;
            case DECLARE:
                {
                alt19=4;
                }
                break;
            case ASSIGN:
                {
                alt19=5;
                }
                break;
            case INDEX:
                {
                alt19=6;
                }
                break;
            case CALL:
                {
                alt19=7;
                }
                break;
            case COND_EXPR:
                {
                alt19=8;
                }
                break;
            case COND_OR:
                {
                alt19=9;
                }
                break;
            case COND_AND:
                {
                alt19=10;
                }
                break;
            case COMP_EQ:
                {
                alt19=11;
                }
                break;
            case NOT:
                {
                alt19=12;
                }
                break;
            case NEW:
                {
                alt19=13;
                }
                break;
            case STRING:
            case TRUE:
            case FALSE:
            case OBJ:
            case THIS:
            case VARIABLE:
                {
                alt19=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // SQLScriptWalker.g:239:4: fd= scriptFuncDef
                    {
                    pushFollow(FOLLOW_scriptFuncDef_in_expressionNoSlotExp998);
                    fd=scriptFuncDef();

                    state._fsp--;

                     value = fd; 

                    }
                    break;
                case 2 :
                    // SQLScriptWalker.g:240:4: fc= scriptFuncCall
                    {
                    pushFollow(FOLLOW_scriptFuncCall_in_expressionNoSlotExp1007);
                    fc=scriptFuncCall();

                    state._fsp--;

                     value = fc; 

                    }
                    break;
                case 3 :
                    // SQLScriptWalker.g:241:4: da= scriptDeclareAndAssign
                    {
                    pushFollow(FOLLOW_scriptDeclareAndAssign_in_expressionNoSlotExp1016);
                    da=scriptDeclareAndAssign();

                    state._fsp--;

                     value = da; 

                    }
                    break;
                case 4 :
                    // SQLScriptWalker.g:242:4: de= scriptDeclare
                    {
                    pushFollow(FOLLOW_scriptDeclare_in_expressionNoSlotExp1025);
                    de=scriptDeclare();

                    state._fsp--;

                     value = de; 

                    }
                    break;
                case 5 :
                    // SQLScriptWalker.g:243:4: ae= scriptAssign
                    {
                    pushFollow(FOLLOW_scriptAssign_in_expressionNoSlotExp1034);
                    ae=scriptAssign();

                    state._fsp--;

                     value = ae; 

                    }
                    break;
                case 6 :
                    // SQLScriptWalker.g:244:4: ix= indexExpressionRHS
                    {
                    pushFollow(FOLLOW_indexExpressionRHS_in_expressionNoSlotExp1043);
                    ix=indexExpressionRHS();

                    state._fsp--;

                     value = ix; 

                    }
                    break;
                case 7 :
                    // SQLScriptWalker.g:245:4: cl= callExpression
                    {
                    pushFollow(FOLLOW_callExpression_in_expressionNoSlotExp1052);
                    cl=callExpression();

                    state._fsp--;

                     value = cl; 

                    }
                    break;
                case 8 :
                    // SQLScriptWalker.g:246:4: tc= ternaryConditional
                    {
                    pushFollow(FOLLOW_ternaryConditional_in_expressionNoSlotExp1061);
                    tc=ternaryConditional();

                    state._fsp--;

                     value = tc; 

                    }
                    break;
                case 9 :
                    // SQLScriptWalker.g:247:4: oc= orCondition
                    {
                    pushFollow(FOLLOW_orCondition_in_expressionNoSlotExp1070);
                    oc=orCondition();

                    state._fsp--;

                     value = oc; 

                    }
                    break;
                case 10 :
                    // SQLScriptWalker.g:248:4: ac= andCondition
                    {
                    pushFollow(FOLLOW_andCondition_in_expressionNoSlotExp1079);
                    ac=andCondition();

                    state._fsp--;

                     value = ac; 

                    }
                    break;
                case 11 :
                    // SQLScriptWalker.g:249:4: ec= eqCondition
                    {
                    pushFollow(FOLLOW_eqCondition_in_expressionNoSlotExp1088);
                    ec=eqCondition();

                    state._fsp--;

                     value = ec; 

                    }
                    break;
                case 12 :
                    // SQLScriptWalker.g:250:4: nexp= notExpression
                    {
                    pushFollow(FOLLOW_notExpression_in_expressionNoSlotExp1097);
                    nexp=notExpression();

                    state._fsp--;

                     value = nexp; 

                    }
                    break;
                case 13 :
                    // SQLScriptWalker.g:251:4: newx= newExpression
                    {
                    pushFollow(FOLLOW_newExpression_in_expressionNoSlotExp1106);
                    newx=newExpression();

                    state._fsp--;

                     value = newx; 

                    }
                    break;
                case 14 :
                    // SQLScriptWalker.g:252:4: sexp= simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expressionNoSlotExp1115);
                    sexp=simpleExpression();

                    state._fsp--;

                     value = sexp; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "expressionNoSlotExp"


    // $ANTLR start "scriptFuncDef"
    // SQLScriptWalker.g:255:1: scriptFuncDef returns [ FunctionDefinitionExpression value ] : ^( FUNC_DEF (name= identifier )? (args= argumentsDef )? block ) ;
    public final FunctionDefinitionExpression scriptFuncDef() throws RecognitionException {
        Block_stack.push(new Block_scope());

        FunctionDefinitionExpression value = null;

        String name = null;

        List<String> args = null;



        //	((Scope_scope)Scope_stack.peek()).scope = new Scope(((Scope_scope)Scope_stack.elementAt(Scope_stack.size()-1-1)).scope);
        	Function function = new Function();
        	value = new FunctionDefinitionExpression(function);
        	((Block_scope)Block_stack.peek()).block = value;

        try {
            // SQLScriptWalker.g:264:2: ( ^( FUNC_DEF (name= identifier )? (args= argumentsDef )? block ) )
            // SQLScriptWalker.g:264:4: ^( FUNC_DEF (name= identifier )? (args= argumentsDef )? block )
            {
            match(input,FUNC_DEF,FOLLOW_FUNC_DEF_in_scriptFuncDef1144); 

            match(input, Token.DOWN, null); 
            // SQLScriptWalker.g:264:15: (name= identifier )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==WORD||LA20_0==IDENTIFIER) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // SQLScriptWalker.g:264:16: name= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_scriptFuncDef1149);
                    name=identifier();

                    state._fsp--;

                     function.setName(name); 

                    }
                    break;

            }

            // SQLScriptWalker.g:265:21: (args= argumentsDef )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ARGS) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // SQLScriptWalker.g:265:22: args= argumentsDef
                    {
                    pushFollow(FOLLOW_argumentsDef_in_scriptFuncDef1178);
                    args=argumentsDef();

                    state._fsp--;

                     function.setArguments(args); 

                    }
                    break;

            }

            pushFollow(FOLLOW_block_in_scriptFuncDef1204);
            block();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            Block_stack.pop();

        }
        return value;
    }
    // $ANTLR end "scriptFuncDef"


    // $ANTLR start "argumentsDef"
    // SQLScriptWalker.g:270:1: argumentsDef returns [ List<String> value ] : ^( ARGS (name= identifier )+ ) ;
    public final List<String> argumentsDef() throws RecognitionException {
        List<String> value = null;

        String name = null;


         value = new ArrayList<String>(); 
        try {
            // SQLScriptWalker.g:272:2: ( ^( ARGS (name= identifier )+ ) )
            // SQLScriptWalker.g:272:4: ^( ARGS (name= identifier )+ )
            {
            match(input,ARGS,FOLLOW_ARGS_in_argumentsDef1227); 

            match(input, Token.DOWN, null); 
            // SQLScriptWalker.g:272:11: (name= identifier )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==WORD||LA22_0==IDENTIFIER) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // SQLScriptWalker.g:272:12: name= identifier
            	    {
            	    pushFollow(FOLLOW_identifier_in_argumentsDef1232);
            	    name=identifier();

            	    state._fsp--;

            	     value.add(name); 

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "argumentsDef"


    // $ANTLR start "scriptFuncCall"
    // SQLScriptWalker.g:277:1: scriptFuncCall returns [ AbstractFunctionCallExpression value ] : ^( FUNC_CALL (name= identifier | expr= expression ) (args= argumentsList )? ) ;
    public final AbstractFunctionCallExpression scriptFuncCall() throws RecognitionException {
        AbstractFunctionCallExpression value = null;

        String name = null;

        Expression expr = null;

        Map<String, Expression> args = null;


        try {
            // SQLScriptWalker.g:278:2: ( ^( FUNC_CALL (name= identifier | expr= expression ) (args= argumentsList )? ) )
            // SQLScriptWalker.g:278:4: ^( FUNC_CALL (name= identifier | expr= expression ) (args= argumentsList )? )
            {
            match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_scriptFuncCall1255); 

            match(input, Token.DOWN, null); 
            // SQLScriptWalker.g:278:16: (name= identifier | expr= expression )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==WORD||LA23_0==IDENTIFIER) ) {
                alt23=1;
            }
            else if ( (LA23_0==STRING||(LA23_0>=DECLARE_ASSIGN && LA23_0<=FUNC_CALL)||(LA23_0>=COND_EXPR && LA23_0<=SLOT)||(LA23_0>=INDEX && LA23_0<=NEW)||LA23_0==VARIABLE) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // SQLScriptWalker.g:278:17: name= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_scriptFuncCall1260);
                    name=identifier();

                    state._fsp--;

                     value = new NamedFunctionCallExpression(name); 

                    }
                    break;
                case 2 :
                    // SQLScriptWalker.g:279:9: expr= expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptFuncCall1274);
                    expr=expression();

                    state._fsp--;

                     value = new FunctionCallExpression(expr); 

                    }
                    break;

            }

            // SQLScriptWalker.g:281:8: (args= argumentsList )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ARGS) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // SQLScriptWalker.g:281:9: args= argumentsList
                    {
                    pushFollow(FOLLOW_argumentsList_in_scriptFuncCall1297);
                    args=argumentsList();

                    state._fsp--;

                     value.setArguments(args); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "scriptFuncCall"


    // $ANTLR start "argumentsList"
    // SQLScriptWalker.g:286:1: argumentsList returns [ Map<String, Expression> value ] : ^( ARGS ( ( ^( ARG_EXPR name= identifier expr= expression ) | ^( ARG_TRUE name= identifier ) | ^( ARG_FALSE name= identifier ) ) )+ ) ;
    public final Map<String, Expression> argumentsList() throws RecognitionException {
        Map<String, Expression> value = null;

        String name = null;

        Expression expr = null;


         value = new HashMap<String, Expression>(); 
        try {
            // SQLScriptWalker.g:288:2: ( ^( ARGS ( ( ^( ARG_EXPR name= identifier expr= expression ) | ^( ARG_TRUE name= identifier ) | ^( ARG_FALSE name= identifier ) ) )+ ) )
            // SQLScriptWalker.g:288:4: ^( ARGS ( ( ^( ARG_EXPR name= identifier expr= expression ) | ^( ARG_TRUE name= identifier ) | ^( ARG_FALSE name= identifier ) ) )+ )
            {
            match(input,ARGS,FOLLOW_ARGS_in_argumentsList1327); 

            match(input, Token.DOWN, null); 
            // SQLScriptWalker.g:288:11: ( ( ^( ARG_EXPR name= identifier expr= expression ) | ^( ARG_TRUE name= identifier ) | ^( ARG_FALSE name= identifier ) ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=ARG_EXPR && LA26_0<=ARG_FALSE)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // SQLScriptWalker.g:288:12: ( ^( ARG_EXPR name= identifier expr= expression ) | ^( ARG_TRUE name= identifier ) | ^( ARG_FALSE name= identifier ) )
            	    {
            	    // SQLScriptWalker.g:288:12: ( ^( ARG_EXPR name= identifier expr= expression ) | ^( ARG_TRUE name= identifier ) | ^( ARG_FALSE name= identifier ) )
            	    int alt25=3;
            	    switch ( input.LA(1) ) {
            	    case ARG_EXPR:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case ARG_TRUE:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case ARG_FALSE:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // SQLScriptWalker.g:288:13: ^( ARG_EXPR name= identifier expr= expression )
            	            {
            	            match(input,ARG_EXPR,FOLLOW_ARG_EXPR_in_argumentsList1332); 

            	            match(input, Token.DOWN, null); 
            	            pushFollow(FOLLOW_identifier_in_argumentsList1336);
            	            name=identifier();

            	            state._fsp--;

            	            pushFollow(FOLLOW_expression_in_argumentsList1340);
            	            expr=expression();

            	            state._fsp--;

            	             value.put(name, expr); 

            	            match(input, Token.UP, null); 

            	            }
            	            break;
            	        case 2 :
            	            // SQLScriptWalker.g:289:19: ^( ARG_TRUE name= identifier )
            	            {
            	            match(input,ARG_TRUE,FOLLOW_ARG_TRUE_in_argumentsList1364); 

            	            match(input, Token.DOWN, null); 
            	            pushFollow(FOLLOW_identifier_in_argumentsList1368);
            	            name=identifier();

            	            state._fsp--;

            	             value.put(name, new BooleanLiteralExpression(Bool.TRUE)); 

            	            match(input, Token.UP, null); 

            	            }
            	            break;
            	        case 3 :
            	            // SQLScriptWalker.g:290:19: ^( ARG_FALSE name= identifier )
            	            {
            	            match(input,ARG_FALSE,FOLLOW_ARG_FALSE_in_argumentsList1392); 

            	            match(input, Token.DOWN, null); 
            	            pushFollow(FOLLOW_identifier_in_argumentsList1396);
            	            name=identifier();

            	            state._fsp--;

            	             value.put(name, new BooleanLiteralExpression(Bool.FALSE)); 

            	            match(input, Token.UP, null); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "argumentsList"


    // $ANTLR start "scriptDeclareAndAssign"
    // SQLScriptWalker.g:299:1: scriptDeclareAndAssign returns [ Expression value ] : ^( DECLARE_ASSIGN declare= scriptDeclare assign= scriptAssign ) ;
    public final Expression scriptDeclareAndAssign() throws RecognitionException {
        Expression value = null;

        DeclareVariableExpression declare = null;

        Expression assign = null;


         Expression decl = null; 
        try {
            // SQLScriptWalker.g:301:2: ( ^( DECLARE_ASSIGN declare= scriptDeclare assign= scriptAssign ) )
            // SQLScriptWalker.g:301:4: ^( DECLARE_ASSIGN declare= scriptDeclare assign= scriptAssign )
            {
            match(input,DECLARE_ASSIGN,FOLLOW_DECLARE_ASSIGN_in_scriptDeclareAndAssign1463); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_scriptDeclare_in_scriptDeclareAndAssign1470);
            declare=scriptDeclare();

            state._fsp--;

             decl = declare; 
            pushFollow(FOLLOW_scriptAssign_in_scriptDeclareAndAssign1479);
            assign=scriptAssign();

            state._fsp--;


            				if (decl != null) {
            					value = new DeclareAndAssignExpression(declare, (AssignExpression)assign);
            				}
            				else {
            					value = assign;
            				}
            			

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "scriptDeclareAndAssign"


    // $ANTLR start "scriptDeclare"
    // SQLScriptWalker.g:315:1: scriptDeclare returns [ DeclareVariableExpression value ] : ^( DECLARE var= VARIABLE ) ;
    public final DeclareVariableExpression scriptDeclare() throws RecognitionException {
        DeclareVariableExpression value = null;

        CommonTree var=null;

        try {
            // SQLScriptWalker.g:316:2: ( ^( DECLARE var= VARIABLE ) )
            // SQLScriptWalker.g:316:4: ^( DECLARE var= VARIABLE )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_scriptDeclare1502); 

            match(input, Token.DOWN, null); 
            var=(CommonTree)match(input,VARIABLE,FOLLOW_VARIABLE_in_scriptDeclare1506); 

            			((Scope_scope)Scope_stack.peek()).scope.setVariable(new Variable((var!=null?var.getText():null)));
            			value = new DeclareVariableExpression((var!=null?var.getText():null));
            		

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "scriptDeclare"


    // $ANTLR start "scriptAssign"
    // SQLScriptWalker.g:326:1: scriptAssign returns [ Expression value ] : ^( ASSIGN (varExp= assignVariable | idxExp= assignIndex | slotExp= assignSlot ) ) ;
    public final Expression scriptAssign() throws RecognitionException {
        Expression value = null;

        Expression varExp = null;

        Expression idxExp = null;

        Expression slotExp = null;


        try {
            // SQLScriptWalker.g:327:2: ( ^( ASSIGN (varExp= assignVariable | idxExp= assignIndex | slotExp= assignSlot ) ) )
            // SQLScriptWalker.g:327:4: ^( ASSIGN (varExp= assignVariable | idxExp= assignIndex | slotExp= assignSlot ) )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_scriptAssign1529); 

            match(input, Token.DOWN, null); 
            // SQLScriptWalker.g:328:4: (varExp= assignVariable | idxExp= assignIndex | slotExp= assignSlot )
            int alt27=3;
            switch ( input.LA(1) ) {
            case VARIABLE:
                {
                alt27=1;
                }
                break;
            case INDEX:
                {
                alt27=2;
                }
                break;
            case SLOT:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // SQLScriptWalker.g:328:6: varExp= assignVariable
                    {
                    pushFollow(FOLLOW_assignVariable_in_scriptAssign1538);
                    varExp=assignVariable();

                    state._fsp--;

                     value = varExp; 

                    }
                    break;
                case 2 :
                    // SQLScriptWalker.g:329:6: idxExp= assignIndex
                    {
                    pushFollow(FOLLOW_assignIndex_in_scriptAssign1549);
                    idxExp=assignIndex();

                    state._fsp--;

                     value = idxExp; 

                    }
                    break;
                case 3 :
                    // SQLScriptWalker.g:330:6: slotExp= assignSlot
                    {
                    pushFollow(FOLLOW_assignSlot_in_scriptAssign1560);
                    slotExp=assignSlot();

                    state._fsp--;

                     value = slotExp; 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "scriptAssign"


    // $ANTLR start "assignVariable"
    // SQLScriptWalker.g:335:1: assignVariable returns [ Expression value ] : lval= VARIABLE rval= expression ;
    public final Expression assignVariable() throws RecognitionException {
        Expression value = null;

        CommonTree lval=null;
        Expression rval = null;


        try {
            // SQLScriptWalker.g:336:2: (lval= VARIABLE rval= expression )
            // SQLScriptWalker.g:336:4: lval= VARIABLE rval= expression
            {
            lval=(CommonTree)match(input,VARIABLE,FOLLOW_VARIABLE_in_assignVariable1588); 
            pushFollow(FOLLOW_expression_in_assignVariable1592);
            rval=expression();

            state._fsp--;


            			Variable variable = ((Scope_scope)Scope_stack.peek()).scope.getVariable((lval!=null?lval.getText():null));
            			if (variable == null) {
            				// TODO: Warning, if not yet declared
            				variable = new Variable((lval!=null?lval.getText():null));
            				((Scope_scope)Scope_stack.peek()).scope.setVariable(variable);
            				value = new DeclareAndAssignExpression(
            						new DeclareVariableExpression((lval!=null?lval.getText():null)),
            						new AssignExpression((lval!=null?lval.getText():null), rval)
            				);
            			}
            			else {
            				value = new AssignExpression((lval!=null?lval.getText():null), rval);
            				//((Block_scope)Block_stack.peek()).block.addStatement(value);
            			}
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "assignVariable"


    // $ANTLR start "assignIndex"
    // SQLScriptWalker.g:354:1: assignIndex returns [ Expression value ] : lval= indexExpressionLHS rval= expression ;
    public final Expression assignIndex() throws RecognitionException {
        Expression value = null;

        Expression lval = null;

        Expression rval = null;


        try {
            // SQLScriptWalker.g:355:2: (lval= indexExpressionLHS rval= expression )
            // SQLScriptWalker.g:355:4: lval= indexExpressionLHS rval= expression
            {
            pushFollow(FOLLOW_indexExpressionLHS_in_assignIndex1611);
            lval=indexExpressionLHS();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_assignIndex1615);
            rval=expression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "assignIndex"


    // $ANTLR start "assignSlot"
    // SQLScriptWalker.g:358:1: assignSlot returns [ Expression value ] : lval= slotExpressionLHS rval= expression ;
    public final Expression assignSlot() throws RecognitionException {
        Expression value = null;

        SlotExpression lval = null;

        Expression rval = null;


        try {
            // SQLScriptWalker.g:359:2: (lval= slotExpressionLHS rval= expression )
            // SQLScriptWalker.g:359:4: lval= slotExpressionLHS rval= expression
            {
            pushFollow(FOLLOW_slotExpressionLHS_in_assignSlot1632);
            lval=slotExpressionLHS();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_assignSlot1636);
            rval=expression();

            state._fsp--;

             value = new SlotSetExpression(lval, rval); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "assignSlot"


    // $ANTLR start "indexExpressionLHS"
    // SQLScriptWalker.g:363:1: indexExpressionLHS returns [ Expression value ] : exp= indexExpression_[POS_LHS] ;
    public final Expression indexExpressionLHS() throws RecognitionException {
        Expression value = null;

        Expression exp = null;


        try {
            // SQLScriptWalker.g:364:2: (exp= indexExpression_[POS_LHS] )
            // SQLScriptWalker.g:364:4: exp= indexExpression_[POS_LHS]
            {
            pushFollow(FOLLOW_indexExpression__in_indexExpressionLHS1657);
            exp=indexExpression_(POS_LHS);

            state._fsp--;

             value = exp; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "indexExpressionLHS"


    // $ANTLR start "indexExpressionRHS"
    // SQLScriptWalker.g:367:1: indexExpressionRHS returns [ Expression value ] : exp= indexExpression_[POS_RHS] ;
    public final Expression indexExpressionRHS() throws RecognitionException {
        Expression value = null;

        Expression exp = null;


        try {
            // SQLScriptWalker.g:368:2: (exp= indexExpression_[POS_RHS] )
            // SQLScriptWalker.g:368:4: exp= indexExpression_[POS_RHS]
            {
            pushFollow(FOLLOW_indexExpression__in_indexExpressionRHS1677);
            exp=indexExpression_(POS_RHS);

            state._fsp--;

             value = exp; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "indexExpressionRHS"


    // $ANTLR start "indexExpression_"
    // SQLScriptWalker.g:371:1: indexExpression_[ int pos ] returns [ Expression value ] : ^( INDEX receiver= expression index= expression ) ;
    public final Expression indexExpression_(int pos) throws RecognitionException {
        Expression value = null;

        Expression receiver = null;

        Expression index = null;


        try {
            // SQLScriptWalker.g:372:2: ( ^( INDEX receiver= expression index= expression ) )
            // SQLScriptWalker.g:372:4: ^( INDEX receiver= expression index= expression )
            {
            match(input,INDEX,FOLLOW_INDEX_in_indexExpression_1698); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_indexExpression_1702);
            receiver=expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_indexExpression_1706);
            index=expression();

            state._fsp--;


            match(input, Token.UP, null); 
             value = pos == POS_RHS ? /* gen "get" */ new NullExpression() : /* gen "set" */ new NullExpression(); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "indexExpression_"


    // $ANTLR start "slotExpressionLHS"
    // SQLScriptWalker.g:376:1: slotExpressionLHS returns [ SlotExpression value ] : exp= slotExpression_[POS_LHS] ;
    public final SlotExpression slotExpressionLHS() throws RecognitionException {
        SlotExpression value = null;

        SlotExpression exp = null;


        try {
            // SQLScriptWalker.g:377:2: (exp= slotExpression_[POS_LHS] )
            // SQLScriptWalker.g:377:4: exp= slotExpression_[POS_LHS]
            {
            pushFollow(FOLLOW_slotExpression__in_slotExpressionLHS1728);
            exp=slotExpression_(POS_LHS);

            state._fsp--;

             value = exp; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "slotExpressionLHS"


    // $ANTLR start "slotExpressionRHS"
    // SQLScriptWalker.g:380:1: slotExpressionRHS returns [ SlotExpression value ] : exp= slotExpression_[POS_RHS] ;
    public final SlotExpression slotExpressionRHS() throws RecognitionException {
        SlotExpression value = null;

        SlotExpression exp = null;


        try {
            // SQLScriptWalker.g:381:2: (exp= slotExpression_[POS_RHS] )
            // SQLScriptWalker.g:381:4: exp= slotExpression_[POS_RHS]
            {
            pushFollow(FOLLOW_slotExpression__in_slotExpressionRHS1748);
            exp=slotExpression_(POS_RHS);

            state._fsp--;

             value = exp; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "slotExpressionRHS"


    // $ANTLR start "slotExpression_"
    // SQLScriptWalker.g:384:1: slotExpression_[ int pos ] returns [ SlotExpression value ] : ^( SLOT receiver= expression (slotName= identifierExpression | slotExpr= expression ) ) ;
    public final SlotExpression slotExpression_(int pos) throws RecognitionException {
        SlotExpression value = null;

        Expression receiver = null;

        Expression slotName = null;

        Expression slotExpr = null;


        try {
            // SQLScriptWalker.g:385:2: ( ^( SLOT receiver= expression (slotName= identifierExpression | slotExpr= expression ) ) )
            // SQLScriptWalker.g:385:4: ^( SLOT receiver= expression (slotName= identifierExpression | slotExpr= expression ) )
            {
            match(input,SLOT,FOLLOW_SLOT_in_slotExpression_1769); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_slotExpression_1773);
            receiver=expression();

            state._fsp--;

            // SQLScriptWalker.g:386:4: (slotName= identifierExpression | slotExpr= expression )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==WORD||LA28_0==IDENTIFIER) ) {
                alt28=1;
            }
            else if ( (LA28_0==STRING||(LA28_0>=DECLARE_ASSIGN && LA28_0<=FUNC_CALL)||(LA28_0>=COND_EXPR && LA28_0<=SLOT)||(LA28_0>=INDEX && LA28_0<=NEW)||LA28_0==VARIABLE) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // SQLScriptWalker.g:386:6: slotName= identifierExpression
                    {
                    pushFollow(FOLLOW_identifierExpression_in_slotExpression_1782);
                    slotName=identifierExpression();

                    state._fsp--;

                     value = new SlotExpression(receiver, slotName); 

                    }
                    break;
                case 2 :
                    // SQLScriptWalker.g:387:6: slotExpr= expression
                    {
                    pushFollow(FOLLOW_expression_in_slotExpression_1793);
                    slotExpr=expression();

                    state._fsp--;

                     value = new SlotExpression(receiver, slotExpr); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "slotExpression_"


    // $ANTLR start "callExpression"
    // SQLScriptWalker.g:392:1: callExpression returns [ Expression value ] : ^( CALL (slotCall= slotCallExpression | funcCall= funcCallExpression ) ) ;
    public final Expression callExpression() throws RecognitionException {
        Expression value = null;

        SlotCallExpression slotCall = null;

        AbstractFunctionCallExpression funcCall = null;


        try {
            // SQLScriptWalker.g:393:2: ( ^( CALL (slotCall= slotCallExpression | funcCall= funcCallExpression ) ) )
            // SQLScriptWalker.g:393:4: ^( CALL (slotCall= slotCallExpression | funcCall= funcCallExpression ) )
            {
            match(input,CALL,FOLLOW_CALL_in_callExpression1821); 

            match(input, Token.DOWN, null); 
            // SQLScriptWalker.g:394:4: (slotCall= slotCallExpression | funcCall= funcCallExpression )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==SLOT) ) {
                alt29=1;
            }
            else if ( (LA29_0==STRING||(LA29_0>=DECLARE_ASSIGN && LA29_0<=FUNC_CALL)||(LA29_0>=COND_EXPR && LA29_0<=OBJ)||(LA29_0>=INDEX && LA29_0<=NEW)||(LA29_0>=WORD && LA29_0<=VARIABLE)||LA29_0==IDENTIFIER) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // SQLScriptWalker.g:394:6: slotCall= slotCallExpression
                    {
                    pushFollow(FOLLOW_slotCallExpression_in_callExpression1830);
                    slotCall=slotCallExpression();

                    state._fsp--;

                     value = slotCall; 

                    }
                    break;
                case 2 :
                    // SQLScriptWalker.g:395:6: funcCall= funcCallExpression
                    {
                    pushFollow(FOLLOW_funcCallExpression_in_callExpression1841);
                    funcCall=funcCallExpression();

                    state._fsp--;

                     value = funcCall; 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "callExpression"


    // $ANTLR start "slotCallExpression"
    // SQLScriptWalker.g:400:1: slotCallExpression returns [ SlotCallExpression value ] : slotExpr= slotExpressionRHS (callArgs= argumentsList )? ;
    public final SlotCallExpression slotCallExpression() throws RecognitionException {
        SlotCallExpression value = null;

        SlotExpression slotExpr = null;

        Map<String, Expression> callArgs = null;


        try {
            // SQLScriptWalker.g:401:2: (slotExpr= slotExpressionRHS (callArgs= argumentsList )? )
            // SQLScriptWalker.g:401:4: slotExpr= slotExpressionRHS (callArgs= argumentsList )?
            {
            pushFollow(FOLLOW_slotExpressionRHS_in_slotCallExpression1869);
            slotExpr=slotExpressionRHS();

            state._fsp--;

             value = new SlotCallExpression(slotExpr); 
            // SQLScriptWalker.g:402:3: (callArgs= argumentsList )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ARGS) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // SQLScriptWalker.g:402:4: callArgs= argumentsList
                    {
                    pushFollow(FOLLOW_argumentsList_in_slotCallExpression1878);
                    callArgs=argumentsList();

                    state._fsp--;

                     value.setArguments(callArgs); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "slotCallExpression"


    // $ANTLR start "funcCallExpression"
    // SQLScriptWalker.g:405:1: funcCallExpression returns [ AbstractFunctionCallExpression value ] : (name= identifier | expr= expressionNoSlotExp ) (callArgs= argumentsList )? ;
    public final AbstractFunctionCallExpression funcCallExpression() throws RecognitionException {
        AbstractFunctionCallExpression value = null;

        String name = null;

        Expression expr = null;

        Map<String, Expression> callArgs = null;


        try {
            // SQLScriptWalker.g:406:2: ( (name= identifier | expr= expressionNoSlotExp ) (callArgs= argumentsList )? )
            // SQLScriptWalker.g:406:4: (name= identifier | expr= expressionNoSlotExp ) (callArgs= argumentsList )?
            {
            // SQLScriptWalker.g:406:4: (name= identifier | expr= expressionNoSlotExp )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==WORD||LA31_0==IDENTIFIER) ) {
                alt31=1;
            }
            else if ( (LA31_0==STRING||(LA31_0>=DECLARE_ASSIGN && LA31_0<=FUNC_CALL)||(LA31_0>=COND_EXPR && LA31_0<=OBJ)||(LA31_0>=INDEX && LA31_0<=NEW)||LA31_0==VARIABLE) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // SQLScriptWalker.g:406:6: name= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_funcCallExpression1901);
                    name=identifier();

                    state._fsp--;

                     value = new NamedFunctionCallExpression(name); 

                    }
                    break;
                case 2 :
                    // SQLScriptWalker.g:407:5: expr= expressionNoSlotExp
                    {
                    pushFollow(FOLLOW_expressionNoSlotExp_in_funcCallExpression1920);
                    expr=expressionNoSlotExp();

                    state._fsp--;

                     value = new FunctionCallExpression(expr); 

                    }
                    break;

            }

            // SQLScriptWalker.g:409:3: (callArgs= argumentsList )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ARGS) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // SQLScriptWalker.g:409:4: callArgs= argumentsList
                    {
                    pushFollow(FOLLOW_argumentsList_in_funcCallExpression1933);
                    callArgs=argumentsList();

                    state._fsp--;

                     value.setArguments(callArgs); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "funcCallExpression"


    // $ANTLR start "ternaryConditional"
    // SQLScriptWalker.g:412:1: ternaryConditional returns [ Expression value ] : ^( COND_EXPR cond= expression trueExp= expression falseExp= expression ) ;
    public final Expression ternaryConditional() throws RecognitionException {
        Expression value = null;

        Expression cond = null;

        Expression trueExp = null;

        Expression falseExp = null;


        try {
            // SQLScriptWalker.g:413:2: ( ^( COND_EXPR cond= expression trueExp= expression falseExp= expression ) )
            // SQLScriptWalker.g:413:4: ^( COND_EXPR cond= expression trueExp= expression falseExp= expression )
            {
            match(input,COND_EXPR,FOLLOW_COND_EXPR_in_ternaryConditional1953); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_ternaryConditional1957);
            cond=expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_ternaryConditional1961);
            trueExp=expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_ternaryConditional1965);
            falseExp=expression();

            state._fsp--;


            match(input, Token.UP, null); 

            			value = new TernaryCondExpression(cond, trueExp, falseExp);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "ternaryConditional"


    // $ANTLR start "orCondition"
    // SQLScriptWalker.g:418:1: orCondition returns [ Condition value ] : ^( COND_OR (expr= expression )+ ) ;
    public final Condition orCondition() throws RecognitionException {
        Condition value = null;

        Expression expr = null;


         List<Expression> expressions = new ArrayList<Expression>(); 
        try {
            // SQLScriptWalker.g:420:2: ( ^( COND_OR (expr= expression )+ ) )
            // SQLScriptWalker.g:420:4: ^( COND_OR (expr= expression )+ )
            {
            match(input,COND_OR,FOLLOW_COND_OR_in_orCondition1989); 

            match(input, Token.DOWN, null); 
            // SQLScriptWalker.g:420:14: (expr= expression )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==STRING||(LA33_0>=DECLARE_ASSIGN && LA33_0<=FUNC_CALL)||(LA33_0>=COND_EXPR && LA33_0<=SLOT)||(LA33_0>=INDEX && LA33_0<=NEW)||LA33_0==VARIABLE) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // SQLScriptWalker.g:420:15: expr= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_orCondition1994);
            	    expr=expression();

            	    state._fsp--;

            	     expressions.add(expr); 

            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);


            match(input, Token.UP, null); 

            			value = new ConditionOr(expressions);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "orCondition"


    // $ANTLR start "andCondition"
    // SQLScriptWalker.g:425:1: andCondition returns [ Condition value ] : ^( COND_AND (expr= expression )+ ) ;
    public final Condition andCondition() throws RecognitionException {
        Condition value = null;

        Expression expr = null;


         List<Expression> expressions = new ArrayList<Expression>(); 
        try {
            // SQLScriptWalker.g:427:2: ( ^( COND_AND (expr= expression )+ ) )
            // SQLScriptWalker.g:427:4: ^( COND_AND (expr= expression )+ )
            {
            match(input,COND_AND,FOLLOW_COND_AND_in_andCondition2022); 

            match(input, Token.DOWN, null); 
            // SQLScriptWalker.g:427:15: (expr= expression )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==STRING||(LA34_0>=DECLARE_ASSIGN && LA34_0<=FUNC_CALL)||(LA34_0>=COND_EXPR && LA34_0<=SLOT)||(LA34_0>=INDEX && LA34_0<=NEW)||LA34_0==VARIABLE) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // SQLScriptWalker.g:427:16: expr= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_andCondition2027);
            	    expr=expression();

            	    state._fsp--;

            	     expressions.add(expr); 

            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


            match(input, Token.UP, null); 

            			value = new ConditionAnd(expressions);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "andCondition"


    // $ANTLR start "eqCondition"
    // SQLScriptWalker.g:432:1: eqCondition returns [ Condition value ] : ^( COMP_EQ exp1= expression exp2= expression ) ;
    public final Condition eqCondition() throws RecognitionException {
        Condition value = null;

        Expression exp1 = null;

        Expression exp2 = null;


        try {
            // SQLScriptWalker.g:433:2: ( ^( COMP_EQ exp1= expression exp2= expression ) )
            // SQLScriptWalker.g:433:4: ^( COMP_EQ exp1= expression exp2= expression )
            {
            match(input,COMP_EQ,FOLLOW_COMP_EQ_in_eqCondition2050); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_eqCondition2054);
            exp1=expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_eqCondition2058);
            exp2=expression();

            state._fsp--;


            match(input, Token.UP, null); 

            			value = new ConditionEq(exp1, exp2);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "eqCondition"


    // $ANTLR start "notExpression"
    // SQLScriptWalker.g:438:1: notExpression returns [ Expression value ] : ^( NOT exp= expression ) ;
    public final Expression notExpression() throws RecognitionException {
        Expression value = null;

        Expression exp = null;


        try {
            // SQLScriptWalker.g:439:2: ( ^( NOT exp= expression ) )
            // SQLScriptWalker.g:439:4: ^( NOT exp= expression )
            {
            match(input,NOT,FOLLOW_NOT_in_notExpression2077); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_notExpression2081);
            exp=expression();

            state._fsp--;


            match(input, Token.UP, null); 

            			value = new NotExpression(exp);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "notExpression"


    // $ANTLR start "newExpression"
    // SQLScriptWalker.g:444:1: newExpression returns [ Expression value ] : ^( NEW exp= expression (args= argumentsList )? ) ;
    public final Expression newExpression() throws RecognitionException {
        Expression value = null;

        Expression exp = null;

        Map<String, Expression> args = null;


        try {
            // SQLScriptWalker.g:445:2: ( ^( NEW exp= expression (args= argumentsList )? ) )
            // SQLScriptWalker.g:445:4: ^( NEW exp= expression (args= argumentsList )? )
            {
            match(input,NEW,FOLLOW_NEW_in_newExpression2100); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_newExpression2104);
            exp=expression();

            state._fsp--;

            // SQLScriptWalker.g:445:25: (args= argumentsList )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ARGS) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // SQLScriptWalker.g:445:26: args= argumentsList
                    {
                    pushFollow(FOLLOW_argumentsList_in_newExpression2109);
                    args=argumentsList();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            			value = new NewExpression(exp, args);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "newExpression"


    // $ANTLR start "simpleExpression"
    // SQLScriptWalker.g:450:1: simpleExpression returns [ Expression value ] : (var= VARIABLE | THIS | str= stringLiteral | bool= booleanLiteral | obj= objectLiteral );
    public final Expression simpleExpression() throws RecognitionException {
        Expression value = null;

        CommonTree var=null;
        StringLiteral str = null;

        Bool bool = null;

        ObjectLiteral obj = null;


        try {
            // SQLScriptWalker.g:451:2: (var= VARIABLE | THIS | str= stringLiteral | bool= booleanLiteral | obj= objectLiteral )
            int alt36=5;
            switch ( input.LA(1) ) {
            case VARIABLE:
                {
                alt36=1;
                }
                break;
            case THIS:
                {
                alt36=2;
                }
                break;
            case STRING:
                {
                alt36=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt36=4;
                }
                break;
            case OBJ:
                {
                alt36=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // SQLScriptWalker.g:451:4: var= VARIABLE
                    {
                    var=(CommonTree)match(input,VARIABLE,FOLLOW_VARIABLE_in_simpleExpression2131); 
                     // TODO: factor out into separate rule
                    			//Variable v = ((Scope_scope)Scope_stack.peek()).scope.getVariable((var!=null?var.getText():null));
                    			//if (v == null) {
                    			//	// TODO: throw warning (variable not set)
                    			//	v = new Variable((var!=null?var.getText():null));
                    			//	((Scope_scope)Scope_stack.peek()).scope.setVariable((var!=null?var.getText():null), v);
                    			//}
                    			value = new VariableExpression((var!=null?var.getText():null));
                    		

                    }
                    break;
                case 2 :
                    // SQLScriptWalker.g:460:4: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_simpleExpression2138); 

                    			value = new VariableExpression("this");
                    		

                    }
                    break;
                case 3 :
                    // SQLScriptWalker.g:463:4: str= stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_simpleExpression2147);
                    str=stringLiteral();

                    state._fsp--;


                    			value = new StringLiteralExpression(str);
                    			//Scope::block.addStatement(new CreateString(str, value));
                    		

                    }
                    break;
                case 4 :
                    // SQLScriptWalker.g:467:4: bool= booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_simpleExpression2156);
                    bool=booleanLiteral();

                    state._fsp--;


                    			//Variable boolVar = new Variable();
                    			//boolVar.setValue(bool);
                    			//value = new VariableExpression(boolVar);
                    			value = new BooleanLiteralExpression(bool);
                    		

                    }
                    break;
                case 5 :
                    // SQLScriptWalker.g:473:4: obj= objectLiteral
                    {
                    pushFollow(FOLLOW_objectLiteral_in_simpleExpression2165);
                    obj=objectLiteral();

                    state._fsp--;


                    			value = new ObjectLiteralExpression(obj);
                    		

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "simpleExpression"


    // $ANTLR start "objectLiteral"
    // SQLScriptWalker.g:478:1: objectLiteral returns [ ObjectLiteral value ] : ^( OBJ (slot= objectSlot )* ) ;
    public final ObjectLiteral objectLiteral() throws RecognitionException {
        ObjectLiteral value = null;

        SQLScriptWalker.objectSlot_return slot = null;


         value = new ObjectLiteral(); 
        try {
            // SQLScriptWalker.g:480:2: ( ^( OBJ (slot= objectSlot )* ) )
            // SQLScriptWalker.g:480:4: ^( OBJ (slot= objectSlot )* )
            {
            match(input,OBJ,FOLLOW_OBJ_in_objectLiteral2188); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // SQLScriptWalker.g:480:10: (slot= objectSlot )*
                loop37:
                do {
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==SLOT) ) {
                        alt37=1;
                    }


                    switch (alt37) {
                	case 1 :
                	    // SQLScriptWalker.g:480:11: slot= objectSlot
                	    {
                	    pushFollow(FOLLOW_objectSlot_in_objectLiteral2193);
                	    slot=objectSlot();

                	    state._fsp--;

                	     value.putSlot((slot!=null?slot.key:null), (slot!=null?slot.value:null)); 

                	    }
                	    break;

                	default :
                	    break loop37;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "objectLiteral"

    public static class objectSlot_return extends TreeRuleReturnScope {
        public Expression key;
        public Expression value;
    };

    // $ANTLR start "objectSlot"
    // SQLScriptWalker.g:483:1: objectSlot returns [ Expression key, Expression value ] : ^( SLOT (id= identifierStringLiteral | str= stringLiteral ) expr= expression ) ;
    public final SQLScriptWalker.objectSlot_return objectSlot() throws RecognitionException {
        SQLScriptWalker.objectSlot_return retval = new SQLScriptWalker.objectSlot_return();
        retval.start = input.LT(1);

        StringLiteral id = null;

        StringLiteral str = null;

        Expression expr = null;


        try {
            // SQLScriptWalker.g:484:2: ( ^( SLOT (id= identifierStringLiteral | str= stringLiteral ) expr= expression ) )
            // SQLScriptWalker.g:484:4: ^( SLOT (id= identifierStringLiteral | str= stringLiteral ) expr= expression )
            {
            match(input,SLOT,FOLLOW_SLOT_in_objectSlot2214); 

            match(input, Token.DOWN, null); 
            // SQLScriptWalker.g:485:4: (id= identifierStringLiteral | str= stringLiteral )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==WORD||LA38_0==IDENTIFIER) ) {
                alt38=1;
            }
            else if ( (LA38_0==STRING) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // SQLScriptWalker.g:485:6: id= identifierStringLiteral
                    {
                    pushFollow(FOLLOW_identifierStringLiteral_in_objectSlot2223);
                    id=identifierStringLiteral();

                    state._fsp--;

                     retval.key = new StringLiteralExpression(id); 

                    }
                    break;
                case 2 :
                    // SQLScriptWalker.g:486:6: str= stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_objectSlot2234);
                    str=stringLiteral();

                    state._fsp--;

                     retval.key = new StringLiteralExpression(str); 

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_objectSlot2248);
            expr=expression();

            state._fsp--;

             retval.value = expr; 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "objectSlot"


    // $ANTLR start "parameter"
    // SQLScriptWalker.g:492:1: parameter returns [ Parameter value ] : PARAM_NAME pname= paramName ( PARAM_VALUE pval= paramValue )? ;
    public final Parameter parameter() throws RecognitionException {
        Parameter value = null;

        String pname = null;

        Expression pval = null;


         Expression paramValue = null; 
        try {
            // SQLScriptWalker.g:494:2: ( PARAM_NAME pname= paramName ( PARAM_VALUE pval= paramValue )? )
            // SQLScriptWalker.g:494:4: PARAM_NAME pname= paramName ( PARAM_VALUE pval= paramValue )?
            {
            match(input,PARAM_NAME,FOLLOW_PARAM_NAME_in_parameter2274); 
            pushFollow(FOLLOW_paramName_in_parameter2278);
            pname=paramName();

            state._fsp--;

            // SQLScriptWalker.g:494:31: ( PARAM_VALUE pval= paramValue )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==PARAM_VALUE) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // SQLScriptWalker.g:494:32: PARAM_VALUE pval= paramValue
                    {
                    match(input,PARAM_VALUE,FOLLOW_PARAM_VALUE_in_parameter2281); 
                    pushFollow(FOLLOW_paramValue_in_parameter2285);
                    pval=paramValue();

                    state._fsp--;

                     paramValue = pval; 

                    }
                    break;

            }


            			value = new Parameter();
            			value.setName(pname);
            			((Block_scope)Block_stack.peek()).block.addStatement(new InitParameter(value, paramValue));
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "parameter"


    // $ANTLR start "paramName"
    // SQLScriptWalker.g:501:1: paramName returns [ String value ] : id= identifier ;
    public final String paramName() throws RecognitionException {
        String value = null;

        String id = null;


        try {
            // SQLScriptWalker.g:502:2: (id= identifier )
            // SQLScriptWalker.g:502:4: id= identifier
            {
            pushFollow(FOLLOW_identifier_in_paramName2308);
            id=identifier();

            state._fsp--;

             value = id; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "paramName"


    // $ANTLR start "paramValue"
    // SQLScriptWalker.g:505:1: paramValue returns [ Expression value ] : expr= expression ;
    public final Expression paramValue() throws RecognitionException {
        Expression value = null;

        Expression expr = null;


        try {
            // SQLScriptWalker.g:506:2: (expr= expression )
            // SQLScriptWalker.g:506:4: expr= expression
            {
            pushFollow(FOLLOW_expression_in_paramValue2327);
            expr=expression();

            state._fsp--;

             value = expr; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "paramValue"


    // $ANTLR start "identifierExpression"
    // SQLScriptWalker.g:509:1: identifierExpression returns [ Expression value ] : id= identifier ;
    public final Expression identifierExpression() throws RecognitionException {
        Expression value = null;

        String id = null;


        try {
            // SQLScriptWalker.g:510:2: (id= identifier )
            // SQLScriptWalker.g:510:4: id= identifier
            {
            pushFollow(FOLLOW_identifier_in_identifierExpression2346);
            id=identifier();

            state._fsp--;

             value = new IdentifierExpression(id); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "identifierExpression"


    // $ANTLR start "identifier"
    // SQLScriptWalker.g:513:1: identifier returns [ String value ] : id= ( WORD | IDENTIFIER ) ;
    public final String identifier() throws RecognitionException {
        String value = null;

        CommonTree id=null;

        try {
            // SQLScriptWalker.g:514:2: (id= ( WORD | IDENTIFIER ) )
            // SQLScriptWalker.g:514:4: id= ( WORD | IDENTIFIER )
            {
            id=(CommonTree)input.LT(1);
            if ( input.LA(1)==WORD||input.LA(1)==IDENTIFIER ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             value = (id!=null?id.getText():null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "identifier"


    // $ANTLR start "sqlSpecialChars"
    // SQLScriptWalker.g:517:1: sqlSpecialChars returns [ String value ] : c= ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | EQUALS | BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | STR_SQUOT | STR_DQUOT | STR_BTICK ) ;
    public final String sqlSpecialChars() throws RecognitionException {
        String value = null;

        CommonTree c=null;

        try {
            // SQLScriptWalker.g:518:2: (c= ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | EQUALS | BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | STR_SQUOT | STR_DQUOT | STR_BTICK ) )
            // SQLScriptWalker.g:518:4: c= ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | EQUALS | BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON | STR_SQUOT | STR_DQUOT | STR_BTICK )
            {
            c=(CommonTree)input.LT(1);
            if ( input.LA(1)==ATSIGN||(input.LA(1)>=BACKSLASH && input.LA(1)<=EQUALS)||(input.LA(1)>=SQL_SPECIAL_CHAR && input.LA(1)<=RPAREN)||(input.LA(1)>=OP_DEFINE && input.LA(1)<=COLON)||(input.LA(1)>=STR_SQUOT && input.LA(1)<=STR_BTICK) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             value = (c!=null?c.getText():null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "sqlSpecialChars"


    // $ANTLR start "keyword"
    // SQLScriptWalker.g:525:1: keyword returns [ String value ] : kw= ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRUE | KW_FALSE ) ;
    public final String keyword() throws RecognitionException {
        String value = null;

        CommonTree kw=null;

        try {
            // SQLScriptWalker.g:526:2: (kw= ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRUE | KW_FALSE ) )
            // SQLScriptWalker.g:526:4: kw= ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRUE | KW_FALSE )
            {
            kw=(CommonTree)input.LT(1);
            if ( input.LA(1)==KW_SQL||input.LA(1)==KW_VAR||(input.LA(1)>=KW_IF && input.LA(1)<=KW_ELSE)||(input.LA(1)>=KW_TRUE && input.LA(1)<=KW_FALSE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             value = (kw!=null?kw.getText():null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "keyword"


    // $ANTLR start "stringLiteral"
    // SQLScriptWalker.g:529:1: stringLiteral returns [ StringLiteral value ] : ^( STRING start= ( SQUOT | DQUOT | BTICK ) (str= STRING_CONTENT | var= EMBEDDED_VARIABLE )* ( SQUOT | DQUOT | BTICK ) ) ;
    public final StringLiteral stringLiteral() throws RecognitionException {
        StringLiteral value = null;

        CommonTree start=null;
        CommonTree str=null;
        CommonTree var=null;

         List<Object> parts = new ArrayList<Object>(); 
        try {
            // SQLScriptWalker.g:531:2: ( ^( STRING start= ( SQUOT | DQUOT | BTICK ) (str= STRING_CONTENT | var= EMBEDDED_VARIABLE )* ( SQUOT | DQUOT | BTICK ) ) )
            // SQLScriptWalker.g:531:4: ^( STRING start= ( SQUOT | DQUOT | BTICK ) (str= STRING_CONTENT | var= EMBEDDED_VARIABLE )* ( SQUOT | DQUOT | BTICK ) )
            {
            match(input,STRING,FOLLOW_STRING_in_stringLiteral2534); 

            match(input, Token.DOWN, null); 
            start=(CommonTree)input.LT(1);
            if ( input.LA(1)==SQUOT||(input.LA(1)>=DQUOT && input.LA(1)<=BTICK) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // SQLScriptWalker.g:532:4: (str= STRING_CONTENT | var= EMBEDDED_VARIABLE )*
            loop40:
            do {
                int alt40=3;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==STRING_CONTENT) ) {
                    alt40=1;
                }
                else if ( (LA40_0==EMBEDDED_VARIABLE) ) {
                    alt40=2;
                }


                switch (alt40) {
            	case 1 :
            	    // SQLScriptWalker.g:532:6: str= STRING_CONTENT
            	    {
            	    str=(CommonTree)match(input,STRING_CONTENT,FOLLOW_STRING_CONTENT_in_stringLiteral2557); 
            	     parts.add((str!=null?str.getText():null)); 

            	    }
            	    break;
            	case 2 :
            	    // SQLScriptWalker.g:533:6: var= EMBEDDED_VARIABLE
            	    {
            	    var=(CommonTree)match(input,EMBEDDED_VARIABLE,FOLLOW_EMBEDDED_VARIABLE_in_stringLiteral2571); 
            	     parts.add(new Variable((var!=null?var.getText():null))); /*System.out.println("embedded str var: " + (var!=null?var.getText():null));*/ 

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( input.LA(1)==SQUOT||(input.LA(1)>=DQUOT && input.LA(1)<=BTICK) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input, Token.UP, null); 
             value = new StringLiteral((start!=null?start.getText():null), parts); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "stringLiteral"


    // $ANTLR start "identifierStringLiteral"
    // SQLScriptWalker.g:539:1: identifierStringLiteral returns [ StringLiteral value ] : id= identifier ;
    public final StringLiteral identifierStringLiteral() throws RecognitionException {
        StringLiteral value = null;

        String id = null;


         List<Object> parts = new ArrayList<Object>(); 
        try {
            // SQLScriptWalker.g:541:2: (id= identifier )
            // SQLScriptWalker.g:541:4: id= identifier
            {
            pushFollow(FOLLOW_identifier_in_identifierStringLiteral2621);
            id=identifier();

            state._fsp--;

             parts.add(id); value = new StringLiteral("'", parts); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "identifierStringLiteral"


    // $ANTLR start "booleanLiteral"
    // SQLScriptWalker.g:544:1: booleanLiteral returns [ Bool value ] : ( TRUE | FALSE );
    public final Bool booleanLiteral() throws RecognitionException {
        Bool value = null;

        try {
            // SQLScriptWalker.g:545:2: ( TRUE | FALSE )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==TRUE) ) {
                alt41=1;
            }
            else if ( (LA41_0==FALSE) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // SQLScriptWalker.g:545:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_booleanLiteral2638); 
                     value = Bool.TRUE; 

                    }
                    break;
                case 2 :
                    // SQLScriptWalker.g:546:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_booleanLiteral2646); 
                     value = Bool.FALSE; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "booleanLiteral"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_script81 = new BitSet(new long[]{0xC3FFC90F85800012L,0x0000000000000203L});
    public static final BitSet FOLLOW_sqlStmt_in_statement93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_evalStmt_in_statement98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmt_in_statement103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStmt_in_block125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStmt__in_blockStmt156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_blockStmt_184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_blockStmt_186 = new BitSet(new long[]{0xC3FFC90F85800018L,0x0000000000000203L});
    public static final BitSet FOLLOW_EVAL_CMD_in_evalStmt210 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_evalCommand_in_evalStmt217 = new BitSet(new long[]{0x000000000A000008L});
    public static final BitSet FOLLOW_evalParam_in_evalStmt227 = new BitSet(new long[]{0x000000000A000008L});
    public static final BitSet FOLLOW_annotation_in_evalStmt239 = new BitSet(new long[]{0x0000000008000008L});
    public static final BitSet FOLLOW_identifier_in_evalCommand264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVAL_ARG_in_evalParam282 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_in_evalParam286 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SQL_CMD_in_sqlStmt311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sqlStmtName_in_sqlStmt318 = new BitSet(new long[]{0x0000000008100018L,0x000017E01A7F1FE0L});
    public static final BitSet FOLLOW_sqlParam_in_sqlStmt329 = new BitSet(new long[]{0x0000000008100018L,0x000017E01A7F1FE0L});
    public static final BitSet FOLLOW_annotation_in_sqlStmt343 = new BitSet(new long[]{0x0000000008000008L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sqlStmtName377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_sqlParam402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_sqlParam415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlSpecialChars_in_sqlParam432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_sqlParam443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_sqlParam463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_sqlParam488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOT_in_annotation526 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationCommand_in_annotation533 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_annotationParam_in_annotation543 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_identifier_in_annotationCommand565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOT_ARG_in_annotationParam583 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_in_annotationParam587 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptStmt601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptTry_in_scriptStmt606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptThrow_in_scriptStmt611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptReturn_in_scriptStmt616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExit_in_scriptStmt621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_scriptStmt626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_scriptIfElse667 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_scriptIf_in_scriptIfElse669 = new BitSet(new long[]{0xC3FFC90F85800018L,0x0000000000000203L});
    public static final BitSet FOLLOW_scriptElse_in_scriptIfElse671 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_scriptIf700 = new BitSet(new long[]{0xC3FFC90F85800010L,0x0000000000000203L});
    public static final BitSet FOLLOW_block_in_scriptIf702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptElse721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_scriptElse730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_scriptTry753 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStmt_in_scriptTry757 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_scriptCatch_in_scriptTry768 = new BitSet(new long[]{0x0000300000000008L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry778 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry791 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CATCH_in_scriptCatch814 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_scriptCatch818 = new BitSet(new long[]{0xC3FFC90F85800018L,0x0000000000000203L});
    public static final BitSet FOLLOW_blockStmt_in_scriptCatch822 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FINALLY_in_scriptFinally841 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStmt_in_scriptFinally845 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROW_in_scriptThrow869 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_scriptThrow873 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_scriptReturn892 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_scriptReturn899 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXIT_in_scriptExit923 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_scriptExit930 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expressionStmt950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoSlotExp_in_expression969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotExpressionRHS_in_expression978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expressionNoSlotExp998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncCall_in_expressionNoSlotExp1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptDeclareAndAssign_in_expressionNoSlotExp1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptDeclare_in_expressionNoSlotExp1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptAssign_in_expressionNoSlotExp1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpressionRHS_in_expressionNoSlotExp1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_expressionNoSlotExp1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryConditional_in_expressionNoSlotExp1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orCondition_in_expressionNoSlotExp1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andCondition_in_expressionNoSlotExp1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eqCondition_in_expressionNoSlotExp1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpression_in_expressionNoSlotExp1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_expressionNoSlotExp1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expressionNoSlotExp1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_DEF_in_scriptFuncDef1144 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDef1149 = new BitSet(new long[]{0xC3FFC91F85800018L,0x0000000000000203L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDef1178 = new BitSet(new long[]{0xC3FFC90F85800018L,0x0000000000000203L});
    public static final BitSet FOLLOW_block_in_scriptFuncDef1204 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGS_in_argumentsDef1227 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_argumentsDef1232 = new BitSet(new long[]{0x0000000000000008L,0x0000002000000100L});
    public static final BitSet FOLLOW_FUNC_CALL_in_scriptFuncCall1255 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncCall1260 = new BitSet(new long[]{0x0000001000000008L});
    public static final BitSet FOLLOW_expression_in_scriptFuncCall1274 = new BitSet(new long[]{0x0000001000000008L});
    public static final BitSet FOLLOW_argumentsList_in_scriptFuncCall1297 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGS_in_argumentsList1327 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARG_EXPR_in_argumentsList1332 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_argumentsList1336 = new BitSet(new long[]{0xC3FFC90F80000010L,0x0000000000000203L});
    public static final BitSet FOLLOW_expression_in_argumentsList1340 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARG_TRUE_in_argumentsList1364 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_argumentsList1368 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARG_FALSE_in_argumentsList1392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_argumentsList1396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARE_ASSIGN_in_scriptDeclareAndAssign1463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_scriptDeclare_in_scriptDeclareAndAssign1470 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptDeclareAndAssign1479 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARE_in_scriptDeclare1502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VARIABLE_in_scriptDeclare1506 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_scriptAssign1529 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_assignVariable_in_scriptAssign1538 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignIndex_in_scriptAssign1549 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignSlot_in_scriptAssign1560 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARIABLE_in_assignVariable1588 = new BitSet(new long[]{0xC3FFC90F80000010L,0x0000000000000203L});
    public static final BitSet FOLLOW_expression_in_assignVariable1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpressionLHS_in_assignIndex1611 = new BitSet(new long[]{0xC3FFC90F80000010L,0x0000000000000203L});
    public static final BitSet FOLLOW_expression_in_assignIndex1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotExpressionLHS_in_assignSlot1632 = new BitSet(new long[]{0xC3FFC90F80000010L,0x0000000000000203L});
    public static final BitSet FOLLOW_expression_in_assignSlot1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpression__in_indexExpressionLHS1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpression__in_indexExpressionRHS1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDEX_in_indexExpression_1698 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_indexExpression_1702 = new BitSet(new long[]{0xC3FFC90F80000010L,0x0000000000000203L});
    public static final BitSet FOLLOW_expression_in_indexExpression_1706 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_slotExpression__in_slotExpressionLHS1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotExpression__in_slotExpressionRHS1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLOT_in_slotExpression_1769 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_slotExpression_1773 = new BitSet(new long[]{0xC3FFC90F80000010L,0x0000002000000303L});
    public static final BitSet FOLLOW_identifierExpression_in_slotExpression_1782 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_slotExpression_1793 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_callExpression1821 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_slotCallExpression_in_callExpression1830 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_funcCallExpression_in_callExpression1841 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_slotExpressionRHS_in_slotCallExpression1869 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_argumentsList_in_slotCallExpression1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_funcCallExpression1901 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_expressionNoSlotExp_in_funcCallExpression1920 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_argumentsList_in_funcCallExpression1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COND_EXPR_in_ternaryConditional1953 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_ternaryConditional1957 = new BitSet(new long[]{0xC3FFC90F80000010L,0x0000000000000203L});
    public static final BitSet FOLLOW_expression_in_ternaryConditional1961 = new BitSet(new long[]{0xC3FFC90F80000010L,0x0000000000000203L});
    public static final BitSet FOLLOW_expression_in_ternaryConditional1965 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COND_OR_in_orCondition1989 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_orCondition1994 = new BitSet(new long[]{0xC3FFC90F80000018L,0x0000000000000203L});
    public static final BitSet FOLLOW_COND_AND_in_andCondition2022 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_andCondition2027 = new BitSet(new long[]{0xC3FFC90F80000018L,0x0000000000000203L});
    public static final BitSet FOLLOW_COMP_EQ_in_eqCondition2050 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_eqCondition2054 = new BitSet(new long[]{0xC3FFC90F80000010L,0x0000000000000203L});
    public static final BitSet FOLLOW_expression_in_eqCondition2058 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notExpression2077 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_notExpression2081 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_in_newExpression2100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_newExpression2104 = new BitSet(new long[]{0x0000001000000008L});
    public static final BitSet FOLLOW_argumentsList_in_newExpression2109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARIABLE_in_simpleExpression2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_simpleExpression2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_simpleExpression2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_simpleExpression2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_simpleExpression2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJ_in_objectLiteral2188 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral2193 = new BitSet(new long[]{0x0200000000000008L});
    public static final BitSet FOLLOW_SLOT_in_objectSlot2214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifierStringLiteral_in_objectSlot2223 = new BitSet(new long[]{0xC3FFC90F80000010L,0x0000000000000203L});
    public static final BitSet FOLLOW_stringLiteral_in_objectSlot2234 = new BitSet(new long[]{0xC3FFC90F80000010L,0x0000000000000203L});
    public static final BitSet FOLLOW_expression_in_objectSlot2248 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAM_NAME_in_parameter2274 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000100L});
    public static final BitSet FOLLOW_paramName_in_parameter2278 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_PARAM_VALUE_in_parameter2281 = new BitSet(new long[]{0xC3FFC90F80000010L,0x0000000000000203L});
    public static final BitSet FOLLOW_paramValue_in_parameter2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_paramName2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_paramValue2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifierExpression2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_identifier2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sqlSpecialChars2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringLiteral2534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_stringLiteral2538 = new BitSet(new long[]{0x0000000000000F80L});
    public static final BitSet FOLLOW_STRING_CONTENT_in_stringLiteral2557 = new BitSet(new long[]{0x0000000000000F80L});
    public static final BitSet FOLLOW_EMBEDDED_VARIABLE_in_stringLiteral2571 = new BitSet(new long[]{0x0000000000000F80L});
    public static final BitSet FOLLOW_set_in_stringLiteral2584 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_identifier_in_identifierStringLiteral2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleanLiteral2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleanLiteral2646 = new BitSet(new long[]{0x0000000000000002L});

}