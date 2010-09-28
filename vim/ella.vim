" au BufRead,BufNewFile *.ella.sql setfiletype ella
" au BufRead,BufNewFile *.ella.sql set syntax=ella
" au BufRead,BufNewFile *.ella.sql set cindent cino=(1s smartindent autoindent ts=4 sw=4

if exists("b:current_syntax")
  finish
endif

runtime! syntax/ellascript.vim
runtime! syntax/sql.vim

let b:current_syntax = "ella"
