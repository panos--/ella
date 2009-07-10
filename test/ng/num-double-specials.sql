if (1.isNaN()) {
	throw '1.isNaN() should not be true';
}

var nan := 0 / 0.0;

if (!nan.isNaN()) {
	throw 'nan.isNaN should be true';
}

if (nan < 1) {
	throw 'nan < 1 should be false';
}

if (1 < nan) {
	throw '1 < nan should be false';
}

if (nan < nan) {
	throw 'nan < nan should be false';
}

if (nan == nan) {
	throw 'nan == nan should be false';
}

if (!(nan != nan)) {
	throw 'nan != nan should be true';
}

if (nan === nan) {
	throw 'nan === nan should be false';
}

if (!(nan !== nan)) {
	throw 'nan !== nan should be true';
}

if (!(1 < 1.23)) {
	throw '1 < 1.23 should be true';
}
