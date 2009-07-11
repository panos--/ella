var x := 'test';

if ('@' + '{x}' != '@{x}') {
	throw 'variable incorreclty substituted in single quoted string';
}

if ("@{x}" == "@" + "{x}") {
	throw 'variable in double quoted string not substituted as it should';
}
