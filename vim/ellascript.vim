if version < 508
  command! -nargs=+ EllaHiLink hi link <args>
else
  command! -nargs=+ EllaHiLink hi def link <args>
endif

syn case match

syn match ellaIdentifier "[a-zA-Z_][a-zA-Z0-9_]*" contained

syn keyword ellaStatement sql SQL return exit
syn keyword ellaConditional if else break continue
syn keyword ellaRepeat while
syn keyword ellaException try catch finally throw
syn keyword ellaInclude include import as
syn keyword ellaBoolean true false
syn keyword ellaConstant null
syn keyword ellaTypedef this super
syn keyword ellaOperator new

syn keyword ellaRepeat for nextgroup=ellaIdentifier skipwhite skipempty
syn keyword ellaStorageClass var fun nextgroup=ellaIdentifier skipwhite skipempty

syn region ellaSingleQuoteString matchgroup=String start="'" end="'"
syn region ellaDoubleQuoteString matchgroup=String start=/"/ end=/"/

syn cluster ellaConstants contains=ellaSingleQuoteString,ellaDoubleQuoteString

EllaHiLink ellaStatement Statement
EllaHiLink ellaConditional Conditional
EllaHiLink ellaRepeat Repeat
EllaHiLink ellaException Exception
EllaHiLink ellaInclude Include
EllaHiLink ellaBoolean Boolean
EllaHiLink ellaConstant Constant
EllaHiLink ellaTypedef Typedef
EllaHiLink ellaOperator Operator
EllaHiLink ellaStorageClass StorageClass
EllaHiLink ellaIdentifier Identifier
EllaHiLink ellaSingleQuoteString String
EllaHiLink ellaDoubleQuoteString String
