.ConnMgr.createFromProps(ARGV[0]);

\set quotes=mysql;

drop table if exists txtest1;

create table txtest1 (
	id int not null primary key auto_increment,
	`key` varchar(255) not null,
	`val` varchar(255) not null
) engine=innodb;

var exCaught := false;
try {
	ConnMgr.tx {=>
		sql insert into txtest1 (`key`, `val`) values ('a', 'b');
		throw 'aborting transaction';
	};
} catch (e) {
	if (e == 'aborting transaction') {
		exCaught = true;
	}
	else {
		throw 'Wrong transaction caught: ' + e;
	}
}

if (!exCaught) {
	throw 'No exception thrown...';
}

for (row : sql select count(*) as c from txtest1) {
	if (row['c'] != 0) {
		var count := row['c'];
		throw "Transaction must have been commited when it should have been rolled back " +
			"- count=@{count}";
	}
}

.ConnMgr.tx {=>
	sql insert into txtest1 (`key`, `val`) values ('a', 'b');
};

for (row : sql select count(*) as c from txtest1) {
	if (row['c'] != 1) {
		var count := row['c'];
		throw "Transaction must have been rolled back when it should have been committed " +
			"- count=@{count}";
	}
}

select * from txtest1;
