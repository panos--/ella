// $ANTLR 3.1.1 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g 2009-02-11 00:59:45

	package org.unbunt.sqlscript;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SQLScriptStringParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "SQUOT", "STRING_CONTENT", "EMBEDDED_VARIABLE", "DQUOT", "BTICK", "SSTRING_CONTENT", "DSTRING_CONTENT", "BTSTRING_CONTENT", "ATSIGN", "VARNAME", "WORD_CHAR"
    };
    public static final int BTSTRING_CONTENT=13;
    public static final int EMBEDDED_VARIABLE=8;
    public static final int SQUOT=6;
    public static final int WORD_CHAR=16;
    public static final int DQUOT=9;
    public static final int STRING_CONTENT=7;
    public static final int DSTRING_CONTENT=12;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int ATSIGN=14;
    public static final int SSTRING_CONTENT=11;
    public static final int BTICK=10;
    public static final int EOF=-1;
    public static final int STRING=4;
    public static final int VARNAME=15;

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:77:1: string : (start= SQUOT (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )* end= SQUOT -> ^( STRING $start ( $content)* $end) | start= DQUOT (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )* end= DQUOT -> ^( STRING $start ( $content)* $end) | start= BTICK (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )* end= BTICK -> ^( STRING $start ( $content)* $end) );
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
        RewriteRuleTokenStream stream_BTICK=new RewriteRuleTokenStream(adaptor,"token BTICK");
        RewriteRuleTokenStream stream_DQUOT=new RewriteRuleTokenStream(adaptor,"token DQUOT");
        RewriteRuleTokenStream stream_STRING_CONTENT=new RewriteRuleTokenStream(adaptor,"token STRING_CONTENT");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:77:8: (start= SQUOT (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )* end= SQUOT -> ^( STRING $start ( $content)* $end) | start= DQUOT (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )* end= DQUOT -> ^( STRING $start ( $content)* $end) | start= BTICK (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )* end= BTICK -> ^( STRING $start ( $content)* $end) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case SQUOT:
                {
                alt4=1;
                }
                break;
            case DQUOT:
                {
                alt4=2;
                }
                break;
            case BTICK:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:77:10: start= SQUOT (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )* end= SQUOT
                    {
                    start=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_string78);  
                    stream_SQUOT.add(start);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:77:22: (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )*
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
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:77:23: content+= STRING_CONTENT
                    	    {
                    	    content=(Token)match(input,STRING_CONTENT,FOLLOW_STRING_CONTENT_in_string83);  
                    	    stream_STRING_CONTENT.add(content);

                    	    if (list_content==null) list_content=new ArrayList();
                    	    list_content.add(content);


                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:77:49: content+= EMBEDDED_VARIABLE
                    	    {
                    	    content=(Token)match(input,EMBEDDED_VARIABLE,FOLLOW_EMBEDDED_VARIABLE_in_string89);  
                    	    stream_EMBEDDED_VARIABLE.add(content);

                    	    if (list_content==null) list_content=new ArrayList();
                    	    list_content.add(content);


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    end=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_string95);  
                    stream_SQUOT.add(end);



                    // AST REWRITE
                    // elements: content, start, end
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
                    // 77:88: -> ^( STRING $start ( $content)* $end)
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:77:91: ^( STRING $start ( $content)* $end)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, stream_start.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:77:107: ( $content)*
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:78:4: start= DQUOT (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )* end= DQUOT
                    {
                    start=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_string118);  
                    stream_DQUOT.add(start);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:78:16: (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )*
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
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:78:17: content+= STRING_CONTENT
                    	    {
                    	    content=(Token)match(input,STRING_CONTENT,FOLLOW_STRING_CONTENT_in_string123);  
                    	    stream_STRING_CONTENT.add(content);

                    	    if (list_content==null) list_content=new ArrayList();
                    	    list_content.add(content);


                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:78:43: content+= EMBEDDED_VARIABLE
                    	    {
                    	    content=(Token)match(input,EMBEDDED_VARIABLE,FOLLOW_EMBEDDED_VARIABLE_in_string129);  
                    	    stream_EMBEDDED_VARIABLE.add(content);

                    	    if (list_content==null) list_content=new ArrayList();
                    	    list_content.add(content);


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    end=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_string135);  
                    stream_DQUOT.add(end);



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
                    // 78:82: -> ^( STRING $start ( $content)* $end)
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:78:85: ^( STRING $start ( $content)* $end)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, stream_start.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:78:101: ( $content)*
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:79:4: start= BTICK (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )* end= BTICK
                    {
                    start=(Token)match(input,BTICK,FOLLOW_BTICK_in_string158);  
                    stream_BTICK.add(start);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:79:16: (content+= STRING_CONTENT | content+= EMBEDDED_VARIABLE )*
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
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:79:17: content+= STRING_CONTENT
                    	    {
                    	    content=(Token)match(input,STRING_CONTENT,FOLLOW_STRING_CONTENT_in_string163);  
                    	    stream_STRING_CONTENT.add(content);

                    	    if (list_content==null) list_content=new ArrayList();
                    	    list_content.add(content);


                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:79:43: content+= EMBEDDED_VARIABLE
                    	    {
                    	    content=(Token)match(input,EMBEDDED_VARIABLE,FOLLOW_EMBEDDED_VARIABLE_in_string169);  
                    	    stream_EMBEDDED_VARIABLE.add(content);

                    	    if (list_content==null) list_content=new ArrayList();
                    	    list_content.add(content);


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    end=(Token)match(input,BTICK,FOLLOW_BTICK_in_string175);  
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
                    // 79:82: -> ^( STRING $start ( $content)* $end)
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:79:85: ^( STRING $start ( $content)* $end)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, stream_start.nextNode());
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:79:101: ( $content)*
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


 

    public static final BitSet FOLLOW_SQUOT_in_string78 = new BitSet(new long[]{0x00000000000001C0L});
    public static final BitSet FOLLOW_STRING_CONTENT_in_string83 = new BitSet(new long[]{0x00000000000001C0L});
    public static final BitSet FOLLOW_EMBEDDED_VARIABLE_in_string89 = new BitSet(new long[]{0x00000000000001C0L});
    public static final BitSet FOLLOW_SQUOT_in_string95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_string118 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_STRING_CONTENT_in_string123 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_EMBEDDED_VARIABLE_in_string129 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_DQUOT_in_string135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_string158 = new BitSet(new long[]{0x0000000000000580L});
    public static final BitSet FOLLOW_STRING_CONTENT_in_string163 = new BitSet(new long[]{0x0000000000000580L});
    public static final BitSet FOLLOW_EMBEDDED_VARIABLE_in_string169 = new BitSet(new long[]{0x0000000000000580L});
    public static final BitSet FOLLOW_BTICK_in_string175 = new BitSet(new long[]{0x0000000000000002L});

}