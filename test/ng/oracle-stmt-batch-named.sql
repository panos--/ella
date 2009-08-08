include 'inc/oracle-init.sql';

var vrfyConn := ConnMgr.createFromProps(ARGV[0]);

fun insert(val) {
	populate([val]);
}

try {
	.runTest() {=>
		(sql insert into tmp_test (id, val) values (tmp_seq.nextval, :val)).batchNamed(3) { batch =>
			batch.add({ val: 'foo' });
			batch.add({ val: 'bar' });
			vrfyConn.do {=>
				if (!matchResult((sql select val from tmp_test), [])) {
					throw 'Batch statements executed too early';
				}
			};
			batch.add({ val: 'baz' });
			vrfyConn.do {=>
				if (!matchResult((sql select val from tmp_test order by id), ['foo', 'bar', 'baz'])) {
					throw 'Batch statements not executed as expected';
				}
			};
			batch.add({ val: 'qux' });
		};
		if (!matchResult((sql select val from tmp_test order by id), ['foo', 'bar', 'baz', 'qux'])) {
			throw 'Batch run not finished correctly';
		}
	};
} finally {
	vrfyConn.close();
}
