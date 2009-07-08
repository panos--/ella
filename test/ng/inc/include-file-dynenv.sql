import java.net.*;

if (time1.equals(Calendar.instance.timeInMillis)) {
	throw 'dynamic env mixup in included file';
}

if ('a+b+c' != URLEncoder.encode('a b c')) {
	throw 'dynamic env mixup in included file (2)';
}
