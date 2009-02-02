// $ANTLR 3.1.1 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g 2009-01-31 16:41:01

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "SQUOT", "STRING_CONTENT", "EMBEDDED_VARIABLE", "DQUOT", "BTICK", "SSTRING_CONTENT", "DSTRING_CONTENT", "BTSTRING_CONTENT", "ATSIGN", "VARNAME", "WORD_CHAR", "BLOCK", "EVAL_CMD", "EVAL_ARG", "SQL_CMD", "ANNOT", "ANNOT_ARG", "PARAM_NAME", "PARAM_VALUE", "DECLARE_ASSIGN", "DECLARE", "ASSIGN", "FUNC_DEF", "FUNC_CALL", "ARGS", "ARG_EXPR", "ARG_TRUE", "ARG_FALSE", "IF", "IF_BLOCK", "ELSE_BLOCK", "TRY", "CATCH", "FINALLY", "THROW", "RETURN", "EXIT", "COND_EXPR", "COND_AND", "COND_OR", "COMP_EQ", "NOT", "TRUE", "FALSE", "OBJ", "SLOT", "SLOT_CALL", "SLOT_GET", "IDX_CALL", "IDX_GET", "INDEX", "CALL", "THIS", "NEW", "SEP", "LCURLY", "RCURLY", "BACKSLASH", "EQUALS", "KW_SQL", "WORD", "VARIABLE", "SQL_SPECIAL_CHAR", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "OP_DEFINE", "OP_AND", "OP_OR", "OP_EQ", "EXCLAM", "QUESTION", "COLON", "DOT", "COMMA", "KW_VAR", "KW_FUN", "KW_IF", "KW_ELSE", "KW_TRY", "KW_CATCH", "KW_FINALLY", "KW_THROW", "KW_RETURN", "KW_EXIT", "KW_NEW", "KW_THIS", "IDENTIFIER", "KW_TRUE", "KW_FALSE", "STRING_START", "WS", "NL", "COMMENT", "LINE_COMMENT"
    };
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
    public String getGrammarFileName() { return "/home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g"; }


    	protected static int POS_RHS = 1;
    	protected static int POS_LHS = 2;

    	protected Observer[] observers = new Observer[] {};

    	public void run(Observer... observers) throws RecognitionException, SQLScriptRuntimeException, RuntimeException {
    		this.observers = observers;

    		boolean success = false;
    		try {
    			script();
    			success = true;
    		}
    		finally {
    			if (success) {
    				finish();
    			}
    			else {
    				try { finish(); }
    				catch (Exception ignored) {}
    			}
    		}
    	}

    	protected SQLScriptContext scriptContext = null;
    	
    	public SQLScriptContext getScriptContext() {
    		return scriptContext;
    	}
    	
    	public void setScriptContext(SQLScriptContext scriptContext) {
    		this.scriptContext = scriptContext;
    	}
    	
    	protected SQLScriptEngine scriptEngine = null;
    	
    	protected SQLScriptEngine engine() {
    		if (scriptEngine == null) {
    			if (scriptContext == null) {
    				throw new RuntimeException("No script context provided");
    			}
    			
    			scriptEngine = new SQLScriptEngine(scriptContext);
    			
    			for (Observer o : observers) {
    				scriptEngine.addObserver(o);
    			}
    		}
    		return scriptEngine;
    	}
    	
    	protected void finish() {
    		if (scriptEngine != null) {
    			scriptEngine.finish();
    		}
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
    	
    	protected List<Token> getOffchannelTokensBefore(int channel, int index) {
    		TokenStream tokens = input.getTokenStream();

    		List<Token> result = new LinkedList<Token>();
    		while (--index >= 0) {
    			Token token;
    			try {
    				token = tokens.get(index);
    			} catch (IndexOutOfBoundsException e) {
    				break;
    			}

    			if (channel != Token.HIDDEN_CHANNEL && token.getChannel() == Token.HIDDEN_CHANNEL) {
    				continue;
    			}

    			if (token.getChannel() == channel) {
    				result.add(0, token);
    			}
    			else {
    				break;
    			}
    		}

    		return result;
    	}

    	protected List<Token> getOffchannelTokensBefore(int channel, Object tree) {
    		if (tree == null) {
    			return getOffchannelTokensBefore(channel, -1);
    		}

    		int index = ((CommonTree)tree).getTokenStartIndex();
    		return getOffchannelTokensBefore(channel, index);
    	}



    // $ANTLR start "script"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:143:1: script : ( statement )* ;
    public final void script() throws RecognitionException {
        Block_stack.push(new Block_scope());
        Scope_stack.push(new Scope_scope());


        	((Scope_scope)Scope_stack.peek()).scope = new Scope();
        	((Block_scope)Block_stack.peek()).block = new Block(((Scope_scope)Scope_stack.peek()).scope);

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:153:2: ( ( statement )* )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:153:4: ( statement )*
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:153:4: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRING||(LA1_0>=BLOCK && LA1_0<=EVAL_CMD)||LA1_0==SQL_CMD||(LA1_0>=DECLARE_ASSIGN && LA1_0<=FUNC_CALL)||LA1_0==IF||LA1_0==TRY||(LA1_0>=THROW && LA1_0<=SLOT)||(LA1_0>=INDEX && LA1_0<=NEW)||LA1_0==VARIABLE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:153:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_script80);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	engine().process((Block)((Block_scope)Block_stack.peek()).block);
            	engine().finish();

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            Block_stack.pop();
            Scope_stack.pop();

        }
        return ;
    }
    // $ANTLR end "script"


    // $ANTLR start "statement"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:156:1: statement : ( sqlStmt | evalStmt | scriptStmt | block );
    public final void statement() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:157:2: ( sqlStmt | evalStmt | scriptStmt | block )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:157:4: sqlStmt
                    {
                    pushFollow(FOLLOW_sqlStmt_in_statement92);
                    sqlStmt();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:158:4: evalStmt
                    {
                    pushFollow(FOLLOW_evalStmt_in_statement97);
                    evalStmt();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:159:4: scriptStmt
                    {
                    pushFollow(FOLLOW_scriptStmt_in_statement102);
                    scriptStmt();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:160:4: block
                    {
                    pushFollow(FOLLOW_block_in_statement107);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:163:1: block returns [ Statement value ] : blk= blockStmt ;
    public final Statement block() throws RecognitionException {
        Statement value = null;

        Statement blk = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:164:2: (blk= blockStmt )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:164:4: blk= blockStmt
            {
            pushFollow(FOLLOW_blockStmt_in_block124);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:169:1: blockStmt returns [ Statement value ] : blk= blockStmt_ ;
    public final Statement blockStmt() throws RecognitionException {
        Scope_stack.push(new Scope_scope());

        Statement value = null;

        Statement blk = null;


         ((Scope_scope)Scope_stack.peek()).scope = new Scope(((Scope_scope)Scope_stack.elementAt(Scope_stack.size()-1-1)).scope); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:172:2: (blk= blockStmt_ )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:172:4: blk= blockStmt_
            {
            pushFollow(FOLLOW_blockStmt__in_blockStmt155);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:175:1: blockStmt_ returns [ Statement value ] : ^( BLOCK ( statement )* ) ;
    public final Statement blockStmt_() throws RecognitionException {
        Block_stack.push(new Block_scope());

        Statement value = null;


        	((Block_scope)Block_stack.peek()).block = new Block(((Scope_scope)Scope_stack.peek()).scope);
        	value = ((Block_scope)Block_stack.peek()).block;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:181:2: ( ^( BLOCK ( statement )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:181:4: ^( BLOCK ( statement )* )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_blockStmt_183); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:181:12: ( statement )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==STRING||(LA3_0>=BLOCK && LA3_0<=EVAL_CMD)||LA3_0==SQL_CMD||(LA3_0>=DECLARE_ASSIGN && LA3_0<=FUNC_CALL)||LA3_0==IF||LA3_0==TRY||(LA3_0>=THROW && LA3_0<=SLOT)||(LA3_0>=INDEX && LA3_0<=NEW)||LA3_0==VARIABLE) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:181:12: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_blockStmt_185);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:184:1: evalStmt : ^( EVAL_CMD evcmd= evalCommand (param= evalParam )* (annot= annotation )* ) ;
    public final void evalStmt() throws RecognitionException {
        String evcmd = null;

        Parameter param = null;

        AnnotationCommand annot = null;


         EvalCommand cmd = new EvalCommand(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:187:2: ( ^( EVAL_CMD evcmd= evalCommand (param= evalParam )* (annot= annotation )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:187:4: ^( EVAL_CMD evcmd= evalCommand (param= evalParam )* (annot= annotation )* )
            {
            match(input,EVAL_CMD,FOLLOW_EVAL_CMD_in_evalStmt209); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_evalCommand_in_evalStmt216);
            evcmd=evalCommand();

            state._fsp--;

             cmd.setName(evcmd); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:189:4: (param= evalParam )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==EVAL_ARG) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:189:5: param= evalParam
            	    {
            	    pushFollow(FOLLOW_evalParam_in_evalStmt226);
            	    param=evalParam();

            	    state._fsp--;

            	     cmd.addParam(param); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:190:4: (annot= annotation )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ANNOT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:190:5: annot= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_evalStmt238);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:194:1: evalCommand returns [ String value ] : cmd= identifier ;
    public final String evalCommand() throws RecognitionException {
        String value = null;

        String cmd = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:195:2: (cmd= identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:195:4: cmd= identifier
            {
            pushFollow(FOLLOW_identifier_in_evalCommand263);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:198:1: evalParam returns [ Parameter value ] : ^( EVAL_ARG param= parameter ) ;
    public final Parameter evalParam() throws RecognitionException {
        Parameter value = null;

        Parameter param = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:199:2: ( ^( EVAL_ARG param= parameter ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:199:4: ^( EVAL_ARG param= parameter )
            {
            match(input,EVAL_ARG,FOLLOW_EVAL_ARG_in_evalParam281); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_parameter_in_evalParam285);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:202:1: sqlStmt : ^( SQL_CMD name= sqlStmtName (param= sqlParam )* (annot= annotation )* ) ;
    public final void sqlStmt() throws RecognitionException {
        Object name = null;

        SQLScriptWalker.sqlParam_return param = null;

        AnnotationCommand annot = null;


         SQLStatement stmt = new SQLStatement(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:205:2: ( ^( SQL_CMD name= sqlStmtName (param= sqlParam )* (annot= annotation )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:205:4: ^( SQL_CMD name= sqlStmtName (param= sqlParam )* (annot= annotation )* )
            {
            match(input,SQL_CMD,FOLLOW_SQL_CMD_in_sqlStmt310); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_sqlStmtName_in_sqlStmt317);
            name=sqlStmtName();

            state._fsp--;

             stmt.addPart(name); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:207:4: (param= sqlParam )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==STRING||LA6_0==ATSIGN||(LA6_0>=BACKSLASH && LA6_0<=RPAREN)||(LA6_0>=OP_DEFINE && LA6_0<=COLON)||LA6_0==KW_VAR||(LA6_0>=KW_IF && LA6_0<=KW_ELSE)||(LA6_0>=IDENTIFIER && LA6_0<=KW_FALSE)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:207:5: param= sqlParam
            	    {
            	    pushFollow(FOLLOW_sqlParam_in_sqlStmt328);
            	    param=sqlParam();

            	    state._fsp--;


            	    				if ((param!=null?param.whitespace:null).length() > 0) {
            	    					stmt.addPart((param!=null?param.whitespace:null));
            	    				}
            	    				stmt.addPart((param!=null?param.value:null));
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:213:4: (annot= annotation )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ANNOT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:213:5: annot= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_sqlStmt342);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:217:1: sqlStmtName returns [ Object value ] : (name= WORD | var= ( VARIABLE | EMBEDDED_VARIABLE ) );
    public final Object sqlStmtName() throws RecognitionException {
        Object value = null;

        CommonTree name=null;
        CommonTree var=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:218:2: (name= WORD | var= ( VARIABLE | EMBEDDED_VARIABLE ) )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:218:4: name= WORD
                    {
                    name=(CommonTree)match(input,WORD,FOLLOW_WORD_in_sqlStmtName367); 
                     value = (name!=null?name.getText():null); 

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:219:4: var= ( VARIABLE | EMBEDDED_VARIABLE )
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

    public static class sqlParam_return extends TreeRuleReturnScope {
        public String whitespace;
        public Object value;
    };

    // $ANTLR start "sqlParam"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:222:1: sqlParam returns [ String whitespace, Object value ] : token= sqlToken ;
    public final SQLScriptWalker.sqlParam_return sqlParam() throws RecognitionException {
        SQLScriptWalker.sqlParam_return retval = new SQLScriptWalker.sqlParam_return();
        retval.start = input.LT(1);

        SQLScriptWalker.sqlToken_return token = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:223:2: (token= sqlToken )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:223:4: token= sqlToken
            {
            pushFollow(FOLLOW_sqlToken_in_sqlParam401);
            token=sqlToken();

            state._fsp--;


            			retval.value = (token!=null?token.value:null);

            			retval.whitespace = "";
            			List<Token> wsBefore = getOffchannelTokensBefore(SQLScriptParser.WHITESPACE_CHANNEL, (token!=null?((CommonTree)token.start):null));
            			for (Token ws : wsBefore) {
            				retval.whitespace += ws.getText();
            			}
            		

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
    // $ANTLR end "sqlParam"

    public static class sqlToken_return extends TreeRuleReturnScope {
        public Object value;
    };

    // $ANTLR start "sqlToken"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:234:1: sqlToken returns [ Object value ] : (str= stringLiteral | id= identifier | chr= sqlSpecialChars | kw= keyword | var= VARIABLE );
    public final SQLScriptWalker.sqlToken_return sqlToken() throws RecognitionException {
        SQLScriptWalker.sqlToken_return retval = new SQLScriptWalker.sqlToken_return();
        retval.start = input.LT(1);

        CommonTree var=null;
        StringLiteral str = null;

        String id = null;

        SQLScriptWalker.sqlSpecialChars_return chr = null;

        SQLScriptWalker.keyword_return kw = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:235:2: (str= stringLiteral | id= identifier | chr= sqlSpecialChars | kw= keyword | var= VARIABLE )
            int alt9=5;
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
            case VARIABLE:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:235:4: str= stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_sqlToken420);
                    str=stringLiteral();

                    state._fsp--;

                     retval.value = str; 

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:236:4: id= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_sqlToken433);
                    id=identifier();

                    state._fsp--;

                     retval.value = id; 

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:237:4: chr= sqlSpecialChars
                    {
                    pushFollow(FOLLOW_sqlSpecialChars_in_sqlToken450);
                    chr=sqlSpecialChars();

                    state._fsp--;

                     retval.value = (chr!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(chr.start),
                      input.getTreeAdaptor().getTokenStopIndex(chr.start))):null); 

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:238:4: kw= keyword
                    {
                    pushFollow(FOLLOW_keyword_in_sqlToken461);
                    kw=keyword();

                    state._fsp--;

                     retval.value = (kw!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(kw.start),
                      input.getTreeAdaptor().getTokenStopIndex(kw.start))):null); 

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:239:4: var= VARIABLE
                    {
                    var=(CommonTree)match(input,VARIABLE,FOLLOW_VARIABLE_in_sqlToken481); 
                     retval.value = ((Scope_scope)Scope_stack.peek()).scope.getVariable((var!=null?var.getText():null)); 

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
        return retval;
    }
    // $ANTLR end "sqlToken"


    // $ANTLR start "annotation"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:242:1: annotation returns [ AnnotationCommand value ] : ^( ANNOT cmd= annotationCommand (param= annotationParam )* ) ;
    public final AnnotationCommand annotation() throws RecognitionException {
        AnnotationCommand value = null;

        String cmd = null;

        Parameter param = null;


         value = new AnnotationCommand(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:245:2: ( ^( ANNOT cmd= annotationCommand (param= annotationParam )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:245:4: ^( ANNOT cmd= annotationCommand (param= annotationParam )* )
            {
            match(input,ANNOT,FOLLOW_ANNOT_in_annotation519); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_annotationCommand_in_annotation526);
            cmd=annotationCommand();

            state._fsp--;

             value.setName(cmd); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:247:4: (param= annotationParam )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ANNOT_ARG) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:247:5: param= annotationParam
            	    {
            	    pushFollow(FOLLOW_annotationParam_in_annotation536);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:250:1: annotationCommand returns [ String value ] : cmd= identifier ;
    public final String annotationCommand() throws RecognitionException {
        String value = null;

        String cmd = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:251:2: (cmd= identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:251:4: cmd= identifier
            {
            pushFollow(FOLLOW_identifier_in_annotationCommand558);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:254:1: annotationParam returns [ Parameter value ] : ^( ANNOT_ARG param= parameter ) ;
    public final Parameter annotationParam() throws RecognitionException {
        Parameter value = null;

        Parameter param = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:255:2: ( ^( ANNOT_ARG param= parameter ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:255:4: ^( ANNOT_ARG param= parameter )
            {
            match(input,ANNOT_ARG,FOLLOW_ANNOT_ARG_in_annotationParam576); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_parameter_in_annotationParam580);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:258:1: scriptStmt : ( scriptIfElse | scriptTry | scriptThrow | scriptReturn | scriptExit | expressionStmt );
    public final void scriptStmt() throws RecognitionException {
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:259:2: ( scriptIfElse | scriptTry | scriptThrow | scriptReturn | scriptExit | expressionStmt )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:259:4: scriptIfElse
                    {
                    pushFollow(FOLLOW_scriptIfElse_in_scriptStmt594);
                    scriptIfElse();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:260:4: scriptTry
                    {
                    pushFollow(FOLLOW_scriptTry_in_scriptStmt599);
                    scriptTry();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:261:4: scriptThrow
                    {
                    pushFollow(FOLLOW_scriptThrow_in_scriptStmt604);
                    scriptThrow();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:262:4: scriptReturn
                    {
                    pushFollow(FOLLOW_scriptReturn_in_scriptStmt609);
                    scriptReturn();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:263:4: scriptExit
                    {
                    pushFollow(FOLLOW_scriptExit_in_scriptStmt614);
                    scriptExit();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:264:4: expressionStmt
                    {
                    pushFollow(FOLLOW_expressionStmt_in_scriptStmt619);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:277:1: scriptIfElse returns [ Statement value ] : ^( IF scriptIf ( scriptElse )? ) ;
    public final Statement scriptIfElse() throws RecognitionException {
        Block_stack.push(new Block_scope());

        Statement value = null;

         ((Block_scope)Block_stack.peek()).block = new IfStatement(); value = ((Block_scope)Block_stack.peek()).block; 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:281:2: ( ^( IF scriptIf ( scriptElse )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:281:4: ^( IF scriptIf ( scriptElse )? )
            {
            match(input,IF,FOLLOW_IF_in_scriptIfElse660); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_scriptIf_in_scriptIfElse662);
            scriptIf();

            state._fsp--;

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:281:18: ( scriptElse )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==BLOCK||LA12_0==IF) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:281:18: scriptElse
                    {
                    pushFollow(FOLLOW_scriptElse_in_scriptIfElse664);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:284:1: scriptIf returns [ Statement value ] : expr= expression block ;
    public final Statement scriptIf() throws RecognitionException {
        Scope_stack.push(new Scope_scope());

        Statement value = null;

        Expression expr = null;


         ((Scope_scope)Scope_stack.peek()).scope = new Scope(((Scope_scope)Scope_stack.elementAt(Scope_stack.size()-1-1)).scope); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:287:2: (expr= expression block )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:287:4: expr= expression block
            {
            pushFollow(FOLLOW_expression_in_scriptIf693);
            expr=expression();

            state._fsp--;

            pushFollow(FOLLOW_block_in_scriptIf695);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:290:1: scriptElse returns [ Statement value ] : (elseIf= scriptIfElse | elseBlock= block );
    public final Statement scriptElse() throws RecognitionException {
        Statement value = null;

        Statement elseIf = null;

        Statement elseBlock = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:291:2: (elseIf= scriptIfElse | elseBlock= block )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:291:4: elseIf= scriptIfElse
                    {
                    pushFollow(FOLLOW_scriptIfElse_in_scriptElse714);
                    elseIf=scriptIfElse();

                    state._fsp--;

                     value = elseIf; 

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:292:4: elseBlock= block
                    {
                    pushFollow(FOLLOW_block_in_scriptElse723);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:295:1: scriptTry returns [ TryStatement value ] : ^( TRY blk= blockStmt (cat= scriptCatch (fin= scriptFinally )? | fin= scriptFinally ) ) ;
    public final TryStatement scriptTry() throws RecognitionException {
        TryStatement value = null;

        Statement blk = null;

        CatchStatement cat = null;

        FinallyStatement fin = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:297:2: ( ^( TRY blk= blockStmt (cat= scriptCatch (fin= scriptFinally )? | fin= scriptFinally ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:297:4: ^( TRY blk= blockStmt (cat= scriptCatch (fin= scriptFinally )? | fin= scriptFinally ) )
            {
            match(input,TRY,FOLLOW_TRY_in_scriptTry746); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_blockStmt_in_scriptTry750);
            blk=blockStmt();

            state._fsp--;

             value = new TryStatement(blk); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:297:67: (cat= scriptCatch (fin= scriptFinally )? | fin= scriptFinally )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:298:4: cat= scriptCatch (fin= scriptFinally )?
                    {
                    pushFollow(FOLLOW_scriptCatch_in_scriptTry761);
                    cat=scriptCatch();

                    state._fsp--;

                     value.setCatchClause(cat); 
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:299:4: (fin= scriptFinally )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==FINALLY) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:299:5: fin= scriptFinally
                            {
                            pushFollow(FOLLOW_scriptFinally_in_scriptTry771);
                            fin=scriptFinally();

                            state._fsp--;

                             value.setFinallyClause(fin); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:300:6: fin= scriptFinally
                    {
                    pushFollow(FOLLOW_scriptFinally_in_scriptTry784);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:304:1: scriptCatch returns [ CatchStatement value ] : ^( CATCH var= identifier blk= blockStmt ) ;
    public final CatchStatement scriptCatch() throws RecognitionException {
        CatchStatement value = null;

        String var = null;

        Statement blk = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:305:2: ( ^( CATCH var= identifier blk= blockStmt ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:305:4: ^( CATCH var= identifier blk= blockStmt )
            {
            match(input,CATCH,FOLLOW_CATCH_in_scriptCatch807); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_identifier_in_scriptCatch811);
            var=identifier();

            state._fsp--;

            pushFollow(FOLLOW_blockStmt_in_scriptCatch815);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:310:1: scriptFinally returns [ FinallyStatement value ] : ^( FINALLY blk= blockStmt ) ;
    public final FinallyStatement scriptFinally() throws RecognitionException {
        FinallyStatement value = null;

        Statement blk = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:311:2: ( ^( FINALLY blk= blockStmt ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:311:4: ^( FINALLY blk= blockStmt )
            {
            match(input,FINALLY,FOLLOW_FINALLY_in_scriptFinally834); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_blockStmt_in_scriptFinally838);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:314:1: scriptThrow returns [ ThrowStatement value ] : ^( THROW expr= expression ) ;
    public final ThrowStatement scriptThrow() throws RecognitionException {
        ThrowStatement value = null;

        Expression expr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:316:2: ( ^( THROW expr= expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:316:4: ^( THROW expr= expression )
            {
            match(input,THROW,FOLLOW_THROW_in_scriptThrow862); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_scriptThrow866);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:319:1: scriptReturn returns [ ReturnStatement value ] : ^( RETURN (expr= expression )? ) ;
    public final ReturnStatement scriptReturn() throws RecognitionException {
        ReturnStatement value = null;

        Expression expr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:320:2: ( ^( RETURN (expr= expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:320:4: ^( RETURN (expr= expression )? )
            {
            match(input,RETURN,FOLLOW_RETURN_in_scriptReturn885); 

             value = new ReturnStatement(); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:320:49: (expr= expression )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==STRING||(LA16_0>=DECLARE_ASSIGN && LA16_0<=FUNC_CALL)||(LA16_0>=COND_EXPR && LA16_0<=SLOT)||(LA16_0>=INDEX && LA16_0<=NEW)||LA16_0==VARIABLE) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:320:50: expr= expression
                        {
                        pushFollow(FOLLOW_expression_in_scriptReturn892);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:325:1: scriptExit returns [ ExitStatement value ] : ^( EXIT (expr= expression )? ) ;
    public final ExitStatement scriptExit() throws RecognitionException {
        ExitStatement value = null;

        Expression expr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:326:2: ( ^( EXIT (expr= expression )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:326:4: ^( EXIT (expr= expression )? )
            {
            match(input,EXIT,FOLLOW_EXIT_in_scriptExit916); 

             value = new ExitStatement(); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:326:45: (expr= expression )?
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==STRING||(LA17_0>=DECLARE_ASSIGN && LA17_0<=FUNC_CALL)||(LA17_0>=COND_EXPR && LA17_0<=SLOT)||(LA17_0>=INDEX && LA17_0<=NEW)||LA17_0==VARIABLE) ) {
                    alt17=1;
                }
                switch (alt17) {
                    case 1 :
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:326:46: expr= expression
                        {
                        pushFollow(FOLLOW_expression_in_scriptExit923);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:331:1: expressionStmt : expr= expression ;
    public final void expressionStmt() throws RecognitionException {
        Expression expr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:332:2: (expr= expression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:332:4: expr= expression
            {
            pushFollow(FOLLOW_expression_in_expressionStmt943);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:335:1: expression returns [ Expression value ] : (ex= expressionNoSlotExp | st= slotExpressionRHS );
    public final Expression expression() throws RecognitionException {
        Expression value = null;

        Expression ex = null;

        SlotExpression st = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:336:2: (ex= expressionNoSlotExp | st= slotExpressionRHS )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:336:4: ex= expressionNoSlotExp
                    {
                    pushFollow(FOLLOW_expressionNoSlotExp_in_expression962);
                    ex=expressionNoSlotExp();

                    state._fsp--;

                     value = ex; 

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:337:4: st= slotExpressionRHS
                    {
                    pushFollow(FOLLOW_slotExpressionRHS_in_expression971);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:340:1: expressionNoSlotExp returns [ Expression value ] : (fd= scriptFuncDef | fc= scriptFuncCall | da= scriptDeclareAndAssign | de= scriptDeclare | ae= scriptAssign | ix= indexExpressionRHS | cl= callExpression | tc= ternaryConditional | oc= orCondition | ac= andCondition | ec= eqCondition | nexp= notExpression | newx= newExpression | sexp= simpleExpression );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:341:2: (fd= scriptFuncDef | fc= scriptFuncCall | da= scriptDeclareAndAssign | de= scriptDeclare | ae= scriptAssign | ix= indexExpressionRHS | cl= callExpression | tc= ternaryConditional | oc= orCondition | ac= andCondition | ec= eqCondition | nexp= notExpression | newx= newExpression | sexp= simpleExpression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:341:4: fd= scriptFuncDef
                    {
                    pushFollow(FOLLOW_scriptFuncDef_in_expressionNoSlotExp991);
                    fd=scriptFuncDef();

                    state._fsp--;

                     value = fd; 

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:342:4: fc= scriptFuncCall
                    {
                    pushFollow(FOLLOW_scriptFuncCall_in_expressionNoSlotExp1000);
                    fc=scriptFuncCall();

                    state._fsp--;

                     value = fc; 

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:343:4: da= scriptDeclareAndAssign
                    {
                    pushFollow(FOLLOW_scriptDeclareAndAssign_in_expressionNoSlotExp1009);
                    da=scriptDeclareAndAssign();

                    state._fsp--;

                     value = da; 

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:344:4: de= scriptDeclare
                    {
                    pushFollow(FOLLOW_scriptDeclare_in_expressionNoSlotExp1018);
                    de=scriptDeclare();

                    state._fsp--;

                     value = de; 

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:345:4: ae= scriptAssign
                    {
                    pushFollow(FOLLOW_scriptAssign_in_expressionNoSlotExp1027);
                    ae=scriptAssign();

                    state._fsp--;

                     value = ae; 

                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:346:4: ix= indexExpressionRHS
                    {
                    pushFollow(FOLLOW_indexExpressionRHS_in_expressionNoSlotExp1036);
                    ix=indexExpressionRHS();

                    state._fsp--;

                     value = ix; 

                    }
                    break;
                case 7 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:347:4: cl= callExpression
                    {
                    pushFollow(FOLLOW_callExpression_in_expressionNoSlotExp1045);
                    cl=callExpression();

                    state._fsp--;

                     value = cl; 

                    }
                    break;
                case 8 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:348:4: tc= ternaryConditional
                    {
                    pushFollow(FOLLOW_ternaryConditional_in_expressionNoSlotExp1054);
                    tc=ternaryConditional();

                    state._fsp--;

                     value = tc; 

                    }
                    break;
                case 9 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:349:4: oc= orCondition
                    {
                    pushFollow(FOLLOW_orCondition_in_expressionNoSlotExp1063);
                    oc=orCondition();

                    state._fsp--;

                     value = oc; 

                    }
                    break;
                case 10 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:350:4: ac= andCondition
                    {
                    pushFollow(FOLLOW_andCondition_in_expressionNoSlotExp1072);
                    ac=andCondition();

                    state._fsp--;

                     value = ac; 

                    }
                    break;
                case 11 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:351:4: ec= eqCondition
                    {
                    pushFollow(FOLLOW_eqCondition_in_expressionNoSlotExp1081);
                    ec=eqCondition();

                    state._fsp--;

                     value = ec; 

                    }
                    break;
                case 12 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:352:4: nexp= notExpression
                    {
                    pushFollow(FOLLOW_notExpression_in_expressionNoSlotExp1090);
                    nexp=notExpression();

                    state._fsp--;

                     value = nexp; 

                    }
                    break;
                case 13 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:353:4: newx= newExpression
                    {
                    pushFollow(FOLLOW_newExpression_in_expressionNoSlotExp1099);
                    newx=newExpression();

                    state._fsp--;

                     value = newx; 

                    }
                    break;
                case 14 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:354:4: sexp= simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expressionNoSlotExp1108);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:357:1: scriptFuncDef returns [ FunctionDefinitionExpression value ] : ^( FUNC_DEF (name= identifier )? (args= argumentsDef )? block ) ;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:366:2: ( ^( FUNC_DEF (name= identifier )? (args= argumentsDef )? block ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:366:4: ^( FUNC_DEF (name= identifier )? (args= argumentsDef )? block )
            {
            match(input,FUNC_DEF,FOLLOW_FUNC_DEF_in_scriptFuncDef1137); 

            match(input, Token.DOWN, null); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:366:15: (name= identifier )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==WORD||LA20_0==IDENTIFIER) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:366:16: name= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_scriptFuncDef1142);
                    name=identifier();

                    state._fsp--;

                     function.setName(name); 

                    }
                    break;

            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:367:21: (args= argumentsDef )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ARGS) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:367:22: args= argumentsDef
                    {
                    pushFollow(FOLLOW_argumentsDef_in_scriptFuncDef1171);
                    args=argumentsDef();

                    state._fsp--;

                     function.setArguments(args); 

                    }
                    break;

            }

            pushFollow(FOLLOW_block_in_scriptFuncDef1197);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:372:1: argumentsDef returns [ List<String> value ] : ^( ARGS (name= identifier )+ ) ;
    public final List<String> argumentsDef() throws RecognitionException {
        List<String> value = null;

        String name = null;


         value = new ArrayList<String>(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:374:2: ( ^( ARGS (name= identifier )+ ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:374:4: ^( ARGS (name= identifier )+ )
            {
            match(input,ARGS,FOLLOW_ARGS_in_argumentsDef1220); 

            match(input, Token.DOWN, null); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:374:11: (name= identifier )+
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
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:374:12: name= identifier
            	    {
            	    pushFollow(FOLLOW_identifier_in_argumentsDef1225);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:379:1: scriptFuncCall returns [ AbstractFunctionCallExpression value ] : ^( FUNC_CALL (name= identifier | expr= expression ) (args= argumentsList )? ) ;
    public final AbstractFunctionCallExpression scriptFuncCall() throws RecognitionException {
        AbstractFunctionCallExpression value = null;

        String name = null;

        Expression expr = null;

        Map<String, Expression> args = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:380:2: ( ^( FUNC_CALL (name= identifier | expr= expression ) (args= argumentsList )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:380:4: ^( FUNC_CALL (name= identifier | expr= expression ) (args= argumentsList )? )
            {
            match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_scriptFuncCall1248); 

            match(input, Token.DOWN, null); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:380:16: (name= identifier | expr= expression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:380:17: name= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_scriptFuncCall1253);
                    name=identifier();

                    state._fsp--;

                     value = new NamedFunctionCallExpression(name); 

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:381:9: expr= expression
                    {
                    pushFollow(FOLLOW_expression_in_scriptFuncCall1267);
                    expr=expression();

                    state._fsp--;

                     value = new FunctionCallExpression(expr); 

                    }
                    break;

            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:383:8: (args= argumentsList )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ARGS) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:383:9: args= argumentsList
                    {
                    pushFollow(FOLLOW_argumentsList_in_scriptFuncCall1290);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:388:1: argumentsList returns [ Map<String, Expression> value ] : ^( ARGS ( ( ^( ARG_EXPR name= identifier expr= expression ) | ^( ARG_TRUE name= identifier ) | ^( ARG_FALSE name= identifier ) ) )+ ) ;
    public final Map<String, Expression> argumentsList() throws RecognitionException {
        Map<String, Expression> value = null;

        String name = null;

        Expression expr = null;


         value = new HashMap<String, Expression>(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:390:2: ( ^( ARGS ( ( ^( ARG_EXPR name= identifier expr= expression ) | ^( ARG_TRUE name= identifier ) | ^( ARG_FALSE name= identifier ) ) )+ ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:390:4: ^( ARGS ( ( ^( ARG_EXPR name= identifier expr= expression ) | ^( ARG_TRUE name= identifier ) | ^( ARG_FALSE name= identifier ) ) )+ )
            {
            match(input,ARGS,FOLLOW_ARGS_in_argumentsList1320); 

            match(input, Token.DOWN, null); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:390:11: ( ( ^( ARG_EXPR name= identifier expr= expression ) | ^( ARG_TRUE name= identifier ) | ^( ARG_FALSE name= identifier ) ) )+
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
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:390:12: ( ^( ARG_EXPR name= identifier expr= expression ) | ^( ARG_TRUE name= identifier ) | ^( ARG_FALSE name= identifier ) )
            	    {
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:390:12: ( ^( ARG_EXPR name= identifier expr= expression ) | ^( ARG_TRUE name= identifier ) | ^( ARG_FALSE name= identifier ) )
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
            	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:390:13: ^( ARG_EXPR name= identifier expr= expression )
            	            {
            	            match(input,ARG_EXPR,FOLLOW_ARG_EXPR_in_argumentsList1325); 

            	            match(input, Token.DOWN, null); 
            	            pushFollow(FOLLOW_identifier_in_argumentsList1329);
            	            name=identifier();

            	            state._fsp--;

            	            pushFollow(FOLLOW_expression_in_argumentsList1333);
            	            expr=expression();

            	            state._fsp--;

            	             value.put(name, expr); 

            	            match(input, Token.UP, null); 

            	            }
            	            break;
            	        case 2 :
            	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:391:19: ^( ARG_TRUE name= identifier )
            	            {
            	            match(input,ARG_TRUE,FOLLOW_ARG_TRUE_in_argumentsList1357); 

            	            match(input, Token.DOWN, null); 
            	            pushFollow(FOLLOW_identifier_in_argumentsList1361);
            	            name=identifier();

            	            state._fsp--;

            	             value.put(name, new BooleanLiteralExpression(Bool.TRUE)); 

            	            match(input, Token.UP, null); 

            	            }
            	            break;
            	        case 3 :
            	            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:392:19: ^( ARG_FALSE name= identifier )
            	            {
            	            match(input,ARG_FALSE,FOLLOW_ARG_FALSE_in_argumentsList1385); 

            	            match(input, Token.DOWN, null); 
            	            pushFollow(FOLLOW_identifier_in_argumentsList1389);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:401:1: scriptDeclareAndAssign returns [ Expression value ] : ^( DECLARE_ASSIGN declare= scriptDeclare assign= scriptAssign ) ;
    public final Expression scriptDeclareAndAssign() throws RecognitionException {
        Expression value = null;

        DeclareVariableExpression declare = null;

        Expression assign = null;


         Expression decl = null; 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:403:2: ( ^( DECLARE_ASSIGN declare= scriptDeclare assign= scriptAssign ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:403:4: ^( DECLARE_ASSIGN declare= scriptDeclare assign= scriptAssign )
            {
            match(input,DECLARE_ASSIGN,FOLLOW_DECLARE_ASSIGN_in_scriptDeclareAndAssign1456); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_scriptDeclare_in_scriptDeclareAndAssign1463);
            declare=scriptDeclare();

            state._fsp--;

             decl = declare; 
            pushFollow(FOLLOW_scriptAssign_in_scriptDeclareAndAssign1472);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:417:1: scriptDeclare returns [ DeclareVariableExpression value ] : ^( DECLARE var= VARIABLE ) ;
    public final DeclareVariableExpression scriptDeclare() throws RecognitionException {
        DeclareVariableExpression value = null;

        CommonTree var=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:418:2: ( ^( DECLARE var= VARIABLE ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:418:4: ^( DECLARE var= VARIABLE )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_scriptDeclare1495); 

            match(input, Token.DOWN, null); 
            var=(CommonTree)match(input,VARIABLE,FOLLOW_VARIABLE_in_scriptDeclare1499); 

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:428:1: scriptAssign returns [ Expression value ] : ^( ASSIGN (varExp= assignVariable | idxExp= assignIndex | slotExp= assignSlot ) ) ;
    public final Expression scriptAssign() throws RecognitionException {
        Expression value = null;

        Expression varExp = null;

        Expression idxExp = null;

        Expression slotExp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:429:2: ( ^( ASSIGN (varExp= assignVariable | idxExp= assignIndex | slotExp= assignSlot ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:429:4: ^( ASSIGN (varExp= assignVariable | idxExp= assignIndex | slotExp= assignSlot ) )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_scriptAssign1522); 

            match(input, Token.DOWN, null); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:430:4: (varExp= assignVariable | idxExp= assignIndex | slotExp= assignSlot )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:430:6: varExp= assignVariable
                    {
                    pushFollow(FOLLOW_assignVariable_in_scriptAssign1531);
                    varExp=assignVariable();

                    state._fsp--;

                     value = varExp; 

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:431:6: idxExp= assignIndex
                    {
                    pushFollow(FOLLOW_assignIndex_in_scriptAssign1542);
                    idxExp=assignIndex();

                    state._fsp--;

                     value = idxExp; 

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:432:6: slotExp= assignSlot
                    {
                    pushFollow(FOLLOW_assignSlot_in_scriptAssign1553);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:437:1: assignVariable returns [ Expression value ] : lval= VARIABLE rval= expression ;
    public final Expression assignVariable() throws RecognitionException {
        Expression value = null;

        CommonTree lval=null;
        Expression rval = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:438:2: (lval= VARIABLE rval= expression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:438:4: lval= VARIABLE rval= expression
            {
            lval=(CommonTree)match(input,VARIABLE,FOLLOW_VARIABLE_in_assignVariable1581); 
            pushFollow(FOLLOW_expression_in_assignVariable1585);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:456:1: assignIndex returns [ Expression value ] : lval= indexExpressionLHS rval= expression ;
    public final Expression assignIndex() throws RecognitionException {
        Expression value = null;

        Expression lval = null;

        Expression rval = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:457:2: (lval= indexExpressionLHS rval= expression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:457:4: lval= indexExpressionLHS rval= expression
            {
            pushFollow(FOLLOW_indexExpressionLHS_in_assignIndex1604);
            lval=indexExpressionLHS();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_assignIndex1608);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:460:1: assignSlot returns [ Expression value ] : lval= slotExpressionLHS rval= expression ;
    public final Expression assignSlot() throws RecognitionException {
        Expression value = null;

        SlotExpression lval = null;

        Expression rval = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:461:2: (lval= slotExpressionLHS rval= expression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:461:4: lval= slotExpressionLHS rval= expression
            {
            pushFollow(FOLLOW_slotExpressionLHS_in_assignSlot1625);
            lval=slotExpressionLHS();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_assignSlot1629);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:465:1: indexExpressionLHS returns [ Expression value ] : exp= indexExpression_[POS_LHS] ;
    public final Expression indexExpressionLHS() throws RecognitionException {
        Expression value = null;

        Expression exp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:466:2: (exp= indexExpression_[POS_LHS] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:466:4: exp= indexExpression_[POS_LHS]
            {
            pushFollow(FOLLOW_indexExpression__in_indexExpressionLHS1650);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:469:1: indexExpressionRHS returns [ Expression value ] : exp= indexExpression_[POS_RHS] ;
    public final Expression indexExpressionRHS() throws RecognitionException {
        Expression value = null;

        Expression exp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:470:2: (exp= indexExpression_[POS_RHS] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:470:4: exp= indexExpression_[POS_RHS]
            {
            pushFollow(FOLLOW_indexExpression__in_indexExpressionRHS1670);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:473:1: indexExpression_[ int pos ] returns [ Expression value ] : ^( INDEX receiver= expression index= expression ) ;
    public final Expression indexExpression_(int pos) throws RecognitionException {
        Expression value = null;

        Expression receiver = null;

        Expression index = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:474:2: ( ^( INDEX receiver= expression index= expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:474:4: ^( INDEX receiver= expression index= expression )
            {
            match(input,INDEX,FOLLOW_INDEX_in_indexExpression_1691); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_indexExpression_1695);
            receiver=expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_indexExpression_1699);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:478:1: slotExpressionLHS returns [ SlotExpression value ] : exp= slotExpression_[POS_LHS] ;
    public final SlotExpression slotExpressionLHS() throws RecognitionException {
        SlotExpression value = null;

        SlotExpression exp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:479:2: (exp= slotExpression_[POS_LHS] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:479:4: exp= slotExpression_[POS_LHS]
            {
            pushFollow(FOLLOW_slotExpression__in_slotExpressionLHS1721);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:482:1: slotExpressionRHS returns [ SlotExpression value ] : exp= slotExpression_[POS_RHS] ;
    public final SlotExpression slotExpressionRHS() throws RecognitionException {
        SlotExpression value = null;

        SlotExpression exp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:483:2: (exp= slotExpression_[POS_RHS] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:483:4: exp= slotExpression_[POS_RHS]
            {
            pushFollow(FOLLOW_slotExpression__in_slotExpressionRHS1741);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:486:1: slotExpression_[ int pos ] returns [ SlotExpression value ] : ^( SLOT receiver= expression (slotName= identifierExpression | slotExpr= expression ) ) ;
    public final SlotExpression slotExpression_(int pos) throws RecognitionException {
        SlotExpression value = null;

        Expression receiver = null;

        Expression slotName = null;

        Expression slotExpr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:487:2: ( ^( SLOT receiver= expression (slotName= identifierExpression | slotExpr= expression ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:487:4: ^( SLOT receiver= expression (slotName= identifierExpression | slotExpr= expression ) )
            {
            match(input,SLOT,FOLLOW_SLOT_in_slotExpression_1762); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_slotExpression_1766);
            receiver=expression();

            state._fsp--;

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:488:4: (slotName= identifierExpression | slotExpr= expression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:488:6: slotName= identifierExpression
                    {
                    pushFollow(FOLLOW_identifierExpression_in_slotExpression_1775);
                    slotName=identifierExpression();

                    state._fsp--;

                     value = new SlotExpression(receiver, slotName); 

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:489:6: slotExpr= expression
                    {
                    pushFollow(FOLLOW_expression_in_slotExpression_1786);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:494:1: callExpression returns [ Expression value ] : ^( CALL (slotCall= slotCallExpression | funcCall= funcCallExpression ) ) ;
    public final Expression callExpression() throws RecognitionException {
        Expression value = null;

        SlotCallExpression slotCall = null;

        AbstractFunctionCallExpression funcCall = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:495:2: ( ^( CALL (slotCall= slotCallExpression | funcCall= funcCallExpression ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:495:4: ^( CALL (slotCall= slotCallExpression | funcCall= funcCallExpression ) )
            {
            match(input,CALL,FOLLOW_CALL_in_callExpression1814); 

            match(input, Token.DOWN, null); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:496:4: (slotCall= slotCallExpression | funcCall= funcCallExpression )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:496:6: slotCall= slotCallExpression
                    {
                    pushFollow(FOLLOW_slotCallExpression_in_callExpression1823);
                    slotCall=slotCallExpression();

                    state._fsp--;

                     value = slotCall; 

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:497:6: funcCall= funcCallExpression
                    {
                    pushFollow(FOLLOW_funcCallExpression_in_callExpression1834);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:502:1: slotCallExpression returns [ SlotCallExpression value ] : slotExpr= slotExpressionRHS (callArgs= argumentsList )? ;
    public final SlotCallExpression slotCallExpression() throws RecognitionException {
        SlotCallExpression value = null;

        SlotExpression slotExpr = null;

        Map<String, Expression> callArgs = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:503:2: (slotExpr= slotExpressionRHS (callArgs= argumentsList )? )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:503:4: slotExpr= slotExpressionRHS (callArgs= argumentsList )?
            {
            pushFollow(FOLLOW_slotExpressionRHS_in_slotCallExpression1862);
            slotExpr=slotExpressionRHS();

            state._fsp--;

             value = new SlotCallExpression(slotExpr); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:504:3: (callArgs= argumentsList )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ARGS) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:504:4: callArgs= argumentsList
                    {
                    pushFollow(FOLLOW_argumentsList_in_slotCallExpression1871);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:507:1: funcCallExpression returns [ AbstractFunctionCallExpression value ] : (name= identifier | expr= expressionNoSlotExp ) (callArgs= argumentsList )? ;
    public final AbstractFunctionCallExpression funcCallExpression() throws RecognitionException {
        AbstractFunctionCallExpression value = null;

        String name = null;

        Expression expr = null;

        Map<String, Expression> callArgs = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:508:2: ( (name= identifier | expr= expressionNoSlotExp ) (callArgs= argumentsList )? )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:508:4: (name= identifier | expr= expressionNoSlotExp ) (callArgs= argumentsList )?
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:508:4: (name= identifier | expr= expressionNoSlotExp )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:508:6: name= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_funcCallExpression1894);
                    name=identifier();

                    state._fsp--;

                     value = new NamedFunctionCallExpression(name); 

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:509:5: expr= expressionNoSlotExp
                    {
                    pushFollow(FOLLOW_expressionNoSlotExp_in_funcCallExpression1913);
                    expr=expressionNoSlotExp();

                    state._fsp--;

                     value = new FunctionCallExpression(expr); 

                    }
                    break;

            }

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:511:3: (callArgs= argumentsList )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ARGS) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:511:4: callArgs= argumentsList
                    {
                    pushFollow(FOLLOW_argumentsList_in_funcCallExpression1926);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:514:1: ternaryConditional returns [ Expression value ] : ^( COND_EXPR cond= expression trueExp= expression falseExp= expression ) ;
    public final Expression ternaryConditional() throws RecognitionException {
        Expression value = null;

        Expression cond = null;

        Expression trueExp = null;

        Expression falseExp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:515:2: ( ^( COND_EXPR cond= expression trueExp= expression falseExp= expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:515:4: ^( COND_EXPR cond= expression trueExp= expression falseExp= expression )
            {
            match(input,COND_EXPR,FOLLOW_COND_EXPR_in_ternaryConditional1946); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_ternaryConditional1950);
            cond=expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_ternaryConditional1954);
            trueExp=expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_ternaryConditional1958);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:520:1: orCondition returns [ Condition value ] : ^( COND_OR (expr= expression )+ ) ;
    public final Condition orCondition() throws RecognitionException {
        Condition value = null;

        Expression expr = null;


         List<Expression> expressions = new ArrayList<Expression>(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:522:2: ( ^( COND_OR (expr= expression )+ ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:522:4: ^( COND_OR (expr= expression )+ )
            {
            match(input,COND_OR,FOLLOW_COND_OR_in_orCondition1982); 

            match(input, Token.DOWN, null); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:522:14: (expr= expression )+
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
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:522:15: expr= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_orCondition1987);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:527:1: andCondition returns [ Condition value ] : ^( COND_AND (expr= expression )+ ) ;
    public final Condition andCondition() throws RecognitionException {
        Condition value = null;

        Expression expr = null;


         List<Expression> expressions = new ArrayList<Expression>(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:529:2: ( ^( COND_AND (expr= expression )+ ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:529:4: ^( COND_AND (expr= expression )+ )
            {
            match(input,COND_AND,FOLLOW_COND_AND_in_andCondition2015); 

            match(input, Token.DOWN, null); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:529:15: (expr= expression )+
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
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:529:16: expr= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_andCondition2020);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:534:1: eqCondition returns [ Condition value ] : ^( COMP_EQ exp1= expression exp2= expression ) ;
    public final Condition eqCondition() throws RecognitionException {
        Condition value = null;

        Expression exp1 = null;

        Expression exp2 = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:535:2: ( ^( COMP_EQ exp1= expression exp2= expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:535:4: ^( COMP_EQ exp1= expression exp2= expression )
            {
            match(input,COMP_EQ,FOLLOW_COMP_EQ_in_eqCondition2043); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_eqCondition2047);
            exp1=expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_eqCondition2051);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:540:1: notExpression returns [ Expression value ] : ^( NOT exp= expression ) ;
    public final Expression notExpression() throws RecognitionException {
        Expression value = null;

        Expression exp = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:541:2: ( ^( NOT exp= expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:541:4: ^( NOT exp= expression )
            {
            match(input,NOT,FOLLOW_NOT_in_notExpression2070); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_notExpression2074);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:546:1: newExpression returns [ Expression value ] : ^( NEW exp= expression (args= argumentsList )? ) ;
    public final Expression newExpression() throws RecognitionException {
        Expression value = null;

        Expression exp = null;

        Map<String, Expression> args = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:547:2: ( ^( NEW exp= expression (args= argumentsList )? ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:547:4: ^( NEW exp= expression (args= argumentsList )? )
            {
            match(input,NEW,FOLLOW_NEW_in_newExpression2093); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_newExpression2097);
            exp=expression();

            state._fsp--;

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:547:25: (args= argumentsList )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ARGS) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:547:26: args= argumentsList
                    {
                    pushFollow(FOLLOW_argumentsList_in_newExpression2102);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:552:1: simpleExpression returns [ Expression value ] : (var= VARIABLE | THIS | str= stringLiteral | bool= booleanLiteral | obj= objectLiteral );
    public final Expression simpleExpression() throws RecognitionException {
        Expression value = null;

        CommonTree var=null;
        StringLiteral str = null;

        Bool bool = null;

        ObjectLiteral obj = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:553:2: (var= VARIABLE | THIS | str= stringLiteral | bool= booleanLiteral | obj= objectLiteral )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:553:4: var= VARIABLE
                    {
                    var=(CommonTree)match(input,VARIABLE,FOLLOW_VARIABLE_in_simpleExpression2124); 
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:562:4: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_simpleExpression2131); 

                    			value = new VariableExpression("this");
                    		

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:565:4: str= stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_simpleExpression2140);
                    str=stringLiteral();

                    state._fsp--;


                    			value = new StringLiteralExpression(str);
                    			//Scope::block.addStatement(new CreateString(str, value));
                    		

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:569:4: bool= booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_simpleExpression2149);
                    bool=booleanLiteral();

                    state._fsp--;


                    			//Variable boolVar = new Variable();
                    			//boolVar.setValue(bool);
                    			//value = new VariableExpression(boolVar);
                    			value = new BooleanLiteralExpression(bool);
                    		

                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:575:4: obj= objectLiteral
                    {
                    pushFollow(FOLLOW_objectLiteral_in_simpleExpression2158);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:580:1: objectLiteral returns [ ObjectLiteral value ] : ^( OBJ (slot= objectSlot )* ) ;
    public final ObjectLiteral objectLiteral() throws RecognitionException {
        ObjectLiteral value = null;

        SQLScriptWalker.objectSlot_return slot = null;


         value = new ObjectLiteral(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:582:2: ( ^( OBJ (slot= objectSlot )* ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:582:4: ^( OBJ (slot= objectSlot )* )
            {
            match(input,OBJ,FOLLOW_OBJ_in_objectLiteral2181); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:582:10: (slot= objectSlot )*
                loop37:
                do {
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==SLOT) ) {
                        alt37=1;
                    }


                    switch (alt37) {
                	case 1 :
                	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:582:11: slot= objectSlot
                	    {
                	    pushFollow(FOLLOW_objectSlot_in_objectLiteral2186);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:585:1: objectSlot returns [ Expression key, Expression value ] : ^( SLOT (id= identifierStringLiteral | str= stringLiteral ) expr= expression ) ;
    public final SQLScriptWalker.objectSlot_return objectSlot() throws RecognitionException {
        SQLScriptWalker.objectSlot_return retval = new SQLScriptWalker.objectSlot_return();
        retval.start = input.LT(1);

        StringLiteral id = null;

        StringLiteral str = null;

        Expression expr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:586:2: ( ^( SLOT (id= identifierStringLiteral | str= stringLiteral ) expr= expression ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:586:4: ^( SLOT (id= identifierStringLiteral | str= stringLiteral ) expr= expression )
            {
            match(input,SLOT,FOLLOW_SLOT_in_objectSlot2207); 

            match(input, Token.DOWN, null); 
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:587:4: (id= identifierStringLiteral | str= stringLiteral )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:587:6: id= identifierStringLiteral
                    {
                    pushFollow(FOLLOW_identifierStringLiteral_in_objectSlot2216);
                    id=identifierStringLiteral();

                    state._fsp--;

                     retval.key = new StringLiteralExpression(id); 

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:588:6: str= stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_objectSlot2227);
                    str=stringLiteral();

                    state._fsp--;

                     retval.key = new StringLiteralExpression(str); 

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_objectSlot2241);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:594:1: parameter returns [ Parameter value ] : PARAM_NAME pname= paramName ( PARAM_VALUE pval= paramValue )? ;
    public final Parameter parameter() throws RecognitionException {
        Parameter value = null;

        String pname = null;

        Expression pval = null;


         Expression paramValue = null; 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:596:2: ( PARAM_NAME pname= paramName ( PARAM_VALUE pval= paramValue )? )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:596:4: PARAM_NAME pname= paramName ( PARAM_VALUE pval= paramValue )?
            {
            match(input,PARAM_NAME,FOLLOW_PARAM_NAME_in_parameter2267); 
            pushFollow(FOLLOW_paramName_in_parameter2271);
            pname=paramName();

            state._fsp--;

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:596:31: ( PARAM_VALUE pval= paramValue )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==PARAM_VALUE) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:596:32: PARAM_VALUE pval= paramValue
                    {
                    match(input,PARAM_VALUE,FOLLOW_PARAM_VALUE_in_parameter2274); 
                    pushFollow(FOLLOW_paramValue_in_parameter2278);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:603:1: paramName returns [ String value ] : id= identifier ;
    public final String paramName() throws RecognitionException {
        String value = null;

        String id = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:604:2: (id= identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:604:4: id= identifier
            {
            pushFollow(FOLLOW_identifier_in_paramName2301);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:607:1: paramValue returns [ Expression value ] : expr= expression ;
    public final Expression paramValue() throws RecognitionException {
        Expression value = null;

        Expression expr = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:608:2: (expr= expression )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:608:4: expr= expression
            {
            pushFollow(FOLLOW_expression_in_paramValue2320);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:611:1: identifierExpression returns [ Expression value ] : id= identifier ;
    public final Expression identifierExpression() throws RecognitionException {
        Expression value = null;

        String id = null;


        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:612:2: (id= identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:612:4: id= identifier
            {
            pushFollow(FOLLOW_identifier_in_identifierExpression2339);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:615:1: identifier returns [ String value ] : id= ( WORD | IDENTIFIER ) ;
    public final String identifier() throws RecognitionException {
        String value = null;

        CommonTree id=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:616:2: (id= ( WORD | IDENTIFIER ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:616:4: id= ( WORD | IDENTIFIER )
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

    public static class sqlSpecialChars_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "sqlSpecialChars"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:619:1: sqlSpecialChars : ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | EQUALS | BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON );
    public final SQLScriptWalker.sqlSpecialChars_return sqlSpecialChars() throws RecognitionException {
        SQLScriptWalker.sqlSpecialChars_return retval = new SQLScriptWalker.sqlSpecialChars_return();
        retval.start = input.LT(1);

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:620:2: ( SQL_SPECIAL_CHAR | LPAREN | RPAREN | EQUALS | BACKSLASH | ATSIGN | OP_DEFINE | OP_AND | OP_OR | OP_EQ | EXCLAM | QUESTION | COLON )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:
            {
            if ( input.LA(1)==ATSIGN||(input.LA(1)>=BACKSLASH && input.LA(1)<=EQUALS)||(input.LA(1)>=SQL_SPECIAL_CHAR && input.LA(1)<=RPAREN)||(input.LA(1)>=OP_DEFINE && input.LA(1)<=COLON) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "sqlSpecialChars"

    public static class keyword_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "keyword"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:625:1: keyword : ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRUE | KW_FALSE );
    public final SQLScriptWalker.keyword_return keyword() throws RecognitionException {
        SQLScriptWalker.keyword_return retval = new SQLScriptWalker.keyword_return();
        retval.start = input.LT(1);

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:625:9: ( KW_SQL | KW_VAR | KW_IF | KW_ELSE | KW_TRUE | KW_FALSE )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:
            {
            if ( input.LA(1)==KW_SQL||input.LA(1)==KW_VAR||(input.LA(1)>=KW_IF && input.LA(1)<=KW_ELSE)||(input.LA(1)>=KW_TRUE && input.LA(1)<=KW_FALSE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "keyword"


    // $ANTLR start "stringLiteral"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:628:1: stringLiteral returns [ StringLiteral value ] : ^( STRING start= ( SQUOT | DQUOT | BTICK ) (str= STRING_CONTENT | var= EMBEDDED_VARIABLE )* ( SQUOT | DQUOT | BTICK ) ) ;
    public final StringLiteral stringLiteral() throws RecognitionException {
        StringLiteral value = null;

        CommonTree start=null;
        CommonTree str=null;
        CommonTree var=null;

         List<Object> parts = new ArrayList<Object>(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:630:2: ( ^( STRING start= ( SQUOT | DQUOT | BTICK ) (str= STRING_CONTENT | var= EMBEDDED_VARIABLE )* ( SQUOT | DQUOT | BTICK ) ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:630:4: ^( STRING start= ( SQUOT | DQUOT | BTICK ) (str= STRING_CONTENT | var= EMBEDDED_VARIABLE )* ( SQUOT | DQUOT | BTICK ) )
            {
            match(input,STRING,FOLLOW_STRING_in_stringLiteral2478); 

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

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:631:4: (str= STRING_CONTENT | var= EMBEDDED_VARIABLE )*
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
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:631:6: str= STRING_CONTENT
            	    {
            	    str=(CommonTree)match(input,STRING_CONTENT,FOLLOW_STRING_CONTENT_in_stringLiteral2501); 
            	     parts.add((str!=null?str.getText():null)); 

            	    }
            	    break;
            	case 2 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:632:6: var= EMBEDDED_VARIABLE
            	    {
            	    var=(CommonTree)match(input,EMBEDDED_VARIABLE,FOLLOW_EMBEDDED_VARIABLE_in_stringLiteral2515); 
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:638:1: identifierStringLiteral returns [ StringLiteral value ] : id= identifier ;
    public final StringLiteral identifierStringLiteral() throws RecognitionException {
        StringLiteral value = null;

        String id = null;


         List<Object> parts = new ArrayList<Object>(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:640:2: (id= identifier )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:640:4: id= identifier
            {
            pushFollow(FOLLOW_identifier_in_identifierStringLiteral2565);
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:643:1: booleanLiteral returns [ Bool value ] : ( TRUE | FALSE );
    public final Bool booleanLiteral() throws RecognitionException {
        Bool value = null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:644:2: ( TRUE | FALSE )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:644:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_booleanLiteral2582); 
                     value = Bool.TRUE; 

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptWalker.g:645:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_booleanLiteral2590); 
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


 

    public static final BitSet FOLLOW_statement_in_script80 = new BitSet(new long[]{0x0F0FFF243E160012L,0x0000000000000008L});
    public static final BitSet FOLLOW_sqlStmt_in_statement92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_evalStmt_in_statement97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptStmt_in_statement102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStmt_in_block124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStmt__in_blockStmt155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_blockStmt_183 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_blockStmt_185 = new BitSet(new long[]{0x0F0FFF243E160018L,0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_CMD_in_evalStmt209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_evalCommand_in_evalStmt216 = new BitSet(new long[]{0x0000000000280008L});
    public static final BitSet FOLLOW_evalParam_in_evalStmt226 = new BitSet(new long[]{0x0000000000280008L});
    public static final BitSet FOLLOW_annotation_in_evalStmt238 = new BitSet(new long[]{0x0000000000200008L});
    public static final BitSet FOLLOW_identifier_in_evalCommand263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVAL_ARG_in_evalParam281 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_in_evalParam285 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SQL_CMD_in_sqlStmt310 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sqlStmtName_in_sqlStmt317 = new BitSet(new long[]{0x8000000000204018L,0x00000001C034FE7FL});
    public static final BitSet FOLLOW_sqlParam_in_sqlStmt328 = new BitSet(new long[]{0x8000000000204018L,0x00000001C034FE7FL});
    public static final BitSet FOLLOW_annotation_in_sqlStmt342 = new BitSet(new long[]{0x0000000000200008L});
    public static final BitSet FOLLOW_WORD_in_sqlStmtName367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sqlStmtName376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlToken_in_sqlParam401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_sqlToken420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_sqlToken433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlSpecialChars_in_sqlToken450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_sqlToken461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_sqlToken481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOT_in_annotation519 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationCommand_in_annotation526 = new BitSet(new long[]{0x0000000000400008L});
    public static final BitSet FOLLOW_annotationParam_in_annotation536 = new BitSet(new long[]{0x0000000000400008L});
    public static final BitSet FOLLOW_identifier_in_annotationCommand558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOT_ARG_in_annotationParam576 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_in_annotationParam580 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptStmt594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptTry_in_scriptStmt599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptThrow_in_scriptStmt604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptReturn_in_scriptStmt609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptExit_in_scriptStmt614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_scriptStmt619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_scriptIfElse660 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_scriptIf_in_scriptIfElse662 = new BitSet(new long[]{0x0F0FFF243E160018L,0x0000000000000008L});
    public static final BitSet FOLLOW_scriptElse_in_scriptIfElse664 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_scriptIf693 = new BitSet(new long[]{0x0F0FFF243E160010L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_scriptIf695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptIfElse_in_scriptElse714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_scriptElse723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_scriptTry746 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStmt_in_scriptTry750 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_scriptCatch_in_scriptTry761 = new BitSet(new long[]{0x000000C000000008L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry771 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_scriptFinally_in_scriptTry784 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CATCH_in_scriptCatch807 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_scriptCatch811 = new BitSet(new long[]{0x0F0FFF243E160018L,0x0000000000000008L});
    public static final BitSet FOLLOW_blockStmt_in_scriptCatch815 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FINALLY_in_scriptFinally834 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStmt_in_scriptFinally838 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROW_in_scriptThrow862 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_scriptThrow866 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_scriptReturn885 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_scriptReturn892 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXIT_in_scriptExit916 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_scriptExit923 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expressionStmt943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoSlotExp_in_expression962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotExpressionRHS_in_expression971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncDef_in_expressionNoSlotExp991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptFuncCall_in_expressionNoSlotExp1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptDeclareAndAssign_in_expressionNoSlotExp1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptDeclare_in_expressionNoSlotExp1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scriptAssign_in_expressionNoSlotExp1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpressionRHS_in_expressionNoSlotExp1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_expressionNoSlotExp1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryConditional_in_expressionNoSlotExp1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orCondition_in_expressionNoSlotExp1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andCondition_in_expressionNoSlotExp1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eqCondition_in_expressionNoSlotExp1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpression_in_expressionNoSlotExp1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_expressionNoSlotExp1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expressionNoSlotExp1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_DEF_in_scriptFuncDef1137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncDef1142 = new BitSet(new long[]{0x0F0FFF247E160018L,0x0000000000000008L});
    public static final BitSet FOLLOW_argumentsDef_in_scriptFuncDef1171 = new BitSet(new long[]{0x0F0FFF243E160018L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_scriptFuncDef1197 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGS_in_argumentsDef1220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_argumentsDef1225 = new BitSet(new long[]{0x0000000000000008L,0x0000000040000004L});
    public static final BitSet FOLLOW_FUNC_CALL_in_scriptFuncCall1248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_scriptFuncCall1253 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_expression_in_scriptFuncCall1267 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_argumentsList_in_scriptFuncCall1290 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGS_in_argumentsList1320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARG_EXPR_in_argumentsList1325 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_argumentsList1329 = new BitSet(new long[]{0x0F0FFF243E000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_argumentsList1333 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARG_TRUE_in_argumentsList1357 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_argumentsList1361 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARG_FALSE_in_argumentsList1385 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_argumentsList1389 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARE_ASSIGN_in_scriptDeclareAndAssign1456 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_scriptDeclare_in_scriptDeclareAndAssign1463 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_scriptAssign_in_scriptDeclareAndAssign1472 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARE_in_scriptDeclare1495 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VARIABLE_in_scriptDeclare1499 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_scriptAssign1522 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_assignVariable_in_scriptAssign1531 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignIndex_in_scriptAssign1542 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignSlot_in_scriptAssign1553 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARIABLE_in_assignVariable1581 = new BitSet(new long[]{0x0F0FFF243E000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_assignVariable1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpressionLHS_in_assignIndex1604 = new BitSet(new long[]{0x0F0FFF243E000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_assignIndex1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotExpressionLHS_in_assignSlot1625 = new BitSet(new long[]{0x0F0FFF243E000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_assignSlot1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpression__in_indexExpressionLHS1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpression__in_indexExpressionRHS1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDEX_in_indexExpression_1691 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_indexExpression_1695 = new BitSet(new long[]{0x0F0FFF243E000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_indexExpression_1699 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_slotExpression__in_slotExpressionLHS1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotExpression__in_slotExpressionRHS1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLOT_in_slotExpression_1762 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_slotExpression_1766 = new BitSet(new long[]{0x0F0FFF243E000010L,0x000000004000000CL});
    public static final BitSet FOLLOW_identifierExpression_in_slotExpression_1775 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_slotExpression_1786 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_callExpression1814 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_slotCallExpression_in_callExpression1823 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_funcCallExpression_in_callExpression1834 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_slotExpressionRHS_in_slotCallExpression1862 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_argumentsList_in_slotCallExpression1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_funcCallExpression1894 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_expressionNoSlotExp_in_funcCallExpression1913 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_argumentsList_in_funcCallExpression1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COND_EXPR_in_ternaryConditional1946 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_ternaryConditional1950 = new BitSet(new long[]{0x0F0FFF243E000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_ternaryConditional1954 = new BitSet(new long[]{0x0F0FFF243E000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_ternaryConditional1958 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COND_OR_in_orCondition1982 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_orCondition1987 = new BitSet(new long[]{0x0F0FFF243E000018L,0x0000000000000008L});
    public static final BitSet FOLLOW_COND_AND_in_andCondition2015 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_andCondition2020 = new BitSet(new long[]{0x0F0FFF243E000018L,0x0000000000000008L});
    public static final BitSet FOLLOW_COMP_EQ_in_eqCondition2043 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_eqCondition2047 = new BitSet(new long[]{0x0F0FFF243E000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_eqCondition2051 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_notExpression2070 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_notExpression2074 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_in_newExpression2093 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_newExpression2097 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_argumentsList_in_newExpression2102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARIABLE_in_simpleExpression2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_simpleExpression2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_simpleExpression2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_simpleExpression2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_simpleExpression2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJ_in_objectLiteral2181 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_objectSlot_in_objectLiteral2186 = new BitSet(new long[]{0x0008000000000008L});
    public static final BitSet FOLLOW_SLOT_in_objectSlot2207 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifierStringLiteral_in_objectSlot2216 = new BitSet(new long[]{0x0F0FFF243E000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_stringLiteral_in_objectSlot2227 = new BitSet(new long[]{0x0F0FFF243E000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_objectSlot2241 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAM_NAME_in_parameter2267 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000004L});
    public static final BitSet FOLLOW_paramName_in_parameter2271 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_PARAM_VALUE_in_parameter2274 = new BitSet(new long[]{0x0F0FFF243E000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_paramValue_in_parameter2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_paramName2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_paramValue2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifierExpression2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_identifier2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sqlSpecialChars0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringLiteral2478 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_stringLiteral2482 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_STRING_CONTENT_in_stringLiteral2501 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_EMBEDDED_VARIABLE_in_stringLiteral2515 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_set_in_stringLiteral2528 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_identifier_in_identifierStringLiteral2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleanLiteral2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleanLiteral2590 = new BitSet(new long[]{0x0000000000000002L});

}