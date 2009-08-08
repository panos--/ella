include 'inc/mysql-init.sql';

.runTest() {=>
	populate(['foo', 'bar', 'qux']);
	(sql select * from tmp_test).each { row =>
		if (row['val'] != 'bar') {
			continue;
		}
		row.insert { urow =>
			urow['val'] = 'blubb';
		};
	};
	if (!matchResult((sql select val from tmp_test order by id), ['foo', 'bar', 'qux', 'blubb'])) {
		throw 'ResSet update did not lead to expected results';
	}
};
