package org.unbunt.sqlscript.testng;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeNodeStream;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import static org.unbunt.sqlscript.SQLScript.compile;
import org.unbunt.sqlscript.compiler.antlr.LazyInputStream;
import org.unbunt.sqlscript.compiler.antlr.LazyTokenStream;
import org.unbunt.sqlscript.compiler.*;
import org.unbunt.sqlscript.exception.SQLScriptIOException;
import org.unbunt.sqlscript.exception.SQLScriptParseException;
import org.unbunt.sqlscript.lang.sql.RawSQLObj;
import org.unbunt.sqlscript.compiler.support.RawParamedSQL;
import org.unbunt.sqlscript.compiler.support.SQLParseMode;
import org.unbunt.sqlscript.compiler.support.SQLStringType;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Test(groups = { "parser" })
public class ParserTestsNG extends AbstractTest {
    /*
     * NOTE: The following three string tests will fail if the string literal isn't parsed as such because of the
     * NOTE: embedded unbalanced parens.
     */

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

    @Test
    public void sqlNamedParamsStdWithSeparateParser() throws RecognitionException {
        String sql = "select *, :, 42::real, a: b:, :param, ':noparam' from foo where bar = :qux or baz = :qux ; ";
        String expectedStatement =
                "select *, :, 42::real, a: b:, ?, ':noparam' from foo where bar = ? or baz = ? ; ";
        Map<String, List<Integer>> expectedParams = new HashMap<String, List<Integer>>();
        expectedParams.put("param", Arrays.asList(1));
        expectedParams.put("qux", Arrays.asList(2, 3));

        LazyInputStream chars = new LazyInputStream(new ByteArrayInputStream(sql.getBytes()));
        SQLScriptLexer lexer = new SQLScriptLexer(chars);
        LazyTokenStream tokens = new LazyTokenStream(lexer);

        SQLScriptParser parser = new SQLScriptParser(null);
        Tree tree = parser.parseParamedSQLLiteral(tokens, new SQLParseMode(SQLStringType.sql92));

        TreeNodeStream nodes = new CommonTreeNodeStream(tree);
        SQLScriptWalker walker = new SQLScriptWalker(null);
        RawParamedSQL result = walker.parseParamedSQLLiteral(nodes);

        assertEquals(result.getStatement(), expectedStatement);
        assertEquals(result.getParameters(), expectedParams);
    }

    @Test
    public void sqlNamedParamsMySQLWithSeparateParser() throws RecognitionException {
        String sql = "select :foo, *, :, 42::real, a: b:, :param, `:noparam` from foo where bar = :qux or baz = :qux ; ";
        String expectedStatement =
                "select ?, *, :, 42::real, a: b:, ?, `:noparam` from foo where bar = ? or baz = ? ; ";
        Map<String, List<Integer>> expectedParams = new HashMap<String, List<Integer>>();
        expectedParams.put("foo", Arrays.asList(1));
        expectedParams.put("param", Arrays.asList(2));
        expectedParams.put("qux", Arrays.asList(3, 4));

        LazyInputStream chars = new LazyInputStream(new ByteArrayInputStream(sql.getBytes()));
        SQLScriptLexer lexer = new SQLScriptLexer(chars);
        LazyTokenStream tokens = new LazyTokenStream(lexer);

        SQLScriptParser parser = new SQLScriptParser(null);
        Tree tree = parser.parseParamedSQLLiteral(tokens, new SQLParseMode(SQLStringType.mysql));

        TreeNodeStream nodes = new CommonTreeNodeStream(tree);
        SQLScriptWalker walker = new SQLScriptWalker(null);
        RawParamedSQL result = walker.parseParamedSQLLiteral(nodes);

        assertEquals(result.getStatement(), expectedStatement);
        assertEquals(result.getParameters(), expectedParams);
    }

    @Test
    public void sqlNamedParamsStdThreadLocalParser() throws RecognitionException {
        String sql = "select *, :, 42::real, a: b:, :param, ':noparam' from foo where bar = :qux or baz = :qux ; ";
        String expectedStatement =
                "select *, :, 42::real, a: b:, ?, ':noparam' from foo where bar = ? or baz = ? ; ";
        Map<String, List<Integer>> expectedParams = new HashMap<String, List<Integer>>();
        expectedParams.put("param", Arrays.asList(1));
        expectedParams.put("qux", Arrays.asList(2, 3));

        RawParamedSQL result = ParserHelper.parseParamedSQLLiteral(new RawSQLObj(sql, new SQLParseMode(SQLStringType.sql92)));

        assertEquals(result.getStatement(), expectedStatement);
        assertEquals(result.getParameters(), expectedParams);
    }

    @Test
    public void sqlNamedParamsMySQLWithThreadLocalParser() throws RecognitionException {
        String sql = "select :foo, *, :, 42::real, a: b:, :param, `:noparam` from foo where bar = :qux or baz = :qux ; ";
        String expectedStatement =
                "select ?, *, :, 42::real, a: b:, ?, `:noparam` from foo where bar = ? or baz = ? ; ";
        Map<String, List<Integer>> expectedParams = new HashMap<String, List<Integer>>();
        expectedParams.put("foo", Arrays.asList(1));
        expectedParams.put("param", Arrays.asList(2));
        expectedParams.put("qux", Arrays.asList(3, 4));

        RawParamedSQL result = ParserHelper.parseParamedSQLLiteral(new RawSQLObj(sql, new SQLParseMode(SQLStringType.mysql)));

        assertEquals(result.getStatement(), expectedStatement);
        assertEquals(result.getParameters(), expectedParams);
    }

    @Test
    public void sqlLiteralLookAheadDiscard() throws SQLScriptIOException, SQLScriptParseException {
        compile(file("sql-literal-look-ahead-discard"));
    }

    @Test
    public void sqlLiteralParamedEmbeddedVars()
            throws SQLScriptIOException, SQLScriptParseException, IOException, RecognitionException {
        // Here we parse an SQL literal containing several embedded variables for named parameters
        // and expect to not be parsed as such.
        // Thereby we verify the involved lexers to be set up correctly.

        String sql = fileContent("sql-literal-paramed-embedded-vars");

        RawParamedSQL result = ParserHelper.parseParamedSQLLiteral(new RawSQLObj(sql, new SQLParseMode(SQLStringType.mysql)));

        assertEquals(result.getStatement(), sql);
    }
}
