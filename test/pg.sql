\test-tx-status;

begin;

\test-tx-status;

insert into test (val) values ('value 1');

select * from test;

\test-tx-status;

commit;

select * from test;

\test-tx-status;
