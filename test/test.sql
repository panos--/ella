var @z := 'zones';
var @x := 'WILT';
select * from @{z} where zone_code = '@{x}';
exit;

var @ClassA := {
    init = fun(arg) {
        \echo msg='in ClassA constructor';
        \echo msg='arg: @{arg}';
        . this.instVarA = 'inst var a';
    },
    classVarA = 'class var a'
};

var @instA := new @ClassA(arg = 'ctor arg');
\echo msg='instVarA:';
\echo msg=@instA.instVarA;
\echo msg='classVarA:';
\echo msg=@instA.classVarA;

exit;

fun test() {
    \echo msg='in fun test()';
}

. test();

var @foo := {
    'foo' = 'bar',
    'bla' = 'blubb',
    'baz' = 'qux',
    testFunc = fun() {
        \echo msg='this.foo: ';
        \echo msg=this.foo;
        \echo msg='in foo.testFunc()';
        return 'testFunc result';
    }
};

. @foo.foo = 'bla';
\echo msg=@foo.foo;
\echo msg=@foo.testFunc();

exit;

.@foo['bar']{'baz'}();
.@foo[@bar][@bla ? @baz : @qux];
.@foo.bla.blubb;
.@foo['foo'].qux['baz']()['baz']['qux'].bla.blubb();
.(@foo ? @foo : @bla).foo().qux().baz;
var @qux = @foo.baz(bla = 'blubb', qix = 'fump');

{
    \echo msg='foo';
};

var @foo := { foo = 'bar', bla = 'blubb' };
var @bla := @foo ? { a = 'b' } : {};

exit;

fun rec(val) {
    if (@val == 'xxx') {
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
    \echo msg=rec(val = '');
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
    if (@foo) {
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

var @foo = fun() {
    \echo msg='called foo';
};

.@foo();
. false || @foo();

var @fump = (fun() {
    \echo msg='inline fun eval';
})();

if (@fump) {
    \echo msg='fump is true';
}
else {
    \echo msg='fump is false';
}

var @foo = fun() {
    \echo msg='called foo';
};

\echo msg='calling @foo()';
var @qux = @foo();

if (@baz := false || @foo()) {
    \echo msg='yes. baz is true';
}
else {
    \echo msg='no. baz is false';
}

if (@baz = true || @foo()) {
    \echo msg='baz is true as it should be.';
}


var @x = @y = @z = 'def';
-- var @c := @d := @e := 'asd';

\echo msg='x=@{x} y=@{y} z=@{z}';
-- \echo msg='c=@{c} d=@{d} e=@{e}';

fun bla() {
    \echo msg='ho!';
}

var @fun := fun() {
    \echo msg='in @fun';
};

var @x := false;

fun foo() {
    if (!@x) {
        \echo msg='x not set';
    	var @x = true;
        .foo();
    	--\echo msg='x now: @{x}';
    	--var @x = false;
    }
    else {
    	\echo msg='x is set!';
    }
}

.foo();
.foo();
.foo();

var @ternTest = true ? 'terntrue' : 'ternfalse';
\echo msg='ternTest=@{ternTest}';
var @ternTest2 = true && false ? 'terntrue' : 'ternfalse';
\echo msg='ternTest2=@{ternTest2}';

var @a = 'a';
var @x1 = !@a;
var @x2 = !!@a;
var @x3 = !@y;
var @x4 = !!@y;
\echo msg='x1=@{x1}(false) x2=@{x2}(true) x3=@{x3}(true) x4=@{x4}(false)';

var @boolNotTrue = !true;
var @boolNotFalse = !false;

\echo msg='nottrue=@{boolNotTrue} notfalse=@{boolNotFalse}';

var @boolTrue = true;
var @boolFalse = false;
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

var @a := 'a';
var @b := 'a';
var @c := 'c';

var @bool1 = @a == @b;
\echo msg='bool1=@{bool1}';

var @bool2 = @a == @c;
\echo msg='bool2=@{bool2}';

var @bool3 = @a == @c || @a == @b;
\echo  msg='bool3=@{bool3}';

var @bool4 = @a == '@{b}';
\echo msg='bool4=@{bool4}';

if (@bool4) {
    \echo msg='bool4 is true';
}
else {
    \echo msg='bool4 is false';
}

if (@bool2) {
    \echo msg='bool2 is true';
}
else if (@bool3 && @a == @c) {
    \echo msg='bool3 is true';
}
else {
    \echo msg='bool2 and bool3 are false';
}

var @x = @y = @z = 'def';
var @c := @d := @e := 'asd';

\echo msg='x=@{x} y=@{y} z=@{z}';
\echo msg='c=@{c} d=@{d} e=@{e}';

if (@a = 'b') {
    \echo msg='assigned';
}

if (@a && @b == @b) {
    \echo msg='a == b';
}

if ((@a) && (@b || @a)) {
    \echo msg='aabb';
}
else if (@b || @a){
    \echo msg='foo';
}
else if (@b || @a && @b || @a || @a) {
    \echo msg='bla';
}
else {
    -- select * from foobar;
}

if (@a) {
    \echo msg='a';
}

if (@a && @b) {
    \echo msg='ab';
}

if ((@a && @b) || (@a && @b)) {
    \echo msg='abab';
}

var @test := 'test: global scope';
\echo msg='global before: @{test}';
{
    \echo msg='inner block with outer var: @{test}';
    var @test := 'test: inner scope';
    \echo msg='inner scope: @{test}';
}
\echo msg='global after: @{test}';

var @foo = 'bla';
{
    var @foo = 'bar';
    \hello foo=@foo;
    \echo msg=@foo;
    {
        \hello bla='@{foo}';
        \echo msg='@{foo}';
    }
}

var @foobar = 'bla as';

var @stmt = 'select @{foobar} foo from barbar';

--sql @stmt;

--select 'b@{foobar}la', foo from bar;
