include 'inc/oracle-init.sql';

.runTest() {=>
	ConnMgr.withPrepared {=>
		var stmt := sql insert into tmp_test (id, val) values (tmp_seq.nextval, :val);
		stmt.withNamed({ val: 'foo' }).exec()
		    .withNamed({ val: 'bar' }).exec()
		    .withNamed({ val: 'baz' }).exec()
		    .withNamed({ val: 'qux' }).exec();
	};
	if (!matchResult((sql select val from tmp_test order by id), ['foo', 'bar', 'baz', 'qux'])) {
		throw 'Batch run not finished correctly';
	}
};
