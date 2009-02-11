// $ANTLR 3.1.1 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g 2009-02-11 15:58:43

	package org.unbunt.sqlscript;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SQLScriptStringParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "QQUOT", "SQUOT", "STRING_CONTENT", "EMBEDDED_VARIABLE", "DQUOT", "BTICK", "QQUOT_START", "QQUOT_END", "SQUOT_FRAG", "QQUOT_DELIM", "SSTRING_CONTENT", "DSTRING_CONTENT", "BTSTRING_CONTENT", "QSTRING_CONTENT", "ATSIGN", "VARNAME", "WORD_CHAR"
    };
    public static final int BTSTRING_CONTENT=18;
    public static final int WORD_CHAR=22;
    public static final int QSTRING_CONTENT=19;
    public static final int DQUOT=10;
    public static final int STRING_CONTENT=8;
    public static final int QQUOT_START=12;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int DSTRING_CONTENT=17;
    public static final int EOF=-1;
    public static final int SSTRING_CONTENT=16;
    public static final int VARNAME=21;
    public static final int QQUOT=6;
    public static final int EMBEDDED_VARIABLE=9;
    public static final int SQUOT=7;
    public static final int QQUOT_DELIM=15;
    public static final int ATSIGN=20;
    public static final int QQUOT_END=13;
    public static final int SQUOT_FRAG=14;
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


    public static class string_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string"
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:117:1: string : (start= SQUOT (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )* end= SQUOT -> ^( STRING $start ( $content)* $end) | start= DQUOT (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )* end= DQUOT -> ^( STRING $start ( $content)* $end) | start= BTICK (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )* end= BTICK -> ^( STRING $start ( $content)* $end) | start= QQUOT_START (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )* end= QQUOT_END -> ^( STRING $start ( $content)* $end) );
    public final SQLScriptStringParser.string_return string() throws RecognitionException {
        SQLScriptStringParser.string_return retval = new SQLScriptStringParser.string_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token start=null;
        Token end=null;
        Token content=null;
        List list_content=null;

        CommonTree start_tree=null;
        CommonTree end_tree=null;
        CommonTree content_tree=null;
        RewriteRuleTokenStream stream_EMBEDDED_VARIABLE=new RewriteRuleTokenStream(adaptor,"token EMBEDDED_VARIABLE");
        RewriteRuleTokenStream stream_SQUOT=new RewriteRuleTokenStream(adaptor,"token SQUOT");
        RewriteRuleTokenStream stream_QQUOT_END=new RewriteRuleTokenStream(adaptor,"token QQUOT_END");
        RewriteRuleTokenStream stream_BTICK=new RewriteRuleTokenStream(adaptor,"token BTICK");
        RewriteRuleTokenStream stream_DQUOT=new RewriteRuleTokenStream(adaptor,"token DQUOT");
        RewriteRuleTokenStream stream_STRING_CONTENT=new RewriteRuleTokenStream(adaptor,"token STRING_CONTENT");
        RewriteRuleTokenStream stream_QQUOT_START=new RewriteRuleTokenStream(adaptor,"token QQUOT_START");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:117:8: (start= SQUOT (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )* end= SQUOT -> ^( STRING $start ( $content)* $end) | start= DQUOT (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )* end= DQUOT -> ^( STRING $start ( $content)* $end) | start= BTICK (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )* end= BTICK -> ^( STRING $start ( $content)* $end) | start= QQUOT_START (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )* end= QQUOT_END -> ^( STRING $start ( $content)* $end) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case SQUOT:
                {
                alt5=1;
                }
                break;
            case DQUOT:
                {
                alt5=2;
                }
                break;
            case BTICK:
                {
                alt5=3;
                }
                break;
            case QQUOT_START:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:117:10: start= SQUOT (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )* end= SQUOT
                    {
                    start=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_string82);  
                    stream_SQUOT.add(start);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:117:28: (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )*
                    loop1:
                    do {
                        int alt1=3;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==STRING_CONTENT) ) {
                            alt1=1;
                        }
                        else if ( (LA1_0==EMBEDDED_VARIABLE) ) {
                            alt1=2;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:117:29: content+= STRING_CONTENT
                    	    {
                    	    content=(Token)match(input,STRING_CONTENT,FOLLOW_STRING_CONTENT_in_string93);  
                    	    stream_STRING_CONTENT.add(content);

                    	    if (list_content==null) list_content=new ArrayList();
                    	    list_content.add(content);


                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:117:55: content+= EMBEDDED_VARIABLE
                    	    {
                    	    content=(Token)match(input,EMBEDDED_VARIABLE,FOLLOW_EMBEDDED_VARIABLE_in_string99);  
                    	    stream_EMBEDDED_VARIABLE.add(content);

                    	    if (list_content==null) list_content=new ArrayList();
                    	    list_content.add(content);


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    end=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_string105);  
                    stream_SQUOT.add(end);



                    // AST REWRITE
                    // elements: start, end, content
                    // token labels: start, end
                    // rule labels: retval
                    // token list labels: content
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_start=new RewriteRuleTokenStream(adaptor,"token start",start);
                    RewriteRuleTokenStream stream_end=new RewriteRuleTokenStream(adaptor,"token end",end);
                    RewriteRuleTokenStream stream_content=new RewriteRuleTokenStream(adaptor,"token content", list_content);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 117:98: -> ^( STRING $start ( $content)* $end)
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:117:101: ^( STRING $start ( $content)* $end)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, stream_start.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:117:117: ( $content)*
                        while ( stream_content.hasNext() ) {
                            adaptor.addChild(root_1, stream_content.nextNode());

                        }
                        stream_content.reset();
                        adaptor.addChild(root_1, stream_end.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:118:4: start= DQUOT (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )* end= DQUOT
                    {
                    start=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_string132);  
                    stream_DQUOT.add(start);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:118:22: (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==STRING_CONTENT) ) {
                            alt2=1;
                        }
                        else if ( (LA2_0==EMBEDDED_VARIABLE) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:118:23: content+= STRING_CONTENT
                    	    {
                    	    content=(Token)match(input,STRING_CONTENT,FOLLOW_STRING_CONTENT_in_string143);  
                    	    stream_STRING_CONTENT.add(content);

                    	    if (list_content==null) list_content=new ArrayList();
                    	    list_content.add(content);


                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:118:49: content+= EMBEDDED_VARIABLE
                    	    {
                    	    content=(Token)match(input,EMBEDDED_VARIABLE,FOLLOW_EMBEDDED_VARIABLE_in_string149);  
                    	    stream_EMBEDDED_VARIABLE.add(content);

                    	    if (list_content==null) list_content=new ArrayList();
                    	    list_content.add(content);


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    end=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_string155);  
                    stream_DQUOT.add(end);



                    // AST REWRITE
                    // elements: start, end, content
                    // token labels: start, end
                    // rule labels: retval
                    // token list labels: content
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_start=new RewriteRuleTokenStream(adaptor,"token start",start);
                    RewriteRuleTokenStream stream_end=new RewriteRuleTokenStream(adaptor,"token end",end);
                    RewriteRuleTokenStream stream_content=new RewriteRuleTokenStream(adaptor,"token content", list_content);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 118:92: -> ^( STRING $start ( $content)* $end)
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:118:95: ^( STRING $start ( $content)* $end)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, stream_start.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:118:111: ( $content)*
                        while ( stream_content.hasNext() ) {
                            adaptor.addChild(root_1, stream_content.nextNode());

                        }
                        stream_content.reset();
                        adaptor.addChild(root_1, stream_end.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:119:4: start= BTICK (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )* end= BTICK
                    {
                    start=(Token)match(input,BTICK,FOLLOW_BTICK_in_string182);  
                    stream_BTICK.add(start);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:119:22: (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==STRING_CONTENT) ) {
                            alt3=1;
                        }
                        else if ( (LA3_0==EMBEDDED_VARIABLE) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:119:23: content+= STRING_CONTENT
                    	    {
                    	    content=(Token)match(input,STRING_CONTENT,FOLLOW_STRING_CONTENT_in_string193);  
                    	    stream_STRING_CONTENT.add(content);

                    	    if (list_content==null) list_content=new ArrayList();
                    	    list_content.add(content);


                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:119:49: content+= EMBEDDED_VARIABLE
                    	    {
                    	    content=(Token)match(input,EMBEDDED_VARIABLE,FOLLOW_EMBEDDED_VARIABLE_in_string199);  
                    	    stream_EMBEDDED_VARIABLE.add(content);

                    	    if (list_content==null) list_content=new ArrayList();
                    	    list_content.add(content);


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    end=(Token)match(input,BTICK,FOLLOW_BTICK_in_string205);  
                    stream_BTICK.add(end);



                    // AST REWRITE
                    // elements: content, end, start
                    // token labels: start, end
                    // rule labels: retval
                    // token list labels: content
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_start=new RewriteRuleTokenStream(adaptor,"token start",start);
                    RewriteRuleTokenStream stream_end=new RewriteRuleTokenStream(adaptor,"token end",end);
                    RewriteRuleTokenStream stream_content=new RewriteRuleTokenStream(adaptor,"token content", list_content);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 119:92: -> ^( STRING $start ( $content)* $end)
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:119:95: ^( STRING $start ( $content)* $end)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, stream_start.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:119:111: ( $content)*
                        while ( stream_content.hasNext() ) {
                            adaptor.addChild(root_1, stream_content.nextNode());

                        }
                        stream_content.reset();
                        adaptor.addChild(root_1, stream_end.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:120:4: start= QQUOT_START (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )* end= QQUOT_END
                    {
                    start=(Token)match(input,QQUOT_START,FOLLOW_QQUOT_START_in_string232);  
                    stream_QQUOT_START.add(start);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:120:22: (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==STRING_CONTENT) ) {
                            alt4=1;
                        }
                        else if ( (LA4_0==EMBEDDED_VARIABLE) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:120:23: content+= STRING_CONTENT
                    	    {
                    	    content=(Token)match(input,STRING_CONTENT,FOLLOW_STRING_CONTENT_in_string237);  
                    	    stream_STRING_CONTENT.add(content);

                    	    if (list_content==null) list_content=new ArrayList();
                    	    list_content.add(content);


                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:120:49: content+= EMBEDDED_VARIABLE
                    	    {
                    	    content=(Token)match(input,EMBEDDED_VARIABLE,FOLLOW_EMBEDDED_VARIABLE_in_string243);  
                    	    stream_EMBEDDED_VARIABLE.add(content);

                    	    if (list_content==null) list_content=new ArrayList();
                    	    list_content.add(content);


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    end=(Token)match(input,QQUOT_END,FOLLOW_QQUOT_END_in_string249);  
                    stream_QQUOT_END.add(end);



                    // AST REWRITE
                    // elements: end, content, start
                    // token labels: start, end
                    // rule labels: retval
                    // token list labels: content
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_start=new RewriteRuleTokenStream(adaptor,"token start",start);
                    RewriteRuleTokenStream stream_end=new RewriteRuleTokenStream(adaptor,"token end",end);
                    RewriteRuleTokenStream stream_content=new RewriteRuleTokenStream(adaptor,"token content", list_content);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 120:92: -> ^( STRING $start ( $content)* $end)
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:120:95: ^( STRING $start ( $content)* $end)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, stream_start.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:120:111: ( $content)*
                        while ( stream_content.hasNext() ) {
                            adaptor.addChild(root_1, stream_content.nextNode());

                        }
                        stream_content.reset();
                        adaptor.addChild(root_1, stream_end.nextNode());

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

    // Delegated rules


 

    public static final BitSet FOLLOW_SQUOT_in_string82 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_STRING_CONTENT_in_string93 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_EMBEDDED_VARIABLE_in_string99 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_SQUOT_in_string105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_string132 = new BitSet(new long[]{0x0000000000000700L});
    public static final BitSet FOLLOW_STRING_CONTENT_in_string143 = new BitSet(new long[]{0x0000000000000700L});
    public static final BitSet FOLLOW_EMBEDDED_VARIABLE_in_string149 = new BitSet(new long[]{0x0000000000000700L});
    public static final BitSet FOLLOW_DQUOT_in_string155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_string182 = new BitSet(new long[]{0x0000000000000B00L});
    public static final BitSet FOLLOW_STRING_CONTENT_in_string193 = new BitSet(new long[]{0x0000000000000B00L});
    public static final BitSet FOLLOW_EMBEDDED_VARIABLE_in_string199 = new BitSet(new long[]{0x0000000000000B00L});
    public static final BitSet FOLLOW_BTICK_in_string205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QQUOT_START_in_string232 = new BitSet(new long[]{0x0000000000002300L});
    public static final BitSet FOLLOW_STRING_CONTENT_in_string237 = new BitSet(new long[]{0x0000000000002300L});
    public static final BitSet FOLLOW_EMBEDDED_VARIABLE_in_string243 = new BitSet(new long[]{0x0000000000002300L});
    public static final BitSet FOLLOW_QQUOT_END_in_string249 = new BitSet(new long[]{0x0000000000000002L});

}