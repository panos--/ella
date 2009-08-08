include 'inc/mysql-init.sql';

.runTest() {=>
	var key := (sql insert into tmp_test (val) values ('foo')).key();
	if (key != 1) {
		throw 'Invalid auto-generated key retrieved';
	}
};
