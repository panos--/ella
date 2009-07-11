fun assert(actual, expected, msg) {
	if (expected != actual) {
		throw "assertion failed: @{msg}: expected=@{expected} actual=@{actual}";
	}
}

var x := [1, 2, 3];

{
	assert(x.get(0), 1, 'x.get(0), 1');
	assert(x.get(1), 2, 'x.get(1), 2');
	assert(x.get(2), 3, 'x.get(2), 3');

	assert(x[0], 1, 'x[0], 1');
	assert(x[1], 2, 'x[1], 2');
	assert(x[2], 3, 'x[2], 3');

	assert(x.set(0, 42), 42, 'x.set(0, 42), 42');
	assert(x.get(0), 42, 'x.get(0), 42');
	assert(x[0], 42, 'x[0], 42');

	assert(x.size(), 3, 'x.size(), 3');
	assert(x.add(23), x, 'x.add(23), x');
	assert(x.size(), 4, 'x.size(), 4');
	assert(x[3], 23, 'x[3], 23');

	assert(x.remove(3), 23, 'x.remove(3), 23');
	assert(x.size(), 3, 'x.size(), 3');
	assert(x.add(23), x, 'x.add(23), x');

	assert(x[3], 23, 'x[3], 23');
	assert(x[3] = 4, 4, 'x[3] = 4, 4');

	assert(x[0] = 1, 1, 'x[0] = 1, 1');

	assert(x == x, true, 'x == x, true');
	assert(x === x, true, 'x === x, true');
	assert(x != x, false, 'x != x, false');
	assert(x !== x, false, 'x !== x, false');

	var sum := 0;
	assert(x.each { val => sum = sum + val; }, 10, 'x.each { val => sum = sum + val; }, 10');
	assert(sum, 10, 'sum, 10');

	sum = 0;
	x.add(5);
	x.each { idx, val =>
		if (idx == 3) {
			break();
		}
		sum = sum + val;
	};
	assert(sum, 6, 'sum, 6');

	assert([1,2,3][1], 2, '[1,2,3][1], 2');
	assert([1,2,3].size(), 3, '[1,2,3].size(), 3');

	x;
}
