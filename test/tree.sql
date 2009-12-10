select * from foo where bar = "foo)bla";

\set quotes=mysql;
select * from foo where bar = `foo)bla`;


\set quotes=ora;
select q'{@{x}'xx@'}';
select q'Xfoo')barX';
select q''foo'bar'';  


\set quotes=pg;
select $x$foo$y$bar$x$;

