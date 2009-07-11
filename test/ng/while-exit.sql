var x := 0;
while (x < 10) {
	x = x + 1;
	print("x=@{x}");
	if (x > 5) {
		exit 42;
		continue;
	}
	print("foo");
}
