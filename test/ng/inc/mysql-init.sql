.ConnMgr.createFromProps(ARGV[0]);

try {
	sql drop table tmp_test;
} catch (e) {
	print(e);
}

create table tmp_test (
	id int primary key auto_increment,
	val varchar(255)
);

fun populate(data) {
	data.each { val =>
		sql insert into tmp_test (val) values ('@{val}');
	};
}

fun matchResult(stmt, data) {
	var result := [];
	stmt.each { row =>
		result.add(row[1]);
	};
	return data == result;
}

fun runTest(test) {
	try {
		test();
	} finally {
		ConnMgr.close();
	}
}
