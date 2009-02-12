// $ANTLR 3.1.1 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g 2009-02-13 00:07:46

	package org.unbunt.sqlscript;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SQLScriptStringParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "QQUOT", "CHARS", "EMBEDDED_VARIABLE", "QQUOT_START", "DOLQUOT", "CHAR", "VARNAME", "SQUOT", "DQUOT", "BTICK", "QQUOT_END", "ATSIGN", "LCURLY", "RCURLY", "QQUOT_DELIM", "DOLQUOT_TAG", "DOLQUOT_TAG_START", "DOLQUOT_TAG_END", "WORD_CHAR"
    };
    public static final int WORD_CHAR=24;
    public static final int DQUOT=14;
    public static final int QQUOT_START=9;
    public static final int CHAR=11;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int LCURLY=18;
    public static final int DOLQUOT_TAG_START=22;
    public static final int EOF=-1;
    public static final int QQUOT=6;
    public static final int VARNAME=12;
    public static final int DOLQUOT_TAG_END=23;
    public static final int EMBEDDED_VARIABLE=8;
    public static final int SQUOT=13;
    public static final int QQUOT_DELIM=20;
    public static final int RCURLY=19;
    public static final int DOLQUOT=10;
    public static final int CHARS=7;
    public static final int ATSIGN=17;
    public static final int DOLQUOT_TAG=21;
    public static final int QQUOT_END=16;
    public static final int BTICK=15;
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:149:1: string : (start= QQUOT_START (content+= unquotedContent )* end= qQuoteEnd -> ^( STRING $start ( $content)* $end) | start= DOLQUOT (content+= unquotedContent )* dend= DOLQUOT -> ^( STRING $start ( $content)* $dend) );
    public final SQLScriptStringParser.string_return string() throws RecognitionException {
        SQLScriptStringParser.string_return retval = new SQLScriptStringParser.string_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token start=null;
        Token dend=null;
        List list_content=null;
        SQLScriptStringParser.qQuoteEnd_return end = null;

        RuleReturnScope content = null;
        CommonTree start_tree=null;
        CommonTree dend_tree=null;
        RewriteRuleTokenStream stream_DOLQUOT=new RewriteRuleTokenStream(adaptor,"token DOLQUOT");
        RewriteRuleTokenStream stream_QQUOT_START=new RewriteRuleTokenStream(adaptor,"token QQUOT_START");
        RewriteRuleSubtreeStream stream_unquotedContent=new RewriteRuleSubtreeStream(adaptor,"rule unquotedContent");
        RewriteRuleSubtreeStream stream_qQuoteEnd=new RewriteRuleSubtreeStream(adaptor,"rule qQuoteEnd");
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:153:2: (start= QQUOT_START (content+= unquotedContent )* end= qQuoteEnd -> ^( STRING $start ( $content)* $end) | start= DOLQUOT (content+= unquotedContent )* dend= DOLQUOT -> ^( STRING $start ( $content)* $dend) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==QQUOT_START) ) {
                alt3=1;
            }
            else if ( (LA3_0==DOLQUOT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:153:4: start= QQUOT_START (content+= unquotedContent )* end= qQuoteEnd
                    {
                    start=(Token)match(input,QQUOT_START,FOLLOW_QQUOT_START_in_string104);  
                    stream_QQUOT_START.add(start);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:153:22: (content+= unquotedContent )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=CHAR && LA1_0<=BTICK)||LA1_0==ATSIGN) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:153:23: content+= unquotedContent
                    	    {
                    	    pushFollow(FOLLOW_unquotedContent_in_string109);
                    	    content=unquotedContent();

                    	    state._fsp--;

                    	    stream_unquotedContent.add(content.getTree());
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
                    // elements: start, end, content
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
                    // 153:64: -> ^( STRING $start ( $content)* $end)
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:153:67: ^( STRING $start ( $content)* $end)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, stream_start.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:153:83: ( $content)*
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
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:154:4: start= DOLQUOT (content+= unquotedContent )* dend= DOLQUOT
                    {
                    start=(Token)match(input,DOLQUOT,FOLLOW_DOLQUOT_in_string138);  
                    stream_DOLQUOT.add(start);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:154:22: (content+= unquotedContent )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=CHAR && LA2_0<=BTICK)||LA2_0==ATSIGN) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:154:23: content+= unquotedContent
                    	    {
                    	    pushFollow(FOLLOW_unquotedContent_in_string147);
                    	    content=unquotedContent();

                    	    state._fsp--;

                    	    stream_unquotedContent.add(content.getTree());
                    	    if (list_content==null) list_content=new ArrayList();
                    	    list_content.add(content.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    dend=(Token)match(input,DOLQUOT,FOLLOW_DOLQUOT_in_string153);  
                    stream_DOLQUOT.add(dend);



                    // AST REWRITE
                    // elements: dend, content, start
                    // token labels: start, dend
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: content
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_start=new RewriteRuleTokenStream(adaptor,"token start",start);
                    RewriteRuleTokenStream stream_dend=new RewriteRuleTokenStream(adaptor,"token dend",dend);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"token content",list_content);
                    root_0 = (CommonTree)adaptor.nil();
                    // 154:63: -> ^( STRING $start ( $content)* $dend)
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:154:66: ^( STRING $start ( $content)* $dend)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, stream_start.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:154:82: ( $content)*
                        while ( stream_content.hasNext() ) {
                            adaptor.addChild(root_1, stream_content.nextTree());

                        }
                        stream_content.reset();
                        adaptor.addChild(root_1, stream_dend.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
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
    // $ANTLR end "string"

    public static class unquotedContent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unquotedContent"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:157:1: unquotedContent : ( embeddedVariable | CHAR | VARNAME | SQUOT | DQUOT | BTICK );
    public final SQLScriptStringParser.unquotedContent_return unquotedContent() throws RecognitionException {
        SQLScriptStringParser.unquotedContent_return retval = new SQLScriptStringParser.unquotedContent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CHAR2=null;
        Token VARNAME3=null;
        Token SQUOT4=null;
        Token DQUOT5=null;
        Token BTICK6=null;
        SQLScriptStringParser.embeddedVariable_return embeddedVariable1 = null;


        CommonTree CHAR2_tree=null;
        CommonTree VARNAME3_tree=null;
        CommonTree SQUOT4_tree=null;
        CommonTree DQUOT5_tree=null;
        CommonTree BTICK6_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:158:2: ( embeddedVariable | CHAR | VARNAME | SQUOT | DQUOT | BTICK )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:158:4: embeddedVariable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_embeddedVariable_in_unquotedContent180);
                    embeddedVariable1=embeddedVariable();

                    state._fsp--;

                    adaptor.addChild(root_0, embeddedVariable1.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:159:4: CHAR
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CHAR2=(Token)match(input,CHAR,FOLLOW_CHAR_in_unquotedContent185); 
                    CHAR2_tree = (CommonTree)adaptor.create(CHAR2);
                    adaptor.addChild(root_0, CHAR2_tree);


                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:160:4: VARNAME
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VARNAME3=(Token)match(input,VARNAME,FOLLOW_VARNAME_in_unquotedContent190); 
                    VARNAME3_tree = (CommonTree)adaptor.create(VARNAME3);
                    adaptor.addChild(root_0, VARNAME3_tree);


                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:161:4: SQUOT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SQUOT4=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_unquotedContent195); 
                    SQUOT4_tree = (CommonTree)adaptor.create(SQUOT4);
                    adaptor.addChild(root_0, SQUOT4_tree);


                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:162:4: DQUOT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DQUOT5=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_unquotedContent200); 
                    DQUOT5_tree = (CommonTree)adaptor.create(DQUOT5);
                    adaptor.addChild(root_0, DQUOT5_tree);


                    }
                    break;
                case 6 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:163:4: BTICK
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BTICK6=(Token)match(input,BTICK,FOLLOW_BTICK_in_unquotedContent205); 
                    BTICK6_tree = (CommonTree)adaptor.create(BTICK6);
                    adaptor.addChild(root_0, BTICK6_tree);


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
    // $ANTLR end "unquotedContent"

    public static class qQuoteEnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qQuoteEnd"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:166:1: qQuoteEnd : QQUOT_END ;
    public final SQLScriptStringParser.qQuoteEnd_return qQuoteEnd() throws RecognitionException {
        SQLScriptStringParser.qQuoteEnd_return retval = new SQLScriptStringParser.qQuoteEnd_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QQUOT_END7=null;

        CommonTree QQUOT_END7_tree=null;

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:167:2: ( QQUOT_END )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:167:4: QQUOT_END
            {
            root_0 = (CommonTree)adaptor.nil();

            QQUOT_END7=(Token)match(input,QQUOT_END,FOLLOW_QQUOT_END_in_qQuoteEnd216); 
            QQUOT_END7_tree = (CommonTree)adaptor.create(QQUOT_END7);
            adaptor.addChild(root_0, QQUOT_END7_tree);


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

    public static class embeddedVariable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "embeddedVariable"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:170:1: embeddedVariable : a1= ATSIGN (lc= LCURLY ( RCURLY -> $a1 | var= VARNAME RCURLY -> EMBEDDED_VARIABLE[$var] | -> $a1 $lc) | -> $a1) ;
    public final SQLScriptStringParser.embeddedVariable_return embeddedVariable() throws RecognitionException {
        SQLScriptStringParser.embeddedVariable_return retval = new SQLScriptStringParser.embeddedVariable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token a1=null;
        Token lc=null;
        Token var=null;
        Token RCURLY8=null;
        Token RCURLY9=null;

        CommonTree a1_tree=null;
        CommonTree lc_tree=null;
        CommonTree var_tree=null;
        CommonTree RCURLY8_tree=null;
        CommonTree RCURLY9_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_ATSIGN=new RewriteRuleTokenStream(adaptor,"token ATSIGN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleTokenStream stream_VARNAME=new RewriteRuleTokenStream(adaptor,"token VARNAME");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:171:2: (a1= ATSIGN (lc= LCURLY ( RCURLY -> $a1 | var= VARNAME RCURLY -> EMBEDDED_VARIABLE[$var] | -> $a1 $lc) | -> $a1) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:171:4: a1= ATSIGN (lc= LCURLY ( RCURLY -> $a1 | var= VARNAME RCURLY -> EMBEDDED_VARIABLE[$var] | -> $a1 $lc) | -> $a1)
            {
            a1=(Token)match(input,ATSIGN,FOLLOW_ATSIGN_in_embeddedVariable229);  
            stream_ATSIGN.add(a1);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:172:3: (lc= LCURLY ( RCURLY -> $a1 | var= VARNAME RCURLY -> EMBEDDED_VARIABLE[$var] | -> $a1 $lc) | -> $a1)
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==LCURLY) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=DOLQUOT && LA6_0<=ATSIGN)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:172:5: lc= LCURLY ( RCURLY -> $a1 | var= VARNAME RCURLY -> EMBEDDED_VARIABLE[$var] | -> $a1 $lc)
                    {
                    lc=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_embeddedVariable237);  
                    stream_LCURLY.add(lc);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:173:5: ( RCURLY -> $a1 | var= VARNAME RCURLY -> EMBEDDED_VARIABLE[$var] | -> $a1 $lc)
                    int alt5=3;
                    switch ( input.LA(1) ) {
                    case RCURLY:
                        {
                        alt5=1;
                        }
                        break;
                    case VARNAME:
                        {
                        int LA5_2 = input.LA(2);

                        if ( (LA5_2==RCURLY) ) {
                            alt5=2;
                        }
                        else if ( ((LA5_2>=DOLQUOT && LA5_2<=ATSIGN)) ) {
                            alt5=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DOLQUOT:
                    case CHAR:
                    case SQUOT:
                    case DQUOT:
                    case BTICK:
                    case QQUOT_END:
                    case ATSIGN:
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:173:7: RCURLY
                            {
                            RCURLY8=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_embeddedVariable245);  
                            stream_RCURLY.add(RCURLY8);



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
                            // 173:15: -> $a1
                            {
                                adaptor.addChild(root_0, stream_a1.nextNode());

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:174:7: var= VARNAME RCURLY
                            {
                            var=(Token)match(input,VARNAME,FOLLOW_VARNAME_in_embeddedVariable261);  
                            stream_VARNAME.add(var);

                            RCURLY9=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_embeddedVariable263);  
                            stream_RCURLY.add(RCURLY9);



                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 174:26: -> EMBEDDED_VARIABLE[$var]
                            {
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(EMBEDDED_VARIABLE, var));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:175:9: 
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
                            // 175:9: -> $a1 $lc
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:177:7: 
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
                    // 177:7: -> $a1
                    {
                        adaptor.addChild(root_0, stream_a1.nextNode());

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
    // $ANTLR end "embeddedVariable"

    public static class chars_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "chars"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:181:1: chars : (c= CHAR )+ ->;
    public final SQLScriptStringParser.chars_return chars() throws RecognitionException {
        SQLScriptStringParser.chars_return retval = new SQLScriptStringParser.chars_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token c=null;

        CommonTree c_tree=null;
        RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");

         StringBuilder chars = new StringBuilder(); 
        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:184:2: ( (c= CHAR )+ ->)
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:184:4: (c= CHAR )+
            {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:184:4: (c= CHAR )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==CHAR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:184:5: c= CHAR
            	    {
            	    c=(Token)match(input,CHAR,FOLLOW_CHAR_in_chars329);  
            	    stream_CHAR.add(c);

            	     chars.append((c!=null?c.getText():null).charAt(0)); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // 185:3: ->
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


 

    public static final BitSet FOLLOW_QQUOT_START_in_string104 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_unquotedContent_in_string109 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_qQuoteEnd_in_string115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLQUOT_in_string138 = new BitSet(new long[]{0x000000000002FC00L});
    public static final BitSet FOLLOW_unquotedContent_in_string147 = new BitSet(new long[]{0x000000000002FC00L});
    public static final BitSet FOLLOW_DOLQUOT_in_string153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVariable_in_unquotedContent180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_unquotedContent185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARNAME_in_unquotedContent190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_unquotedContent195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_unquotedContent200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_unquotedContent205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QQUOT_END_in_qQuoteEnd216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSIGN_in_embeddedVariable229 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_LCURLY_in_embeddedVariable237 = new BitSet(new long[]{0x0000000000081002L});
    public static final BitSet FOLLOW_RCURLY_in_embeddedVariable245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARNAME_in_embeddedVariable261 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RCURLY_in_embeddedVariable263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_chars329 = new BitSet(new long[]{0x0000000000000802L});

}