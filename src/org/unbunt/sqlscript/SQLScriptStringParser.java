// $ANTLR 3.1.1 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g 2009-02-13 08:43:50

	package org.unbunt.sqlscript;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class SQLScriptStringParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "QQUOT", "CHARS", "EMBEDDED_VARIABLE", "SQUOT", "DQUOT", "BTICK", "QQUOT_START", "DOLQUOT", "CHAR", "VARNAME", "QQUOT_END", "ATSIGN", "LCURLY", "RCURLY", "QQUOT_DELIM", "DOLQUOT_TAG", "DOLQUOT_TAG_START", "DOLQUOT_TAG_END", "WORD_CHAR"
    };
    public static final int WORD_CHAR=24;
    public static final int DQUOT=10;
    public static final int QQUOT_START=12;
    public static final int CHAR=14;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int LCURLY=18;
    public static final int DOLQUOT_TAG_START=22;
    public static final int EOF=-1;
    public static final int QQUOT=6;
    public static final int VARNAME=15;
    public static final int DOLQUOT_TAG_END=23;
    public static final int EMBEDDED_VARIABLE=8;
    public static final int SQUOT=9;
    public static final int QQUOT_DELIM=20;
    public static final int RCURLY=19;
    public static final int DOLQUOT=13;
    public static final int CHARS=7;
    public static final int ATSIGN=17;
    public static final int DOLQUOT_TAG=21;
    public static final int QQUOT_END=16;
    public static final int BTICK=11;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:149:1: string : (start= SQUOT (content+= singleQuoteContent )* endt= SQUOT -> ^( STRING $start ( $content)* $endt) | start= DQUOT (content+= doubleQuoteContent )* endt= DQUOT -> ^( STRING $start ( $content)* $endt) | start= BTICK (content+= backTickContent )* endt= BTICK -> ^( STRING $start ( $content)* $endt) | start= QQUOT_START (content+= unquotedContent )* end= qQuoteEnd -> ^( STRING $start ( $content)* $end) | start= DOLQUOT (content+= unquotedContent )* endt= DOLQUOT -> ^( STRING $start ( $content)* $endt) );
    public final SQLScriptStringParser.string_return string() throws RecognitionException {
        SQLScriptStringParser.string_return retval = new SQLScriptStringParser.string_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token start=null;
        Token endt=null;
        List list_content=null;
        SQLScriptStringParser.qQuoteEnd_return end = null;

        RuleReturnScope content = null;
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:149:8: (start= SQUOT (content+= singleQuoteContent )* endt= SQUOT -> ^( STRING $start ( $content)* $endt) | start= DQUOT (content+= doubleQuoteContent )* endt= DQUOT -> ^( STRING $start ( $content)* $endt) | start= BTICK (content+= backTickContent )* endt= BTICK -> ^( STRING $start ( $content)* $endt) | start= QQUOT_START (content+= unquotedContent )* end= qQuoteEnd -> ^( STRING $start ( $content)* $end) | start= DOLQUOT (content+= unquotedContent )* endt= DOLQUOT -> ^( STRING $start ( $content)* $endt) )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:149:10: start= SQUOT (content+= singleQuoteContent )* endt= SQUOT
                    {
                    start=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_string101); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUOT.add(start);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:149:28: (content+= singleQuoteContent )*
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
                        else if ( ((LA1_0>=DQUOT && LA1_0<=BTICK)||(LA1_0>=CHAR && LA1_0<=VARNAME)||LA1_0==ATSIGN) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:149:29: content+= singleQuoteContent
                    	    {
                    	    pushFollow(FOLLOW_singleQuoteContent_in_string112);
                    	    content=singleQuoteContent();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_singleQuoteContent.add(content.getTree());
                    	    if (list_content==null) list_content=new ArrayList();
                    	    list_content.add(content.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    endt=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_string118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUOT.add(endt);



                    // AST REWRITE
                    // elements: endt, content, start
                    // token labels: endt, start
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: content
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_endt=new RewriteRuleTokenStream(adaptor,"token endt",endt);
                    RewriteRuleTokenStream stream_start=new RewriteRuleTokenStream(adaptor,"token start",start);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"token content",list_content);
                    root_0 = (CommonTree)adaptor.nil();
                    // 149:70: -> ^( STRING $start ( $content)* $endt)
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:149:73: ^( STRING $start ( $content)* $endt)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, stream_start.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:149:89: ( $content)*
                        while ( stream_content.hasNext() ) {
                            adaptor.addChild(root_1, stream_content.nextTree());

                        }
                        stream_content.reset();
                        adaptor.addChild(root_1, stream_endt.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:150:4: start= DQUOT (content+= doubleQuoteContent )* endt= DQUOT
                    {
                    start=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_string141); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DQUOT.add(start);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:150:22: (content+= doubleQuoteContent )*
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
                        else if ( (LA2_0==SQUOT||LA2_0==BTICK||(LA2_0>=CHAR && LA2_0<=VARNAME)||LA2_0==ATSIGN) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:150:23: content+= doubleQuoteContent
                    	    {
                    	    pushFollow(FOLLOW_doubleQuoteContent_in_string152);
                    	    content=doubleQuoteContent();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_doubleQuoteContent.add(content.getTree());
                    	    if (list_content==null) list_content=new ArrayList();
                    	    list_content.add(content.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    endt=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_string158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DQUOT.add(endt);



                    // AST REWRITE
                    // elements: endt, content, start
                    // token labels: endt, start
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: content
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_endt=new RewriteRuleTokenStream(adaptor,"token endt",endt);
                    RewriteRuleTokenStream stream_start=new RewriteRuleTokenStream(adaptor,"token start",start);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"token content",list_content);
                    root_0 = (CommonTree)adaptor.nil();
                    // 150:64: -> ^( STRING $start ( $content)* $endt)
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:150:67: ^( STRING $start ( $content)* $endt)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, stream_start.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:150:83: ( $content)*
                        while ( stream_content.hasNext() ) {
                            adaptor.addChild(root_1, stream_content.nextTree());

                        }
                        stream_content.reset();
                        adaptor.addChild(root_1, stream_endt.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:151:4: start= BTICK (content+= backTickContent )* endt= BTICK
                    {
                    start=(Token)match(input,BTICK,FOLLOW_BTICK_in_string181); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BTICK.add(start);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:151:22: (content+= backTickContent )*
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
                        else if ( ((LA3_0>=SQUOT && LA3_0<=DQUOT)||(LA3_0>=CHAR && LA3_0<=VARNAME)||LA3_0==ATSIGN) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:151:23: content+= backTickContent
                    	    {
                    	    pushFollow(FOLLOW_backTickContent_in_string192);
                    	    content=backTickContent();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_backTickContent.add(content.getTree());
                    	    if (list_content==null) list_content=new ArrayList();
                    	    list_content.add(content.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    endt=(Token)match(input,BTICK,FOLLOW_BTICK_in_string201); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BTICK.add(endt);



                    // AST REWRITE
                    // elements: content, start, endt
                    // token labels: endt, start
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: content
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_endt=new RewriteRuleTokenStream(adaptor,"token endt",endt);
                    RewriteRuleTokenStream stream_start=new RewriteRuleTokenStream(adaptor,"token start",start);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"token content",list_content);
                    root_0 = (CommonTree)adaptor.nil();
                    // 151:64: -> ^( STRING $start ( $content)* $endt)
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:151:67: ^( STRING $start ( $content)* $endt)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, stream_start.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:151:83: ( $content)*
                        while ( stream_content.hasNext() ) {
                            adaptor.addChild(root_1, stream_content.nextTree());

                        }
                        stream_content.reset();
                        adaptor.addChild(root_1, stream_endt.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:152:4: start= QQUOT_START (content+= unquotedContent )* end= qQuoteEnd
                    {
                    start=(Token)match(input,QQUOT_START,FOLLOW_QQUOT_START_in_string224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QQUOT_START.add(start);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:152:22: (content+= unquotedContent )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=SQUOT && LA4_0<=BTICK)||(LA4_0>=CHAR && LA4_0<=VARNAME)||LA4_0==ATSIGN) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:152:23: content+= unquotedContent
                    	    {
                    	    pushFollow(FOLLOW_unquotedContent_in_string229);
                    	    content=unquotedContent();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_unquotedContent.add(content.getTree());
                    	    if (list_content==null) list_content=new ArrayList();
                    	    list_content.add(content.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    pushFollow(FOLLOW_qQuoteEnd_in_string238);
                    end=qQuoteEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qQuoteEnd.add(end.getTree());


                    // AST REWRITE
                    // elements: content, end, start
                    // token labels: start
                    // rule labels: retval, end
                    // token list labels: 
                    // rule list labels: content
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_start=new RewriteRuleTokenStream(adaptor,"token start",start);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"token end",end!=null?end.tree:null);
                    RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"token content",list_content);
                    root_0 = (CommonTree)adaptor.nil();
                    // 152:67: -> ^( STRING $start ( $content)* $end)
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:152:70: ^( STRING $start ( $content)* $end)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, stream_start.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:152:86: ( $content)*
                        while ( stream_content.hasNext() ) {
                            adaptor.addChild(root_1, stream_content.nextTree());

                        }
                        stream_content.reset();
                        adaptor.addChild(root_1, stream_end.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:153:4: start= DOLQUOT (content+= unquotedContent )* endt= DOLQUOT
                    {
                    start=(Token)match(input,DOLQUOT,FOLLOW_DOLQUOT_in_string261); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOLQUOT.add(start);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:153:22: (content+= unquotedContent )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=SQUOT && LA5_0<=BTICK)||(LA5_0>=CHAR && LA5_0<=VARNAME)||LA5_0==ATSIGN) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:153:23: content+= unquotedContent
                    	    {
                    	    pushFollow(FOLLOW_unquotedContent_in_string270);
                    	    content=unquotedContent();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_unquotedContent.add(content.getTree());
                    	    if (list_content==null) list_content=new ArrayList();
                    	    list_content.add(content.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    endt=(Token)match(input,DOLQUOT,FOLLOW_DOLQUOT_in_string279); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOLQUOT.add(endt);



                    // AST REWRITE
                    // elements: content, start, endt
                    // token labels: endt, start
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: content
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_endt=new RewriteRuleTokenStream(adaptor,"token endt",endt);
                    RewriteRuleTokenStream stream_start=new RewriteRuleTokenStream(adaptor,"token start",start);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"token content",list_content);
                    root_0 = (CommonTree)adaptor.nil();
                    // 153:66: -> ^( STRING $start ( $content)* $endt)
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:153:69: ^( STRING $start ( $content)* $endt)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, stream_start.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:153:85: ( $content)*
                        while ( stream_content.hasNext() ) {
                            adaptor.addChild(root_1, stream_content.nextTree());

                        }
                        stream_content.reset();
                        adaptor.addChild(root_1, stream_endt.nextNode());

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

    public static class singleQuoteContent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "singleQuoteContent"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:156:1: singleQuoteContent : ( ( SQUOT SQUOT )=> SQUOT SQUOT -> SQUOT | genericContent | DQUOT | BTICK );
    public final SQLScriptStringParser.singleQuoteContent_return singleQuoteContent() throws RecognitionException {
        SQLScriptStringParser.singleQuoteContent_return retval = new SQLScriptStringParser.singleQuoteContent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SQUOT1=null;
        Token SQUOT2=null;
        Token DQUOT4=null;
        Token BTICK5=null;
        SQLScriptStringParser.genericContent_return genericContent3 = null;


        CommonTree SQUOT1_tree=null;
        CommonTree SQUOT2_tree=null;
        CommonTree DQUOT4_tree=null;
        CommonTree BTICK5_tree=null;
        RewriteRuleTokenStream stream_SQUOT=new RewriteRuleTokenStream(adaptor,"token SQUOT");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:157:2: ( ( SQUOT SQUOT )=> SQUOT SQUOT -> SQUOT | genericContent | DQUOT | BTICK )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==SQUOT) && (synpred1_SQLScriptString())) {
                alt7=1;
            }
            else if ( ((LA7_0>=CHAR && LA7_0<=VARNAME)||LA7_0==ATSIGN) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:157:4: ( SQUOT SQUOT )=> SQUOT SQUOT
                    {
                    SQUOT1=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_singleQuoteContent313); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUOT.add(SQUOT1);

                    SQUOT2=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_singleQuoteContent315); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUOT.add(SQUOT2);



                    // AST REWRITE
                    // elements: SQUOT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 157:32: -> SQUOT
                    {
                        adaptor.addChild(root_0, stream_SQUOT.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:158:4: genericContent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_genericContent_in_singleQuoteContent324);
                    genericContent3=genericContent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericContent3.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:159:4: DQUOT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DQUOT4=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_singleQuoteContent329); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DQUOT4_tree = (CommonTree)adaptor.create(DQUOT4);
                    adaptor.addChild(root_0, DQUOT4_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:160:4: BTICK
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BTICK5=(Token)match(input,BTICK,FOLLOW_BTICK_in_singleQuoteContent334); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BTICK5_tree = (CommonTree)adaptor.create(BTICK5);
                    adaptor.addChild(root_0, BTICK5_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "singleQuoteContent"

    public static class doubleQuoteContent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "doubleQuoteContent"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:163:1: doubleQuoteContent : ( ( DQUOT DQUOT )=> DQUOT DQUOT -> DQUOT | genericContent | SQUOT | BTICK );
    public final SQLScriptStringParser.doubleQuoteContent_return doubleQuoteContent() throws RecognitionException {
        SQLScriptStringParser.doubleQuoteContent_return retval = new SQLScriptStringParser.doubleQuoteContent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DQUOT6=null;
        Token DQUOT7=null;
        Token SQUOT9=null;
        Token BTICK10=null;
        SQLScriptStringParser.genericContent_return genericContent8 = null;


        CommonTree DQUOT6_tree=null;
        CommonTree DQUOT7_tree=null;
        CommonTree SQUOT9_tree=null;
        CommonTree BTICK10_tree=null;
        RewriteRuleTokenStream stream_DQUOT=new RewriteRuleTokenStream(adaptor,"token DQUOT");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:164:2: ( ( DQUOT DQUOT )=> DQUOT DQUOT -> DQUOT | genericContent | SQUOT | BTICK )
            int alt8=4;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==DQUOT) && (synpred2_SQLScriptString())) {
                alt8=1;
            }
            else if ( ((LA8_0>=CHAR && LA8_0<=VARNAME)||LA8_0==ATSIGN) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:164:4: ( DQUOT DQUOT )=> DQUOT DQUOT
                    {
                    DQUOT6=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_doubleQuoteContent352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DQUOT.add(DQUOT6);

                    DQUOT7=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_doubleQuoteContent354); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DQUOT.add(DQUOT7);



                    // AST REWRITE
                    // elements: DQUOT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 164:32: -> DQUOT
                    {
                        adaptor.addChild(root_0, stream_DQUOT.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:165:4: genericContent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_genericContent_in_doubleQuoteContent363);
                    genericContent8=genericContent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericContent8.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:166:4: SQUOT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SQUOT9=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_doubleQuoteContent368); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SQUOT9_tree = (CommonTree)adaptor.create(SQUOT9);
                    adaptor.addChild(root_0, SQUOT9_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:167:4: BTICK
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BTICK10=(Token)match(input,BTICK,FOLLOW_BTICK_in_doubleQuoteContent373); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BTICK10_tree = (CommonTree)adaptor.create(BTICK10);
                    adaptor.addChild(root_0, BTICK10_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "doubleQuoteContent"

    public static class backTickContent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "backTickContent"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:170:1: backTickContent : ( ( BTICK BTICK )=> BTICK BTICK -> BTICK | genericContent | SQUOT | DQUOT );
    public final SQLScriptStringParser.backTickContent_return backTickContent() throws RecognitionException {
        SQLScriptStringParser.backTickContent_return retval = new SQLScriptStringParser.backTickContent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BTICK11=null;
        Token BTICK12=null;
        Token SQUOT14=null;
        Token DQUOT15=null;
        SQLScriptStringParser.genericContent_return genericContent13 = null;


        CommonTree BTICK11_tree=null;
        CommonTree BTICK12_tree=null;
        CommonTree SQUOT14_tree=null;
        CommonTree DQUOT15_tree=null;
        RewriteRuleTokenStream stream_BTICK=new RewriteRuleTokenStream(adaptor,"token BTICK");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:171:2: ( ( BTICK BTICK )=> BTICK BTICK -> BTICK | genericContent | SQUOT | DQUOT )
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==BTICK) && (synpred3_SQLScriptString())) {
                alt9=1;
            }
            else if ( ((LA9_0>=CHAR && LA9_0<=VARNAME)||LA9_0==ATSIGN) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:171:4: ( BTICK BTICK )=> BTICK BTICK
                    {
                    BTICK11=(Token)match(input,BTICK,FOLLOW_BTICK_in_backTickContent391); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BTICK.add(BTICK11);

                    BTICK12=(Token)match(input,BTICK,FOLLOW_BTICK_in_backTickContent393); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BTICK.add(BTICK12);



                    // AST REWRITE
                    // elements: BTICK
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 171:32: -> BTICK
                    {
                        adaptor.addChild(root_0, stream_BTICK.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:172:4: genericContent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_genericContent_in_backTickContent402);
                    genericContent13=genericContent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericContent13.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:173:4: SQUOT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SQUOT14=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_backTickContent407); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SQUOT14_tree = (CommonTree)adaptor.create(SQUOT14);
                    adaptor.addChild(root_0, SQUOT14_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:174:4: DQUOT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DQUOT15=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_backTickContent412); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DQUOT15_tree = (CommonTree)adaptor.create(DQUOT15);
                    adaptor.addChild(root_0, DQUOT15_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "backTickContent"

    public static class unquotedContent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unquotedContent"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:177:1: unquotedContent : ( genericContent | SQUOT | DQUOT | BTICK );
    public final SQLScriptStringParser.unquotedContent_return unquotedContent() throws RecognitionException {
        SQLScriptStringParser.unquotedContent_return retval = new SQLScriptStringParser.unquotedContent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SQUOT17=null;
        Token DQUOT18=null;
        Token BTICK19=null;
        SQLScriptStringParser.genericContent_return genericContent16 = null;


        CommonTree SQUOT17_tree=null;
        CommonTree DQUOT18_tree=null;
        CommonTree BTICK19_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:178:2: ( genericContent | SQUOT | DQUOT | BTICK )
            int alt10=4;
            switch ( input.LA(1) ) {
            case CHAR:
            case VARNAME:
            case ATSIGN:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:178:4: genericContent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_genericContent_in_unquotedContent423);
                    genericContent16=genericContent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericContent16.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:179:4: SQUOT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SQUOT17=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_unquotedContent428); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SQUOT17_tree = (CommonTree)adaptor.create(SQUOT17);
                    adaptor.addChild(root_0, SQUOT17_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:180:4: DQUOT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DQUOT18=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_unquotedContent433); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DQUOT18_tree = (CommonTree)adaptor.create(DQUOT18);
                    adaptor.addChild(root_0, DQUOT18_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:181:4: BTICK
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BTICK19=(Token)match(input,BTICK,FOLLOW_BTICK_in_unquotedContent438); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BTICK19_tree = (CommonTree)adaptor.create(BTICK19);
                    adaptor.addChild(root_0, BTICK19_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "unquotedContent"

    public static class genericContent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "genericContent"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:184:1: genericContent : ( embeddedVariable | CHAR | VARNAME );
    public final SQLScriptStringParser.genericContent_return genericContent() throws RecognitionException {
        SQLScriptStringParser.genericContent_return retval = new SQLScriptStringParser.genericContent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CHAR21=null;
        Token VARNAME22=null;
        SQLScriptStringParser.embeddedVariable_return embeddedVariable20 = null;


        CommonTree CHAR21_tree=null;
        CommonTree VARNAME22_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:185:2: ( embeddedVariable | CHAR | VARNAME )
            int alt11=3;
            switch ( input.LA(1) ) {
            case ATSIGN:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:185:4: embeddedVariable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_embeddedVariable_in_genericContent449);
                    embeddedVariable20=embeddedVariable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, embeddedVariable20.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:186:4: CHAR
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CHAR21=(Token)match(input,CHAR,FOLLOW_CHAR_in_genericContent454); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR21_tree = (CommonTree)adaptor.create(CHAR21);
                    adaptor.addChild(root_0, CHAR21_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:187:4: VARNAME
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VARNAME22=(Token)match(input,VARNAME,FOLLOW_VARNAME_in_genericContent459); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VARNAME22_tree = (CommonTree)adaptor.create(VARNAME22);
                    adaptor.addChild(root_0, VARNAME22_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "genericContent"

    public static class qQuoteEnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qQuoteEnd"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:190:1: qQuoteEnd : QQUOT_END ;
    public final SQLScriptStringParser.qQuoteEnd_return qQuoteEnd() throws RecognitionException {
        SQLScriptStringParser.qQuoteEnd_return retval = new SQLScriptStringParser.qQuoteEnd_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QQUOT_END23=null;

        CommonTree QQUOT_END23_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:191:2: ( QQUOT_END )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:191:4: QQUOT_END
            {
            root_0 = (CommonTree)adaptor.nil();

            QQUOT_END23=(Token)match(input,QQUOT_END,FOLLOW_QQUOT_END_in_qQuoteEnd470); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            QQUOT_END23_tree = (CommonTree)adaptor.create(QQUOT_END23);
            adaptor.addChild(root_0, QQUOT_END23_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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

    public static class embeddedVariable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "embeddedVariable"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:194:1: embeddedVariable : a1= ATSIGN (lc= LCURLY ( RCURLY -> $a1 | var= VARNAME RCURLY -> EMBEDDED_VARIABLE[$var] | -> $a1 $lc) | -> $a1) ;
    public final SQLScriptStringParser.embeddedVariable_return embeddedVariable() throws RecognitionException {
        SQLScriptStringParser.embeddedVariable_return retval = new SQLScriptStringParser.embeddedVariable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token a1=null;
        Token lc=null;
        Token var=null;
        Token RCURLY24=null;
        Token RCURLY25=null;

        CommonTree a1_tree=null;
        CommonTree lc_tree=null;
        CommonTree var_tree=null;
        CommonTree RCURLY24_tree=null;
        CommonTree RCURLY25_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_ATSIGN=new RewriteRuleTokenStream(adaptor,"token ATSIGN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleTokenStream stream_VARNAME=new RewriteRuleTokenStream(adaptor,"token VARNAME");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:195:2: (a1= ATSIGN (lc= LCURLY ( RCURLY -> $a1 | var= VARNAME RCURLY -> EMBEDDED_VARIABLE[$var] | -> $a1 $lc) | -> $a1) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:195:4: a1= ATSIGN (lc= LCURLY ( RCURLY -> $a1 | var= VARNAME RCURLY -> EMBEDDED_VARIABLE[$var] | -> $a1 $lc) | -> $a1)
            {
            a1=(Token)match(input,ATSIGN,FOLLOW_ATSIGN_in_embeddedVariable483); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ATSIGN.add(a1);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:196:3: (lc= LCURLY ( RCURLY -> $a1 | var= VARNAME RCURLY -> EMBEDDED_VARIABLE[$var] | -> $a1 $lc) | -> $a1)
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LCURLY) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=SQUOT && LA13_0<=BTICK)||(LA13_0>=DOLQUOT && LA13_0<=ATSIGN)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:196:5: lc= LCURLY ( RCURLY -> $a1 | var= VARNAME RCURLY -> EMBEDDED_VARIABLE[$var] | -> $a1 $lc)
                    {
                    lc=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_embeddedVariable491); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LCURLY.add(lc);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:197:5: ( RCURLY -> $a1 | var= VARNAME RCURLY -> EMBEDDED_VARIABLE[$var] | -> $a1 $lc)
                    int alt12=3;
                    switch ( input.LA(1) ) {
                    case RCURLY:
                        {
                        alt12=1;
                        }
                        break;
                    case VARNAME:
                        {
                        int LA12_2 = input.LA(2);

                        if ( (LA12_2==RCURLY) ) {
                            alt12=2;
                        }
                        else if ( ((LA12_2>=SQUOT && LA12_2<=BTICK)||(LA12_2>=DOLQUOT && LA12_2<=ATSIGN)) ) {
                            alt12=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case SQUOT:
                    case DQUOT:
                    case BTICK:
                    case DOLQUOT:
                    case CHAR:
                    case QQUOT_END:
                    case ATSIGN:
                        {
                        alt12=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }

                    switch (alt12) {
                        case 1 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:197:7: RCURLY
                            {
                            RCURLY24=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_embeddedVariable499); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY24);



                            // AST REWRITE
                            // elements: a1
                            // token labels: a1
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_a1=new RewriteRuleTokenStream(adaptor,"token a1",a1);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 197:15: -> $a1
                            {
                                adaptor.addChild(root_0, stream_a1.nextNode());

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:198:7: var= VARNAME RCURLY
                            {
                            var=(Token)match(input,VARNAME,FOLLOW_VARNAME_in_embeddedVariable515); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_VARNAME.add(var);

                            RCURLY25=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_embeddedVariable517); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY25);



                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 198:26: -> EMBEDDED_VARIABLE[$var]
                            {
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(EMBEDDED_VARIABLE, var));

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:199:9: 
                            {

                            // AST REWRITE
                            // elements: a1, lc
                            // token labels: a1, lc
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_a1=new RewriteRuleTokenStream(adaptor,"token a1",a1);
                            RewriteRuleTokenStream stream_lc=new RewriteRuleTokenStream(adaptor,"token lc",lc);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 199:9: -> $a1 $lc
                            {
                                adaptor.addChild(root_0, stream_a1.nextNode());
                                adaptor.addChild(root_0, stream_lc.nextNode());

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:201:7: 
                    {

                    // AST REWRITE
                    // elements: a1
                    // token labels: a1
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_a1=new RewriteRuleTokenStream(adaptor,"token a1",a1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 201:7: -> $a1
                    {
                        adaptor.addChild(root_0, stream_a1.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "embeddedVariable"

    // $ANTLR start synpred1_SQLScriptString
    public final void synpred1_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:157:4: ( SQUOT SQUOT )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:157:5: SQUOT SQUOT
        {
        match(input,SQUOT,FOLLOW_SQUOT_in_synpred1_SQLScriptString307); if (state.failed) return ;
        match(input,SQUOT,FOLLOW_SQUOT_in_synpred1_SQLScriptString309); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_SQLScriptString

    // $ANTLR start synpred2_SQLScriptString
    public final void synpred2_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:164:4: ( DQUOT DQUOT )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:164:5: DQUOT DQUOT
        {
        match(input,DQUOT,FOLLOW_DQUOT_in_synpred2_SQLScriptString346); if (state.failed) return ;
        match(input,DQUOT,FOLLOW_DQUOT_in_synpred2_SQLScriptString348); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_SQLScriptString

    // $ANTLR start synpred3_SQLScriptString
    public final void synpred3_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:171:4: ( BTICK BTICK )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:171:5: BTICK BTICK
        {
        match(input,BTICK,FOLLOW_BTICK_in_synpred3_SQLScriptString385); if (state.failed) return ;
        match(input,BTICK,FOLLOW_BTICK_in_synpred3_SQLScriptString387); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_SQLScriptString

    // Delegated rules

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


 

    public static final BitSet FOLLOW_SQUOT_in_string101 = new BitSet(new long[]{0x000000000002CE00L});
    public static final BitSet FOLLOW_singleQuoteContent_in_string112 = new BitSet(new long[]{0x000000000002CE00L});
    public static final BitSet FOLLOW_SQUOT_in_string118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_string141 = new BitSet(new long[]{0x000000000002CE00L});
    public static final BitSet FOLLOW_doubleQuoteContent_in_string152 = new BitSet(new long[]{0x000000000002CE00L});
    public static final BitSet FOLLOW_DQUOT_in_string158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_string181 = new BitSet(new long[]{0x000000000002CE00L});
    public static final BitSet FOLLOW_backTickContent_in_string192 = new BitSet(new long[]{0x000000000002CE00L});
    public static final BitSet FOLLOW_BTICK_in_string201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QQUOT_START_in_string224 = new BitSet(new long[]{0x000000000003CE00L});
    public static final BitSet FOLLOW_unquotedContent_in_string229 = new BitSet(new long[]{0x000000000003CE00L});
    public static final BitSet FOLLOW_qQuoteEnd_in_string238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLQUOT_in_string261 = new BitSet(new long[]{0x000000000002EE00L});
    public static final BitSet FOLLOW_unquotedContent_in_string270 = new BitSet(new long[]{0x000000000002EE00L});
    public static final BitSet FOLLOW_DOLQUOT_in_string279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_singleQuoteContent313 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SQUOT_in_singleQuoteContent315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericContent_in_singleQuoteContent324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_singleQuoteContent329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_singleQuoteContent334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_doubleQuoteContent352 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DQUOT_in_doubleQuoteContent354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericContent_in_doubleQuoteContent363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_doubleQuoteContent368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_doubleQuoteContent373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_backTickContent391 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_BTICK_in_backTickContent393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericContent_in_backTickContent402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_backTickContent407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_backTickContent412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericContent_in_unquotedContent423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_unquotedContent428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_unquotedContent433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_unquotedContent438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVariable_in_genericContent449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_genericContent454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARNAME_in_genericContent459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QQUOT_END_in_qQuoteEnd470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSIGN_in_embeddedVariable483 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_LCURLY_in_embeddedVariable491 = new BitSet(new long[]{0x0000000000088002L});
    public static final BitSet FOLLOW_RCURLY_in_embeddedVariable499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARNAME_in_embeddedVariable515 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RCURLY_in_embeddedVariable517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_synpred1_SQLScriptString307 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SQUOT_in_synpred1_SQLScriptString309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_synpred2_SQLScriptString346 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DQUOT_in_synpred2_SQLScriptString348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_synpred3_SQLScriptString385 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_BTICK_in_synpred3_SQLScriptString387 = new BitSet(new long[]{0x0000000000000002L});

}