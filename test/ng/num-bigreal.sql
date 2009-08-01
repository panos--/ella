var x := BigReal.valueOf('1');
var y := x / 3;
var z := BigReal.valueOf('0.33333333333333333333333333333333');

if (y !== z) {
	throw "Division of BigReal / Num (1 / 3) returned incorrect result: @{y} - Expected: @{z}";
}

.'success';
