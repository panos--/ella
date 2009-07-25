var caught := null;

try {
	.1.&&(2);
} catch (e) {
	caught = e;
}

if (caught == null) {
	throw 'Invalid type not detected';
}
else {
	print('Successfully caught type check exception: ' + caught);
	42;
}
