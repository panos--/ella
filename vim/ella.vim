" au BufRead,BufNewFile *.ella.sql setfiletype ella
" au BufRead,BufNewFile *.ella.sql set syntax=ella
" au BufRead,BufNewFile *.ella.sql set cindent cino=(1s smartindent autoindent ts=4 sw=4

if exists("b:current_syntax")
  finish
endif

syn include @sqlTop ${VIMRUNTIME}/syntax/sql.vim
syn include @ellaTop <sfile>:p:h/ellascript.vim

"runtime! syntax/ellascript.vim
"runtime! syntax/sql.vim

"syn region ellaScript start="[a-zA-Z]\+" end=";" contains=@ellaTop,@ellaBlock
"syn region ellaSQL start="[a-zA-Z]\+" end=";" contains=@sqlTop
"syn region ellaSimpleStatement start="\(var\|throw\|include\|import\|break\|continue\)" end=";" contains=@ellaTop,@ellaBlock
syn region ellaCompoundStatement matchgroup=Constant start="\(if\|else\|while\|try\|catch\|finally\|for\|fun\)" end="}" contains=@ellaTop,@ellaModeScript fold
"syn region ellaSQLStatement matchgroup=ellaStatement start="\<[sS][qQ][lL]\>" end=";" contains=@sqlTop
"syn region ellaScriptStatement start="\." end=";" contains=@ellaTop,@ellaBlock

"syn cluster ellaModeSQL contains=ellaBlock,ellaBlockSQL,ellaSQL,ellaSimpleStatement,ellaCompoundStatement,ellaSQLStatement,ellaScriptStatement
"syn cluster ellaModeScript contains=ellaBlock,ellaBlockSQL,ellaScript,ellaSimpleStatement,ellaCompoundStatement,ellaSQLStatement,ellaScriptStatement

syn cluster ellaModeSQL contains=ellaBlock,ellaBlockSQL,ellaCompoundStatement
syn cluster ellaModeScript contains=ellaBlock,ellaBlockSQL,ellaCompoundStatement

syn region ellaBlock matchgroup=Statement start="{" end="}" contains=@ellaModeScript fold
syn region ellaBlockSQL matchgroup=Identifier start="\<[sS][qQ][lL][ 	\n]*{" end="}" contains=@ellaModeSQL fold
