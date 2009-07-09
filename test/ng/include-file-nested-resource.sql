var inc := 'inc/include-file-nested-resource-1.sql';

var expected := 'include-file-nested-resource.sql';

--.print('outer before - script: ' + scriptName());

var nameBefore := scriptName();

if (expected != nameBefore) {
	throw 'filename does not match: expected=@{expected} got=@{nameBefore}';
}

fun func() {
	var closure := {=>
		.includeFile(inc);
	};
	closure();
}

.func();

--.print('outer after - script: ' + scriptName());

var nameAfter := scriptName();

if (expected != nameAfter) {
	throw 'filename does not match: expected=@{expected} got=@{nameAfter}';
}
