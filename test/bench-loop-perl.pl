#!/bin/perl

use strict;
use warnings;

my $start = 1;
my $end = 10000000;

for my $i ($start..$end) {
	foo($i);
}

sub foo {
	$_[0] + $start;
}
