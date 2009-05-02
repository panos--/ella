var iters := 1000000;

var p := Sys.print;

fun loop(n) {
    if (n == 0) {
        return 0;
    }

    --.p(n);
    return loop(n - 1);
}

fun loopRev(n) {
    if (n != 0) {
        --.p(n);
        return loopRev(n - 1);
    }

    return 0;
}

.loop(iters / 2);
.loopRev(iters / 2);
exit;
