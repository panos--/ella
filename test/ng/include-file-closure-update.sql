var inc := 'inc/include-file-closure-update.sql';

.includeFile(inc);

if (inner != 'inner') {
	throw 'inner not available';
}

.inner = 'inner-modified';

if (closure == null) {
	throw 'closure not available';
}

.closure(inner);
