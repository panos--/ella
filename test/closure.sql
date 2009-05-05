{

fun ifFunc (cond, trueBody) {
	if (cond()) {
		trueBody();
	}
	return 13;
}

fun test() {
	ifFunc({=> 1 == 1; }, {=> ifFunc({=> 2 == 2; }, {=> return 42; }); });
	return 23;
}

test();

}
