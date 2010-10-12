fun assert(actual, expected, msg) {
	if (expected != actual) {
		throw "assertion failed: @{msg}: expected=@{expected} actual=@{actual}";
	}
}

var a := [ 1, 2, 3 ];
.assert(a.filter { v => v < 3; }, [ 1, 2 ], 'Lst.filter failed');
