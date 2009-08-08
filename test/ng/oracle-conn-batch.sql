include 'inc/oracle-init.sql';

var vrfyConn := ConnMgr.createFromProps(ARGV[0]);

fun insert(val) {
	populate([val]);
}

try {
	.runTest() {=>
		ConnMgr.batch(3) { =>
			insert('foo');
			insert('bar');
			vrfyConn.do {=>
				if (!matchResult((sql select val from tmp_test), [])) {
					throw 'Batch statements executed too early';
				}
			};
			insert('baz');
			vrfyConn.do {=>
				if (!matchResult((sql select val from tmp_test order by id), ['foo', 'bar', 'baz'])) {
					throw 'Batch statements not executed as expected';
				}
			};
			insert('qux');
		};
		if (!matchResult((sql select val from tmp_test order by id), ['foo', 'bar', 'baz', 'qux'])) {
			throw 'Batch run not finished correctly';
		}
	};
} finally {
	vrfyConn.close();
}
