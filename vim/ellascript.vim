if version < 508
  command! -nargs=+ EllaHiLink hi link <args>
else
  command! -nargs=+ EllaHiLink hi def link <args>
endif

syn case match

syn keyword ellaStatement sql SQL return exit
syn keyword ellaConditional if else break continue
syn keyword ellaRepeat for while
syn keyword ellaException try catch finally throw
syn keyword ellaInclude include import as
syn keyword ellaBoolean true false
syn keyword ellaConstant null
syn keyword ellaTypedef this super
syn keyword ellaOperator new
syn keyword ellaStorageClass var fun

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
