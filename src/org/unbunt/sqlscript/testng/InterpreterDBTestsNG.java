package org.unbunt.sqlscript.testng;

import org.testng.annotations.Test;
import static org.unbunt.sqlscript.Ella.eval;
import org.unbunt.sqlscript.exception.EllaIOException;
import org.unbunt.sqlscript.exception.EllaParseException;
import org.unbunt.sqlscript.exception.EllaException;
import static org.unbunt.sqlscript.testng.TestUtils.ensureType;

import java.sql.Connection;
import java.sql.SQLException;

@Test(groups = { "interpreter-db" }, dependsOnGroups = "interpreter")
public class InterpreterDBTestsNG extends AbstractTest {
    public static final String PROPS_PATH = "cfg/";

    public static final String PROPS_MYSQL = "mysql.properties";
    public static final String PROPS_PGSQL = "pg.properties";
    public static final String PROPS_ORACLE = "oracle.properties";

    @Test
    public void connectMysql() throws EllaIOException, EllaParseException, SQLException, EllaException {
        Object result = eval(String.format(".ConnMgr.createFromProps('%s', 'mysql');", propsMysql()));
        Connection conn = ensureType(Connection.class, result);
        conn.close();
    }

    @Test(dependsOnMethods = "connectMysql")
    public void connActivate() throws EllaIOException, EllaParseException, EllaException {
        // TODO: Close connections
        eval("{\n" +
                String.format("var conn1 := ConnMgr.createFromProps('%s', 'mysql');\n", propsMysql()) +
                String.format("var conn2 := ConnMgr.createFromProps('%s', 'mysql');\n", propsMysql()) +
                ".conn2.do {=>\n" +
                "   if (ConnMgr.active !== conn2) {\n" +
                "       throw 'conn2 not active';\n" +
                "   }\n" +
                "};\n" +
                "if (ConnMgr.active !== conn1) {\n" +
                "   throw 'conn1 not active';" +
                "}\n" +
                "}\n"
        );
    }

    @Test(dependsOnMethods = "connActivate")
    public void sqlLiteralVariableSubstitution()
            throws EllaIOException, EllaParseException, EllaException {
        eval(file("sql-literal-variable-substitution"), propsMysql(), "mysql");
    }

    @Test(dependsOnMethods = "connectMysql")
    public void tx() throws EllaIOException, EllaParseException, EllaException {
        eval(file("tx"), propsMysql());
    }

    @Test(dependsOnMethods = "connectMysql")
    public void mysqlStmtKey() throws EllaIOException, EllaException, EllaParseException {
        eval(file("mysql-stmt-key"), propsMysql());
    }

    @Test(dependsOnMethods = "connectMysql")
    public void mysqlResSetUpdate() throws EllaIOException, EllaException, EllaParseException {
        eval(file("mysql-resset-update"), propsMysql());
    }

    @Test(dependsOnMethods = "connectMysql")
    public void mysqlResSetInsert() throws EllaIOException, EllaException, EllaParseException {
        eval(file("mysql-resset-insert"), propsMysql());
    }

    @Test
    public void connectOracle() throws EllaIOException, EllaParseException, SQLException, EllaException {
        Object result = eval(
                String.format(".ConnMgr.createFromProps('%s', 'oracle');", propsOracle())
        );
        Connection conn = ensureType(Connection.class, result);
        conn.close();
    }

    @Test(dependsOnMethods = "connectOracle")
    public void oracleInsertSelectSimple() throws EllaIOException, EllaException, EllaParseException {
        eval(file("oracle-insert-select-simple"), propsOracle());
    }

    @Test(dependsOnMethods = "connectOracle")
    public void oracleStmtFirst() throws EllaIOException, EllaException, EllaParseException {
        eval(file("oracle-stmt-first"), propsOracle());
    }

    @Test(dependsOnMethods = "connectOracle")
    public void oracleConnBatch() throws EllaIOException, EllaException, EllaParseException {
        eval(file("oracle-conn-batch"), propsOracle());
    }

    @Test(dependsOnMethods = "connectOracle")
    public void oracleStmtBatch() throws EllaIOException, EllaException, EllaParseException {
        eval(file("oracle-stmt-batch"), propsOracle());
    }

    @Test(dependsOnMethods = "connectOracle")
    public void oracleStmtBatchNamed() throws EllaIOException, EllaException, EllaParseException {
        eval(file("oracle-stmt-batch-named"), propsOracle());
    }

    @Test(dependsOnMethods = "connectOracle")
    public void oracleConnWithPrepared() throws EllaIOException, EllaException, EllaParseException {
        eval(file("oracle-conn-with-prepared"), propsOracle());
    }

    @Test(dependsOnMethods = "connectOracle")
    public void oracleConnWithPreparedNamed() throws EllaIOException, EllaException, EllaParseException {
        eval(file("oracle-conn-with-prepared-named"), propsOracle());
    }

    protected static String propsMysql() {
        return props(PROPS_MYSQL);
    }

    protected static String propsPG() {
        return props(PROPS_PGSQL);
    }

    protected static String propsOracle() {
        return props(PROPS_ORACLE);
    }

    protected static String props(String file) {
        return PROPS_PATH + file;
    }

}
