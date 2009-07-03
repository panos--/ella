package org.unbunt.sqlscript.testng;

import static org.unbunt.sqlscript.SQLScript.compile;
import org.unbunt.sqlscript.exception.SQLScriptIOException;
import org.unbunt.sqlscript.exception.SQLScriptParseException;
import org.testng.annotations.Test;

@Test(groups = { "parser" })
public class ParserTestsNG {
    // NOTE: The following string tests will fail if the string literal isn't parsed as such because of the
    // NOTE: embedded unbalanced parens.

    @Test
    public void sqlStringOracleQQuote() throws SQLScriptIOException, SQLScriptParseException {
        compile("\\set quotes=oracle; select * from foo where bar = q'Xfoo')barX';");
    }

    @Test
    public void sqlStringMysqlBacktick() throws SQLScriptIOException, SQLScriptParseException {
        compile("\\set quotes=mysql; select * from foo where bar = `foo)bla`;");
    }

    /*
     * FIXME: Disabled. Does currently not work. See comment in STR_DOLQUOT rule of SQLScriptLexer.
     */
    @Test(enabled = false)
    public void sqlStringPostgresDollar() throws SQLScriptIOException, SQLScriptParseException {
        compile("\\set quotes=pg; select * from foo where bar = $$bla)blubb$$ or baz = $xyz$foo}bar$xzy$;");
    }

    @Test
    public void assignSingleSQL() throws SQLScriptIOException, SQLScriptParseException {
        compile("var foo := sql select * from foo;");
    }

    @Test
    public void assignMultiSQL() throws SQLScriptIOException, SQLScriptParseException {
        compile("var foo = 'bla', bar = (sql select * from foo), bla = 'blubb';");
    }

    @Test(dependsOnMethods = { "sqlStringMysqlBacktick" })
    public void scopedParseMode() throws SQLScriptIOException, SQLScriptParseException {
        compile("\\set quotes=mysql;         \n" +
                "select `foo)bar`;           \n" +
                "{                           \n" +
                "   \\set quotes=sql92;      \n" +
                "   sql select foo;          \n" +
                "}                           \n" +
                "select foo where `qux)baz`; -- here mysql mode must be active again\n" +
                "");
    }
}
