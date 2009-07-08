.Conn.withPrepared { =>
	var ins := sql insert into test (val) values (?);
	var sel := sql select * from test where id = :id;

	var id;
	id = ins.with('foo1').key();
	sel.withNamed({ id: id }).do();
	id = ins.with('foo2').key();
	sel.withNamed({ id: id }).do();
	id = ins.with('foo3').key();
	sel.withNamed({ id: id }).do();
};
