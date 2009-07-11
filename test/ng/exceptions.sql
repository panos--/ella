var ex1 := null;
var finally1 := null;
try {
	throw 'exception1';
} catch (e) {
	ex1 = e;
	print("exception1 caught: @{e}");
} finally {
	finally1 = 42;
	print("exception1 finally...");
}

if ('exception1' != ex1) {
	throw 'exception1 not caught';
}

if (42 != finally1) {
	throw 'finally1 not processed';
}

var ex2 := null;
try {
	[][2]; -- provoke IndexOutOfBoundsException
} catch (e) {
	print("host exception caught: @{e}");
	--print("stack trace:");
	--e.printStackTrace();
	ex2 = e;
}

if (null === ex2) {
	throw 'host exception not caught';
}

var finally3 := null;

try {
} finally {
	finally3 = 42;
}

if (42 != finally3) {
	throw 'finally3 not processed';
}

var ex4 := null;
var finally4 := null;

try {
	try {
		throw 'exception4';
	} finally {
		finally4 = 42;
	}
} catch (e) {
	ex4 = e;
}

if ('exception4' != ex4) {
	throw 'exception4 not caught';
}

if (42 != finally4) {
	throw 'finally4 not processed';
}

throw 'intentionally-uncaught-exception';
