// $ANTLR 3.1.2 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g 2009-07-09 10:22:50

	package org.unbunt.sqlscript;
	
	import org.unbunt.sqlscript.exception.UnexpectedEOFException;
	import org.unbunt.sqlscript.exception.UnterminatedStringException;
	import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class SQLScriptStringParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "QQUOT", "CHARS", "STRING_START", "STRING_CONTENT", "STRING_END", "EMBEDDED_VAR", "SQUOT", "DQUOT", "BTICK", "QQUOT_START", "DOLQUOT", "CHAR", "VARNAME", "QQUOT_END", "ATSIGN", "LCURLY", "RCURLY", "QQUOT_DELIM", "DOLQUOT_TAG", "DOLQUOT_TAG_START", "DOLQUOT_TAG_END", "WORD_CHAR"
    };
    public static final int STRING_START=8;
    public static final int WORD_CHAR=27;
    public static final int DQUOT=13;
    public static final int STRING_CONTENT=9;
    public static final int QQUOT_START=15;
    public static final int CHAR=17;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int LCURLY=21;
    public static final int DOLQUOT_TAG_START=25;
    public static final int EOF=-1;
    public static final int QQUOT=6;
    public static final int VARNAME=18;
    public static final int DOLQUOT_TAG_END=26;
    public static final int SQUOT=12;
    public static final int QQUOT_DELIM=23;
    public static final int STRING_END=10;
    public static final int RCURLY=22;
    public static final int DOLQUOT=16;
    public static final int CHARS=7;
    public static final int ATSIGN=20;
    public static final int EMBEDDED_VAR=11;
    public static final int DOLQUOT_TAG=24;
    public static final int QQUOT_END=19;
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



    	protected int stringType = -1;

    	@Override
    	public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
    		//System.out.println("recovering from mismatched set" + e.getMessage());
    		throw e;
    	}
    	
    	@Override
    	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
    		if (((TokenStream)input).LT(1).getType() == EOF) {
    			throw stringType != -1
    				? new UnterminatedStringException(ttype, input, stringType)
    				: new UnexpectedEOFException(ttype, input);
    		}
    		throw new MismatchedTokenException(ttype, input);
    	}
    		
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:196:1: string : (start= SQUOT (content1+= singleQuoteContent )* endt= SQUOT -> ^( STRING STRING_START[$start] ( $content1)* STRING_END[$endt] ) | start= DQUOT (content2+= doubleQuoteContent )* endt= DQUOT -> ^( STRING STRING_START[$start] ( $content2)* STRING_END[$endt] ) | start= BTICK (content3+= backTickContent )* endt= BTICK -> ^( STRING STRING_START[$start] ( $content3)* STRING_END[$endt] ) | start= QQUOT_START (content4+= unquotedContent )* end= qQuoteEnd -> ^( STRING STRING_START[$start] ( $content4)* STRING_END[$end.token] ) | start= DOLQUOT (content5+= unquotedContent )* endt= DOLQUOT -> ^( STRING STRING_START[$start] ( $content5)* STRING_END[$endt] ) );
    public final SQLScriptStringParser.string_return string() throws RecognitionException {
        SQLScriptStringParser.string_return retval = new SQLScriptStringParser.string_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token start=null;
        Token endt=null;
        List list_content1=null;
        List list_content2=null;
        List list_content3=null;
        List list_content4=null;
        List list_content5=null;
        SQLScriptStringParser.qQuoteEnd_return end = null;

        SQLScriptStringParser.singleQuoteContent_return content1 = null;
         content1 = null;
        SQLScriptStringParser.doubleQuoteContent_return content2 = null;
         content2 = null;
        SQLScriptStringParser.backTickContent_return content3 = null;
         content3 = null;
        SQLScriptStringParser.unquotedContent_return content4 = null;
         content4 = null;
        SQLScriptStringParser.unquotedContent_return content5 = null;
         content5 = null;
        CommonTree start_tree=null;
        CommonTree endt_tree=null;
        RewriteRuleTokenStream stream_DOLQUOT=new RewriteRuleTokenStream(adaptor,"token DOLQUOT");
        RewriteRuleTokenStream stream_SQUOT=new RewriteRuleTokenStream(adaptor,"token SQUOT");
        RewriteRuleTokenStream stream_BTICK=new RewriteRuleTokenStream(adaptor,"token BTICK");
        RewriteRuleTokenStream stream_DQUOT=new RewriteRuleTokenStream(adaptor,"token DQUOT");
        RewriteRuleTokenStream stream_QQUOT_START=new RewriteRuleTokenStream(adaptor,"token QQUOT_START");
        RewriteRuleSubtreeStream stream_doubleQuoteContent=new RewriteRuleSubtreeStream(adaptor,"rule doubleQuoteContent");
        RewriteRuleSubtreeStream stream_unquotedContent=new RewriteRuleSubtreeStream(adaptor,"rule unquotedContent");
        RewriteRuleSubtreeStream stream_singleQuoteContent=new RewriteRuleSubtreeStream(adaptor,"rule singleQuoteContent");
        RewriteRuleSubtreeStream stream_backTickContent=new RewriteRuleSubtreeStream(adaptor,"rule backTickContent");
        RewriteRuleSubtreeStream stream_qQuoteEnd=new RewriteRuleSubtreeStream(adaptor,"rule qQuoteEnd");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:196:8: (start= SQUOT (content1+= singleQuoteContent )* endt= SQUOT -> ^( STRING STRING_START[$start] ( $content1)* STRING_END[$endt] ) | start= DQUOT (content2+= doubleQuoteContent )* endt= DQUOT -> ^( STRING STRING_START[$start] ( $content2)* STRING_END[$endt] ) | start= BTICK (content3+= backTickContent )* endt= BTICK -> ^( STRING STRING_START[$start] ( $content3)* STRING_END[$endt] ) | start= QQUOT_START (content4+= unquotedContent )* end= qQuoteEnd -> ^( STRING STRING_START[$start] ( $content4)* STRING_END[$end.token] ) | start= DOLQUOT (content5+= unquotedContent )* endt= DOLQUOT -> ^( STRING STRING_START[$start] ( $content5)* STRING_END[$endt] ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case SQUOT:
                {
                alt6=1;
                }
                break;
            case DQUOT:
                {
                alt6=2;
                }
                break;
            case BTICK:
                {
                alt6=3;
                }
                break;
            case QQUOT_START:
                {
                alt6=4;
                }
                break;
            case DOLQUOT:
                {
                alt6=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:196:10: start= SQUOT (content1+= singleQuoteContent )* endt= SQUOT
                    {
                    start=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_string117); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUOT.add(start);

                    if ( state.backtracking==0 ) {
                       stringType = SQUOT; 
                    }
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:196:54: (content1+= singleQuoteContent )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==SQUOT) ) {
                            int LA1_1 = input.LA(2);

                            if ( (LA1_1==SQUOT) ) {
                                alt1=1;
                            }


                        }
                        else if ( ((LA1_0>=DQUOT && LA1_0<=BTICK)||(LA1_0>=CHAR && LA1_0<=VARNAME)||(LA1_0>=ATSIGN && LA1_0<=RCURLY)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:196:55: content1+= singleQuoteContent
                    	    {
                    	    pushFollow(FOLLOW_singleQuoteContent_in_string132);
                    	    content1=singleQuoteContent();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_singleQuoteContent.add(content1.getTree());
                    	    if (list_content1==null) list_content1=new ArrayList();
                    	    list_content1.add(content1.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    endt=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_string138); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUOT.add(endt);



                    // AST REWRITE
                    // elements: content1
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: content1
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_content1=new RewriteRuleSubtreeStream(adaptor,"token content1",list_content1);
                    root_0 = (CommonTree)adaptor.nil();
                    // 196:98: -> ^( STRING STRING_START[$start] ( $content1)* STRING_END[$endt] )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:196:101: ^( STRING STRING_START[$start] ( $content1)* STRING_END[$endt] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_START, start));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:196:131: ( $content1)*
                        while ( stream_content1.hasNext() ) {
                            adaptor.addChild(root_1, stream_content1.nextTree());

                        }
                        stream_content1.reset();
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_END, endt));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:197:4: start= DQUOT (content2+= doubleQuoteContent )* endt= DQUOT
                    {
                    start=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_string162); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DQUOT.add(start);

                    if ( state.backtracking==0 ) {
                       stringType = DQUOT; 
                    }
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:197:48: (content2+= doubleQuoteContent )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==DQUOT) ) {
                            int LA2_1 = input.LA(2);

                            if ( (LA2_1==DQUOT) ) {
                                alt2=1;
                            }


                        }
                        else if ( (LA2_0==SQUOT||LA2_0==BTICK||(LA2_0>=CHAR && LA2_0<=VARNAME)||(LA2_0>=ATSIGN && LA2_0<=RCURLY)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:197:49: content2+= doubleQuoteContent
                    	    {
                    	    pushFollow(FOLLOW_doubleQuoteContent_in_string177);
                    	    content2=doubleQuoteContent();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_doubleQuoteContent.add(content2.getTree());
                    	    if (list_content2==null) list_content2=new ArrayList();
                    	    list_content2.add(content2.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    endt=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_string183); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DQUOT.add(endt);



                    // AST REWRITE
                    // elements: content2
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: content2
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_content2=new RewriteRuleSubtreeStream(adaptor,"token content2",list_content2);
                    root_0 = (CommonTree)adaptor.nil();
                    // 197:92: -> ^( STRING STRING_START[$start] ( $content2)* STRING_END[$endt] )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:197:95: ^( STRING STRING_START[$start] ( $content2)* STRING_END[$endt] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_START, start));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:197:125: ( $content2)*
                        while ( stream_content2.hasNext() ) {
                            adaptor.addChild(root_1, stream_content2.nextTree());

                        }
                        stream_content2.reset();
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_END, endt));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:198:4: start= BTICK (content3+= backTickContent )* endt= BTICK
                    {
                    start=(Token)match(input,BTICK,FOLLOW_BTICK_in_string207); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BTICK.add(start);

                    if ( state.backtracking==0 ) {
                       stringType = BTICK; 
                    }
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:198:48: (content3+= backTickContent )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==BTICK) ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1==BTICK) ) {
                                alt3=1;
                            }


                        }
                        else if ( ((LA3_0>=SQUOT && LA3_0<=DQUOT)||(LA3_0>=CHAR && LA3_0<=VARNAME)||(LA3_0>=ATSIGN && LA3_0<=RCURLY)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:198:49: content3+= backTickContent
                    	    {
                    	    pushFollow(FOLLOW_backTickContent_in_string222);
                    	    content3=backTickContent();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_backTickContent.add(content3.getTree());
                    	    if (list_content3==null) list_content3=new ArrayList();
                    	    list_content3.add(content3.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    endt=(Token)match(input,BTICK,FOLLOW_BTICK_in_string231); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BTICK.add(endt);



                    // AST REWRITE
                    // elements: content3
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: content3
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_content3=new RewriteRuleSubtreeStream(adaptor,"token content3",list_content3);
                    root_0 = (CommonTree)adaptor.nil();
                    // 198:92: -> ^( STRING STRING_START[$start] ( $content3)* STRING_END[$endt] )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:198:95: ^( STRING STRING_START[$start] ( $content3)* STRING_END[$endt] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_START, start));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:198:125: ( $content3)*
                        while ( stream_content3.hasNext() ) {
                            adaptor.addChild(root_1, stream_content3.nextTree());

                        }
                        stream_content3.reset();
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_END, endt));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:199:4: start= QQUOT_START (content4+= unquotedContent )* end= qQuoteEnd
                    {
                    start=(Token)match(input,QQUOT_START,FOLLOW_QQUOT_START_in_string255); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QQUOT_START.add(start);

                    if ( state.backtracking==0 ) {
                       stringType = QQUOT; 
                    }
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:199:48: (content4+= unquotedContent )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=SQUOT && LA4_0<=BTICK)||(LA4_0>=CHAR && LA4_0<=VARNAME)||(LA4_0>=ATSIGN && LA4_0<=RCURLY)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:199:49: content4+= unquotedContent
                    	    {
                    	    pushFollow(FOLLOW_unquotedContent_in_string264);
                    	    content4=unquotedContent();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_unquotedContent.add(content4.getTree());
                    	    if (list_content4==null) list_content4=new ArrayList();
                    	    list_content4.add(content4.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    pushFollow(FOLLOW_qQuoteEnd_in_string273);
                    end=qQuoteEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qQuoteEnd.add(end.getTree());


                    // AST REWRITE
                    // elements: content4
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: content4
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_content4=new RewriteRuleSubtreeStream(adaptor,"token content4",list_content4);
                    root_0 = (CommonTree)adaptor.nil();
                    // 199:94: -> ^( STRING STRING_START[$start] ( $content4)* STRING_END[$end.token] )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:199:97: ^( STRING STRING_START[$start] ( $content4)* STRING_END[$end.token] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_START, start));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:199:127: ( $content4)*
                        while ( stream_content4.hasNext() ) {
                            adaptor.addChild(root_1, stream_content4.nextTree());

                        }
                        stream_content4.reset();
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_END, (end!=null?end.token:null)));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:200:4: start= DOLQUOT (content5+= unquotedContent )* endt= DOLQUOT
                    {
                    start=(Token)match(input,DOLQUOT,FOLLOW_DOLQUOT_in_string296); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOLQUOT.add(start);

                    if ( state.backtracking==0 ) {
                       stringType = DOLQUOT; 
                    }
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:200:48: (content5+= unquotedContent )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=SQUOT && LA5_0<=BTICK)||(LA5_0>=CHAR && LA5_0<=VARNAME)||(LA5_0>=ATSIGN && LA5_0<=RCURLY)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:200:49: content5+= unquotedContent
                    	    {
                    	    pushFollow(FOLLOW_unquotedContent_in_string307);
                    	    content5=unquotedContent();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_unquotedContent.add(content5.getTree());
                    	    if (list_content5==null) list_content5=new ArrayList();
                    	    list_content5.add(content5.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    endt=(Token)match(input,DOLQUOT,FOLLOW_DOLQUOT_in_string316); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOLQUOT.add(endt);



                    // AST REWRITE
                    // elements: content5
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: content5
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_content5=new RewriteRuleSubtreeStream(adaptor,"token content5",list_content5);
                    root_0 = (CommonTree)adaptor.nil();
                    // 200:93: -> ^( STRING STRING_START[$start] ( $content5)* STRING_END[$endt] )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:200:96: ^( STRING STRING_START[$start] ( $content5)* STRING_END[$endt] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_START, start));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:200:126: ( $content5)*
                        while ( stream_content5.hasNext() ) {
                            adaptor.addChild(root_1, stream_content5.nextTree());

                        }
                        stream_content5.reset();
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_END, endt));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "string"

    public static class singleQuoteContent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "singleQuoteContent"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:203:1: singleQuoteContent : ( ( SQUOT SQUOT )=>q= SQUOT SQUOT -> STRING_CONTENT[$q] | genericContent | q= DQUOT -> STRING_CONTENT[$q] | q= BTICK -> STRING_CONTENT[$q] );
    public final SQLScriptStringParser.singleQuoteContent_return singleQuoteContent() throws RecognitionException {
        SQLScriptStringParser.singleQuoteContent_return retval = new SQLScriptStringParser.singleQuoteContent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token q=null;
        Token SQUOT1=null;
        SQLScriptStringParser.genericContent_return genericContent2 = null;


        CommonTree q_tree=null;
        CommonTree SQUOT1_tree=null;
        RewriteRuleTokenStream stream_SQUOT=new RewriteRuleTokenStream(adaptor,"token SQUOT");
        RewriteRuleTokenStream stream_BTICK=new RewriteRuleTokenStream(adaptor,"token BTICK");
        RewriteRuleTokenStream stream_DQUOT=new RewriteRuleTokenStream(adaptor,"token DQUOT");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:204:2: ( ( SQUOT SQUOT )=>q= SQUOT SQUOT -> STRING_CONTENT[$q] | genericContent | q= DQUOT -> STRING_CONTENT[$q] | q= BTICK -> STRING_CONTENT[$q] )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==SQUOT) && (synpred1_SQLScriptString())) {
                alt7=1;
            }
            else if ( ((LA7_0>=CHAR && LA7_0<=VARNAME)||(LA7_0>=ATSIGN && LA7_0<=RCURLY)) ) {
                alt7=2;
            }
            else if ( (LA7_0==DQUOT) ) {
                alt7=3;
            }
            else if ( (LA7_0==BTICK) ) {
                alt7=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:204:4: ( SQUOT SQUOT )=>q= SQUOT SQUOT
                    {
                    q=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_singleQuoteContent352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUOT.add(q);

                    SQUOT1=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_singleQuoteContent354); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUOT.add(SQUOT1);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 204:34: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:205:4: genericContent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_genericContent_in_singleQuoteContent364);
                    genericContent2=genericContent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericContent2.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:206:4: q= DQUOT
                    {
                    q=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_singleQuoteContent371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DQUOT.add(q);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 206:15: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:207:4: q= BTICK
                    {
                    q=(Token)match(input,BTICK,FOLLOW_BTICK_in_singleQuoteContent386); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BTICK.add(q);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 207:15: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "singleQuoteContent"

    public static class doubleQuoteContent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "doubleQuoteContent"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:210:1: doubleQuoteContent : ( ( DQUOT DQUOT )=>q= DQUOT DQUOT -> STRING_CONTENT[$q] | genericContent | q= SQUOT -> STRING_CONTENT[$q] | q= BTICK -> STRING_CONTENT[$q] );
    public final SQLScriptStringParser.doubleQuoteContent_return doubleQuoteContent() throws RecognitionException {
        SQLScriptStringParser.doubleQuoteContent_return retval = new SQLScriptStringParser.doubleQuoteContent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token q=null;
        Token DQUOT3=null;
        SQLScriptStringParser.genericContent_return genericContent4 = null;


        CommonTree q_tree=null;
        CommonTree DQUOT3_tree=null;
        RewriteRuleTokenStream stream_SQUOT=new RewriteRuleTokenStream(adaptor,"token SQUOT");
        RewriteRuleTokenStream stream_BTICK=new RewriteRuleTokenStream(adaptor,"token BTICK");
        RewriteRuleTokenStream stream_DQUOT=new RewriteRuleTokenStream(adaptor,"token DQUOT");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:211:2: ( ( DQUOT DQUOT )=>q= DQUOT DQUOT -> STRING_CONTENT[$q] | genericContent | q= SQUOT -> STRING_CONTENT[$q] | q= BTICK -> STRING_CONTENT[$q] )
            int alt8=4;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==DQUOT) && (synpred2_SQLScriptString())) {
                alt8=1;
            }
            else if ( ((LA8_0>=CHAR && LA8_0<=VARNAME)||(LA8_0>=ATSIGN && LA8_0<=RCURLY)) ) {
                alt8=2;
            }
            else if ( (LA8_0==SQUOT) ) {
                alt8=3;
            }
            else if ( (LA8_0==BTICK) ) {
                alt8=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:211:4: ( DQUOT DQUOT )=>q= DQUOT DQUOT
                    {
                    q=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_doubleQuoteContent414); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DQUOT.add(q);

                    DQUOT3=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_doubleQuoteContent416); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DQUOT.add(DQUOT3);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 211:34: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:212:4: genericContent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_genericContent_in_doubleQuoteContent426);
                    genericContent4=genericContent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericContent4.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:213:4: q= SQUOT
                    {
                    q=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_doubleQuoteContent433); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUOT.add(q);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 213:15: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:214:4: q= BTICK
                    {
                    q=(Token)match(input,BTICK,FOLLOW_BTICK_in_doubleQuoteContent448); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BTICK.add(q);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 214:15: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "doubleQuoteContent"

    public static class backTickContent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "backTickContent"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:217:1: backTickContent : ( ( BTICK BTICK )=>q= BTICK BTICK -> STRING_CONTENT[$q] | genericContent | q= SQUOT -> STRING_CONTENT[$q] | q= DQUOT -> STRING_CONTENT[$q] );
    public final SQLScriptStringParser.backTickContent_return backTickContent() throws RecognitionException {
        SQLScriptStringParser.backTickContent_return retval = new SQLScriptStringParser.backTickContent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token q=null;
        Token BTICK5=null;
        SQLScriptStringParser.genericContent_return genericContent6 = null;


        CommonTree q_tree=null;
        CommonTree BTICK5_tree=null;
        RewriteRuleTokenStream stream_SQUOT=new RewriteRuleTokenStream(adaptor,"token SQUOT");
        RewriteRuleTokenStream stream_BTICK=new RewriteRuleTokenStream(adaptor,"token BTICK");
        RewriteRuleTokenStream stream_DQUOT=new RewriteRuleTokenStream(adaptor,"token DQUOT");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:218:2: ( ( BTICK BTICK )=>q= BTICK BTICK -> STRING_CONTENT[$q] | genericContent | q= SQUOT -> STRING_CONTENT[$q] | q= DQUOT -> STRING_CONTENT[$q] )
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==BTICK) && (synpred3_SQLScriptString())) {
                alt9=1;
            }
            else if ( ((LA9_0>=CHAR && LA9_0<=VARNAME)||(LA9_0>=ATSIGN && LA9_0<=RCURLY)) ) {
                alt9=2;
            }
            else if ( (LA9_0==SQUOT) ) {
                alt9=3;
            }
            else if ( (LA9_0==DQUOT) ) {
                alt9=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:218:4: ( BTICK BTICK )=>q= BTICK BTICK
                    {
                    q=(Token)match(input,BTICK,FOLLOW_BTICK_in_backTickContent476); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BTICK.add(q);

                    BTICK5=(Token)match(input,BTICK,FOLLOW_BTICK_in_backTickContent478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BTICK.add(BTICK5);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 218:34: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:219:4: genericContent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_genericContent_in_backTickContent488);
                    genericContent6=genericContent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericContent6.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:220:4: q= SQUOT
                    {
                    q=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_backTickContent495); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUOT.add(q);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 220:15: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:221:4: q= DQUOT
                    {
                    q=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_backTickContent510); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DQUOT.add(q);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 221:15: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "backTickContent"

    public static class unquotedContent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unquotedContent"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:224:1: unquotedContent : ( genericContent | q= SQUOT -> STRING_CONTENT[$q] | q= DQUOT -> STRING_CONTENT[$q] | q= BTICK -> STRING_CONTENT[$q] );
    public final SQLScriptStringParser.unquotedContent_return unquotedContent() throws RecognitionException {
        SQLScriptStringParser.unquotedContent_return retval = new SQLScriptStringParser.unquotedContent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token q=null;
        SQLScriptStringParser.genericContent_return genericContent7 = null;


        CommonTree q_tree=null;
        RewriteRuleTokenStream stream_SQUOT=new RewriteRuleTokenStream(adaptor,"token SQUOT");
        RewriteRuleTokenStream stream_BTICK=new RewriteRuleTokenStream(adaptor,"token BTICK");
        RewriteRuleTokenStream stream_DQUOT=new RewriteRuleTokenStream(adaptor,"token DQUOT");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:225:2: ( genericContent | q= SQUOT -> STRING_CONTENT[$q] | q= DQUOT -> STRING_CONTENT[$q] | q= BTICK -> STRING_CONTENT[$q] )
            int alt10=4;
            switch ( input.LA(1) ) {
            case CHAR:
            case VARNAME:
            case ATSIGN:
            case LCURLY:
            case RCURLY:
                {
                alt10=1;
                }
                break;
            case SQUOT:
                {
                alt10=2;
                }
                break;
            case DQUOT:
                {
                alt10=3;
                }
                break;
            case BTICK:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:225:4: genericContent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_genericContent_in_unquotedContent529);
                    genericContent7=genericContent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericContent7.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:226:4: q= SQUOT
                    {
                    q=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_unquotedContent536); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUOT.add(q);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 226:15: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:227:4: q= DQUOT
                    {
                    q=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_unquotedContent551); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DQUOT.add(q);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 227:15: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:228:4: q= BTICK
                    {
                    q=(Token)match(input,BTICK,FOLLOW_BTICK_in_unquotedContent566); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BTICK.add(q);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 228:15: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "unquotedContent"

    public static class genericContent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "genericContent"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:231:1: genericContent : ( embeddedVariable | q= CHAR -> STRING_CONTENT[$q] | q= VARNAME -> STRING_CONTENT[$q] );
    public final SQLScriptStringParser.genericContent_return genericContent() throws RecognitionException {
        SQLScriptStringParser.genericContent_return retval = new SQLScriptStringParser.genericContent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token q=null;
        SQLScriptStringParser.embeddedVariable_return embeddedVariable8 = null;


        CommonTree q_tree=null;
        RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
        RewriteRuleTokenStream stream_VARNAME=new RewriteRuleTokenStream(adaptor,"token VARNAME");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:232:2: ( embeddedVariable | q= CHAR -> STRING_CONTENT[$q] | q= VARNAME -> STRING_CONTENT[$q] )
            int alt11=3;
            switch ( input.LA(1) ) {
            case ATSIGN:
            case LCURLY:
            case RCURLY:
                {
                alt11=1;
                }
                break;
            case CHAR:
                {
                alt11=2;
                }
                break;
            case VARNAME:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:232:4: embeddedVariable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_embeddedVariable_in_genericContent585);
                    embeddedVariable8=embeddedVariable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, embeddedVariable8.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:233:4: q= CHAR
                    {
                    q=(Token)match(input,CHAR,FOLLOW_CHAR_in_genericContent592); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHAR.add(q);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 233:14: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:234:4: q= VARNAME
                    {
                    q=(Token)match(input,VARNAME,FOLLOW_VARNAME_in_genericContent607); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VARNAME.add(q);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 234:16: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "genericContent"

    public static class qQuoteEnd_return extends ParserRuleReturnScope {
        public Token token;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qQuoteEnd"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:237:1: qQuoteEnd returns [ Token token ] : q= QQUOT_END -> STRING_END[$q] ;
    public final SQLScriptStringParser.qQuoteEnd_return qQuoteEnd() throws RecognitionException {
        SQLScriptStringParser.qQuoteEnd_return retval = new SQLScriptStringParser.qQuoteEnd_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token q=null;

        CommonTree q_tree=null;
        RewriteRuleTokenStream stream_QQUOT_END=new RewriteRuleTokenStream(adaptor,"token QQUOT_END");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:238:2: (q= QQUOT_END -> STRING_END[$q] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:238:4: q= QQUOT_END
            {
            q=(Token)match(input,QQUOT_END,FOLLOW_QQUOT_END_in_qQuoteEnd631); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_QQUOT_END.add(q);

            if ( state.backtracking==0 ) {
               retval.token = q; 
            }


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 238:33: -> STRING_END[$q]
            {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_END, q));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "qQuoteEnd"

    public static class embeddedVariable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "embeddedVariable"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:241:1: embeddedVariable : ( ( ATSIGN LCURLY )=>a1= ATSIGN (lc= LCURLY ( RCURLY -> STRING_CONTENT[$a1] | var= VARNAME RCURLY -> EMBEDDED_VAR[$var] ) ) | ATSIGN -> STRING_CONTENT[$ATSIGN] | LCURLY -> STRING_CONTENT[$LCURLY] | RCURLY -> STRING_CONTENT[$RCURLY] );
    public final SQLScriptStringParser.embeddedVariable_return embeddedVariable() throws RecognitionException {
        SQLScriptStringParser.embeddedVariable_return retval = new SQLScriptStringParser.embeddedVariable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token a1=null;
        Token lc=null;
        Token var=null;
        Token RCURLY9=null;
        Token RCURLY10=null;
        Token ATSIGN11=null;
        Token LCURLY12=null;
        Token RCURLY13=null;

        CommonTree a1_tree=null;
        CommonTree lc_tree=null;
        CommonTree var_tree=null;
        CommonTree RCURLY9_tree=null;
        CommonTree RCURLY10_tree=null;
        CommonTree ATSIGN11_tree=null;
        CommonTree LCURLY12_tree=null;
        CommonTree RCURLY13_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_ATSIGN=new RewriteRuleTokenStream(adaptor,"token ATSIGN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleTokenStream stream_VARNAME=new RewriteRuleTokenStream(adaptor,"token VARNAME");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:242:2: ( ( ATSIGN LCURLY )=>a1= ATSIGN (lc= LCURLY ( RCURLY -> STRING_CONTENT[$a1] | var= VARNAME RCURLY -> EMBEDDED_VAR[$var] ) ) | ATSIGN -> STRING_CONTENT[$ATSIGN] | LCURLY -> STRING_CONTENT[$LCURLY] | RCURLY -> STRING_CONTENT[$RCURLY] )
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:242:4: ( ATSIGN LCURLY )=>a1= ATSIGN (lc= LCURLY ( RCURLY -> STRING_CONTENT[$a1] | var= VARNAME RCURLY -> EMBEDDED_VAR[$var] ) )
                    {
                    a1=(Token)match(input,ATSIGN,FOLLOW_ATSIGN_in_embeddedVariable660); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ATSIGN.add(a1);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:244:3: (lc= LCURLY ( RCURLY -> STRING_CONTENT[$a1] | var= VARNAME RCURLY -> EMBEDDED_VAR[$var] ) )
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:244:5: lc= LCURLY ( RCURLY -> STRING_CONTENT[$a1] | var= VARNAME RCURLY -> EMBEDDED_VAR[$var] )
                    {
                    lc=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_embeddedVariable668); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LCURLY.add(lc);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:245:5: ( RCURLY -> STRING_CONTENT[$a1] | var= VARNAME RCURLY -> EMBEDDED_VAR[$var] )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RCURLY) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==VARNAME) ) {
                        alt12=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:245:7: RCURLY
                            {
                            RCURLY9=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_embeddedVariable676); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY9);



                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 245:15: -> STRING_CONTENT[$a1]
                            {
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, a1));

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:246:7: var= VARNAME RCURLY
                            {
                            var=(Token)match(input,VARNAME,FOLLOW_VARNAME_in_embeddedVariable692); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_VARNAME.add(var);

                            RCURLY10=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_embeddedVariable694); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY10);



                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 246:26: -> EMBEDDED_VAR[$var]
                            {
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(EMBEDDED_VAR, var));

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:251:4: ATSIGN
                    {
                    ATSIGN11=(Token)match(input,ATSIGN,FOLLOW_ATSIGN_in_embeddedVariable722); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ATSIGN.add(ATSIGN11);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 251:13: -> STRING_CONTENT[$ATSIGN]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, ATSIGN11));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:252:4: LCURLY
                    {
                    LCURLY12=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_embeddedVariable734); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY12);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 252:13: -> STRING_CONTENT[$LCURLY]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, LCURLY12));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:253:4: RCURLY
                    {
                    RCURLY13=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_embeddedVariable746); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY13);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 253:13: -> STRING_CONTENT[$RCURLY]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, RCURLY13));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		//System.out.println("caught RecognitionException: " + e.getMessage());
        		throw e;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "embeddedVariable"

    // $ANTLR start synpred1_SQLScriptString
    public final void synpred1_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:204:4: ( SQUOT SQUOT )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:204:5: SQUOT SQUOT
        {
        match(input,SQUOT,FOLLOW_SQUOT_in_synpred1_SQLScriptString344); if (state.failed) return ;
        match(input,SQUOT,FOLLOW_SQUOT_in_synpred1_SQLScriptString346); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_SQLScriptString

    // $ANTLR start synpred2_SQLScriptString
    public final void synpred2_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:211:4: ( DQUOT DQUOT )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:211:5: DQUOT DQUOT
        {
        match(input,DQUOT,FOLLOW_DQUOT_in_synpred2_SQLScriptString406); if (state.failed) return ;
        match(input,DQUOT,FOLLOW_DQUOT_in_synpred2_SQLScriptString408); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_SQLScriptString

    // $ANTLR start synpred3_SQLScriptString
    public final void synpred3_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:218:4: ( BTICK BTICK )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:218:5: BTICK BTICK
        {
        match(input,BTICK,FOLLOW_BTICK_in_synpred3_SQLScriptString468); if (state.failed) return ;
        match(input,BTICK,FOLLOW_BTICK_in_synpred3_SQLScriptString470); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_SQLScriptString

    // $ANTLR start synpred4_SQLScriptString
    public final void synpred4_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:242:4: ( ATSIGN LCURLY )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:242:5: ATSIGN LCURLY
        {
        match(input,ATSIGN,FOLLOW_ATSIGN_in_synpred4_SQLScriptString650); if (state.failed) return ;
        match(input,LCURLY,FOLLOW_LCURLY_in_synpred4_SQLScriptString652); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_SQLScriptString

    // Delegated rules

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


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\12\uffff";
    static final String DFA13_eofS =
        "\12\uffff";
    static final String DFA13_minS =
        "\1\24\1\14\2\uffff\1\14\1\uffff\1\0\1\14\1\uffff\1\0";
    static final String DFA13_maxS =
        "\2\26\2\uffff\1\26\1\uffff\1\0\1\26\1\uffff\1\0";
    static final String DFA13_acceptS =
        "\2\uffff\1\3\1\4\1\uffff\1\2\2\uffff\1\1\1\uffff";
    static final String DFA13_specialS =
        "\6\uffff\1\1\2\uffff\1\0}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\2\1\3",
            "\3\5\1\uffff\5\5\1\4\1\5",
            "",
            "",
            "\3\5\1\uffff\2\5\1\7\3\5\1\6",
            "",
            "\1\uffff",
            "\3\5\1\uffff\6\5\1\11",
            "",
            "\1\uffff"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "241:1: embeddedVariable : ( ( ATSIGN LCURLY )=>a1= ATSIGN (lc= LCURLY ( RCURLY -> STRING_CONTENT[$a1] | var= VARNAME RCURLY -> EMBEDDED_VAR[$var] ) ) | ATSIGN -> STRING_CONTENT[$ATSIGN] | LCURLY -> STRING_CONTENT[$LCURLY] | RCURLY -> STRING_CONTENT[$RCURLY] );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_9 = input.LA(1);

                         
                        int index13_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_SQLScriptString()) ) {s = 8;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index13_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_6 = input.LA(1);

                         
                        int index13_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_SQLScriptString()) ) {s = 8;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index13_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_SQUOT_in_string117 = new BitSet(new long[]{0x0000000000767000L});
    public static final BitSet FOLLOW_singleQuoteContent_in_string132 = new BitSet(new long[]{0x0000000000767000L});
    public static final BitSet FOLLOW_SQUOT_in_string138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_string162 = new BitSet(new long[]{0x0000000000767000L});
    public static final BitSet FOLLOW_doubleQuoteContent_in_string177 = new BitSet(new long[]{0x0000000000767000L});
    public static final BitSet FOLLOW_DQUOT_in_string183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_string207 = new BitSet(new long[]{0x0000000000767000L});
    public static final BitSet FOLLOW_backTickContent_in_string222 = new BitSet(new long[]{0x0000000000767000L});
    public static final BitSet FOLLOW_BTICK_in_string231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QQUOT_START_in_string255 = new BitSet(new long[]{0x00000000007E7000L});
    public static final BitSet FOLLOW_unquotedContent_in_string264 = new BitSet(new long[]{0x00000000007E7000L});
    public static final BitSet FOLLOW_qQuoteEnd_in_string273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLQUOT_in_string296 = new BitSet(new long[]{0x0000000000777000L});
    public static final BitSet FOLLOW_unquotedContent_in_string307 = new BitSet(new long[]{0x0000000000777000L});
    public static final BitSet FOLLOW_DOLQUOT_in_string316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_singleQuoteContent352 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SQUOT_in_singleQuoteContent354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericContent_in_singleQuoteContent364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_singleQuoteContent371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_singleQuoteContent386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_doubleQuoteContent414 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DQUOT_in_doubleQuoteContent416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericContent_in_doubleQuoteContent426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_doubleQuoteContent433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_doubleQuoteContent448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_backTickContent476 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_BTICK_in_backTickContent478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericContent_in_backTickContent488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_backTickContent495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_backTickContent510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericContent_in_unquotedContent529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_unquotedContent536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_unquotedContent551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_unquotedContent566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVariable_in_genericContent585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_genericContent592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARNAME_in_genericContent607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QQUOT_END_in_qQuoteEnd631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSIGN_in_embeddedVariable660 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LCURLY_in_embeddedVariable668 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_RCURLY_in_embeddedVariable676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARNAME_in_embeddedVariable692 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RCURLY_in_embeddedVariable694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSIGN_in_embeddedVariable722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_embeddedVariable734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RCURLY_in_embeddedVariable746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_synpred1_SQLScriptString344 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SQUOT_in_synpred1_SQLScriptString346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_synpred2_SQLScriptString406 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DQUOT_in_synpred2_SQLScriptString408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_synpred3_SQLScriptString468 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_BTICK_in_synpred3_SQLScriptString470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSIGN_in_synpred4_SQLScriptString650 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LCURLY_in_synpred4_SQLScriptString652 = new BitSet(new long[]{0x0000000000000002L});

}