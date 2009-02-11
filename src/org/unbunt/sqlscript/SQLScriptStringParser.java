// $ANTLR 3.1.1 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g 2009-02-11 23:59:17

	package org.unbunt.sqlscript;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SQLScriptStringParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "QQUOT", "QQUOT_END", "CHARS", "QQUOT_START", "CHAR", "SQUOT", "VARNAME", "DQUOT", "BTICK", "QQUOT_DELIM", "ATSIGN", "LCURLY", "RCURLY", "WORD_CHAR"
    };
    public static final int WORD_CHAR=19;
    public static final int DQUOT=13;
    public static final int QQUOT_START=9;
    public static final int CHAR=10;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int LCURLY=17;
    public static final int EOF=-1;
    public static final int QQUOT=6;
    public static final int VARNAME=12;
    public static final int SQUOT=11;
    public static final int QQUOT_DELIM=15;
    public static final int RCURLY=18;
    public static final int CHARS=8;
    public static final int ATSIGN=16;
    public static final int QQUOT_END=7;
    public static final int BTICK=14;
    public static final int STRING=4;

    // delegates
    // delegators


        public SQLScriptStringParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SQLScriptStringParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return SQLScriptStringParser.tokenNames; }
    public String getGrammarFileName() { return "/home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g"; }


    	
    	protected boolean matchQQuoteDelim(Token start, Token end) {
    		String startText = start.getText();
    		String endText = end.getText();
    		
    		char startDelim = startText.charAt(startText.length() - 1);
    		char endDelim = endText.charAt(endText.length() - 1);

    		switch (startDelim) {
    			case '(': return endDelim == ')';
    			case '<': return endDelim == '>';
    			case '[': return endDelim == ']';
    			case '{': return endDelim == '}';
    			default:
    				return endDelim == startDelim;
    		}
    	}
    	


    public static class string_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:142:1: string : start= QQUOT_START qQuoteEnd[$start] ;
    public final SQLScriptStringParser.string_return string() throws RecognitionException {
        SQLScriptStringParser.string_return retval = new SQLScriptStringParser.string_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token start=null;
        SQLScriptStringParser.qQuoteEnd_return qQuoteEnd1 = null;


        CommonTree start_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:146:2: (start= QQUOT_START qQuoteEnd[$start] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:146:4: start= QQUOT_START qQuoteEnd[$start]
            {
            root_0 = (CommonTree)adaptor.nil();

            start=(Token)match(input,QQUOT_START,FOLLOW_QQUOT_START_in_string102); 
            start_tree = (CommonTree)adaptor.create(start);
            adaptor.addChild(root_0, start_tree);

            pushFollow(FOLLOW_qQuoteEnd_in_string104);
            qQuoteEnd1=qQuoteEnd(start);

            state._fsp--;

            adaptor.addChild(root_0, qQuoteEnd1.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "string"

    public static class qQuoteEnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qQuoteEnd"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:149:1: qQuoteEnd[ Token start ] : {...}? (c= CHAR SQUOT -> QQUOT_END[$c] | v= VARNAME SQUOT -> { prefixToken != null }? ->) ;
    public final SQLScriptStringParser.qQuoteEnd_return qQuoteEnd(Token start) throws RecognitionException {
        SQLScriptStringParser.qQuoteEnd_return retval = new SQLScriptStringParser.qQuoteEnd_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token c=null;
        Token v=null;
        Token SQUOT2=null;
        Token SQUOT3=null;

        CommonTree c_tree=null;
        CommonTree v_tree=null;
        CommonTree SQUOT2_tree=null;
        CommonTree SQUOT3_tree=null;
        RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
        RewriteRuleTokenStream stream_SQUOT=new RewriteRuleTokenStream(adaptor,"token SQUOT");
        RewriteRuleTokenStream stream_VARNAME=new RewriteRuleTokenStream(adaptor,"token VARNAME");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:150:2: ({...}? (c= CHAR SQUOT -> QQUOT_END[$c] | v= VARNAME SQUOT -> { prefixToken != null }? ->) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:150:4: {...}? (c= CHAR SQUOT -> QQUOT_END[$c] | v= VARNAME SQUOT -> { prefixToken != null }? ->)
            {
            if ( !((input.LT(2).getType() == SQUOT && matchQQuoteDelim(start, input.LT(1)))) ) {
                throw new FailedPredicateException(input, "qQuoteEnd", "input.LT(2).getType() == SQUOT && matchQQuoteDelim($start, input.LT(1))");
            }
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:151:3: (c= CHAR SQUOT -> QQUOT_END[$c] | v= VARNAME SQUOT -> { prefixToken != null }? ->)
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==CHAR) ) {
                alt1=1;
            }
            else if ( (LA1_0==VARNAME) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:151:5: c= CHAR SQUOT
                    {
                    c=(Token)match(input,CHAR,FOLLOW_CHAR_in_qQuoteEnd126);  
                    stream_CHAR.add(c);

                    SQUOT2=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_qQuoteEnd128);  
                    stream_SQUOT.add(SQUOT2);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 151:19: -> QQUOT_END[$c]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(QQUOT_END, c));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:152:5: v= VARNAME SQUOT
                    {
                    v=(Token)match(input,VARNAME,FOLLOW_VARNAME_in_qQuoteEnd142);  
                    stream_VARNAME.add(v);

                    SQUOT3=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_qQuoteEnd144);  
                    stream_SQUOT.add(SQUOT3);


                    			String varText = (v!=null?v.getText():null);
                    			
                    			CommonTree prefixToken = null;
                    			if (varText.length() > 1) {
                    				String prefixText = varText.substring(0, varText.length() - 2);
                    				prefixToken = (CommonTree)adaptor.create(CHARS, v, prefixText);
                    			}
                    			
                    			String quoteEnd = varText.substring(varText.length() - 1, 1) + "'";
                    			CommonTree quoteEndToken = (CommonTree)adaptor.create(QQUOT_END, v, quoteEnd);
                    		  


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 164:5: -> { prefixToken != null }?
                    if ( prefixToken != null ) {
                        adaptor.addChild(root_0, prefixToken);
                        adaptor.addChild(root_0, quoteEndToken);

                    }
                    else // 165:5: ->
                    {
                        adaptor.addChild(root_0, quoteEndToken);

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "qQuoteEnd"

    // Delegated rules


 

    public static final BitSet FOLLOW_QQUOT_START_in_string102 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_qQuoteEnd_in_string104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_qQuoteEnd126 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_SQUOT_in_qQuoteEnd128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARNAME_in_qQuoteEnd142 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_SQUOT_in_qQuoteEnd144 = new BitSet(new long[]{0x0000000000000002L});

}