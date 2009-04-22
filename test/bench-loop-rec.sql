fun loop(n) {
    if (n == 0) {
        return 0;
    }

    --\echo msg='@{n}';
    return loop(n - 1);
}

.loop(10000000);
exit;
