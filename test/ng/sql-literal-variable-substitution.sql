.Conn.createFromProps(ARGV[0]);

var value := 'foo';
var stmt := sql select * from foo where bar = 'abc->@{value}<-def';
var queryStr := stmt.getQueryString();
var expected := 'select * from foo where bar = ''abc->foo<-def''';
if (queryStr != expected) {
	print('queryStr: @{queryStr}');
	print('expected: @{expected}');
	throw 'subst1 failed';
}

var value = 'foo''bar';
var stmt = sql select * from foo where bar = 'abc->@{value}<-def';
var queryStr = stmt.getQueryString();
var expected = 'select * from foo where bar = ''abc->foo''''bar<-def''';
if (queryStr != expected) {
	print('queryStr: @{queryStr}');
	print('expected: @{expected}');
	throw 'subst2 failed';
}

var value = 'foo`bar';
-- NOTE: Here we check for a lexer bug with the single at-sign
var stmt = sql select @ @foo `foo@{value}bar`;
var queryStr = stmt.getQueryString();
var expected = 'select @ @foo `foofoo`barbar`';
if (queryStr != expected) {
	print('queryStr: @{queryStr}');
	print('expected: @{expected}');
	throw 'subst3 failed';
}

\set quotes=mysql;

var value = 'foo`bar';
var stmt = sql select `foo@{value}bar`;
var queryStr = stmt.getQueryString();
var expected = 'select `foofoo``barbar`';
if (queryStr != expected) {
	print('queryStr: @{queryStr}');
	print('expected: @{expected}');
	throw 'subst4 failed';
}

var value = 'foo`bar';
var stmt = sql select @{value};
var queryStr = stmt.getQueryString();
var expected = 'select foo`bar';
if (queryStr != expected) {
	print('queryStr: @{queryStr}');
	print('expected: @{expected}');
	throw 'subst5 failed';
}

var stmt = sql select '@}', '@{}', '@@', '@{';
var queryStr = stmt.getQueryString();
var expected = 'select ''@}'', ''@'', ''@@'', ''@{''';
if (queryStr != expected) {
	print('queryStr: @{queryStr}');
	print('expected: @{expected}');
	throw 'subst6 failed';
}
