if (1 == 1 && 2 == 2) {
	print('yes');
}
else {
	print('no');
}

fun retTrue(msg) {
	print(msg);
	return true;
}

fun retFalse(msg) {
	print(msg);
	return false;
}

fun retNull(msg) {
	print(msg);
	return null;
}

fun retObj(msg) {
	print(msg);
	return {};
}

if (retTrue('a') || retFalse('b')) {
	print('yep');
}

if (retNull('a') && retTrue('b')) {
	print('yep');
}

if (retNull('a') || retTrue('b')) {
	print('yep');
}

if (retObj('a') || retFalse('b')) {
	print('yep');
}

if (retObj('a') && (retFalse('b') || retTrue('c'))) {
	print('yep');
}

if (1) {
	print('yep');
}

if (null) {
	print('nope');
}
else {
	print('yessss');
}
