/* EllaStringParser.g
   Copyright (C) 2009, 2010 Thomas Weiß <panos@unbunt.org>

This file is part of the Ella scripting language interpreter.

Ella is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

Ella is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with Ella; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

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
	:	(SQUOT SQUOT)=> esc=SQUOT q=SQUOT	-> STRING_ESCAPE[$esc] STRING_CONTENT[$q]
	|	genericContent
	|	q=DQUOT				-> STRING_CONTENT[$q]
	|	q=BTICK				-> STRING_CONTENT[$q]
	;

doubleQuoteContent
	:	(DQUOT DQUOT)=> esc=DQUOT q=DQUOT	-> STRING_ESCAPE[$esc] STRING_CONTENT[$q]
	|	genericContent
	|	q=SQUOT				-> STRING_CONTENT[$q]
	|	q=BTICK				-> STRING_CONTENT[$q]
	;

backTickContent
	:	(BTICK BTICK)=> esc=BTICK q=BTICK	-> STRING_ESCAPE[$esc] STRING_CONTENT[$q]
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
	|	EMBVAR			-> EMBEDDED_VAR[$EMBVAR]
	;
