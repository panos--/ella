var inc := 'inc/include-file-nested-1.sql';

var result := includeFile(inc);

if (42 != result) {
	throw 'unexpected value returned from include file: @{result}';
}
