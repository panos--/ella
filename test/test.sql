{
    var x := [1,2,3,4,5];
    var sum := 0;
	x.each { idx, val =>
		if (idx == 3) {
			.print("break at idx @{idx}");
			break();
		}
		.print("@{idx}: @{val}");
		sum = sum + val;
	};
	if (sum != 6) {
	    throw 'failed - result=@{sum}';
    }
}