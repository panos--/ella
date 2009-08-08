package org.unbunt.sqlscript.compiler;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.runtime.tree.CommonTree;
import org.unbunt.sqlscript.compiler.antlr.LazyInputStream;
import org.unbunt.sqlscript.compiler.antlr.LazyTokenStream;
import org.unbunt.sqlscript.lang.sql.RawSQL;
import org.unbunt.sqlscript.compiler.RawParamedSQL;
import org.unbunt.sqlscript.compiler.SQLParseMode;
import org.unbunt.sqlscript.compiler.Scope;
import org.unbunt.sqlscript.compiler.TailCallOptimizer;
import org.unbunt.sqlscript.statement.Block;
import org.unbunt.sqlscript.exception.*;
import org.unbunt.sqlscript.utils.res.SimpleResource;

import java.io.*;

/**
 * Helper class providing static methods for:
 * <ul>
 * <li>complete scripts</li>
 * <li>SQL literals for named parameters</li>
 * </ul>
 */
public class ParserHelper {
    protected static ThreadLocalParser threadLocalParser = new ThreadLocalParser();

    public static Block parseScript(Scope initialScope, String filename) throws GenericParseException {
        return threadLocalParser.get().scriptParser.parse(initialScope, filename);
    }

    public static Block parseScript(Scope initialScope, SimpleResource fileResource) throws GenericParseException {
        return threadLocalParser.get().scriptParser.parse(initialScope, fileResource);
    }

    public static RawParamedSQL parseParamedSQLLiteral(RawSQL stmt) throws RecognitionException {
        return threadLocalParser.get().paramedSQLLiteralParser.parse(stmt);
    }

    protected static class ThreadLocalParser extends ThreadLocal<RealParser> {
        @Override
        protected RealParser initialValue() {
            return new RealParser();
        }
    }

    protected static class RealParser {
        protected ScriptParser scriptParser = new ScriptParser();
        protected ParamedSQLLiteralParser paramedSQLLiteralParser = new ParamedSQLLiteralParser();
    }

    protected static class ScriptParser {
        public Block parse(Scope initialScope, String filename) throws GenericParseException {
            try {
                return parse(initialScope, filename, new FileInputStream(filename));
            } catch (FileNotFoundException e) {
                throw new GenericParseException("Failed to read sql script: " + filename + ": " + e.getMessage(), e);
            }
        }

        public Block parse(Scope initialScope, SimpleResource fileResource) throws GenericParseException {
            String filename = null;
            try {
                filename = fileResource.getPath();
                return parse(initialScope, filename, fileResource.getInputStream());
            } catch (IOException e) {
                if (filename == null) {
                    filename = "<unknown>";
                }
                throw new GenericParseException("Failed to read sql script: " + filename + ": " + e.getMessage(), e);
            }
        }

        protected Block parse(Scope initialScope, String filename, InputStream inputStream)
                throws GenericParseException {
            Block block;
            try {
                LazyInputStream input;
                try {
                    input = new LazyInputStream(inputStream);
                } catch (Exception e) {
                    throw new SQLScriptIOException("Failed to read sql script: " + filename + ": " +
                                                        e.getMessage(), e);
                }

                SQLScriptLexer lexer = new SQLScriptLexer(input);
                TokenStream tokens = new LazyTokenStream(lexer);

                SQLScriptParser parser;
                try {
                    parser = new SQLScriptParser(tokens);
                } catch (RuntimeRecognitionException re) {
                    RecognitionException e = (RecognitionException) re.getCause();
                    throw new SQLScriptParseException("Failed to parse sql script: " + filename + ": " +
                                                        lexer.getErrorHeader(e) + " " +
                                                        lexer.getErrorMessage(e, lexer.getTokenNames()),
                                                        e);
                }

                SQLScriptParser.script_return r;
                try {
                    r = parser.script();
                } catch (RecognitionException e) {
                    throw new SQLScriptParseException("Failed to parse sql script: " + filename + ": " +
                                                      parser.getErrorHeader(e) + " " +
                                                      parser.getErrorMessage(e, parser.getTokenNames()),
                                                      e);
                } catch (RuntimeRecognitionException re) {
                    RecognitionException e = (RecognitionException) re.getCause();
                    throw new SQLScriptParseException("Failed to parse sql script: " + filename + ": " +
                                                        lexer.getErrorHeader(e) + " " +
                                                        lexer.getErrorMessage(e, lexer.getTokenNames()),
                                                        e);
                }

                CommonTree tree = (CommonTree) r.getTree();

                CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
                nodes.setTokenStream(tokens);

                SQLScriptWalker walker = new SQLScriptWalker(nodes);
                try {
                    block = walker.parseIncremental(initialScope);
                    TailCallOptimizer.process(block);
                } catch (RecognitionException e) {
                    throw new SQLScriptParseException("Failed to parse sql script: " + filename + ": " +
                                                      walker.getErrorHeader(e) + " " +
                                                      walker.getErrorMessage(e, walker.getTokenNames()),
                                                      e);
                } catch (RuntimeException e) {
                    throw new SQLScriptRuntimeException(e.getMessage(), e);
                }
            } catch (SQLScriptIOException e) {
                throw new GenericParseException(e);
            } catch (SQLScriptParseException e) {
                throw new GenericParseException(e);
            }

            return block;
        }
    }

    protected static class ParamedSQLLiteralParser {
        protected SQLScriptLexer lexer;
        protected LazyTokenStream tokens;
        protected SQLScriptParser parser;
        protected SQLScriptWalker walker;

        public ParamedSQLLiteralParser() {
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
