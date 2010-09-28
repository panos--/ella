fun assert(actual, expected, msg) {
	if (expected != actual) {
		throw "assertion failed: @{msg}: expected=@{expected} actual=@{actual}";
	}
}

{
    var lf := Str.fromCharCode(10);
    assert(Str.lf, lf, 'Str.lf == lf');

    var cr := Str.fromCharCode(13);
    assert(Str.cr, cr, 'Str.cr == cr');

    var crlf := Str.fromCharCode(13) + Str.fromCharCode(10);
    assert(Str.crlf, crlf, 'Str.crlf == crlf');

    import java.lang.System;
    var nl := System.getProperty('line.separator');
    assert(Str.nl, nl, 'Str.nl == nl');
}
