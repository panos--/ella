if exists("b:current_syntax")
  finish
endif

if version < 508
  command! -nargs=+ TestHiLink hi link <args>
else
  command! -nargs=+ TestHiLink hi def link <args>
endif

syn region testBlock matchgroup=Statement start="{" end="}" contains=@testBlocks fold
syn region testFooBlock matchgroup=Identifier start="\<foo[ 	\n]\+{" end="}" contains=@testBlocks fold
syn region testBarBlock matchgroup=Constant start="\<bar[ 	\n]\+{" end="}" contains=@testBlocks fold

syn cluster testBlocks contains=testBlock,testFooBlock,testBarBlock

TestHiLink testBlock Statement
TestHiLink testFooBlock Identifier
TestHiLink testBarBlock Constant
