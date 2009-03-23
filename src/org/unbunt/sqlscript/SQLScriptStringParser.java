// $ANTLR 3.1.1 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g 2009-03-20 15:58:36

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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:186:1: string : (start= SQUOT (content+= singleQuoteContent )* endt= SQUOT -> ^( STRING STRING_START[$start] ( $content)* STRING_END[$endt] ) | start= DQUOT (content+= doubleQuoteContent )* endt= DQUOT -> ^( STRING STRING_START[$start] ( $content)* STRING_END[$endt] ) | start= BTICK (content+= backTickContent )* endt= BTICK -> ^( STRING STRING_START[$start] ( $content)* STRING_END[$endt] ) | start= QQUOT_START (content+= unquotedContent )* end= qQuoteEnd -> ^( STRING STRING_START[$start] ( $content)* STRING_END[$end.token] ) | start= DOLQUOT (content+= unquotedContent )* endt= DOLQUOT -> ^( STRING STRING_START[$start] ( $content)* STRING_END[$endt] ) );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:186:8: (start= SQUOT (content+= singleQuoteContent )* endt= SQUOT -> ^( STRING STRING_START[$start] ( $content)* STRING_END[$endt] ) | start= DQUOT (content+= doubleQuoteContent )* endt= DQUOT -> ^( STRING STRING_START[$start] ( $content)* STRING_END[$endt] ) | start= BTICK (content+= backTickContent )* endt= BTICK -> ^( STRING STRING_START[$start] ( $content)* STRING_END[$endt] ) | start= QQUOT_START (content+= unquotedContent )* end= qQuoteEnd -> ^( STRING STRING_START[$start] ( $content)* STRING_END[$end.token] ) | start= DOLQUOT (content+= unquotedContent )* endt= DOLQUOT -> ^( STRING STRING_START[$start] ( $content)* STRING_END[$endt] ) )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:186:10: start= SQUOT (content+= singleQuoteContent )* endt= SQUOT
                    {
                    start=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_string117); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUOT.add(start);

                    if ( state.backtracking==0 ) {
                       stringType = SQUOT; 
                    }
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:186:54: (content+= singleQuoteContent )*
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
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:186:55: content+= singleQuoteContent
                    	    {
                    	    pushFollow(FOLLOW_singleQuoteContent_in_string132);
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

                    endt=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_string138); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUOT.add(endt);



                    // AST REWRITE
                    // elements: content
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: content
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"token content",list_content);
                    root_0 = (CommonTree)adaptor.nil();
                    // 186:97: -> ^( STRING STRING_START[$start] ( $content)* STRING_END[$endt] )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:186:100: ^( STRING STRING_START[$start] ( $content)* STRING_END[$endt] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_START, start));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:186:130: ( $content)*
                        while ( stream_content.hasNext() ) {
                            adaptor.addChild(root_1, stream_content.nextTree());

                        }
                        stream_content.reset();
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_END, endt));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:187:4: start= DQUOT (content+= doubleQuoteContent )* endt= DQUOT
                    {
                    start=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_string162); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DQUOT.add(start);

                    if ( state.backtracking==0 ) {
                       stringType = DQUOT; 
                    }
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:187:48: (content+= doubleQuoteContent )*
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
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:187:49: content+= doubleQuoteContent
                    	    {
                    	    pushFollow(FOLLOW_doubleQuoteContent_in_string177);
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

                    endt=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_string183); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DQUOT.add(endt);



                    // AST REWRITE
                    // elements: content
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: content
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"token content",list_content);
                    root_0 = (CommonTree)adaptor.nil();
                    // 187:91: -> ^( STRING STRING_START[$start] ( $content)* STRING_END[$endt] )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:187:94: ^( STRING STRING_START[$start] ( $content)* STRING_END[$endt] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_START, start));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:187:124: ( $content)*
                        while ( stream_content.hasNext() ) {
                            adaptor.addChild(root_1, stream_content.nextTree());

                        }
                        stream_content.reset();
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_END, endt));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:188:4: start= BTICK (content+= backTickContent )* endt= BTICK
                    {
                    start=(Token)match(input,BTICK,FOLLOW_BTICK_in_string207); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BTICK.add(start);

                    if ( state.backtracking==0 ) {
                       stringType = BTICK; 
                    }
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:188:48: (content+= backTickContent )*
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
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:188:49: content+= backTickContent
                    	    {
                    	    pushFollow(FOLLOW_backTickContent_in_string222);
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

                    endt=(Token)match(input,BTICK,FOLLOW_BTICK_in_string231); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BTICK.add(endt);



                    // AST REWRITE
                    // elements: content
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: content
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"token content",list_content);
                    root_0 = (CommonTree)adaptor.nil();
                    // 188:91: -> ^( STRING STRING_START[$start] ( $content)* STRING_END[$endt] )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:188:94: ^( STRING STRING_START[$start] ( $content)* STRING_END[$endt] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_START, start));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:188:124: ( $content)*
                        while ( stream_content.hasNext() ) {
                            adaptor.addChild(root_1, stream_content.nextTree());

                        }
                        stream_content.reset();
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_END, endt));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:189:4: start= QQUOT_START (content+= unquotedContent )* end= qQuoteEnd
                    {
                    start=(Token)match(input,QQUOT_START,FOLLOW_QQUOT_START_in_string255); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QQUOT_START.add(start);

                    if ( state.backtracking==0 ) {
                       stringType = QQUOT; 
                    }
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:189:48: (content+= unquotedContent )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=SQUOT && LA4_0<=BTICK)||(LA4_0>=CHAR && LA4_0<=VARNAME)||LA4_0==ATSIGN) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:189:49: content+= unquotedContent
                    	    {
                    	    pushFollow(FOLLOW_unquotedContent_in_string264);
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

                    pushFollow(FOLLOW_qQuoteEnd_in_string273);
                    end=qQuoteEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qQuoteEnd.add(end.getTree());


                    // AST REWRITE
                    // elements: content
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: content
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"token content",list_content);
                    root_0 = (CommonTree)adaptor.nil();
                    // 189:93: -> ^( STRING STRING_START[$start] ( $content)* STRING_END[$end.token] )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:189:96: ^( STRING STRING_START[$start] ( $content)* STRING_END[$end.token] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_START, start));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:189:126: ( $content)*
                        while ( stream_content.hasNext() ) {
                            adaptor.addChild(root_1, stream_content.nextTree());

                        }
                        stream_content.reset();
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_END, (end!=null?end.token:null)));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:190:4: start= DOLQUOT (content+= unquotedContent )* endt= DOLQUOT
                    {
                    start=(Token)match(input,DOLQUOT,FOLLOW_DOLQUOT_in_string296); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOLQUOT.add(start);

                    if ( state.backtracking==0 ) {
                       stringType = DOLQUOT; 
                    }
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:190:48: (content+= unquotedContent )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=SQUOT && LA5_0<=BTICK)||(LA5_0>=CHAR && LA5_0<=VARNAME)||LA5_0==ATSIGN) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:190:49: content+= unquotedContent
                    	    {
                    	    pushFollow(FOLLOW_unquotedContent_in_string307);
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

                    endt=(Token)match(input,DOLQUOT,FOLLOW_DOLQUOT_in_string316); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOLQUOT.add(endt);



                    // AST REWRITE
                    // elements: content
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: content
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"token content",list_content);
                    root_0 = (CommonTree)adaptor.nil();
                    // 190:93: -> ^( STRING STRING_START[$start] ( $content)* STRING_END[$endt] )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:190:96: ^( STRING STRING_START[$start] ( $content)* STRING_END[$endt] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_START, start));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:190:126: ( $content)*
                        while ( stream_content.hasNext() ) {
                            adaptor.addChild(root_1, stream_content.nextTree());

                        }
                        stream_content.reset();
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:193:1: singleQuoteContent : ( ( SQUOT SQUOT )=>q= SQUOT SQUOT -> STRING_CONTENT[$q] | genericContent | q= DQUOT -> STRING_CONTENT[$q] | q= BTICK -> STRING_CONTENT[$q] );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:194:2: ( ( SQUOT SQUOT )=>q= SQUOT SQUOT -> STRING_CONTENT[$q] | genericContent | q= DQUOT -> STRING_CONTENT[$q] | q= BTICK -> STRING_CONTENT[$q] )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:194:4: ( SQUOT SQUOT )=>q= SQUOT SQUOT
                    {
                    q=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_singleQuoteContent353); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUOT.add(q);

                    SQUOT1=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_singleQuoteContent355); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUOT.add(SQUOT1);



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
                    // 194:34: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:195:4: genericContent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_genericContent_in_singleQuoteContent365);
                    genericContent2=genericContent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericContent2.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:196:4: q= DQUOT
                    {
                    q=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_singleQuoteContent372); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DQUOT.add(q);



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
                    // 196:15: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:197:4: q= BTICK
                    {
                    q=(Token)match(input,BTICK,FOLLOW_BTICK_in_singleQuoteContent387); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BTICK.add(q);



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
                    // 197:15: -> STRING_CONTENT[$q]
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:200:1: doubleQuoteContent : ( ( DQUOT DQUOT )=>q= DQUOT DQUOT -> STRING_CONTENT[$q] | genericContent | q= SQUOT -> STRING_CONTENT[$q] | q= BTICK -> STRING_CONTENT[$q] );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:201:2: ( ( DQUOT DQUOT )=>q= DQUOT DQUOT -> STRING_CONTENT[$q] | genericContent | q= SQUOT -> STRING_CONTENT[$q] | q= BTICK -> STRING_CONTENT[$q] )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:201:4: ( DQUOT DQUOT )=>q= DQUOT DQUOT
                    {
                    q=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_doubleQuoteContent415); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DQUOT.add(q);

                    DQUOT3=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_doubleQuoteContent417); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DQUOT.add(DQUOT3);



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
                    // 201:34: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:202:4: genericContent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_genericContent_in_doubleQuoteContent427);
                    genericContent4=genericContent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericContent4.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:203:4: q= SQUOT
                    {
                    q=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_doubleQuoteContent434); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUOT.add(q);



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
                    // 203:15: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:204:4: q= BTICK
                    {
                    q=(Token)match(input,BTICK,FOLLOW_BTICK_in_doubleQuoteContent449); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BTICK.add(q);



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
                    // 204:15: -> STRING_CONTENT[$q]
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:207:1: backTickContent : ( ( BTICK BTICK )=>q= BTICK BTICK -> STRING_CONTENT[$q] | genericContent | q= SQUOT -> STRING_CONTENT[$q] | q= DQUOT -> STRING_CONTENT[$q] );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:208:2: ( ( BTICK BTICK )=>q= BTICK BTICK -> STRING_CONTENT[$q] | genericContent | q= SQUOT -> STRING_CONTENT[$q] | q= DQUOT -> STRING_CONTENT[$q] )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:208:4: ( BTICK BTICK )=>q= BTICK BTICK
                    {
                    q=(Token)match(input,BTICK,FOLLOW_BTICK_in_backTickContent477); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BTICK.add(q);

                    BTICK5=(Token)match(input,BTICK,FOLLOW_BTICK_in_backTickContent479); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BTICK.add(BTICK5);



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
                    // 208:34: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:209:4: genericContent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_genericContent_in_backTickContent489);
                    genericContent6=genericContent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericContent6.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:210:4: q= SQUOT
                    {
                    q=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_backTickContent496); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUOT.add(q);



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
                    // 210:15: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:211:4: q= DQUOT
                    {
                    q=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_backTickContent511); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DQUOT.add(q);



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
                    // 211:15: -> STRING_CONTENT[$q]
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:214:1: unquotedContent : ( genericContent | q= SQUOT -> STRING_CONTENT[$q] | q= DQUOT -> STRING_CONTENT[$q] | q= BTICK -> STRING_CONTENT[$q] );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:215:2: ( genericContent | q= SQUOT -> STRING_CONTENT[$q] | q= DQUOT -> STRING_CONTENT[$q] | q= BTICK -> STRING_CONTENT[$q] )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:215:4: genericContent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_genericContent_in_unquotedContent530);
                    genericContent7=genericContent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericContent7.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:216:4: q= SQUOT
                    {
                    q=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_unquotedContent537); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUOT.add(q);



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
                    // 216:15: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:217:4: q= DQUOT
                    {
                    q=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_unquotedContent552); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DQUOT.add(q);



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
                    // 217:15: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:218:4: q= BTICK
                    {
                    q=(Token)match(input,BTICK,FOLLOW_BTICK_in_unquotedContent567); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BTICK.add(q);



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
                    // 218:15: -> STRING_CONTENT[$q]
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:221:1: genericContent : ( embeddedVariable | q= CHAR -> STRING_CONTENT[$q] | q= VARNAME -> STRING_CONTENT[$q] );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:222:2: ( embeddedVariable | q= CHAR -> STRING_CONTENT[$q] | q= VARNAME -> STRING_CONTENT[$q] )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:222:4: embeddedVariable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_embeddedVariable_in_genericContent586);
                    embeddedVariable8=embeddedVariable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, embeddedVariable8.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:223:4: q= CHAR
                    {
                    q=(Token)match(input,CHAR,FOLLOW_CHAR_in_genericContent593); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHAR.add(q);



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
                    // 223:14: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:224:4: q= VARNAME
                    {
                    q=(Token)match(input,VARNAME,FOLLOW_VARNAME_in_genericContent608); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VARNAME.add(q);



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
                    // 224:16: -> STRING_CONTENT[$q]
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:227:1: qQuoteEnd returns [ Token token ] : q= QQUOT_END -> STRING_END[$q] ;
    public final SQLScriptStringParser.qQuoteEnd_return qQuoteEnd() throws RecognitionException {
        SQLScriptStringParser.qQuoteEnd_return retval = new SQLScriptStringParser.qQuoteEnd_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token q=null;

        CommonTree q_tree=null;
        RewriteRuleTokenStream stream_QQUOT_END=new RewriteRuleTokenStream(adaptor,"token QQUOT_END");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:228:2: (q= QQUOT_END -> STRING_END[$q] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:228:4: q= QQUOT_END
            {
            q=(Token)match(input,QQUOT_END,FOLLOW_QQUOT_END_in_qQuoteEnd632); if (state.failed) return retval; 
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
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 228:33: -> STRING_END[$q]
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:231:1: embeddedVariable : a1= ATSIGN (lc= LCURLY ( RCURLY -> STRING_CONTENT[$a1] | var= VARNAME RCURLY -> EMBEDDED_VAR[$var] | -> STRING_CONTENT[$a1] STRING_CONTENT[$lc] ) | -> STRING_CONTENT[$a1] ) ;
    public final SQLScriptStringParser.embeddedVariable_return embeddedVariable() throws RecognitionException {
        SQLScriptStringParser.embeddedVariable_return retval = new SQLScriptStringParser.embeddedVariable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token a1=null;
        Token lc=null;
        Token var=null;
        Token RCURLY9=null;
        Token RCURLY10=null;

        CommonTree a1_tree=null;
        CommonTree lc_tree=null;
        CommonTree var_tree=null;
        CommonTree RCURLY9_tree=null;
        CommonTree RCURLY10_tree=null;
        RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
        RewriteRuleTokenStream stream_ATSIGN=new RewriteRuleTokenStream(adaptor,"token ATSIGN");
        RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
        RewriteRuleTokenStream stream_VARNAME=new RewriteRuleTokenStream(adaptor,"token VARNAME");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:232:2: (a1= ATSIGN (lc= LCURLY ( RCURLY -> STRING_CONTENT[$a1] | var= VARNAME RCURLY -> EMBEDDED_VAR[$var] | -> STRING_CONTENT[$a1] STRING_CONTENT[$lc] ) | -> STRING_CONTENT[$a1] ) )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:232:4: a1= ATSIGN (lc= LCURLY ( RCURLY -> STRING_CONTENT[$a1] | var= VARNAME RCURLY -> EMBEDDED_VAR[$var] | -> STRING_CONTENT[$a1] STRING_CONTENT[$lc] ) | -> STRING_CONTENT[$a1] )
            {
            a1=(Token)match(input,ATSIGN,FOLLOW_ATSIGN_in_embeddedVariable652); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ATSIGN.add(a1);

            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:233:3: (lc= LCURLY ( RCURLY -> STRING_CONTENT[$a1] | var= VARNAME RCURLY -> EMBEDDED_VAR[$var] | -> STRING_CONTENT[$a1] STRING_CONTENT[$lc] ) | -> STRING_CONTENT[$a1] )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:233:5: lc= LCURLY ( RCURLY -> STRING_CONTENT[$a1] | var= VARNAME RCURLY -> EMBEDDED_VAR[$var] | -> STRING_CONTENT[$a1] STRING_CONTENT[$lc] )
                    {
                    lc=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_embeddedVariable660); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LCURLY.add(lc);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:234:5: ( RCURLY -> STRING_CONTENT[$a1] | var= VARNAME RCURLY -> EMBEDDED_VAR[$var] | -> STRING_CONTENT[$a1] STRING_CONTENT[$lc] )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:234:7: RCURLY
                            {
                            RCURLY9=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_embeddedVariable668); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY9);



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
                            // 234:15: -> STRING_CONTENT[$a1]
                            {
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, a1));

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:235:7: var= VARNAME RCURLY
                            {
                            var=(Token)match(input,VARNAME,FOLLOW_VARNAME_in_embeddedVariable684); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_VARNAME.add(var);

                            RCURLY10=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_embeddedVariable686); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY10);



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
                            // 235:26: -> EMBEDDED_VAR[$var]
                            {
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(EMBEDDED_VAR, var));

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 3 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:236:9: 
                            {

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
                            // 236:9: -> STRING_CONTENT[$a1] STRING_CONTENT[$lc]
                            {
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, a1));
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, lc));

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:238:7: 
                    {

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
                    // 238:7: -> STRING_CONTENT[$a1]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, a1));

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
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:194:4: ( SQUOT SQUOT )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:194:5: SQUOT SQUOT
        {
        match(input,SQUOT,FOLLOW_SQUOT_in_synpred1_SQLScriptString345); if (state.failed) return ;
        match(input,SQUOT,FOLLOW_SQUOT_in_synpred1_SQLScriptString347); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_SQLScriptString

    // $ANTLR start synpred2_SQLScriptString
    public final void synpred2_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:201:4: ( DQUOT DQUOT )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:201:5: DQUOT DQUOT
        {
        match(input,DQUOT,FOLLOW_DQUOT_in_synpred2_SQLScriptString407); if (state.failed) return ;
        match(input,DQUOT,FOLLOW_DQUOT_in_synpred2_SQLScriptString409); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_SQLScriptString

    // $ANTLR start synpred3_SQLScriptString
    public final void synpred3_SQLScriptString_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:208:4: ( BTICK BTICK )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptString.g:208:5: BTICK BTICK
        {
        match(input,BTICK,FOLLOW_BTICK_in_synpred3_SQLScriptString469); if (state.failed) return ;
        match(input,BTICK,FOLLOW_BTICK_in_synpred3_SQLScriptString471); if (state.failed) return ;

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


 

    public static final BitSet FOLLOW_SQUOT_in_string117 = new BitSet(new long[]{0x0000000000167000L});
    public static final BitSet FOLLOW_singleQuoteContent_in_string132 = new BitSet(new long[]{0x0000000000167000L});
    public static final BitSet FOLLOW_SQUOT_in_string138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_string162 = new BitSet(new long[]{0x0000000000167000L});
    public static final BitSet FOLLOW_doubleQuoteContent_in_string177 = new BitSet(new long[]{0x0000000000167000L});
    public static final BitSet FOLLOW_DQUOT_in_string183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_string207 = new BitSet(new long[]{0x0000000000167000L});
    public static final BitSet FOLLOW_backTickContent_in_string222 = new BitSet(new long[]{0x0000000000167000L});
    public static final BitSet FOLLOW_BTICK_in_string231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QQUOT_START_in_string255 = new BitSet(new long[]{0x00000000001E7000L});
    public static final BitSet FOLLOW_unquotedContent_in_string264 = new BitSet(new long[]{0x00000000001E7000L});
    public static final BitSet FOLLOW_qQuoteEnd_in_string273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLQUOT_in_string296 = new BitSet(new long[]{0x0000000000177000L});
    public static final BitSet FOLLOW_unquotedContent_in_string307 = new BitSet(new long[]{0x0000000000177000L});
    public static final BitSet FOLLOW_DOLQUOT_in_string316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_singleQuoteContent353 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SQUOT_in_singleQuoteContent355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericContent_in_singleQuoteContent365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_singleQuoteContent372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_singleQuoteContent387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_doubleQuoteContent415 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DQUOT_in_doubleQuoteContent417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericContent_in_doubleQuoteContent427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_doubleQuoteContent434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_doubleQuoteContent449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_backTickContent477 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_BTICK_in_backTickContent479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericContent_in_backTickContent489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_backTickContent496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_backTickContent511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericContent_in_unquotedContent530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_unquotedContent537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_unquotedContent552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_unquotedContent567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVariable_in_genericContent586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_genericContent593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARNAME_in_genericContent608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QQUOT_END_in_qQuoteEnd632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSIGN_in_embeddedVariable652 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_LCURLY_in_embeddedVariable660 = new BitSet(new long[]{0x0000000000440002L});
    public static final BitSet FOLLOW_RCURLY_in_embeddedVariable668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARNAME_in_embeddedVariable684 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RCURLY_in_embeddedVariable686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_synpred1_SQLScriptString345 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SQUOT_in_synpred1_SQLScriptString347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_synpred2_SQLScriptString407 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DQUOT_in_synpred2_SQLScriptString409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_synpred3_SQLScriptString469 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_BTICK_in_synpred3_SQLScriptString471 = new BitSet(new long[]{0x0000000000000002L});

}