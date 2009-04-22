. Sys.print('hello', 'world!');
exit;

fun loop(n) {
    if (n == 0) {
        return 0;
    }

    \echo msg='@{n}';
    return loop(n - 1);
}

.loop(3);
exit;

/*
var i := 0;

fun a() {
    var i = i + 1;
    \echo msg='ai: @{i}';
}

fun b() {
    \echo msg='bi: @{i}';
}

. a();
. b();
. a();
. b();
. a();
. b();

exit;
*/

var block := {=> \echo msg='inside block'; };

var i := 0;
. {=> var i = i + 1; . i != 4; } while {=> \echo msg='iter: @{i}'; };

exit;

fun foo(block) {
    \echo msg='before block call';
    . block('bla');
    \echo msg='after block call';
}

fun bar() {

    \echo msg='before foo call';
    . foo { msg => \echo msg='invoked block: @{msg}'; return 'result from block'; };
    \echo msg='after foo call';
}

var result := bar();
\echo msg='bar result: @{result}';

exit;

var obj := {
    foo = fun (block) {
        . block('hello world!');
    }
};

. obj foo { msg => \echo msg='bin msg: @{msg}'; };

exit;

fun foo(block) {
    . block('hello world!');
}

. foo { msg => \echo msg='@{msg}'; };

exit;

fun loop(n) {
    if (n == 0) {
        return 0;
    }

    -- \echo msg='@{n}';

    return loop(n - 1);
}

.loop(10000000);
exit;

/*
fun loop2(n) {
	return n == 0 ? 0 : loop2(n - 1);
}

.loop2(1000000);

exit;

fun fib(n) {
	fun fib-helper(f1, f2, i) {
		if  (i == n) {
			return f2;
		}
		return fib-helper(f1 = f2, f2 = f1 + f2, i = i + 1);
	}
	return fib-helper(f1 = 0, f2 = 1, i = 0);
}

var fib8 := fib(n = 18);
\echo msg='fib8: @{fib8}';

exit;

if (1 === 1) {
    \echo msg='mmm. yes!';
}

var a := { foo = 'bar' };
var b := a;

if (a === b) {
    \echo msg='yep!';
}

var c := {};
if (a === c) {
    \echo msg='ooops!';
}
else {
    \echo msg='alllright';
}

var foo := 1 + 2 + 3;
\echo msg='foo: @{foo}';
exit;

var foo := {
    init = fun() {},
    parent = {
        bar = fun() {
            \echo msg='bla.bar';
        }
    }
};

var bla := new foo();
var res := bla.bar();
\echo msg='@{res}';

exit;

var i := 1 + 1 - 1;
\echo msg='i: @{i}';

var foo := {
    + = fun(value) {
        \echo msg='adding @{value}';
    }
};

. foo + 'bla';
exit;

fun foo() {
    \echo msg='in fun foo()';
}

. foo();

var foofun := fun () {
    \echo msg='in foofun()';
};

. foofun();

var bla := {};
. bla.foo = fun () {
    \echo msg='in bla.foo()';
};
.bla.foo();

.bla.+ = fun () {
    \echo msg='in bla.+()';
};

.bla.+();

var z := 'zones';
var x := 'WILT';
select * from @{z} where zone_code = '@{x}';
exit;

\\set quotes=mysql;

--@describe(title = 'foo')
\echo msg='hello';

\\set quotes=mysql;
\echo msg='fooobar';

select  `select foo; select`  from bar;

var ClassA := {
    init = fun(arg) {
        \echo msg='in ClassA constructor';
        \echo msg='arg: @{arg}';
        . this.instVarA = 'inst var a';
    },
    classVarA = 'class var a'
};

var instA := new ClassA(arg = 'ctor arg');
\echo msg='instVarA:';
\echo msg=(instA.instVarA);
\echo msg='classVarA:';
\echo msg=(instA.classVarA);

exit;

fun test() {
    \echo msg='in fun test()';
}

. test();

var foo := {
    'foo' = 'bar',
    'bla' = 'blubb',
    'baz' = 'qux',
    testFunc = fun() {
        \echo msg='this.foo: ';
        \echo msg=(this.foo);
        \echo msg='in foo.testFunc()';
        return 'testFunc result';
    }
};

. foo.foo = 'bla';
\echo msg=(foo.foo);
\echo msg=(foo.testFunc());

exit;

.foo['bar']{'baz'}();
.foo[bar][bla ? baz : qux];
.foo.bla.blubb;
.foo['foo'].qux['baz']()['baz']['qux'].bla.blubb();
.(foo ? foo : bla).foo().qux().baz;
var qux = foo.baz(bla = 'blubb', qix = 'fump');

{
    \echo msg='foo';
};

var foo := { foo = 'bar', bla = 'blubb' };
var bla := foo ? { a = 'b' } : {};

exit;

fun rec(val) {
    if (val == 'xxx') {
        try {
            \echo msg='run 3 times. finishing.';
            return 'recursion result: @{val}';
        }
        finally {
            \echo msg='msg from the finally clause';
        }
    }

    {
        return rec(val = 'x@{val}');
    }

    \echo msg='fooo';
}

try {
    \echo msg=(rec(val = ''));
}
catch (ex) {
    \echo msg='caught exception: @{ex}';
}

exit;

fun echo(foo, bar) {
    \echo msg='foo=@{foo} bar=@{bar}';
}

/*
fun echo(bla) {
    \echo msg='bla=@{bla}';
}
*/

