/*
\test-tx-status;

set transaction name 'foo-tx';

\test-tx-status;

@describe(title = 'test')
select * from foo;
*/

@ignoreErrors
@describe(title = 'Loading foob...')
select * from foob;

@describe(title = 'Loading foo...')
select * from foo;