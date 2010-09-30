" au BufRead,BufNewFile *.ella.sql setfiletype ella
" au BufRead,BufNewFile *.ella.sql set syntax=ella
" au BufRead,BufNewFile *.ella.sql set cindent cino=(1s smartindent autoindent ts=4 sw=4

"if exists("b:current_syntax")
"  finish
"endif
syntax clear

syn case match

syn include @sqlTop ${VIMRUNTIME}/syntax/sql.vim
syn include @ellaTop <sfile>:p:h/ellascript.vim

"runtime! syntax/ellascript.vim
"runtime! syntax/sql.vim

"syn region ellaScript start="[a-zA-Z]\+" end=";" contains=@ellaTop,@ellaBlock
syn region ellaSQL start="[a-zA-Z]\+" end=";" contains=@sqlTop
"syn region ellaSimpleStatement start="\(var\|throw\|include\|import\|break\|continue\)" end=";" contains=@ellaTop,@ellaBlock
"syn region ellaCompoundStatement matchgroup=Constant start="\(if\|else\|while\|try\|catch\|finally\|for\|fun\)" end="}" contains=@ellaTop,@ellaModeScript fold
"syn region ellaSQLStatement matchgroup=ellaStatement start="\<[sS][qQ][lL]\>" end=";" contains=@sqlTop
syn region ellaScriptStatement start="\." end=";" contains=@ellaExpr

syn cluster ellaExpr contains=ellaParenExpr,@ellaTop,@ellaBlock,@ellaConstants
syn region ellaParenExpr start="(" end=")" contained contains=@ellaExpr

syn match ellaFun "\<fun\>" nextgroup=ellaFunName skipwhite
syn match ellaFunName "[a-zA-Z_][a-zA-Z0-9_]*" nextgroup=ellaFunArgs skipwhite contained
syn region ellaFunArgs start="(" end=")" nextgroup=ellaBlock contained

syn match ellaIf "\<if\>" nextgroup=ellaIfExpr skipwhite
" XXX: the following breaks if the matchgroup is omitted
syn region ellaIfExpr matchgroup=Operator start="(" end=")" nextgroup=ellaBlock skipwhite contained contains=@ellaExpr

syn match ellaVar "\<var\>" nextgroup=ellaVarName skipwhite
syn match ellaVarName "[a-zA-Z_][a-zA-Z0-9_]*" nextgroup=ellaAssignExpr skipwhite contained
syn region ellaAssignExpr start=":\?=" end=";" skipwhite contained contains=@ellaExpr

"syn cluster ellaModeSQL contains=ellaBlock,ellaBlockSQL,ellaSQL,ellaSimpleStatement,ellaCompoundStatement,ellaSQLStatement,ellaScriptStatement
"syn cluster ellaModeScript contains=ellaBlock,ellaBlockSQL,ellaScript,ellaSimpleStatement,ellaCompoundStatement,ellaSQLStatement,ellaScriptStatement

syn cluster ellaModeSQL contains=ellaBlock,ellaBlockSQL,ellaSQL,ellaCompoundStatement
syn cluster ellaModeScript contains=ellaBlock,ellaBlockSQL,ellaCompoundStatement

syn region ellaBlock matchgroup=Statement start="{" end="}" contains=@ellaModeScript fold
syn region ellaBlockSQL matchgroup=Identifier start="\<[sS][qQ][lL][ 	\n]*{" end="}" contains=@ellaModeSQL fold

if version < 508
  command! -nargs=+ EllaHiLink hi link <args>
else
  command! -nargs=+ EllaHiLink hi def link <args>
endif

EllaHiLink ellaFun StorageClass
EllaHiLink ellaFunName Identifier
EllaHiLink ellaIf Statement
EllaHiLink ellaVar StorageClass
EllaHiLink ellaVarName Identifier
