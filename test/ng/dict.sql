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
