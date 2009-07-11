.Sys.tryCatchFinally(
    {=> 23; },
    { e => 42; },
    {=> 3.14; }
);

try {
    23;
} catch (e) {
    42;
} finally {
    3.14;
}