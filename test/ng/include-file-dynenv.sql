var inc := 'inc/include-file-dynenv.sql';

var time1;

import java.util.*;

.time1 = Calendar.instance.timeInMillis;

.includeFile(inc);

var time2 := Calendar.instance.timeInMillis;
if (time1 == time2) {
	throw 'dynamic env mixed up';
}
if ('d+e+f' != URLEncoder.encode('d e f')) {
	throw 'dynamic env from included file not available';
}
