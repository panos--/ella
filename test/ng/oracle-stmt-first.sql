include 'inc/oracle-init.sql';

.runTest() {=>
	populate(['foo', 'bar', 'qux']);
	var firstRow := (sql select * from tmp_test order by id).first();
	if ('foo' != firstRow.VAL) {
		throw 'Retrieval of first row did not return expected data';
	}
};
