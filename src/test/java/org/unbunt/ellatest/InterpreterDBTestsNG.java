/* InterpreterDBTestsNG.java
   Copyright (C) 2009, 2010 Thomas Weiß <panos@unbunt.org>

This file is part of the Ella scripting language interpreter.

Ella is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

Ella is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with Ella; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

package org.unbunt.ellatest;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import static org.unbunt.ella.Ella.eval;
import org.unbunt.ella.exception.EllaException;
import org.unbunt.ella.exception.EllaIOException;
import org.unbunt.ella.exception.EllaParseException;
import org.unbunt.ella.exception.EllaStoppedException;
import static org.unbunt.ellatest.TestUtils.ensureType;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@Test(groups = { "interpreter-db" }, dependsOnGroups = "interpreter")
public class InterpreterDBTestsNG extends AbstractTest {
    public static final String PROPS_PATH = "src/main/config/";

    public static final String PROPS_MYSQL = "mysql.properties";
    public static final String PROPS_PGSQL = "pg.properties";
    public static final String PROPS_ORACLE = "oracle.properties";

    public void connectMysql()
            throws EllaIOException, EllaParseException, SQLException, EllaException, EllaStoppedException {
        Object result = eval(String.format(".ConnMgr.createFromProps('%s', 'mysql');", propsMysql()));
        Connection conn = ensureType(Connection.class, result);
        conn.close();
    }

    @Test(dependsOnMethods = "connectMysql")
    public void connActivate() throws EllaIOException, EllaParseException, EllaException, EllaStoppedException {
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

    @SuppressWarnings({"unchecked", "ConstantConditions"})
    @Test(dependsOnMethods = "connectMysql")
    public void connAutoClose()
            throws EllaParseException, EllaIOException, EllaException, SQLException, EllaStoppedException {
        Object result = eval(file("conn-auto-close"), propsMysql());
        assertNotNull(result);
        assertTrue(result instanceof List, "Expected list of connections - got " + result.getClass());
        List<Object> connections = (List<Object>) result;
        assertFalse(connections.isEmpty(), "List of connections is empty - at least one connection expected");
        int nopen = 0;
        for (Object elem : connections) {
            assertNotNull(elem);
            assertTrue(elem instanceof Connection);
            Connection connection = (Connection) elem;
            if (!connection.isClosed()) {
                nopen++;
            }
        }
        assertEquals(nopen, 0, "Connection auto-close broken: " +
                               nopen + " out of " + connections.size() + " " +
                               "connections still open");
    }

    @Test(dependsOnMethods = "connActivate")
    public void sqlLiteralVariableSubstitution()
            throws EllaIOException, EllaParseException, EllaException, EllaStoppedException {
        eval(file("sql-literal-variable-substitution"), propsMysql(), "mysql");
    }

    @Test(dependsOnMethods = "connectMysql")
    public void tx() throws EllaIOException, EllaParseException, EllaException, EllaStoppedException {
        eval(file("tx"), propsMysql());
    }

    @Test(dependsOnMethods = "connectMysql")
    public void mysqlStmtKey() throws EllaIOException, EllaException, EllaParseException, EllaStoppedException {
        eval(file("mysql-stmt-key"), propsMysql());
    }

    @Test(dependsOnMethods = "connectMysql")
    public void mysqlResSetUpdate() throws EllaIOException, EllaException, EllaParseException, EllaStoppedException {
        eval(file("mysql-resset-update"), propsMysql());
    }

    @Test(dependsOnMethods = "connectMysql")
    public void mysqlResSetInsert() throws EllaIOException, EllaException, EllaParseException, EllaStoppedException {
        eval(file("mysql-resset-insert"), propsMysql());
    }

    public void connectPostgresql()
            throws EllaParseException, EllaIOException, EllaException, SQLException, EllaStoppedException {
        Object result = eval(".ConnMgr.createFromProps(ARGV[0]);", propsPG());
        Connection conn = ensureType(Connection.class, result);
        conn.close();
    }

    @Test(dependsOnMethods = "connectPostgresql")
    public void postgresqlStringSingleQuoted()
            throws EllaParseException, EllaIOException, EllaException, EllaStoppedException {
        Object result = eval(".ConnMgr.createFromProps(ARGV[0]);" +
                             ".(sql select 'foobar' as foo).first().foo;", propsPG());
        assertEquals(result, "foobar");
    }

    @Test(dependsOnMethods = "connectPostgresql")
    public void postgresqlStringDollarQuoted()
            throws EllaParseException, EllaIOException, EllaException, EllaStoppedException {
        Object result = eval(".ConnMgr.createFromProps(ARGV[0]); " +
                             "\\set quotes=pg; " +
                             ".(sql select $$foo)bar$$ as foo).first().foo;",
                             propsPG());
        assertEquals(result, "foo)bar");
    }

    @Test(dependsOnMethods = "connectPostgresql")
    public void postgresqlStringDollarQuotedTag()
            throws EllaParseException, EllaIOException, EllaException, EllaStoppedException {
        Object result = eval(".ConnMgr.createFromProps(ARGV[0]); " +
                             "\\set quotes=pg; " +
                             ".(sql select $tag$foo)bar$tag$ as foo).first().foo;",
                             propsPG());
        assertEquals(result, "foo)bar");
    }

    @Test(dependsOnMethods = "connectPostgresql")
    public void postgresqlStringDollarQuotedVarSubst()
            throws EllaParseException, EllaIOException, EllaException, EllaStoppedException {
        Object result = eval(".ConnMgr.createFromProps(ARGV[0]); " +
                             "\\set quotes=pg; " +
                             "var foo := 'foobar'; " +
                             ".(sql select $tag$foo@{foo})bar$tag$ as foo).first().foo;",
                             propsPG());
        assertEquals(result, "foofoobar)bar");
    }

    public void connectOracle()
            throws EllaIOException, EllaParseException, SQLException, EllaException, EllaStoppedException {
        Object result = eval(
                String.format(".ConnMgr.createFromProps('%s', 'oracle');", propsOracle())
        );
        Connection conn = ensureType(Connection.class, result);
        conn.close();
    }

    @Test(dependsOnMethods = "connectOracle")
    public void oracleInsertSelectSimple()
            throws EllaIOException, EllaException, EllaParseException, EllaStoppedException {
        eval(file("oracle-insert-select-simple"), propsOracle());
    }

    @Test(dependsOnMethods = "oracleInsertSelectSimple")
    public void oracleStmtFirst() throws EllaIOException, EllaException, EllaParseException, EllaStoppedException {
        eval(file("oracle-stmt-first"), propsOracle());
    }

    @Test(dependsOnMethods = "oracleStmtFirst")
    public void oracleQQuotedStringAlphaDelim()
            throws EllaParseException, EllaIOException, EllaException, EllaStoppedException {
        String code = ".ConnMgr.createFromProps(ARGV[0]); " +
                      "\\set quotes=ora; " +
                      ".(sql select q'Xfoo')barX' as str from dual).first().STR;";
        Object result = eval(code, propsOracle());
        assertEquals(result, "foo')bar");
    }

    @Test(dependsOnMethods = "oracleStmtFirst")
    public void oracleQQuotedStringSquotDelim()
            throws EllaParseException, EllaIOException, EllaException, EllaStoppedException {
        String code = ".ConnMgr.createFromProps(ARGV[0]); " +
                      "\\set quotes=ora; " +
                      ".(sql select q''foo')bar'' as str from dual).first().STR;";
        Object result = eval(code, propsOracle());
        assertEquals(result, "foo')bar");
    }

    @Test(dependsOnMethods = "oracleStmtFirst")
    public void oracleQQuotedStringCurlyDelim()
            throws EllaParseException, EllaIOException, EllaException, EllaStoppedException {
        String code = ".ConnMgr.createFromProps(ARGV[0]); " +
                      "\\set quotes=ora; " +
                      ".(sql select q'{x'xx''zz}yy@'}' as str from dual).first().STR;";
        Object result = eval(code, propsOracle());
        assertEquals(result, "x'xx''zz}yy@'");
    }

    @Test(dependsOnMethods = "oracleQQuotedStringCurlyDelim")
    public void oracleQQuotedStringCurlyDelimVarSubst()
            throws EllaParseException, EllaIOException, EllaException, EllaStoppedException {
        String code = ".ConnMgr.createFromProps(ARGV[0]); " +
                      "\\set quotes=ora; " +
                      "var foo := 'foobar'; " +
                      "var baz := 'qux';" +
                      ".(sql select q'{x@{foo}'xx''zz@{baz}}yy@'}' as str from dual).first().STR;";
        Object result = eval(code, propsOracle());
        assertEquals(result, "xfoobar'xx''zzqux}yy@'");
    }

    @Test(dependsOnMethods = "connectOracle")
    public void oracleConnBatch() throws EllaIOException, EllaException, EllaParseException, EllaStoppedException {
        eval(file("oracle-conn-batch"), propsOracle());
    }

    @Test(dependsOnMethods = "connectOracle")
    public void oracleStmtBatch() throws EllaIOException, EllaException, EllaParseException, EllaStoppedException {
        eval(file("oracle-stmt-batch"), propsOracle());
    }

    @Test(dependsOnMethods = "connectOracle")
    public void oracleStmtBatchNamed() throws EllaIOException, EllaException, EllaParseException, EllaStoppedException {
        eval(file("oracle-stmt-batch-named"), propsOracle());
    }

    @Test(dependsOnMethods = "connectOracle")
    public void oracleConnWithPrepared() throws EllaIOException, EllaException, EllaParseException, EllaStoppedException {
        eval(file("oracle-conn-with-prepared"), propsOracle());
    }

    @Test(dependsOnMethods = "connectOracle")
    public void oracleConnWithPreparedNamed()
            throws EllaIOException, EllaException, EllaParseException, EllaStoppedException {
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
        String path = PROPS_PATH + file;
        String pathLocal = path + ".local";
        File fileLocal = new File(pathLocal);
        return fileLocal.exists() ? pathLocal : path;
    }

}
