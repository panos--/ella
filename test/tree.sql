\set quotes=mysql;
select `foo)bar`;
{
   \set quotes=sql92;      
   sql select foo;
}
select foo where `qux)baz`; -- here mysql mode must be active again
/*
\set quotes = mysql;

select * from foo where bar = `bla)blubb`;

{
    \set quotes = sql92;
    sql select * from foo where bar = `blablubb`;
}

select * from quz where baz = `foo)bar`;
*/
--select (foo), {}, [bla] from foo  ;

--.1.to(10, { i => print('num: @{i}'); });

/*
import java.util.*;

.print(new Date());
*/

/*
var @ := 'at';
var o := {
    @ = 'foo'
};

.print(o.@);

select * from foo;

sql {
    insert into foo;
}
*/

/*
var obj := {
    foo = fun (block) {
        . block('hello world!');
    }
};

. obj foo { msg => \echo msg='bin msg: @{msg}'; };
*/

/*
fun foo(block) {
    . block('hello world!');
}

. foo { msg => \echo msg='@{msg}'; };
*/

--. foo.bar { baz => . 1 + 1; };

--. foo() { => \echo msg='foo'; };

--. foo { bla => \echo msg='foo'; };


/*
. foo bla blubb bar baz;
. bla * foo + bar + baz * qux.fump * blubb;
*/

--select  q'Xoracle 'Xquoted@{foo} string@{bar}X';
--select $foo;bar$foo@{blablubb}bar$foobar$ from bar;
--\\set quotes=pg;
--select $$fooo$$ from bar;
/* foo /* bar */ bla /* blubb /* baz */ */ */
/*
\\set quotes = pg;
select $foo$foo@{bar$foo$ from bar;
*/