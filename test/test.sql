var srcConn := ConnMgr.createFromProps(ARGV[0]);
var dstConn := ConnMgr.createFromProps(ARGV[1]);

fun withConnDo(conn, stmt) {
    stmt.associateConnection(conn).do();
}

.withConnDo(srcConn, (sql select synonym_name from user_synonyms));
.withConnDo(dstConn, (sql select synonym_name from user_synonyms));
