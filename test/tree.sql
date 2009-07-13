\set linesep = slash;

select foo ; foo ; bar
/

\set linesep = semi;
insert into bar;
select bla;