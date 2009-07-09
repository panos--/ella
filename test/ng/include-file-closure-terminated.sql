var inc := 'inc/include-file-closure-terminated.sql';

var test := 'initial';

fun func() {
	var closure := {=>
		.includeFile(inc);
	};
	closure();
}

var result := func();

if ('initial' != test) {
	throw 'dynamic environment added in includeFile() inspite of closure return';
}

if (42 != result) {
	throw 'incorrect return value from included file';
}
