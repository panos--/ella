-- TODO: turn into real unit test

var obj := {
	foo: 'foooo',
	bar: 'baaar'
};

var dict := new Dict(obj);

for (k,v : dict) {
	print("k=@{k} v=@{v}");
}

.dict['foo'] = 'f0000';
.dict['qux'] = 'quuux';
.print(dict['bar']);

for (k,v : dict) {
	print("k=@{k} v=@{v}");
}

import java.util.Date;

var dateDict := new Dict(new Date());

for (k,v : dateDict) {
	print("k=@{k} v=@{v}");
}

var objDict := obj.toDict();
for (k,v : objDict) {
	print("k=@{k} v=@{v}");
}

-- And now for the real unit tests...

fun assert(actual, expected, msg) {
	if (expected != actual) {
		throw "assertion failed: @{msg}: expected=@{expected} actual=@{actual}";
	}
}

{
    var d;

    var d = new Dict();
    assert(d.size(), 0, 'd.size(), 0');
    d['foo'] = 'bar';
    d['baz'] = 'qux';
    assert(d.size(), 2, 'd.size(), 2');
    d['bla'] = 'fasel';
    assert(d.size(), 3, 'd.size(), 3');
    print('dict tests passed');
}
