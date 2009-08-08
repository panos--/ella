include 'inc/oracle-init.sql';

.runTest() {=>
	var data := ['foo', 'bar', 'baz', 'qux'];
	data.each { val =>
		sql insert into tmp_test (id, val) values (tmp_seq.nextval, '@{val}');
	};
	var result := [];
	for (row : sql select * from tmp_test order by id) {
		result.add(row['val']);
	}

	if (result != data) {
		throw 'Data retrieved from DB does not match data stored in DB';
	}
};
