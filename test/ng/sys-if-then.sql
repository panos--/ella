{
	var x;

	x = Sys.ifThen(
		1 == 1,
		{=> print('yes, 1 == 1'); 'true-branch'; },
		{=> print('what? 1 != 1?'); 'false-branch'; }
	);

	print("branch chosen: @{x}");

	x = Sys.ifThen(
		2 != 2,
		{=> print('what? 2 != 2?'); 'true-branch'; },
		{=> print('yes, 2 != 2'); 'false-branch'; }
	);

	print("branch chosen: @{x}");
}
