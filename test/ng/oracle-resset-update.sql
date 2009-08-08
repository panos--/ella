include 'inc/oracle-init.sql';

.runTest() {=>
	populate(['foo', 'bar', 'qux']);
	sql select * from tmp_test;
	(sql select * from tmp_test).each { row =>
		if (row['val'] != 'bar') {
			continue;
		}
		row.update { urow =>
			urow['val'] = 'blubb';
		};
	};
	sql select * from tmp_test;
};
