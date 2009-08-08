include 'inc/oracle-init.sql';

.runTest() {=>
	ConnMgr.withPrepared {=>
		var stmt := sql insert into tmp_test (id, val) values (tmp_seq.nextval, ?);
		stmt.with('foo').exec()
		    .with('bar').exec()
		    .with('baz').exec()
		    .with('qux').exec();
	};
	if (!matchResult((sql select val from tmp_test order by id), ['foo', 'bar', 'baz', 'qux'])) {
		throw 'Batch run not finished correctly';
	}
};
