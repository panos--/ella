fun foo() {
    try {
		if (true) {
	        return 42;
		}
		print('foo');
		return 7;
    } finally {
        23;
    }
}

if (foo() != 42) {
	throw 'try-finally-return error 1';
}

fun bar() {
	.1.to(3) { i =>
		print("i: @{i}");
		if (i == 2) {
			try {
				print('returning ' + i);
			} finally {
				return i;
			}
		}
	};
	print('and now ' + 24);
	return 24;
}
if (bar() != 2) {
	throw 'try-finally-return error 2';
}
