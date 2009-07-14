var j := 0;

for (i : 1 range 3) {
	print("i=@{i}");
	j = i;
}

if (j != 3) {
	throw 'range not iterated';
}

.j = 0;
.2 range 4 each { k =>
	print("k=@{k}");
	j = k;
};

if (j != 4) {
	throw 'range 2 not iterated';
}

.j = 0;
.(3 range 5).each { m =>
	print("m=@{m}");
	j = m;
};

if (j != 5) {
	throw 'range 3 not iterated';
}

-- TODO: Does not work
--.2 .. 4.each { k =>
--	print("k=@{k}");
--};
