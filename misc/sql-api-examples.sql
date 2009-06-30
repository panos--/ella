/*
 * Conn create
 */
var newConn := Conn.create(...);

newConn.do {
	Conn.tx {
		// ...
	}
}

newConn.close();

/*
 * Conn create / loan
 */
Conn.create(...) {
	// same as create, do, close
}

/*
 * Conn use active
 */
Conn.tx {
	// ...
}

/*
 * Conn get active
 */
var activeConn := Conn.active;

/*
 * Conn resend to active
 */
Conn.close();

/*
 * Conn metadata
 */
Conn.metadata;

/*
 * SQL-Statement
 */
select * from foo;

/*
 * SQL-Statement embedded vars
 *
 * SQLLiteralExpression (analog zu StringLiteralExpression)
 */
select * from foo where bar = '@{qux}';

/*
 * SQL-Expression (equivalent)
 */
(sql select * from foo).do();

/*
 * ResultSet iteration
 */
(sql select * from foo).each { baz, qux =>
	println("baz: @{baz}; qux: @{qux}");
}
(sql select * from foo).eachRow { row =>
	println("baz: @{row.baz}; qux: @{row.qux}");
}
-- XXX: Index-basierter Zugriff und Slot-basierter Zugriff gleichzeitig
(sql select * from foo).eachRow { row, meta =>
	println("baz: @{row[0]}; qux: @{row[1]}");
	meta.columns.each { idx, name =>
		println("column @{idx}: @{name}");
	}
}

/*
 * Paramed SQL-Expression
 */
(sql select * from foo where bar = ?).with(42).do();
(sql select * from foo where bar = ?).with(42).each { baz, qux =>
	-- ...
}

/*
 * Paramed SQL-Expression - Reuse
 */
(sql select * from foo where bar = ?).withPrepared { stmt =>
	[1,2,3].each { i =>
		stmt.with(i).do();
	}
}

/*
 * Paramed SQL-Expression - Batch
 */
-- NOTE: default size: 10 explicit size: batch(23) { ... }
(sql insert into foo (baz) values (?)).batch { batch =>
	[1,2,3].each { i =>
		batch.add(i);
	}
}

/*
 * Paramed SQL-Expression - Reuse multiple
 */
Conn.withPrepared {
	var stmt1 := sql select * from foo where bar = ?;
	var stmt2 := sql insert into bla (baz) values (?);
	[1,2,3].each { i =>
		stmt1.with(i).each { qux =>
			stmt2.with(qux).do();
		}
	}
}

/*
 * Paramed SQL-Expression - Batch multiple
 */
-- NOTE: default size: 10 explicit size: batch(23) { ... }
Conn.batch {
	[1,2,3].each { i =>
		sql insert into foo (bar) values (@{i});
	}
}

/*
 * TODO:
 * - multiple result sets
 * - auto generated keys
 * - procedure calls
 /
