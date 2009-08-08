include 'inc/oracle-init.sql';

var vrfyConn := ConnMgr.createFromProps(ARGV[0]);

fun insert(val) {
	populate([val]);
}

try {
	.runTest() {=>
		(sql insert into tmp_test (id, val) values (tmp_seq.nextval, ?)).batch(3) { batch =>
			batch.add('foo');
			batch.add('bar');
			vrfyConn.do {=>
				if (!matchResult((sql select val from tmp_test), [])) {
					throw 'Batch statements executed too early';
				}
			};
			batch.add('baz');
			vrfyConn.do {=>
				if (!matchResult((sql select val from tmp_test order by id), ['foo', 'bar', 'baz'])) {
					throw 'Batch statements not executed as expected';
				}
			};
			batch.add('qux');
		};
		if (!matchResult((sql select val from tmp_test order by id), ['foo', 'bar', 'baz', 'qux'])) {
			throw 'Batch run not finished correctly';
		}
	};
} finally {
	vrfyConn.close();
}