.echo(foo='foooo', bar='baaaaaar');

fun testfun(foo) {
    if (foo) {
        \echo msg='foo is true';
    }
    else {
        \echo msg='foo is false';
    }
}

.testfun(foo = false);
.testfun(foo = true);
.testfun(foo);
.testfun(!foo);

var foo = fun() {
    \echo msg='called foo';
};

.foo();
. false || foo();

var fump = (fun() {
    \echo msg='inline fun eval';
})();

if (fump) {
    \echo msg='fump is true';
}
else {
    \echo msg='fump is false';
}

var foo = fun() {
    \echo msg='called foo';
};

\echo msg='calling @foo()';
var qux = foo();

if (baz := false || foo()) {
    \echo msg='yes. baz is true';
}
else {
    \echo msg='no. baz is false';
}

if (baz = true || foo()) {
    \echo msg='baz is true as it should be.';
}


var x = y = z = 'def';
-- var c := d := e := 'asd';

\echo msg='x=@{x} y=@{y} z=@{z}';
-- \echo msg='c=@{c} d=@{d} e=@{e}';

fun bla() {
    \echo msg='ho!';
}

var f := fun() {
    \echo msg='in @fun';
};

var x := false;

fun foo() {
    if (!x) {
        \echo msg='x not set';
    	var x = true;
        .foo();
    	--\echo msg='x now: @{x}';
    	--var x = false;
    }
    else {
    	\echo msg='x is set!';
    }
}

.foo();
.foo();
.foo();

var ternTest = true ? 'terntrue' : 'ternfalse';
\echo msg='ternTest=@{ternTest}';
var ternTest2 = true && false ? 'terntrue' : 'ternfalse';
\echo msg='ternTest2=@{ternTest2}';

var a = 'a';
var x1 = !a;
var x2 = !!a;
var x3 = !y;
var x4 = !!y;
\echo msg='x1=@{x1}(false) x2=@{x2}(true) x3=@{x3}(true) x4=@{x4}(false)';

var boolNotTrue = !true;
var boolNotFalse = !false;

\echo msg='nottrue=@{boolNotTrue} notfalse=@{boolNotFalse}';

var boolTrue = true;
var boolFalse = false;
\echo msg='boolTrue=@{boolTrue} boolFalse=@{boolFalse}';

if (true) {
    \echo msg='true is true';
}
else {
    \echo msg='true is false';
}

if (false) {
    \echo msg='false is true';
}
else {
    \echo msg='false is false';
}

var a := 'a';
var b := 'a';
var c := 'c';

var bool1 = a == b;
\echo msg='bool1=@{bool1}';

var bool2 = a == c;
\echo msg='bool2=@{bool2}';

var bool3 = a == c || a == b;
\echo  msg='bool3=@{bool3}';

var bool4 = a == '@{b}';
\echo msg='bool4=@{bool4}';

if (bool4) {
    \echo msg='bool4 is true';
}
else {
    \echo msg='bool4 is false';
}

if (bool2) {
    \echo msg='bool2 is true';
}
else if (bool3 && a == c) {
    \echo msg='bool3 is true';
}
else {
    \echo msg='bool2 and bool3 are false';
}

var x = y = z = 'def';
var c := d := e := 'asd';

\echo msg='x=@{x} y=@{y} z=@{z}';
\echo msg='c=@{c} d=@{d} e=@{e}';

if (a = 'b') {
    \echo msg='assigned';
}

if (a && b == b) {
    \echo msg='a == b';
}

if ((a) && (b || a)) {
    \echo msg='aabb';
}
else if (b || a){
    \echo msg='foo';
}
else if (b || a && b || a || a) {
    \echo msg='bla';
}
else {
    -- select * from foobar;
}

if (a) {
    \echo msg='a';
}

if (a && b) {
    \echo msg='ab';
}

if ((a && b) || (a && b)) {
    \echo msg='abab';
}

var test := 'test: global scope';
\echo msg='global before: @{test}';
{
    \echo msg='inner block with outer var: @{test}';
    var test := 'test: inner scope';
    \echo msg='inner scope: @{test}';
}
\echo msg='global after: @{test}';

var foo = 'bla';
{
    var foo = 'bar';
    \hello foo=foo;
    \echo msg=foo;
    {
        \hello bla='@{foo}';
        \echo msg='@{foo}';
    }
}

var foobar = 'bla as';

var stmt = 'select @{foobar} foo from barbar';

--sql @stmt;

--select 'b@{foobar}la', foo from bar;
*/
