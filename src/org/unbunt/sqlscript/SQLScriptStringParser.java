// $ANTLR 3.1.2 /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g 2009-08-05 00:08:59

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "QUOTTED_IDENFITIER", "QQUOT", "CHARS", "STRING_START", "STRING_CONTENT", "STRING_END", "EMBEDDED_VAR", "DQUOT", "SQUOT", "BTICK", "QQUOT_DELIM", "QQUOT_START", "QQUOT_END", "DOLQUOT_TAG", "DOLQUOT", "DOLQUOT_TAG_START", "DOLQUOT_TAG_END", "ATSIGN", "LCURLY", "RCURLY", "WORD_CHAR", "VARNAME", "CHAR"
    };
    public static final int STRING_START=8;
    public static final int WORD_CHAR=25;
    public static final int DQUOT=12;
    public static final int STRING_CONTENT=9;
    public static final int QQUOT_START=16;
    public static final int CHAR=27;
    public static final int QUOTTED_IDENFITIER=5;
    public static final int LCURLY=23;
    public static final int DOLQUOT_TAG_START=20;
    public static final int EOF=-1;
    public static final int VARNAME=26;
    public static final int QQUOT=6;
    public static final int DOLQUOT_TAG_END=21;
    public static final int SQUOT=13;
    public static final int STRING_END=10;
    public static final int QQUOT_DELIM=15;
    public static final int RCURLY=24;
    public static final int DOLQUOT=19;
    public static final int CHARS=7;
    public static final int EMBEDDED_VAR=11;
    public static final int ATSIGN=22;
    public static final int DOLQUOT_TAG=18;
    public static final int QQUOT_END=17;
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
    public String getGrammarFileName() { return "/home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g"; }



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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:68:1: string : (start= SQUOT (content1+= singleQuoteContent )* endt= SQUOT -> ^( STRING STRING_START[$start] ( $content1)* STRING_END[$endt] ) | start= DQUOT (content2+= doubleQuoteContent )* endt= DQUOT -> ^( STRING STRING_START[$start] ( $content2)* STRING_END[$endt] ) | start= BTICK (content3+= backTickContent )* endt= BTICK -> ^( STRING STRING_START[$start] ( $content3)* STRING_END[$endt] ) | start= QQUOT_START (content4+= unquotedContent )* end= qQuoteEnd -> ^( STRING STRING_START[$start] ( $content4)* STRING_END[$end.token] ) | start= DOLQUOT (content5+= unquotedContent )* endt= DOLQUOT -> ^( STRING STRING_START[$start] ( $content5)* STRING_END[$endt] ) );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:68:8: (start= SQUOT (content1+= singleQuoteContent )* endt= SQUOT -> ^( STRING STRING_START[$start] ( $content1)* STRING_END[$endt] ) | start= DQUOT (content2+= doubleQuoteContent )* endt= DQUOT -> ^( STRING STRING_START[$start] ( $content2)* STRING_END[$endt] ) | start= BTICK (content3+= backTickContent )* endt= BTICK -> ^( STRING STRING_START[$start] ( $content3)* STRING_END[$endt] ) | start= QQUOT_START (content4+= unquotedContent )* end= qQuoteEnd -> ^( STRING STRING_START[$start] ( $content4)* STRING_END[$end.token] ) | start= DOLQUOT (content5+= unquotedContent )* endt= DOLQUOT -> ^( STRING STRING_START[$start] ( $content5)* STRING_END[$endt] ) )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:68:10: start= SQUOT (content1+= singleQuoteContent )* endt= SQUOT
                    {
                    start=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_string72); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUOT.add(start);

                    if ( state.backtracking==0 ) {
                       stringType = SQUOT; 
                    }
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:68:54: (content1+= singleQuoteContent )*
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
                        else if ( (LA1_0==DQUOT||LA1_0==BTICK||(LA1_0>=ATSIGN && LA1_0<=RCURLY)||(LA1_0>=VARNAME && LA1_0<=CHAR)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:68:55: content1+= singleQuoteContent
                    	    {
                    	    pushFollow(FOLLOW_singleQuoteContent_in_string87);
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

                    endt=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_string93); if (state.failed) return retval; 
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
                    // 68:98: -> ^( STRING STRING_START[$start] ( $content1)* STRING_END[$endt] )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:68:101: ^( STRING STRING_START[$start] ( $content1)* STRING_END[$endt] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_START, start));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:68:131: ( $content1)*
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:69:4: start= DQUOT (content2+= doubleQuoteContent )* endt= DQUOT
                    {
                    start=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_string117); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DQUOT.add(start);

                    if ( state.backtracking==0 ) {
                       stringType = DQUOT; 
                    }
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:69:48: (content2+= doubleQuoteContent )*
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
                        else if ( ((LA2_0>=SQUOT && LA2_0<=BTICK)||(LA2_0>=ATSIGN && LA2_0<=RCURLY)||(LA2_0>=VARNAME && LA2_0<=CHAR)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:69:49: content2+= doubleQuoteContent
                    	    {
                    	    pushFollow(FOLLOW_doubleQuoteContent_in_string132);
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

                    endt=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_string138); if (state.failed) return retval; 
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
                    // 69:92: -> ^( STRING STRING_START[$start] ( $content2)* STRING_END[$endt] )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:69:95: ^( STRING STRING_START[$start] ( $content2)* STRING_END[$endt] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_START, start));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:69:125: ( $content2)*
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:70:4: start= BTICK (content3+= backTickContent )* endt= BTICK
                    {
                    start=(Token)match(input,BTICK,FOLLOW_BTICK_in_string162); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BTICK.add(start);

                    if ( state.backtracking==0 ) {
                       stringType = BTICK; 
                    }
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:70:48: (content3+= backTickContent )*
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
                        else if ( ((LA3_0>=DQUOT && LA3_0<=SQUOT)||(LA3_0>=ATSIGN && LA3_0<=RCURLY)||(LA3_0>=VARNAME && LA3_0<=CHAR)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:70:49: content3+= backTickContent
                    	    {
                    	    pushFollow(FOLLOW_backTickContent_in_string177);
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

                    endt=(Token)match(input,BTICK,FOLLOW_BTICK_in_string186); if (state.failed) return retval; 
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
                    // 70:92: -> ^( STRING STRING_START[$start] ( $content3)* STRING_END[$endt] )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:70:95: ^( STRING STRING_START[$start] ( $content3)* STRING_END[$endt] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_START, start));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:70:125: ( $content3)*
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:71:4: start= QQUOT_START (content4+= unquotedContent )* end= qQuoteEnd
                    {
                    start=(Token)match(input,QQUOT_START,FOLLOW_QQUOT_START_in_string210); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QQUOT_START.add(start);

                    if ( state.backtracking==0 ) {
                       stringType = QQUOT; 
                    }
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:71:48: (content4+= unquotedContent )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=DQUOT && LA4_0<=BTICK)||(LA4_0>=ATSIGN && LA4_0<=RCURLY)||(LA4_0>=VARNAME && LA4_0<=CHAR)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:71:49: content4+= unquotedContent
                    	    {
                    	    pushFollow(FOLLOW_unquotedContent_in_string219);
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

                    pushFollow(FOLLOW_qQuoteEnd_in_string228);
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
                    // 71:94: -> ^( STRING STRING_START[$start] ( $content4)* STRING_END[$end.token] )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:71:97: ^( STRING STRING_START[$start] ( $content4)* STRING_END[$end.token] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_START, start));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:71:127: ( $content4)*
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:72:4: start= DOLQUOT (content5+= unquotedContent )* endt= DOLQUOT
                    {
                    start=(Token)match(input,DOLQUOT,FOLLOW_DOLQUOT_in_string251); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOLQUOT.add(start);

                    if ( state.backtracking==0 ) {
                       stringType = DOLQUOT; 
                    }
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:72:48: (content5+= unquotedContent )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=DQUOT && LA5_0<=BTICK)||(LA5_0>=ATSIGN && LA5_0<=RCURLY)||(LA5_0>=VARNAME && LA5_0<=CHAR)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:72:49: content5+= unquotedContent
                    	    {
                    	    pushFollow(FOLLOW_unquotedContent_in_string262);
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

                    endt=(Token)match(input,DOLQUOT,FOLLOW_DOLQUOT_in_string271); if (state.failed) return retval; 
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
                    // 72:93: -> ^( STRING STRING_START[$start] ( $content5)* STRING_END[$endt] )
                    {
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:72:96: ^( STRING STRING_START[$start] ( $content5)* STRING_END[$endt] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(STRING_START, start));
                        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:72:126: ( $content5)*
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:75:1: singleQuoteContent : ( ( SQUOT SQUOT )=>q= SQUOT SQUOT -> STRING_CONTENT[$q] | genericContent | q= DQUOT -> STRING_CONTENT[$q] | q= BTICK -> STRING_CONTENT[$q] );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:76:2: ( ( SQUOT SQUOT )=>q= SQUOT SQUOT -> STRING_CONTENT[$q] | genericContent | q= DQUOT -> STRING_CONTENT[$q] | q= BTICK -> STRING_CONTENT[$q] )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==SQUOT) && (synpred1_SQLScriptStringParser())) {
                alt7=1;
            }
            else if ( ((LA7_0>=ATSIGN && LA7_0<=RCURLY)||(LA7_0>=VARNAME && LA7_0<=CHAR)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:76:4: ( SQUOT SQUOT )=>q= SQUOT SQUOT
                    {
                    q=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_singleQuoteContent307); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUOT.add(q);

                    SQUOT1=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_singleQuoteContent309); if (state.failed) return retval; 
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
                    // 76:34: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:77:4: genericContent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_genericContent_in_singleQuoteContent319);
                    genericContent2=genericContent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericContent2.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:78:4: q= DQUOT
                    {
                    q=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_singleQuoteContent326); if (state.failed) return retval; 
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
                    // 78:15: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:79:4: q= BTICK
                    {
                    q=(Token)match(input,BTICK,FOLLOW_BTICK_in_singleQuoteContent341); if (state.failed) return retval; 
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
                    // 79:15: -> STRING_CONTENT[$q]
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:82:1: doubleQuoteContent : ( ( DQUOT DQUOT )=>q= DQUOT DQUOT -> STRING_CONTENT[$q] | genericContent | q= SQUOT -> STRING_CONTENT[$q] | q= BTICK -> STRING_CONTENT[$q] );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:83:2: ( ( DQUOT DQUOT )=>q= DQUOT DQUOT -> STRING_CONTENT[$q] | genericContent | q= SQUOT -> STRING_CONTENT[$q] | q= BTICK -> STRING_CONTENT[$q] )
            int alt8=4;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==DQUOT) && (synpred2_SQLScriptStringParser())) {
                alt8=1;
            }
            else if ( ((LA8_0>=ATSIGN && LA8_0<=RCURLY)||(LA8_0>=VARNAME && LA8_0<=CHAR)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:83:4: ( DQUOT DQUOT )=>q= DQUOT DQUOT
                    {
                    q=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_doubleQuoteContent369); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DQUOT.add(q);

                    DQUOT3=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_doubleQuoteContent371); if (state.failed) return retval; 
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
                    // 83:34: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:84:4: genericContent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_genericContent_in_doubleQuoteContent381);
                    genericContent4=genericContent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericContent4.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:85:4: q= SQUOT
                    {
                    q=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_doubleQuoteContent388); if (state.failed) return retval; 
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
                    // 85:15: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:86:4: q= BTICK
                    {
                    q=(Token)match(input,BTICK,FOLLOW_BTICK_in_doubleQuoteContent403); if (state.failed) return retval; 
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
                    // 86:15: -> STRING_CONTENT[$q]
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:89:1: backTickContent : ( ( BTICK BTICK )=>q= BTICK BTICK -> STRING_CONTENT[$q] | genericContent | q= SQUOT -> STRING_CONTENT[$q] | q= DQUOT -> STRING_CONTENT[$q] );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:90:2: ( ( BTICK BTICK )=>q= BTICK BTICK -> STRING_CONTENT[$q] | genericContent | q= SQUOT -> STRING_CONTENT[$q] | q= DQUOT -> STRING_CONTENT[$q] )
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==BTICK) && (synpred3_SQLScriptStringParser())) {
                alt9=1;
            }
            else if ( ((LA9_0>=ATSIGN && LA9_0<=RCURLY)||(LA9_0>=VARNAME && LA9_0<=CHAR)) ) {
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:90:4: ( BTICK BTICK )=>q= BTICK BTICK
                    {
                    q=(Token)match(input,BTICK,FOLLOW_BTICK_in_backTickContent431); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BTICK.add(q);

                    BTICK5=(Token)match(input,BTICK,FOLLOW_BTICK_in_backTickContent433); if (state.failed) return retval; 
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
                    // 90:34: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:91:4: genericContent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_genericContent_in_backTickContent443);
                    genericContent6=genericContent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericContent6.getTree());

                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:92:4: q= SQUOT
                    {
                    q=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_backTickContent450); if (state.failed) return retval; 
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
                    // 92:15: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:93:4: q= DQUOT
                    {
                    q=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_backTickContent465); if (state.failed) return retval; 
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
                    // 93:15: -> STRING_CONTENT[$q]
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:96:1: unquotedContent : ( genericContent | q= SQUOT -> STRING_CONTENT[$q] | q= DQUOT -> STRING_CONTENT[$q] | q= BTICK -> STRING_CONTENT[$q] );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:97:2: ( genericContent | q= SQUOT -> STRING_CONTENT[$q] | q= DQUOT -> STRING_CONTENT[$q] | q= BTICK -> STRING_CONTENT[$q] )
            int alt10=4;
            switch ( input.LA(1) ) {
            case ATSIGN:
            case LCURLY:
            case RCURLY:
            case VARNAME:
            case CHAR:
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:97:4: genericContent
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_genericContent_in_unquotedContent484);
                    genericContent7=genericContent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericContent7.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:98:4: q= SQUOT
                    {
                    q=(Token)match(input,SQUOT,FOLLOW_SQUOT_in_unquotedContent491); if (state.failed) return retval; 
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
                    // 98:15: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:99:4: q= DQUOT
                    {
                    q=(Token)match(input,DQUOT,FOLLOW_DQUOT_in_unquotedContent506); if (state.failed) return retval; 
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
                    // 99:15: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:100:4: q= BTICK
                    {
                    q=(Token)match(input,BTICK,FOLLOW_BTICK_in_unquotedContent521); if (state.failed) return retval; 
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
                    // 100:15: -> STRING_CONTENT[$q]
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:103:1: genericContent : ( embeddedVariable | q= CHAR -> STRING_CONTENT[$q] | q= VARNAME -> STRING_CONTENT[$q] );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:104:2: ( embeddedVariable | q= CHAR -> STRING_CONTENT[$q] | q= VARNAME -> STRING_CONTENT[$q] )
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:104:4: embeddedVariable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_embeddedVariable_in_genericContent540);
                    embeddedVariable8=embeddedVariable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, embeddedVariable8.getTree());

                    }
                    break;
                case 2 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:105:4: q= CHAR
                    {
                    q=(Token)match(input,CHAR,FOLLOW_CHAR_in_genericContent547); if (state.failed) return retval; 
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
                    // 105:14: -> STRING_CONTENT[$q]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, q));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:106:4: q= VARNAME
                    {
                    q=(Token)match(input,VARNAME,FOLLOW_VARNAME_in_genericContent562); if (state.failed) return retval; 
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
                    // 106:16: -> STRING_CONTENT[$q]
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:109:1: qQuoteEnd returns [ Token token ] : q= QQUOT_END -> STRING_END[$q] ;
    public final SQLScriptStringParser.qQuoteEnd_return qQuoteEnd() throws RecognitionException {
        SQLScriptStringParser.qQuoteEnd_return retval = new SQLScriptStringParser.qQuoteEnd_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token q=null;

        CommonTree q_tree=null;
        RewriteRuleTokenStream stream_QQUOT_END=new RewriteRuleTokenStream(adaptor,"token QQUOT_END");

        try {
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:110:2: (q= QQUOT_END -> STRING_END[$q] )
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:110:4: q= QQUOT_END
            {
            q=(Token)match(input,QQUOT_END,FOLLOW_QQUOT_END_in_qQuoteEnd586); if (state.failed) return retval; 
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
            // 110:33: -> STRING_END[$q]
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
    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:113:1: embeddedVariable : ( ( ATSIGN LCURLY )=>a1= ATSIGN (lc= LCURLY ( RCURLY -> STRING_CONTENT[$a1] | var= VARNAME RCURLY -> EMBEDDED_VAR[$var] ) ) | ATSIGN -> STRING_CONTENT[$ATSIGN] | LCURLY -> STRING_CONTENT[$LCURLY] | RCURLY -> STRING_CONTENT[$RCURLY] );
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
            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:114:2: ( ( ATSIGN LCURLY )=>a1= ATSIGN (lc= LCURLY ( RCURLY -> STRING_CONTENT[$a1] | var= VARNAME RCURLY -> EMBEDDED_VAR[$var] ) ) | ATSIGN -> STRING_CONTENT[$ATSIGN] | LCURLY -> STRING_CONTENT[$LCURLY] | RCURLY -> STRING_CONTENT[$RCURLY] )
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:114:4: ( ATSIGN LCURLY )=>a1= ATSIGN (lc= LCURLY ( RCURLY -> STRING_CONTENT[$a1] | var= VARNAME RCURLY -> EMBEDDED_VAR[$var] ) )
                    {
                    a1=(Token)match(input,ATSIGN,FOLLOW_ATSIGN_in_embeddedVariable615); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ATSIGN.add(a1);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:116:3: (lc= LCURLY ( RCURLY -> STRING_CONTENT[$a1] | var= VARNAME RCURLY -> EMBEDDED_VAR[$var] ) )
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:116:5: lc= LCURLY ( RCURLY -> STRING_CONTENT[$a1] | var= VARNAME RCURLY -> EMBEDDED_VAR[$var] )
                    {
                    lc=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_embeddedVariable623); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LCURLY.add(lc);

                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:117:5: ( RCURLY -> STRING_CONTENT[$a1] | var= VARNAME RCURLY -> EMBEDDED_VAR[$var] )
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
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:117:7: RCURLY
                            {
                            RCURLY9=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_embeddedVariable631); if (state.failed) return retval; 
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
                            // 117:15: -> STRING_CONTENT[$a1]
                            {
                                adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, a1));

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:118:7: var= VARNAME RCURLY
                            {
                            var=(Token)match(input,VARNAME,FOLLOW_VARNAME_in_embeddedVariable647); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_VARNAME.add(var);

                            RCURLY10=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_embeddedVariable649); if (state.failed) return retval; 
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
                            // 118:26: -> EMBEDDED_VAR[$var]
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
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:123:4: ATSIGN
                    {
                    ATSIGN11=(Token)match(input,ATSIGN,FOLLOW_ATSIGN_in_embeddedVariable677); if (state.failed) return retval; 
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
                    // 123:13: -> STRING_CONTENT[$ATSIGN]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, ATSIGN11));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:124:4: LCURLY
                    {
                    LCURLY12=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_embeddedVariable689); if (state.failed) return retval; 
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
                    // 124:13: -> STRING_CONTENT[$LCURLY]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_CONTENT, LCURLY12));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:125:4: RCURLY
                    {
                    RCURLY13=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_embeddedVariable701); if (state.failed) return retval; 
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
                    // 125:13: -> STRING_CONTENT[$RCURLY]
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

    // $ANTLR start synpred1_SQLScriptStringParser
    public final void synpred1_SQLScriptStringParser_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:76:4: ( SQUOT SQUOT )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:76:5: SQUOT SQUOT
        {
        match(input,SQUOT,FOLLOW_SQUOT_in_synpred1_SQLScriptStringParser299); if (state.failed) return ;
        match(input,SQUOT,FOLLOW_SQUOT_in_synpred1_SQLScriptStringParser301); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_SQLScriptStringParser

    // $ANTLR start synpred2_SQLScriptStringParser
    public final void synpred2_SQLScriptStringParser_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:83:4: ( DQUOT DQUOT )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:83:5: DQUOT DQUOT
        {
        match(input,DQUOT,FOLLOW_DQUOT_in_synpred2_SQLScriptStringParser361); if (state.failed) return ;
        match(input,DQUOT,FOLLOW_DQUOT_in_synpred2_SQLScriptStringParser363); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_SQLScriptStringParser

    // $ANTLR start synpred3_SQLScriptStringParser
    public final void synpred3_SQLScriptStringParser_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:90:4: ( BTICK BTICK )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:90:5: BTICK BTICK
        {
        match(input,BTICK,FOLLOW_BTICK_in_synpred3_SQLScriptStringParser423); if (state.failed) return ;
        match(input,BTICK,FOLLOW_BTICK_in_synpred3_SQLScriptStringParser425); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_SQLScriptStringParser

    // $ANTLR start synpred4_SQLScriptStringParser
    public final void synpred4_SQLScriptStringParser_fragment() throws RecognitionException {   
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:114:4: ( ATSIGN LCURLY )
        // /home/panos/IdeaProjects/SQLScript/src/org/unbunt/sqlscript/SQLScriptStringParser.g:114:5: ATSIGN LCURLY
        {
        match(input,ATSIGN,FOLLOW_ATSIGN_in_synpred4_SQLScriptStringParser605); if (state.failed) return ;
        match(input,LCURLY,FOLLOW_LCURLY_in_synpred4_SQLScriptStringParser607); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_SQLScriptStringParser

    // Delegated rules

    public final boolean synpred1_SQLScriptStringParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_SQLScriptStringParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_SQLScriptStringParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_SQLScriptStringParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_SQLScriptStringParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_SQLScriptStringParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_SQLScriptStringParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_SQLScriptStringParser_fragment(); // can never throw exception
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
        "\1\26\1\14\2\uffff\1\14\1\uffff\1\0\1\14\1\uffff\1\0";
    static final String DFA13_maxS =
        "\1\30\1\33\2\uffff\1\33\1\uffff\1\0\1\33\1\uffff\1\0";
    static final String DFA13_acceptS =
        "\2\uffff\1\3\1\4\1\uffff\1\2\2\uffff\1\1\1\uffff";
    static final String DFA13_specialS =
        "\6\uffff\1\1\2\uffff\1\0}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\2\1\3",
            "\3\5\2\uffff\1\5\1\uffff\1\5\2\uffff\1\5\1\4\1\5\1\uffff\2"+
            "\5",
            "",
            "",
            "\3\5\2\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\6\1\uffff\1\7\1"+
            "\5",
            "",
            "\1\uffff",
            "\3\5\2\uffff\1\5\1\uffff\1\5\2\uffff\2\5\1\11\1\uffff\2\5",
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
            return "113:1: embeddedVariable : ( ( ATSIGN LCURLY )=>a1= ATSIGN (lc= LCURLY ( RCURLY -> STRING_CONTENT[$a1] | var= VARNAME RCURLY -> EMBEDDED_VAR[$var] ) ) | ATSIGN -> STRING_CONTENT[$ATSIGN] | LCURLY -> STRING_CONTENT[$LCURLY] | RCURLY -> STRING_CONTENT[$RCURLY] );";
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
                        if ( (synpred4_SQLScriptStringParser()) ) {s = 8;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index13_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_6 = input.LA(1);

                         
                        int index13_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_SQLScriptStringParser()) ) {s = 8;}

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
 

    public static final BitSet FOLLOW_SQUOT_in_string72 = new BitSet(new long[]{0x000000000DC07000L});
    public static final BitSet FOLLOW_singleQuoteContent_in_string87 = new BitSet(new long[]{0x000000000DC07000L});
    public static final BitSet FOLLOW_SQUOT_in_string93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_string117 = new BitSet(new long[]{0x000000000DC07000L});
    public static final BitSet FOLLOW_doubleQuoteContent_in_string132 = new BitSet(new long[]{0x000000000DC07000L});
    public static final BitSet FOLLOW_DQUOT_in_string138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_string162 = new BitSet(new long[]{0x000000000DC07000L});
    public static final BitSet FOLLOW_backTickContent_in_string177 = new BitSet(new long[]{0x000000000DC07000L});
    public static final BitSet FOLLOW_BTICK_in_string186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QQUOT_START_in_string210 = new BitSet(new long[]{0x000000000DC27000L});
    public static final BitSet FOLLOW_unquotedContent_in_string219 = new BitSet(new long[]{0x000000000DC27000L});
    public static final BitSet FOLLOW_qQuoteEnd_in_string228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLQUOT_in_string251 = new BitSet(new long[]{0x000000000DC87000L});
    public static final BitSet FOLLOW_unquotedContent_in_string262 = new BitSet(new long[]{0x000000000DC87000L});
    public static final BitSet FOLLOW_DOLQUOT_in_string271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_singleQuoteContent307 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_SQUOT_in_singleQuoteContent309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericContent_in_singleQuoteContent319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_singleQuoteContent326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_singleQuoteContent341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_doubleQuoteContent369 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DQUOT_in_doubleQuoteContent371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericContent_in_doubleQuoteContent381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_doubleQuoteContent388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_doubleQuoteContent403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_backTickContent431 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_BTICK_in_backTickContent433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericContent_in_backTickContent443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_backTickContent450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_backTickContent465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericContent_in_unquotedContent484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_unquotedContent491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_unquotedContent506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_unquotedContent521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_embeddedVariable_in_genericContent540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_genericContent547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARNAME_in_genericContent562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QQUOT_END_in_qQuoteEnd586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSIGN_in_embeddedVariable615 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LCURLY_in_embeddedVariable623 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_RCURLY_in_embeddedVariable631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARNAME_in_embeddedVariable647 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RCURLY_in_embeddedVariable649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSIGN_in_embeddedVariable677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_embeddedVariable689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RCURLY_in_embeddedVariable701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOT_in_synpred1_SQLScriptStringParser299 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_SQUOT_in_synpred1_SQLScriptStringParser301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOT_in_synpred2_SQLScriptStringParser361 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DQUOT_in_synpred2_SQLScriptStringParser363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BTICK_in_synpred3_SQLScriptStringParser423 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_BTICK_in_synpred3_SQLScriptStringParser425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSIGN_in_synpred4_SQLScriptStringParser605 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LCURLY_in_synpred4_SQLScriptStringParser607 = new BitSet(new long[]{0x0000000000000002L});

}