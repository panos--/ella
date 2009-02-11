\\set quotes=sql92;
select  q'Xoracle 'Xquoted@{foo} stringX' as foo, nq'{baz}' as bla, 'squot {foo}string' as bar, "dquot ""string" as qux from bar;
