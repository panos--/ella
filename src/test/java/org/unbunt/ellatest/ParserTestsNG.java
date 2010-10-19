package org.unbunt.ellatest;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeNodeStream;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import static org.unbunt.ella.Ella.compile;
import org.unbunt.ella.compiler.*;
import org.unbunt.ella.compiler.antlr.LazyInputStream;
import org.unbunt.ella.compiler.antlr.LazyTokenStream;
import org.unbunt.ella.compiler.support.RawParamedSQL;
import org.unbunt.ella.compiler.support.SQLParseMode;
import org.unbunt.ella.compiler.support.SQLStringType;
import org.unbunt.ella.engine.corelang.RawSQLObj;
import org.unbunt.ella.exception.EllaIOException;
import org.unbunt.ella.exception.EllaParseException;
import org.unbunt.ella.exception.EllaRecognitionException;
import org.unbunt.ella.exception.GenericParseException;

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

    public void sqlStringOracleQQuote() throws EllaIOException, EllaParseException {
        compile("\\set quotes=oracle; select * from foo where bar = q'Xfoo')barX';");
    }

    public void sqlStringMysqlBacktick() throws EllaIOException, EllaParseException {
        compile("\\set quotes=mysql; select * from foo where bar = `foo)bla`;");
    }

    public void sqlStringPostgresDollar() throws EllaIOException, EllaParseException {
        compile("\\set quotes=pg; select * from foo where bar = $$bla)blubb$$ or baz = $xyz$foo}bar$xyz$;");
    }

    public void sqlStringPostgresDollarUnterminated() throws EllaParseException, EllaIOException {
        boolean success = false;

        try {
            compile("\\set quotes=pg; select $abc$foo)bar$def$;");
        } catch (EllaParseException e) {
            if (!e.isCausedBy(UnterminatedStringException.class)) {
                throw e;
            }
            UnterminatedStringException use = e.getCause(UnterminatedStringException.class);
            assertEquals(use.getStringType(), EllaStringParser.DOLQUOT,
                         "UnterminatedStringException correctly thrown, " +
                         "but with invalid string type - expected DOLQUOT");
            success = true;
        }

        if (!success) {
            assertTrue(false, "Unterminated dollar quoted string not correctly reported");
        }
    }

    public void assignSingleSQL() throws EllaIOException, EllaParseException {
        compile("var foo := sql select * from foo;");
    }

    public void assignMultiSQL() throws EllaIOException, EllaParseException {
        compile("var foo = 'bla', bar = (sql select * from foo), bla = 'blubb';");
    }

    @Test(dependsOnMethods = { "sqlStringMysqlBacktick" })
    public void scopedParseMode() throws EllaIOException, EllaParseException {
        compile("\\set quotes=mysql;         \n" +
                "select `foo)bar`;           \n" +
                "{                           \n" +
                "   \\set quotes=sql92;      \n" +
                "   sql select foo;          \n" +
                "}                           \n" +
                "select foo where `qux)baz`; -- here mysql mode must be active again\n" +
                "");
    }

    public void sqlNamedParamsStdWithSeparateParser() throws RecognitionException, EllaParseException {
        String sql = "select *, :, 42::real, a: b:, :param, ':noparam' from foo where bar = :qux or baz = :qux ; ";
        String expectedStatement =
                "select *, :, 42::real, a: b:, ?, ':noparam' from foo where bar = ? or baz = ? ; ";
        Map<String, List<Integer>> expectedParams = new HashMap<String, List<Integer>>();
        expectedParams.put("param", Arrays.asList(1));
        expectedParams.put("qux", Arrays.asList(2, 3));

        LazyInputStream chars = new LazyInputStream(new ByteArrayInputStream(sql.getBytes()));
        EllaLexer lexer = new EllaLexer(chars);
        LazyTokenStream tokens = new LazyTokenStream(lexer);

        EllaParser parser = new EllaParser(null);
        Tree tree = parser.parseParamedSQLLiteral(tokens, new SQLParseMode(SQLStringType.sql92));

        TreeNodeStream nodes = new CommonTreeNodeStream(tree);
        EllaWalker walker = new EllaWalker(null);
        RawParamedSQL result = walker.parseParamedSQLLiteral(nodes);

        assertEquals(result.getStatement(), expectedStatement);
        assertEquals(result.getParameters(), expectedParams);
    }

    public void sqlNamedParamsMySQLWithSeparateParser() throws RecognitionException, EllaParseException {
        String sql = "select :foo, *, :, 42::real, a: b:, :param, `:noparam` from foo where bar = :qux or baz = :qux ; ";
        String expectedStatement =
                "select ?, *, :, 42::real, a: b:, ?, `:noparam` from foo where bar = ? or baz = ? ; ";
        Map<String, List<Integer>> expectedParams = new HashMap<String, List<Integer>>();
        expectedParams.put("foo", Arrays.asList(1));
        expectedParams.put("param", Arrays.asList(2));
        expectedParams.put("qux", Arrays.asList(3, 4));

        LazyInputStream chars = new LazyInputStream(new ByteArrayInputStream(sql.getBytes()));
        EllaLexer lexer = new EllaLexer(chars);
        LazyTokenStream tokens = new LazyTokenStream(lexer);

        EllaParser parser = new EllaParser(null);
        Tree tree = parser.parseParamedSQLLiteral(tokens, new SQLParseMode(SQLStringType.mysql));

        TreeNodeStream nodes = new CommonTreeNodeStream(tree);
        EllaWalker walker = new EllaWalker(null);
        RawParamedSQL result = walker.parseParamedSQLLiteral(nodes);

        assertEquals(result.getStatement(), expectedStatement);
        assertEquals(result.getParameters(), expectedParams);
    }

    public void sqlNamedParamsStdThreadLocalParser() throws GenericParseException {
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

    public void sqlNamedParamsMySQLWithThreadLocalParser() throws GenericParseException {
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

    public void sqlLiteralLookAheadDiscard() throws EllaIOException, EllaParseException {
        compile(file("sql-literal-look-ahead-discard"));
    }

    public void sqlLiteralParamedEmbeddedVars()
            throws EllaIOException, EllaRecognitionException, IOException, RecognitionException, GenericParseException {
        // Here we parse an SQL literal containing several embedded variables for named parameters
        // and expect to not be parsed as such.
        // Thereby we verify the involved lexers to be set up correctly.

        String sql = fileContent("sql-literal-paramed-embedded-vars");

        RawParamedSQL result = ParserHelper.parseParamedSQLLiteral(new RawSQLObj(sql, new SQLParseMode(SQLStringType.mysql)));

        assertEquals(result.getStatement(), sql);
    }
}
