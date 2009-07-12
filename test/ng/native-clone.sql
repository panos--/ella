var aInit := null;
var bInit := null;
var cInit := null;

var a := {
	a: 'a',
	cloneInit: fun() {
		aInit = 1;
	}
};

var b := {
	parent: a,
	b: 'b',
	cloneInit: fun() {
		super.cloneInit();
		bInit = 2;
	}
};


var cThis;

var c := {
	parent: b,
	c: 'c',
	cloneInit: fun() {
		super.cloneInit();
		cThis = this;
		cInit = 3;
	}
};

var d := c.clone();

if (c !== d.parent) {
	throw 'cloned object not parent of clone';
}

if (cInit != 3) {
	throw 'c.cloneInit not triggered during clone() call';
}

if (bInit != 2) {
	throw 'b.cloneInit not triggered during clone() call';
}

if (aInit != 1) {
	throw 'a.cloneInit not triggered during clone() call';
}

if (cThis !== d) {
	throw 'c.cloneInit called in wrong context';
}

var A := {};

var B := A.clone();

if (B.parent !== A) {
	throw 'B.parent !== A: clone object not parent clone';
}
