// $ANTLR 3.1 /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g 2009-02-12 09:38:06

	package org.unbunt.sqlscript;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SQLScriptStringParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "QQUOT", "CHARS", "EMBEDDED_VARIABLE", "QQUOT_START", "ATSIGN", "LCURLY", "RCURLY", "VARNAME", "CHAR", "SQUOT", "DQUOT", "BTICK", "QQUOT_END", "QQUOT_DELIM", "WORD_CHAR"
    };
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
    public String getGrammarFileName() { return "/home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g"; }


    	
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
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:148:1: string : start= QQUOT_START (content+= qQuoteContent )* end= qQuoteEnd -> ^( STRING $start ( $content)* $end) ;
    public final SQLScriptStringParser.string_return string() throws RecognitionException {
        SQLScriptStringParser.string_return retval = new SQLScriptStringParser.string_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token start=null;
        List list_content=null;
        SQLScriptStringParser.qQuoteEnd_return end = null;

        SQLScriptStringParser.qQuoteContent_return content = null;
        CommonTree start_tree=null;
        RewriteRuleTokenStream stream_QQUOT_START=new RewriteRuleTokenStream(adaptor,"token QQUOT_START");
        RewriteRuleSubtreeStream stream_qQuoteContent=new RewriteRuleSubtreeStream(adaptor,"rule qQuoteContent");
        RewriteRuleSubtreeStream stream_qQuoteEnd=new RewriteRuleSubtreeStream(adaptor,"rule qQuoteEnd");
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:152:2: (start= QQUOT_START (content+= qQuoteContent )* end= qQuoteEnd -> ^( STRING $start ( $content)* $end) )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:152:4: start= QQUOT_START (content+= qQuoteContent )* end= qQuoteEnd
            {
            start=(Token)match(input,QQUOT_START,FOLLOW_QQUOT_START_in_string104);  
            stream_QQUOT_START.add(start);

            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:152:22: (content+= qQuoteContent )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ATSIGN||(LA1_0>=VARNAME && LA1_0<=BTICK)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:152:23: content+= qQuoteContent
            	    {
            	    pushFollow(FOLLOW_qQuoteContent_in_string109);
            	    content=qQuoteContent();

            	    state._fsp--;

            	    stream_qQuoteContent.add(content.getTree());
            	    if (list_content==null) list_content=new ArrayList();
            	    list_content.add(content.getTree());


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            pushFollow(FOLLOW_qQuoteEnd_in_string115);
            end=qQuoteEnd();

            state._fsp--;

            stream_qQuoteEnd.add(end.getTree());


            // AST REWRITE
            // elements: content, start, end
            // token labels: start
            // rule labels: retval, end
            // token list labels: 
            // rule list labels: content
            retval.tree = root_0;
            RewriteRuleTokenStream stream_start=new RewriteRuleTokenStream(adaptor,"token start",start);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"token end",end!=null?end.tree:null);
            RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"token content",list_content);
            root_0 = (CommonTree)adaptor.nil();
            // 152:62: -> ^( STRING $start ( $content)* $end)
            {
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:152:65: ^( STRING $start ( $content)* $end)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                adaptor.addChild(root_1, stream_start.nextNode());
                // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:152:81: ( $content)*
                while ( stream_content.hasNext() ) {
                    adaptor.addChild(root_1, stream_content.nextTree());

                }
                stream_content.reset();
                adaptor.addChild(root_1, stream_end.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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

    public static class qQuoteContent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qQuoteContent"
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:155:1: qQuoteContent : (a1= ATSIGN (lc= LCURLY ( RCURLY -> $a1 | var= VARNAME RCURLY -> EMBEDDED_VARIABLE[$var] | -> $a1 $lc) | -> $a1) | CHAR | VARNAME | SQUOT | DQUOT | BTICK );
    public final SQLScriptStringParser.qQuoteContent_return qQuoteContent() throws RecognitionException {
        SQLScriptStringParser.qQuoteContent_return retval = new SQLScriptStringParser.qQuoteContent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token a1=null;
        Token lc=null;
        Token var=null;
        Token RCURLY1=null;
        Token RCURLY2=null;
        Token CHAR3=null;
        Token VARNAME4=null;
        Token SQUOT5=null;
        Token DQUOT6=null;
        Token BTICK7=null;

        CommonTree a1_tree=null;
        CommonTree lc_tree=null;
        CommonTree var_tree=null;
        CommonTree RCURLY1_tree=null;
        CommonTree RCURLY2_tree=null;
        CommonTree CHAR3_tree=null;
        CommonTree VARNAME4_tree=null;
        CommonTree SQUOT5_tree=null;
        CommonTree DQUOT6_tree=null;
        CommonTree BTICK7_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_ATSIGN=new RewriteRuleTokenStream(adaptor,"token ATSIGN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleTokenStream stream_VARNAME=new RewriteRuleTokenStream(adaptor,"token VARNAME");

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:156:2: (a1= ATSIGN (lc= LCURLY ( RCURLY -> $a1 | var= VARNAME RCURLY -> EMBEDDED_VARIABLE[$var] | -> $a1 $lc) | -> $a1) | CHAR | VARNAME | SQUOT | DQUOT | BTICK )
            int alt4=6;
            switch ( input.LA(1) ) {
            case ATSIGN:
                {
                alt4=1;
                }
                break;
            case CHAR:
                {
                alt4=2;
                }
                break;
            case VARNAME:
                {
                alt4=3;
                }
                break;
            case SQUOT:
                {
                alt4=4;
                }
                break;
            case DQUOT:
                {
                alt4=5;
                }
                break;
            case BTICK:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:156:4: a1= ATSIGN (lc= LCURLY ( RCURLY -> $a1 | var= VARNAME RCURLY -> EMBEDDED_VARIABLE[$var] | -> $a1 $lc) | -> $a1)
                    {
                    a1=(Token)match(input,ATSIGN,FOLLOW_ATSIGN_in_qQuoteContent144);  
                    stream_ATSIGN.add(a1);

                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:157:3: (lc= LCURLY ( RCURLY -> $a1 | var= VARNAME RCURLY -> EMBEDDED_VARIABLE[$var] | -> $a1 $lc) | -> $a1)
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==LCURLY) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==ATSIGN||(LA3_0>=VARNAME && LA3_0<=QQUOT_END)) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:157:5: lc= LCURLY ( RCURLY -> $a1 | var= VARNAME RCURLY -> EMBEDDED_VARIABLE[$var] | -> $a1 $lc)
                            {
                            lc=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_qQuoteContent152);  
                            stream_LCURLY.add(lc);

                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:158:5: ( RCURLY -> $a1 | var= VARNAME RCURLY -> EMBEDDED_VARIABLE[$var] | -> $a1 $lc)
                            int alt2=3;
                            switch ( input.LA(1) ) {
                            case RCURLY:
                                {
                                alt2=1;
                                }
                                break;
                            case VARNAME:
                                {
                                int LA2_2 = input.LA(2);

                                if ( (LA2_2==RCURLY) ) {
                                    alt2=2;
                                }
                                else if ( (LA2_2==ATSIGN||(LA2_2>=VARNAME && LA2_2<=QQUOT_END)) ) {
                                    alt2=3;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 2, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case ATSIGN:
                            case CHAR:
                            case SQUOT:
                            case DQUOT:
                            case BTICK:
                            case QQUOT_END:
                                {
                                alt2=3;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 0, input);

                                throw nvae;
                            }

                            switch (alt2) {
                                case 1 :
                                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:158:7: RCURLY
                                    {
                                    RCURLY1=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_qQuoteContent160);  
                                    stream_RCURLY.add(RCURLY1);



                                    // AST REWRITE
                                    // elements: a1
                                    // token labels: a1
                                    // rule labels: retval
                                    // token list labels: 
                                    // rule list labels: 
                                    retval.tree = root_0;
                                    RewriteRuleTokenStream stream_a1=new RewriteRuleTokenStream(adaptor,"token a1",a1);
                                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                                    root_0 = (CommonTree)adaptor.nil();
                                    // 158:15: -> $a1
                                    {
                                        adaptor.addChild(root_0, stream_a1.nextNode());

                                    }

                                    retval.tree = root_0;
                                    }
                                    break;
                                case 2 :
                                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:159:7: var= VARNAME RCURLY
                                    {
                                    var=(Token)match(input,VARNAME,FOLLOW_VARNAME_in_qQuoteContent176);  
                                    stream_VARNAME.add(var);

                                    RCURLY2=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_qQuoteContent178);  
                                    stream_RCURLY.add(RCURLY2);



                                    // AST REWRITE
                                    // elements: 
                                    // token labels: 
                                    // rule labels: retval
                                    // token list labels: 
                                    // rule list labels: 
                                    retval.tree = root_0;
                                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                                    root_0 = (CommonTree)adaptor.nil();
                                    // 159:26: -> EMBEDDED_VARIABLE[$var]
                                    {
                                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EMBEDDED_VARIABLE, var));

                                    }

                                    retval.tree = root_0;
                                    }
                                    break;
                                case 3 :
                                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:160:9: 
                                    {

                                    // AST REWRITE
                                    // elements: a1, lc
                                    // token labels: a1, lc
                                    // rule labels: retval
                                    // token list labels: 
                                    // rule list labels: 
                                    retval.tree = root_0;
                                    RewriteRuleTokenStream stream_a1=new RewriteRuleTokenStream(adaptor,"token a1",a1);
                                    RewriteRuleTokenStream stream_lc=new RewriteRuleTokenStream(adaptor,"token lc",lc);
                                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                                    root_0 = (CommonTree)adaptor.nil();
                                    // 160:9: -> $a1 $lc
                                    {
                                        adaptor.addChild(root_0, stream_a1.nextNode());
                                        adaptor.addChild(root_0, stream_lc.nextNode());

                                    }

                                    retval.tree = root_0;
                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:162:7: 
                            {

                            // AST REWRITE
                            // elements: a1
                            // token labels: a1
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_a1=new RewriteRuleTokenStream(adaptor,"token a1",a1);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 162:7: -> $a1
                            {
                                adaptor.addChild(root_0, stream_a1.nextNode());

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:164:4: CHAR
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CHAR3=(Token)match(input,CHAR,FOLLOW_CHAR_in_qQuoteContent225); 
                    CHAR3_tree = (CommonTree)adaptor.create(CHAR3);
                    adaptor.addChild(root_0, CHAR3_tree);


                    }
                    break;
                case 3 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:165:4: VARNAME
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VARNAME4=(Token)match(input,VARNAME,FOLLOW_VARNAME_in_qQuoteContent230); 
                    VARNAME4_tree = (CommonTree)adaptor.create(VARNAME4);
                    adaptor.addChild(root_0, VARNAME4_tree);


                    }
                    break;
                case 4 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:166:4: SQUOT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SQUOT5=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_qQuoteContent235); 
                    SQUOT5_tree = (CommonTree)adaptor.create(SQUOT5);
                    adaptor.addChild(root_0, SQUOT5_tree);


                    }
                    break;
                case 5 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:167:4: DQUOT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DQUOT6=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_qQuoteContent240); 
                    DQUOT6_tree = (CommonTree)adaptor.create(DQUOT6);
                    adaptor.addChild(root_0, DQUOT6_tree);


                    }
                    break;
                case 6 :
                    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:168:4: BTICK
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BTICK7=(Token)match(input,BTICK,FOLLOW_BTICK_in_qQuoteContent245); 
                    BTICK7_tree = (CommonTree)adaptor.create(BTICK7);
                    adaptor.addChild(root_0, BTICK7_tree);


                    }
                    break;

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
    // $ANTLR end "qQuoteContent"

    public static class qQuoteEnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qQuoteEnd"
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:171:1: qQuoteEnd : QQUOT_END ;
    public final SQLScriptStringParser.qQuoteEnd_return qQuoteEnd() throws RecognitionException {
        SQLScriptStringParser.qQuoteEnd_return retval = new SQLScriptStringParser.qQuoteEnd_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QQUOT_END8=null;

        CommonTree QQUOT_END8_tree=null;

        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:172:2: ( QQUOT_END )
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:172:4: QQUOT_END
            {
            root_0 = (CommonTree)adaptor.nil();

            QQUOT_END8=(Token)match(input,QQUOT_END,FOLLOW_QQUOT_END_in_qQuoteEnd256); 
            QQUOT_END8_tree = (CommonTree)adaptor.create(QQUOT_END8);
            adaptor.addChild(root_0, QQUOT_END8_tree);


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

    public static class chars_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "chars"
    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:175:1: chars : (c= CHAR )+ ->;
    public final SQLScriptStringParser.chars_return chars() throws RecognitionException {
        SQLScriptStringParser.chars_return retval = new SQLScriptStringParser.chars_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token c=null;

        CommonTree c_tree=null;
        RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");

         StringBuilder chars = new StringBuilder(); 
        try {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:178:2: ( (c= CHAR )+ ->)
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:178:4: (c= CHAR )+
            {
            // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:178:4: (c= CHAR )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==CHAR) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/tweiss/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:178:5: c= CHAR
            	    {
            	    c=(Token)match(input,CHAR,FOLLOW_CHAR_in_chars280);  
            	    stream_CHAR.add(c);

            	     chars.append((c!=null?c.getText():null).charAt(0)); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

             CommonTree charsTree = (CommonTree)adaptor.create(CHARS, chars.toString()); 


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 179:3: ->
            {
                adaptor.addChild(root_0, charsTree);

            }

            retval.tree = root_0;
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
    // $ANTLR end "chars"

    // Delegated rules


 

    public static final BitSet FOLLOW_QQUOT_START_in_string104 = new BitSet(new long[]{0x000000000007E400L});
    public static final BitSet FOLLOW_qQuoteContent_in_string109 = new BitSet(new long[]{0x000000000007E400L});
    public static final BitSet FOLLOW_qQuoteEnd_in_string115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSIGN_in_qQuoteContent144 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_LCURLY_in_qQuoteContent152 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_RCURLY_in_qQuoteContent160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARNAME_in_qQuoteContent176 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RCURLY_in_qQuoteContent178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_qQuoteContent225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARNAME_in_qQuoteContent230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_qQuoteContent235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_qQuoteContent240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_qQuoteContent245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QQUOT_END_in_qQuoteEnd256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_chars280 = new BitSet(new long[]{0x0000000000004002L});

}