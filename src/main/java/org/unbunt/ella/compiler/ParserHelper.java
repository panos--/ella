/* ParserHelper.java
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
 * <li>parsing complete scripts</li>
 * <li>parsing SQL literals for named parameters</li>
 * </ul>
 */
public class ParserHelper {
    protected static ThreadLocalParser threadLocalParser = new ThreadLocalParser();

    /**
     * Compiles the given EllaScript program into an executable form.
     *
     * @param initialScope the scope information to use during compilation.
     * @param filename the name of the file containing the program to compile.
     * @return the executable representation of the program.
     * @throws GenericParseException if any errors occur during compilation of the program.
     */
    public static Block parseScript(Scope initialScope, String filename) throws GenericParseException {
        return threadLocalParser.get().scriptParser.parse(initialScope, filename);
    }

    /**
     * Compiles the given EllaScript program into an executable form.
     *
     * @param initialScope the scope information to use during compilation.
     * @param resource the resource containing the program to compile.
     * @return the executable representation of the program.
     * @throws GenericParseException if any errors occur during compilation of the program.
     */
    public static Block parseScript(Scope initialScope, SimpleResource resource) throws GenericParseException {
        return threadLocalParser.get().scriptParser.parse(initialScope, resource);
    }

    /**
     * Parses the given sql statement for named parameters.
     *
     * @param stmt the sql statement.
     * @return the sql statement and it's named parameters.
     * @throws GenericParseException if any errors occur during parsing of the statement.
     */
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
