fun ifFunc (cond, trueBody) {
	if (cond()) {
		trueBody();
	}
	print("after ifFunc");
}

fun test() {
	.ifFunc({=> 1 == 1; }, {=> ifFunc({=> 2 == 2; }, {=> return 42; }); });
	print("after test");
}

.test();
