\set quotes=mysql;
sql select * from foo where bla = :blubb and baz = 42::real or a: b:;
select * from foo where bar = `bla)blubb`;
select * from quz where baz = `foo)bar`;
