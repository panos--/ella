var inner := 'inner';

var closure := fun (modifiedInner) {
	if (modifiedInner != inner) {
		throw 'inner not updated in closure';
	}
};
