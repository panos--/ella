var outer := 'outer';

var inc := 'inc/include-file.sql';
.includeFile(inc);

if (inner != 'inner') {
	throw 'inner var not available in including script';
}

.inner = 'inner-modified';

if (inner != 'inner-modified') {
	throw 'inner var not updatable from including script';
}
