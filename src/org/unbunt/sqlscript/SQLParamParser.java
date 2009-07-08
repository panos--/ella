package org.unbunt.sqlscript;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeNodeStream;
import org.unbunt.sqlscript.antlr.LazyInputStream;
import org.unbunt.sqlscript.antlr.LazyTokenStream;
import org.unbunt.sqlscript.lang.sql.RawSQL;
import org.unbunt.sqlscript.support.RawParamedSQL;
import org.unbunt.sqlscript.support.SQLParseMode;

import java.io.ByteArrayInputStream;

public class SQLParamParser {
    protected static ThreadLocalParser threadLocalParser = new ThreadLocalParser();

    public static RawParamedSQL parse(RawSQL stmt) throws RecognitionException {
        return threadLocalParser.get().parse(stmt);
    }

    protected static class ThreadLocalParser extends ThreadLocal<Parser> {
        @Override
        protected Parser initialValue() {
            return new Parser();
        }
    }

    protected static class Parser {
        protected SQLScriptLexer lexer;
        protected LazyTokenStream tokens;
        protected SQLScriptParser parser;
        protected SQLScriptWalker walker;

        public Parser() {
            lexer = new SQLScriptLexer();
            tokens = new LazyTokenStream();
            parser = new SQLScriptParser(null);
            walker = new SQLScriptWalker(null);
        }

        public RawParamedSQL parse(RawSQL stmt) throws RecognitionException {
            LazyInputStream chars = new LazyInputStream(new ByteArrayInputStream(stmt.getStatement().getBytes()));
            lexer.setCharStream(chars);
            tokens.setTokenSource(lexer);
            Tree tree = parser.parseParamedSQLLiteral(tokens, new SQLParseMode(stmt.getParseMode().getStringType()));
            TreeNodeStream nodes = new CommonTreeNodeStream(tree);
            walker.setTreeNodeStream(nodes);
            return walker.parseParamedSQLLiteral(nodes);
        }
    }
}
