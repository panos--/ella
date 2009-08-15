package org.unbunt.ella.compiler;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeNodeStream;
import org.unbunt.ella.compiler.antlr.LazyInputStream;
import org.unbunt.ella.compiler.antlr.LazyTokenStream;
import org.unbunt.ella.compiler.statement.Block;
import org.unbunt.ella.compiler.support.RawParamedSQL;
import org.unbunt.ella.compiler.support.SQLParseMode;
import org.unbunt.ella.compiler.support.Scope;
import org.unbunt.ella.compiler.support.RawSQL;
import org.unbunt.ella.exception.*;
import org.unbunt.ella.resource.SimpleResource;

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

    public static RawParamedSQL parseParamedSQLLiteral(RawSQL stmt) throws GenericParseException {
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
                    throw new EllaIOException("Failed to read sql script: " + filename + ": " +
                                                        e.getMessage(), e);
                }

                EllaLexer lexer = new EllaLexer(input);
                TokenStream tokens = new LazyTokenStream(lexer);
                EllaParser parser = new EllaParser(tokens);

                EllaParser.script_return r;
                try {
                    r = parser.parseScript();
                } catch (EllaRecognitionException e) {
                    RecognitionException re = e.getCause();
                    throw new EllaRecognitionException("Failed to parse sql script: " + filename + ": " +
                                                      parser.getErrorHeader(re) + " " +
                                                      parser.getErrorMessage(re, parser.getTokenNames()),
                                                      re);
                } catch (EllaParseException e) {
                    throw new EllaParseException("Failed to parse sql script: " + filename + ": " + e.getMessage(), e);
                }

                CommonTree tree = (CommonTree) r.getTree();

                CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
                nodes.setTokenStream(tokens);

                EllaWalker walker = new EllaWalker(nodes);
                try {
                    block = walker.walkScript(initialScope);
                    TailCallOptimizer.process(block);
                } catch (EllaRecognitionException e) {
                    RecognitionException re = e.getCause();
                    throw new EllaRecognitionException("Failed to parse sql script: " + filename + ": " +
                                                      walker.getErrorHeader(re) + " " +
                                                      walker.getErrorMessage(re, walker.getTokenNames()),
                                                      re);
                }
            } catch (EllaIOException e) {
                throw new GenericParseException(e);
            } catch (EllaParseException e) {
                throw new GenericParseException(e);
            }

            return block;
        }
    }

    protected static class ParamedSQLLiteralParser {
        protected EllaLexer lexer;
        protected LazyTokenStream tokens;
        protected EllaParser parser;
        protected EllaWalker walker;

        public ParamedSQLLiteralParser() {
            lexer = new EllaLexer();
            tokens = new LazyTokenStream();
            parser = new EllaParser(null);
            walker = new EllaWalker(null);
        }

        public RawParamedSQL parse(RawSQL stmt) throws GenericParseException {
            try {
                try {
                    LazyInputStream chars = new LazyInputStream(new ByteArrayInputStream(stmt.getStatement().getBytes()));
                    lexer.setCharStream(chars);
                    tokens.setTokenSource(lexer);
                    Tree tree = parser.parseParamedSQLLiteral(tokens, new SQLParseMode(stmt.getParseMode().getStringType()));
                    TreeNodeStream nodes = new CommonTreeNodeStream(tree);
                    walker.setTreeNodeStream(nodes);
                    return walker.parseParamedSQLLiteral(nodes);
                } catch (EllaRecognitionException e) {
                    RecognitionException re = e.getCause();
                    throw new EllaRecognitionException("Failed to parse sql literal for named parameters: " +
                                                       re.getMessage(), re);
                } catch (EllaRuntimeException e) {
                    throw new EllaParseException("Failed to parse sql literal for named parameters: " +
                                                 e.getMessage(), e);
                }
            } catch (EllaParseException e) {
                throw new GenericParseException(e);
            }
        }
    }
}
