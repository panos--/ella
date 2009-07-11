var innerInc := 'include-file-nested-resource-2.sql';

var expectedInner := 'include-file-nested-resource-1.sql';

-- Intentionally calling Sys.print instread of just print.
-- Triggered a bug with scope generation.
.Sys.print('inner before: ' + scriptName());

var nameInnerBefore := scriptName();

if (expectedInner != nameInnerBefore) {
	throw "filename does not match: expected=@{expectedInner} got=@{nameInnerBefore}";
}

.includeFile(innerInc);

throw 'this should not be reached';
