parser grammar EllaStringParser;

// TODO:
// - Optimize overridden lexer method nextToken()
// - Handle backslash escapes (not SQL92 but most RDBMS use them)
// - Fail early on errors

options {
	output = AST;
	ASTLabelType = CommonTree;
	tokenVocab = EllaStringLexer;
}

@parser::header {
	package org.unbunt.ella.compiler;
	
	import org.unbunt.ella.compiler.UnexpectedEOFException;
	import org.unbunt.ella.compiler.UnterminatedStringException;
	import org.unbunt.ella.exception.EllaRuntimeException;
}

@parser::members {

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
	
}

@rulecatch {
	catch (RecognitionException e) {
		//System.out.println("caught RecognitionException: " + e.getMessage());
		throw e;
	}
}

string
	:	start=SQUOT       { stringType = SQUOT; }   (content1+=singleQuoteContent)* endt=SQUOT		-> ^(STRING STRING_START[$start] $content1* STRING_END[$endt])
	|	start=DQUOT       { stringType = DQUOT; }   (content2+=doubleQuoteContent)* endt=DQUOT		-> ^(STRING STRING_START[$start] $content2* STRING_END[$endt])
	|	start=BTICK       { stringType = BTICK; }   (content3+=backTickContent)*    endt=BTICK		-> ^(STRING STRING_START[$start] $content3* STRING_END[$endt])
	|	start=QQUOT_START { stringType = QQUOT; }   (content4+=unquotedContent)*    end=qQuoteEnd	-> ^(STRING STRING_START[$start] $content4* STRING_END[$end.token])
	|	start=DOLQUOT     { stringType = DOLQUOT; } (content5+=unquotedContent)*    endt=DOLQUOT	-> ^(STRING STRING_START[$start] $content5* STRING_END[$endt])
	;

singleQuoteContent
	:	(SQUOT SQUOT)=> q=SQUOT SQUOT	-> STRING_CONTENT[$q]
	|	genericContent
	|	q=DQUOT				-> STRING_CONTENT[$q]
	|	q=BTICK				-> STRING_CONTENT[$q]
	;

doubleQuoteContent
	:	(DQUOT DQUOT)=> q=DQUOT DQUOT	-> STRING_CONTENT[$q]
	|	genericContent
	|	q=SQUOT				-> STRING_CONTENT[$q]
	|	q=BTICK				-> STRING_CONTENT[$q]
	;

backTickContent
	:	(BTICK BTICK)=> q=BTICK BTICK	-> STRING_CONTENT[$q]
	|	genericContent
	|	q=SQUOT				-> STRING_CONTENT[$q]
	|	q=DQUOT				-> STRING_CONTENT[$q]
	;

unquotedContent
	:	genericContent
	|	q=SQUOT				-> STRING_CONTENT[$q]
	|	q=DQUOT				-> STRING_CONTENT[$q]
	|	q=BTICK				-> STRING_CONTENT[$q]
	;

genericContent
	:	embeddedVariable
	|	q=CHAR				-> STRING_CONTENT[$q]
	|	q=VARNAME			-> STRING_CONTENT[$q]
	;

qQuoteEnd returns [ Token token ]
	:	q=QQUOT_END { $token = $q; }	-> STRING_END[$q]
	;

embeddedVariable
	:	(ATSIGN LCURLY)=>
		a1=ATSIGN
		( lc=LCURLY
		  ( RCURLY		-> STRING_CONTENT[$a1]
		  | var=VARNAME RCURLY	-> EMBEDDED_VAR[$var]
		  //|			-> STRING_CONTENT[$a1] STRING_CONTENT[$lc]
		  )
		//|			-> STRING_CONTENT[$a1]
		)
	|	ATSIGN			-> STRING_CONTENT[$ATSIGN]
	|	LCURLY			-> STRING_CONTENT[$LCURLY]
	|	RCURLY			-> STRING_CONTENT[$RCURLY]
	;
