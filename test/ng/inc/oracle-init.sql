.ConnMgr.createFromProps(ARGV[0]);

try {
	sql drop table tmp_test;
} catch (e) {
	print(e);
}

try {
	sql drop sequence tmp_seq;
} catch (e) {
	print(e);
}

create table tmp_test (
	id number(12, 0) primary key,
	val varchar2(255)
);
create sequence tmp_seq;

fun populate(data) {
	data.each { val =>
		sql insert into tmp_test (id, val) values (tmp_seq.nextval, '@{val}');
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
