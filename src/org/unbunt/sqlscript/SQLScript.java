package org.unbunt.sqlscript;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;
import org.gnu.readline.Readline;
import org.gnu.readline.ReadlineLibrary;
import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.unbunt.sqlscript.compiler.antlr.LazyInputStream;
import org.unbunt.sqlscript.compiler.antlr.LazyTokenStream;
import org.unbunt.sqlscript.compiler.*;
import org.unbunt.sqlscript.compiler.support.Scope;
import org.unbunt.sqlscript.exception.*;
import org.unbunt.sqlscript.compiler.statement.Block;
import org.unbunt.sqlscript.support.*;
import org.unbunt.sqlscript.lang.sql.DBUtils;
import static org.unbunt.sqlscript.utils.StringUtils.join;
import org.unbunt.sqlscript.utils.res.FilesystemResource;
import org.unbunt.sqlscript.utils.res.FilesystemResourceLoader;
import org.unbunt.sqlscript.utils.res.SimpleResource;
import org.unbunt.sqlscript.utils.res.StringResource;
import org.unbunt.sqlscript.engine.DefaultContext;
import org.unbunt.sqlscript.engine.SQLScriptEngine;
import sun.misc.Signal;
import sun.misc.SignalHandler;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLScript {
    protected DefaultContext context;
    protected SimpleResource script;
    protected String scriptName;

    protected SQLScriptLexer lexer;
    protected LazyTokenStream tokens;

    protected SQLScriptParser parser;
    protected CommonTree tree;

    protected SQLScriptWalker walker;

    protected SQLScriptEngine engine = null;
    protected Block block; // the parsed script to be run by the engine

    public SQLScript(SimpleResource script) {
        this(new DefaultContext(), script);
    }

    public SQLScript(DefaultContext context, SimpleResource script) {
        this.context = context;
        this.script = script;
        this.scriptName = script.getFilename();

        context.setScriptFilename(script.getFilename());
        context.setScriptResource(script);
    }

    protected boolean interactiveCancel = false;

    protected void initInteractive() {
        // init readline library
        ReadlineLibrary[] libs = new ReadlineLibrary[] {
            ReadlineLibrary.GnuReadline,
            ReadlineLibrary.Editline,
            ReadlineLibrary.Getline,
            ReadlineLibrary.PureJava
        };
        Readline.setVar(Readline.RL_CATCH_SIGNALS, 1);
        Readline.setVar(Readline.RL_CATCH_SIGWINCH, 1);
        for (ReadlineLibrary lib : libs) {
            try {
                Readline.load(lib);
                break;
            } catch (UnsatisfiedLinkError ignored) {
                System.err.println("Readling lib " + lib.getName() + " not found...");
            } catch (Exception ignored) {
            }
        }
        Readline.initReadline("SQLScript");
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                Readline.cleanup();
            }
        });

        // install signal handlers (naughty - using sun.misc.*)
        SignalHandler signalHandler = new SignalHandler() { // TODO: ensure thread-safety
            public void handle(Signal signal) {
                if (!interactiveCancel) {
                    System.out.println();
                }
                interactiveCancel = true;
//                Readline.setVar(Readline.RL_PENDING_INPUT, (int) '\n');
                Readline.setVar(Readline.RL_DONE, 1);
//                System.out.println("Caught sigTerm");
            }
        };
        Signal.handle(new Signal("TERM"), signalHandler);
        Signal.handle(new Signal("INT"), signalHandler);
    }

    public void executeInteractive() throws SQLScriptIOException, SQLScriptParseException, SQLScriptRuntimeException {
        initInteractive();
        initEngine();

        try {
            String line;
            StringBuilder buf = new StringBuilder();
            boolean incompleteString = false;
            int stringType = -1;
            while (!engine.isFinished()) {
                boolean continued = buf.length() != 0;

                String prompt = "=>";
                if (continued) {
                    if (incompleteString) {
                        switch (stringType) {
                            case SQLScriptParser.SQUOT:   prompt = "'>";  break;
                            case SQLScriptParser.DQUOT:   prompt = "\">"; break;
                            case SQLScriptParser.BTICK:   prompt = "`>";  break;
                            case SQLScriptParser.QQUOT:   prompt = "Q>";  break;
                            case SQLScriptParser.DOLQUOT: prompt = "$>";  break;
                        }
                    }
                    else {
                        prompt = "->";
                    }
                }

                try {
                    line = Readline.readline(prompt + " ", false);
                    if (interactiveCancel) {
                        interactiveCancel = false;
                        buf.setLength(0);
                        continue;
                    }
                    if (line == null) { // just pressed enter
                        continue;
                    }
                } catch (EOFException e) { // input closed
                    break;
                } catch (IOException e) {
                    throw new SQLScriptIOException(e);
                }

                if (continued) {
                    buf.append('\n');
                }
                buf.append(line);

                String unit = buf.toString();
                InputStream input = new ByteArrayInputStream(unit.getBytes());

                boolean incompleteInput = false;
                try {
                    try {
                        tokenize(input);
                        parseTokens();
                        parseTreeIncremental();
                        runBlock();
                    } catch (SQLScriptParseException e) {
                        if (e.isCausedBy(UnterminatedStringException.class)) {
                            UnterminatedStringException ex = e.getCause(UnterminatedStringException.class);
                            stringType = ex.getStringType();
                            incompleteInput = true;
                            incompleteString = true;
                        }
                        else if (e.isCausedBy(UnexpectedEOFException.class)
                                || (e.isCausedBy(RecognitionException.class)
                                    && (e.getCause(RecognitionException.class)).getUnexpectedType() == SQLScriptParser.EOF)) {
                            incompleteInput = true;
                            incompleteString = false;
                        }
                        else {
                            throw e;
                        }
                    }
                } catch (Exception e) {
                    System.err.println("ERROR: " + e.getMessage());
                    e.printStackTrace();
                }

                // keep current statement buffer in case it was an incomplete statement
                if (!incompleteInput) {
                    Readline.addToHistory(unit);
                    buf.setLength(0);
                }
            }
        }
        finally {
            finish();
            Readline.cleanup();
            System.out.println();
        }
    }

    public Object executeIncremental()
            throws SQLScriptIOException, SQLScriptParseException, SQLScriptRuntimeException, SQLScriptException {
        initParserIncremental();
        initEngine();
        try {
            Object result = null;
            while (parseTokensIncremental() && !engine.isFinished()) {
                if (tree == null) {
                    continue;
                }
                parseTree();
                result = runBlock();
            }
            return result;
        }
        finally {
            finish();
        }
    }

    public Object execute()
            throws SQLScriptIOException, SQLScriptParseException, SQLScriptRuntimeException, SQLScriptException {
        tokenize();
        parseTokens();
        parseTree();
        return run();
    }

    public Block compile() throws SQLScriptIOException, SQLScriptParseException {
        tokenize();
        parseTokens();
        parseTree();
        return block;
    }

    public void showAST() throws SQLScriptIOException, SQLScriptParseException, SQLScriptRuntimeException {
        tokenize();
        parseTokens();

        try {
            DOTTreeGenerator dotGen = new DOTTreeGenerator();
            StringTemplate dotGraph = dotGen.toDOT(tree);

            File dotFile = File.createTempFile("tree", "dot");
            dotFile.deleteOnExit();

            Writer w = new FileWriter(dotFile);
            w.write(dotGraph.toString()
                    .replace("digraph {", "digraph {\n  rankdir=LR;")
                    .replace("fixedsize=true", "fixedsize=false")
            );
            w.close();

            File pngFile = File.createTempFile("tree", "png");

            Process dot = Runtime.getRuntime().exec(new String[] {
                    "dot", "-Tsvg", "-o", pngFile.getPath(), dotFile.getPath()
            });

            int result;
            while (true) {
                try {
                    result = dot.waitFor();
                    break;
                } catch (InterruptedException e) {
                    continue;
                }
            }

            if (result != 0) {
                throw new Exception("dot command failed");
            }

            Runtime.getRuntime().exec(new String[] { "xdg-open", pngFile.getPath() });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void tokenize() throws SQLScriptIOException {
        try {
            tokenize(script.getInputStream());
        } catch (Exception e) {
            throw new SQLScriptIOException("Failed to read sql script: " + scriptName + ": " + e.getMessage(), e);
        }
    }

    protected void tokenize(InputStream stream) throws SQLScriptIOException {
        LazyInputStream input;
        try {
            input = new LazyInputStream(stream);
        } catch (Exception e) {
            throw new SQLScriptIOException("Failed to read sql script: " + scriptName + ": " + e.getMessage(), e);
        }

        lexer = new SQLScriptLexer(input);
        tokens = new LazyTokenStream(lexer);
    }

    protected void parseTokens() throws SQLScriptParseException, SQLScriptRuntimeException {
        try {
            if (parser == null) {
                parser = new SQLScriptParser(tokens);
            }
            else {
                parser.setTokenStream(tokens);
            }
        } catch (RuntimeRecognitionException re) {
            RecognitionException e = (RecognitionException) re.getCause();
            throw new SQLScriptParseException("Failed to parse sql script: " + scriptName + ": " +
                                              lexer.getErrorHeader(e) + " " +
                                              lexer.getErrorMessage(e, lexer.getTokenNames()),
                                              e);
        }

        SQLScriptParser.script_return r;
        try {
            r = parser.script();
        } catch (RecognitionException e) {
            throw new SQLScriptParseException("Failed to parse sql script: " + scriptName + ": " +
                                              parser.getErrorHeader(e) + " " +
                                              parser.getErrorMessage(e, parser.getTokenNames()),
                                              e);
        } catch (RuntimeRecognitionException re) {
            RecognitionException e = (RecognitionException) re.getCause();
            throw new SQLScriptParseException("Failed to parse sql script: " + scriptName + ": " +
                                              lexer.getErrorHeader(e) + " " +
                                              lexer.getErrorMessage(e, lexer.getTokenNames()),
                                              e);
        }

        tree = (CommonTree) r.getTree();
    }

    protected void initParserIncremental()
            throws SQLScriptParseException, SQLScriptRuntimeException, SQLScriptIOException {
        InputStream stream;
        try {
            stream = script.getInputStream();
        } catch (IOException e) {
            throw new SQLScriptIOException("Failed to read sql script: " + scriptName + ": " + e.getMessage(), e);
        }

        initParserIncremental(stream);
    }

    protected void initParserIncremental(InputStream stream)
            throws SQLScriptParseException, SQLScriptRuntimeException {
        LazyInputStream input = new LazyInputStream(stream);

        lexer = new SQLScriptLexer(input);
        tokens = new LazyTokenStream(lexer);

        try {
            parser = new SQLScriptParser(tokens);
        } catch (RuntimeRecognitionException re) {
            RecognitionException e = (RecognitionException) re.getCause();
            throw new SQLScriptParseException("Failed to parse sql script: " + scriptName + ": " +
                                              lexer.getErrorHeader(e) + " " +
                                              lexer.getErrorMessage(e, lexer.getTokenNames()),
                                              e);
        }
    }

    protected boolean parseTokensIncremental()
            throws SQLScriptParseException, SQLScriptRuntimeException {
        SQLScriptParser.scriptIncremental_return r;
        try {
            r = parser.scriptIncremental();
        } catch (RecognitionException e) {
            e.printStackTrace();
            throw new SQLScriptParseException("Failed to parse sql script: " + scriptName + ": " +
                                              parser.getErrorHeader(e) + " " +
                                              parser.getErrorMessage(e, parser.getTokenNames()),
                                              e);
        } catch (RuntimeRecognitionException re) {
            RecognitionException e = (RecognitionException) re.getCause();
            re.printStackTrace();
            throw new SQLScriptParseException("Failed to parse sql script: " + scriptName + ": " +
                                              lexer.getErrorHeader(e) + " " +
                                              lexer.getErrorMessage(e, lexer.getTokenNames()),
                                              e);
        }

        tree = (CommonTree) r.getTree();

        return !parser.isEOF();
    }

    protected void parseTree() throws SQLScriptParseException, SQLScriptRuntimeException {
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
        nodes.setTokenStream(tokens);

        SQLScriptWalker walker = new SQLScriptWalker(nodes);
        try {
            block = walker.parse(context.getEnv().toScope());
            TailCallOptimizer.process(block);
        } catch (RecognitionException e) {
            throw new SQLScriptParseException("Failed to parse sql script: " + scriptName + ": " +
                                              walker.getErrorHeader(e) + " " +
                                              walker.getErrorMessage(e, walker.getTokenNames()),
                                              e);
        } catch (SQLScriptRuntimeException e) {
            throw e;
        } catch (RuntimeException e) {
            throw new SQLScriptRuntimeException(e.getMessage(), e);
        }
    }

    protected Scope savedScope = null;

    protected void parseTreeIncremental() throws SQLScriptParseException, SQLScriptRuntimeException {
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
        nodes.setTokenStream(tokens);

        SQLScriptWalker walker = new SQLScriptWalker(nodes);
        try {
            if (savedScope == null) {
                savedScope = context.getEnv().toScope();
            }
            block = walker.parseIncremental(savedScope);
            savedScope = block.getScope();

            TailCallOptimizer.process(block);
        } catch (RecognitionException e) {
            throw new SQLScriptParseException("Failed to parse sql script: " + scriptName + ": " +
                                              walker.getErrorHeader(e) + " " +
                                              walker.getErrorMessage(e, walker.getTokenNames()),
                                              e);
        } catch (SQLScriptRuntimeException e) {
            throw e;
        } catch (RuntimeException e) {
            throw new SQLScriptRuntimeException(e.getMessage(), e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected Object run() throws SQLScriptException {
        initEngine();
        try {
            return runBlock();
        } finally {
            finish();
        }
    }

    protected Object runBlock() throws SQLScriptException {
        return engine.process(block);
    }

    protected void initEngine() {
        engine = SQLScriptEngine.create(context);
    }

    protected void finish() {
        if (engine == null) {
            return;
        }
        engine.finish();
    }

    /*
     * Static methods / Main program
     */

    public static Object evalIncremental(File script, Object... args)
            throws SQLScriptIOException, SQLScriptException, SQLScriptParseException {
        return evalIncremental(script, new DefaultContext(args));
    }

    public static Object evalIncremental(File script, DefaultContext context)
            throws SQLScriptIOException, SQLScriptException, SQLScriptParseException {
        SimpleResource res = new FilesystemResource(script);
        SQLScript interp = new SQLScript(context, res);
        return interp.executeIncremental();
    }

    public static Object eval(File script, Object... args)
            throws SQLScriptIOException, SQLScriptParseException, SQLScriptException {
        return eval(script, new DefaultContext(args));
    }

    protected static Object eval(File script, DefaultContext context)
            throws SQLScriptIOException, SQLScriptParseException, SQLScriptException {
        SimpleResource res = new FilesystemResource(script);
        SQLScript interp = new SQLScript(context, res);
        return interp.execute();
    }

    public static Object eval(String script, Object... args)
            throws SQLScriptIOException, SQLScriptParseException, SQLScriptException {
        return eval(script, new DefaultContext(args));
    }

    protected static Object eval(String script, DefaultContext context)
            throws SQLScriptIOException, SQLScriptParseException, SQLScriptException {
        SimpleResource res = new StringResource(script);
        SQLScript interp = new SQLScript(context, res);
        return interp.execute();
    }

    public static Block compile(File script) throws SQLScriptIOException, SQLScriptParseException {
        SimpleResource res = new FilesystemResource(script);
        SQLScript interp = new SQLScript(res);
        return interp.compile();
    }

    public static Block compile(String script) throws SQLScriptIOException, SQLScriptParseException {
        SimpleResource res = new StringResource(script);
        SQLScript interp = new SQLScript(res);
        return interp.compile();
    }

    @SuppressWarnings({"UnusedDeclaration"})
    protected static void die(String msg, Exception e, int err) {
        System.err.println(msg);

        if (e != null) {
            e.printStackTrace();
        }

        System.exit(err);
    }

    protected static void die(String msg, int err) {
        die(msg, null, err);
    }

    protected static void die(String msg) {
        die(msg, 1);
    }

    protected static void usage(CmdLineParser parser) {
        System.err.println("usage: SQLScript [-url|-props] OPTION... {-i | [-large] [FILE]} [ARG]...");
        parser.printUsage(System.err);
        System.err.println();
        System.err.println("Known drivers:");
        for (Drivers driver : Drivers.values()) {
            System.err.print(driver);
            System.err.print(": ");
            System.err.println(join((Object[])driver.getDriverClasses()));
        }
        System.exit(1);
    }

    public static void main(String[] args) {
        Args pargs = new Args();
        CmdLineParser parser = new CmdLineParser(pargs);
        try {
            parser.parseArgument(args);
        } catch (CmdLineException e) {
            System.err.println(e.getMessage());
            usage(parser);
        }

        String file = pargs.args.isEmpty() ? null : pargs.args.get(0);
        if (pargs.possiblyInteractive && file == null) {
            pargs.interactive = true;
        }
        if (pargs.interactive) {
            if (file != null || pargs.ast || pargs.large) {
                usage(parser);
            }
        }
        else if (pargs.large && pargs.ast) {
            usage(parser);
        }

        String[] scriptArgs;
        if (pargs.args.size() > 1) {
            List<String> argsList = pargs.args.subList(1, pargs.args.size());
            scriptArgs = argsList.toArray(new String[argsList.size()]);
        }
        else {
            scriptArgs = new String[0];
        }

        DriverManagerDataSource ds = null;
        if (pargs.url != null && pargs.properties != null) {
            usage(parser);
        }
        try {
            if (pargs.properties != null) {
                ds = DBUtils.createDataSourceFromProps(pargs.properties, pargs.user, pargs.pass, pargs.driver);
            }
            else if (pargs.url != null) {
                ds = DBUtils.createDataSource(pargs.url, pargs.user, pargs.pass, pargs.driver);
            }
        } catch (DBConnectionFailedException e) {
            die("Could not connect database: " + e.getMessage());
        }

        Connection conn = null;
        if (ds != null) {
            try {
                conn = ds.getConnection();
            } catch (SQLException e) {
                die("Could not connect database: " + e.getMessage());
            }
        }

        try {
            FilesystemResourceLoader loader = new FilesystemResourceLoader();
            SimpleResource script = file == null ? loader.getStdinResource() : loader.getResource(file);

            DefaultContext context = new DefaultContext(scriptArgs);
            if (conn != null) {
                context.getObjConnMgr().activate(conn);
            }
            context.addSQLResultListener(new SimpleSQLResultListener(System.out));

            SQLScript interp = new SQLScript(context, script);
            if (pargs.compile) {
                interp.compile();
            }
            else {
                if (pargs.verbose) {
                    // TODO: Provide functionality
                }
                if (pargs.interactive) {
                    interp.executeInteractive();
                }
                else if (pargs.ast) {
                    interp.showAST();
                }
                else if (pargs.large) {
                    interp.executeIncremental();
                }
                else {
                    interp.execute();
                }
            }
        } catch (SQLScriptIOException e) {
            die(e.getMessage(), e, 2);
        } catch (SQLScriptParseException e) {
            die(e.getMessage(), e, 3);
        } catch (SQLScriptException e) {
            die("Unhandled exception: " + e.getClass().getName() +
                (e.getMessage() == null ? "" : ": " + e.getMessage()),
                e, 4);
        }
    }

    protected static class Args {
        @Option(name = "-props", usage = "the properties file to be used to configure the database connection")
        public String properties = null;

        @Option(name = "-driver", usage = "the driver to be used - class name or alias (see below)")
        public String driver = null;

        @Option(name = "-url", usage = "the URL of the database to connect to")
        public String url = null;

        @Option(name = "-user", usage = "the username to use for connections")
        public String user = null;

        @Option(name = "-pass", usage = "the password to use for connections")
        public String pass = null;

        @Option(name = "-ast",
                usage = "show AST instead of executing script (not available in interactive and large file modes)")
        public boolean ast = false;

        @Option(name = "-verbose", usage = "echo executed statements")
        public boolean verbose = false;

        @Option(name = "-large", usage = "optimize for large files")
        public boolean large = false;

        @Option(name = "-c", usage = "compile only")
        public boolean compile = false;

        @Option(name = "-i", usage = "operate in interactive mode")
        public boolean interactive = false;

        /**
         * This option is intended to be used by wrapper scripts to indicate that interactive mode should
         * be activated if input is stdin.
         * This avoids the need for wrapper scripts to contain logic determining when stdin would be used as input.
         */
        @Option(name = "-I")
        public boolean possiblyInteractive = false;

        @Argument
        public List<String> args = new ArrayList<String>();
    }
}
