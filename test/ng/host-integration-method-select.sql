import org.unbunt.sqlscript.testng.*;

fun assert(expected, actual) {
	if (expected != actual) {
		throw "wrong method called: expected=@{expected} actual=@{actual}";
	}
}

var test := new MethodSelectTest();

.assert(test.foo(1), 'foo(long)');
.assert(test.foo(1.toByte()), 'foo(byte)');
.assert(test.foo('s'), 'foo(String)');
.assert(test.foo.select('byte').call(test, 1), 'foo(byte)');
.assert(test.foo.select('String').call(test, 's'), 'foo(String)');

import java.util.Date as UtilDate;
import java.util.Calendar;

var SQLDate := new JClass('java.sql.Date');

.assert(test.baz.select('java.util.Date').call(test, new UtilDate()), 'baz(java.util.Date)');
.assert(test.baz.select('java.sql.Date').call(test, new SQLDate(0)), 'baz(java.sql.Date)');

.assert(test.bar(Calendar.instance), 'bar(Calendar)');
.assert(test.bar(new UtilDate()), 'bar(Date)');
