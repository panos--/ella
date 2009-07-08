package org.unbunt.sqlscript.testng;

import org.testng.annotations.Test;
import static org.unbunt.sqlscript.SQLScript.eval;
import org.unbunt.sqlscript.exception.SQLScriptIOException;
import org.unbunt.sqlscript.exception.SQLScriptParseException;
import org.unbunt.sqlscript.utils.TestUtils;
import static org.unbunt.sqlscript.utils.TestUtils.ensureType;

import java.sql.Connection;
import java.sql.SQLException;

@Test(groups = { "interpreter-db" }, dependsOnGroups = "interpreter")
public class InterpreterDBTestsNG extends AbstractTest {
    public static final String PROPS_PATH = "cfg/";

    public static final String PROPS_MYSQL = "mysql.properties";
    public static final String PROPS_PGSQL = "pg.properties";
    public static final String PROPS_ORACLE = "oracle.properties";

    @Test
    public void connectMysql() throws SQLScriptIOException, SQLScriptParseException, SQLException {
        Object result = eval(String.format(".Conn.createFromProps('%s', 'mysql');", propsMysql()));
        Connection conn = ensureType(Connection.class, result);
        conn.close();
    }

    @Test(dependsOnMethods = "connectMysql")
    public void connActivate() throws SQLScriptIOException, SQLScriptParseException {
        // TODO: Close connections
        eval("{\n" +
                String.format("var conn1 := Conn.createFromProps('%s', 'mysql');\n", propsMysql()) +
                String.format("var conn2 := Conn.createFromProps('%s', 'mysql');\n", propsMysql()) +
                ".conn2.do {=>\n" +
                "   if (Conn.active !== conn2) {\n" +
                "       throw 'conn2 not active';\n" +
                "   }\n" +
                "};\n" +
                "if (Conn.active !== conn1) {\n" +
                "   throw 'conn1 not active';" +
                "}\n" +
                "}\n"
        );
    }

    @Test(dependsOnMethods = "connActivate")
    public void sqlLiteralVariableSubstitution() throws SQLScriptIOException, SQLScriptParseException {
        eval(file("sql-literal-variable-substitution"), propsMysql(), "mysql");
    }

    protected static String propsMysql() {
        return props(PROPS_MYSQL);
    }

    protected static String propsPG() {
        return props(PROPS_PGSQL);
    }

    protected static String propsOra() {
        return props(PROPS_ORACLE);
    }

    protected static String props(String file) {
        return PROPS_PATH + file;
    }

}
