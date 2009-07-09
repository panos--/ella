--.print('inner2: ' + scriptName());

var nameInner2 := scriptName();
var expectedInner2 := 'include-file-nested-resource-2.sql';
if (expectedInner2 != nameInner2) {
	throw 'filename does not match: expected=@{expectedInner2} got=@{nameInner2}';
}

return 42;
