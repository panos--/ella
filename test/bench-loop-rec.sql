var p := Sys.print;

fun loop(n) {
    if (n == 0) {
        return 0;
    }

    --.noop();
    return loop(n - 1);
}

.loop(10000000);
exit;
