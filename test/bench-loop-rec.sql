var p := Sys.print;

fun loop(n) {
    if (n == 0) {
        return 0;
    }

    --.p(n);
    return loop(n - 1);
}

.loop(10000000);
exit;
