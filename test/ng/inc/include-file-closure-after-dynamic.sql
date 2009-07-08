var inner := 'inner';

import java.util.*;

var closure := fun (modifiedInner) {
	if (modifiedInner != inner) {
		throw 'inner not updated in closure';
	}
};
