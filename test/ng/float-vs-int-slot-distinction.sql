-- Here we test if slot access on integer numbers
-- is misinterpreted as floating point literal

var n := 0;
. 1.to(3) { i => n = n + 1; };
