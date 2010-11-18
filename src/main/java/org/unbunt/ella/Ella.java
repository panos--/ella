package org.unbunt.ella;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.unbunt.ella.compiler.*;
import org.unbunt.ella.compiler.antlr.LazyInputStream;
import org.unbunt.ella.compiler.antlr.LazyTokenStream;
import org.unbunt.ella.compiler.statement.Block;
import org.unbunt.ella.compiler.support.Scope;
import org.unbunt.ella.engine.EllaCPSEngine;
import org.unbunt.ella.engine.EllaEngine;
import org.unbunt.ella.engine.context.Context;
import org.unbunt.ella.engine.context.PrintStreamLogger;
import org.unbunt.ella.engine.context.DupContextLogger;
import org.unbunt.ella.engine.context.SLF4JContextLogger;
import org.unbunt.ella.exception.*;
import org.unbunt.ella.lang.sql.DBUtils;
import org.unbunt.ella.lang.sql.Drivers;
import org.unbunt.ella.lang.sql.StmtBatch;
import org.unbunt.ella.resource.*;
import org.unbunt.ella.utils.*;
import static org.unbunt.ella.utils.StringUtils.join;
import sun.misc.Signal;
import sun.misc.SignalHandler;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Main interface for executing programs written in the EllaScript programming language. Also implements a
 * <code>main</code> method providing a command line interface which allows for the compilation, tree generation
 * and execution of EllaScript programs.
 */
public class Ella {
    public static final String NAME = "${pom.artifactId}";
    public static final String VERSION = "${project.finalVersion}";

    /*
     * Convenience interface to ella interpreter. For programmatic use.
     */

    protected String script = null;
    protected SimpleResource scriptResource = null;
    protected final String[] scriptArgs;

    protected ConnectionDetails connectionDetails = null;

    protected boolean logOutput = false;
    protected boolean logOnly = false;
    protected DefaultContext.LogLevel logLevel = DefaultContext.LogLevel.info;

    protected SimpleResourceLoader resourceLoader = new FilesystemResourceLoader();

    protected boolean batchStatements = false;
    protected int batchSize = 1000;

    protected InputStream inputStream = System.in;
    protected OutputStream outputStream = System.out;
    protected OutputStream errorStream = System.err;

    protected Context currentContext = null;
    protected Connection currentConnection = null;
    protected StmtBatch currentBatch = null;

    public Ella(String script) {
        this(script, new String[0]);
    }

    public Ella(String script, String[] scriptArgs) {
        this.script = script;
        this.scriptArgs = scriptArgs;
    }

    public Ella(String script, List<String> scriptArgs) {
        this(script, scriptArgs.toArray(new String[scriptArgs.size()]));
    }

    public Ella(SimpleResource scriptResource) {
        this(scriptResource, new String[0]);
    }

    public Ella(SimpleResource scriptResource, String[] scriptArgs) {
        this.scriptResource = scriptResource;
        this.scriptArgs = scriptArgs;
    }

    public Ella(SimpleResource scriptResource, List<String> scriptArgs) {
        this(scriptResource, scriptArgs.toArray(new String[scriptArgs.size()]));
    }

    protected ELLA createELLA() throws EllaIOException {
        DefaultContext context = new DefaultContext(scriptArgs);

        SimpleResource script;
        if (this.script != null && this.scriptResource != null) {
            throw new IllegalArgumentException("Only one of script or scriptResource may be provided");
        }
        else if (this.script != null) {
            try {
                script = resourceLoader.getResource(this.script);
            } catch (IOException e) {
                throw new EllaIOException("Failed to load script resource: " +
                                          this.script + ": " + e.getMessage(), e);
            }
        }
        else if (this.scriptResource != null) {
            script = this.scriptResource;
        }
        else {
            throw new IllegalArgumentException("Neither script nor scriptResource given");
        }

        return new ELLA(context, script);
    }

    protected ELLA prepareELLA() throws EllaIOException, DBConnectionFailedException, DataSourceInitializationException,
                                        DatabaseException {
        ELLA ella = createELLA();

        Context context = currentContext;

        context.setInputStream(inputStream);
        context.setOutputStream(new PrintStream(outputStream));
        context.setErrorStream(new PrintStream(errorStream));

        if (logOutput) {
            Logger ellaLogger = LoggerFactory.getLogger("ella");

            if (logOnly) {
                context.setLogger(new SLF4JContextLogger(ellaLogger));
            }
            else {
                context.setLogger(
                        new DupContextLogger(
                                new PrintStreamLogger(context.getOutputStream(), context.getErrorStream()),
                                new SLF4JContextLogger(ellaLogger))
                );
            }

            SLF4JOutputStream slf4jOutputStream =
                    new SLF4JOutputStream(ellaLogger, SLF4JOutputStream.Priority.info);
            SLF4JOutputStream slf4jErrorStream =
                    new SLF4JOutputStream(ellaLogger, SLF4JOutputStream.Priority.warn);
            OutputStream outputStream = logOnly
                                        ? slf4jOutputStream
                                        : new DupOutputStream(new OutputStream[] {
                                                context.getOutputStream(),
                                                slf4jOutputStream
                                        });
            OutputStream errorStream = logOnly
                                       ? slf4jErrorStream
                                       : new DupOutputStream(new OutputStream[] {
                                               context.getErrorStream(),
                                               slf4jErrorStream
                                       });
            context.setOutputStream(new PrintStream(outputStream));
            context.setErrorStream(new PrintStream(errorStream));
        }

        DriverManagerDataSource ds = null;
        if (connectionDetails != null) {
            ds = connectionDetails.createDataSource();
        }

        currentConnection = null;
        if (ds != null) {
            try {
                currentConnection = ds.getConnection();
            } catch (SQLException e) {
                throw new DBConnectionFailedException(e.getMessage(), e);
            }
        }

        currentBatch = null;
        if (currentConnection != null) {
            if (batchStatements) {
                try {
                    currentBatch = new StmtBatch(context, currentConnection, batchSize);
                } catch (SQLException e) {
                    throw new DatabaseException("Failed to activate batch processing: " +
                                                                e.getMessage(), e);
                } finally {
                    try { currentConnection.close(); }
                    catch (Exception ignored) {}
                }
                context.getObjConnMgr().activate(currentConnection, currentBatch);
            }
            else {
                context.getObjConnMgr().activate(currentConnection);
            }
        }

        context.addSQLResultListener(new SimpleSQLResultListener(context.getOutputStream()));

        return ella;
    }

    protected void cleanup() throws DatabaseException {
        if (currentBatch != null) {
            try {
                currentBatch.finish();
            }
            catch (SQLException e) {
                throw new DatabaseException("Batch finalization failed: " + e.getMessage(), e);
            }
            finally {
                try { if (currentConnection != null) { currentConnection.close(); } }
                catch (Exception ignored) {}
            }
        }

        if (currentConnection != null) {
            try {
                currentConnection.close();
            } catch (SQLException e) {
                throw new DatabaseException("Closing connection failed:" + e.getMessage(), e);
            }
        }
    }

    protected enum ExecType {
        DEFAULT, INTERACTIVE, INCREMENTAL
    }

    protected Object exec(ExecType execType) throws EllaParseException, EllaIOException, DBConnectionFailedException,
                                                    DataSourceInitializationException, DatabaseException, EllaException {
        try {
            ELLA ella = prepareELLA();
            try {
                switch (execType) {
                    case INTERACTIVE:
                        ella.executeInteractive();
                        return null;
                    case INCREMENTAL:
                        ella.executeIncremental();
                        return null;
                    default:
                        return ella.execute();
                }
            } finally {
                cleanup();
            }
        } catch (DatabaseException e) {
            if (currentContext != null) {
                currentContext.error(e.getMessage());
            }
            throw e;
        } catch (EllaException e) {
            Throwable cause = e.getCause();
            String msg = cause.getMessage();
            if (cause.getCause() != null && (msg == null || msg.length() == 0)) {
                msg = cause.getCause().getMessage();
            }
            String name = cause.getClass().getSimpleName();
            if (name.length() == 0) {
                name = cause.getClass().getName();
            }
            String error;
            //noinspection InstanceofInterfaces
            if (cause instanceof EllaRuntimeException && msg != null && msg.length() > 0) {
                error = msg;
            }
            else {
                error = name;
                if (msg != null && msg.length() > 0) {
                    error += ": " + msg;
                }
            }

            msg = "Unhandled exception: " + error;
            if (currentContext != null) {
                currentContext.error(msg);
            }

            throw e;
        }
    }

    public Block compile() throws EllaParseException, EllaIOException {
        ELLA ella = createELLA();
        return ella.compile();
    }

    public void showAST() throws EllaParseException, EllaIOException {
        ELLA ella = createELLA();
        ella.showAST();
    }

    public Object execute() throws EllaIOException, DBConnectionFailedException, DataSourceInitializationException,
                                   EllaParseException, EllaException, DatabaseException {
        return exec(ExecType.DEFAULT);
    }

    public void executeInteractive()
            throws EllaIOException, DBConnectionFailedException, DataSourceInitializationException,
                   DatabaseException, EllaParseException, EllaException {
        exec(ExecType.INTERACTIVE);
    }

    public void executeIncremental()
            throws EllaIOException, DBConnectionFailedException, DataSourceInitializationException,
                   DatabaseException, EllaParseException, EllaException {
        exec(ExecType.INCREMENTAL);
    }

    public Context getCurrentContext() {
        return currentContext;
    }

    public boolean isLogOutput() {
        return logOutput;
    }

    public void setLogOutput(boolean logOutput) {
        this.logOutput = logOutput;
    }

    public boolean isLogOnly() {
        return logOnly;
    }

    public void setLogOnly(boolean logOnly) {
        this.logOnly = logOnly;
    }

    public DefaultContext.LogLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(DefaultContext.LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public SimpleResourceLoader getResourceLoader() {
        return resourceLoader;
    }

    public void setResourceLoader(SimpleResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public ConnectionDetails getConnectionDetails() {
        return connectionDetails;
    }

    public void setConnectionDetails(ConnectionDetails connectionDetails) {
        this.connectionDetails = connectionDetails;
    }

    public boolean isBatchStatements() {
        return batchStatements;
    }

    public void setBatchStatements(boolean batchStatements) {
        this.batchStatements = batchStatements;
    }

    public int getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(int batchSize) {
        if (batchSize < 1) {
            throw new IllegalArgumentException("batchSize must be greater than zero");
        }
        this.batchSize = batchSize;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public OutputStream getOutputStream() {
        return outputStream;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public OutputStream getErrorStream() {
        return errorStream;
    }

    public void setErrorStream(OutputStream errorStream) {
        this.errorStream = errorStream;
    }

    /*
    * Static methods / Main program
    */

    /**
     * Evaluates the given EllaScript program in incremental mode.
     *
     * @param script the file containing the program to execute.
     * @param args arguments to pass to the program.
     * @return the result of the evaluation of the program.
     * @throws EllaIOException if reading the program file fails.
     * @throws EllaParseException if compilation of the program fails.
     * @throws EllaException if the program throws an exception.
     * @see #executeIncremental()
     */
    public static Object evalIncremental(File script, Object... args)
            throws EllaIOException, EllaParseException, EllaException {
        return evalIncremental(script, new DefaultContext(args));
    }

    /**
     * Evaluates the given EllaScript program in incremental mode using the given execution context.
     *
     * @param script the file containing the program to execute.
     * @param context the context the program is to be executed within.
     * @return the result of the evaluation of the program.
     * @throws EllaIOException if reading the program file fails.
     * @throws EllaParseException if compilation of the program fails.
     * @throws EllaException if the program throws an exception.
     * @see #executeIncremental()
     */
    public static Object evalIncremental(File script, Context context)
            throws EllaIOException, EllaParseException, EllaException {
        SimpleResource res = new FilesystemResource(script);
        ELLA interp = new ELLA(context, res);
        return interp.executeIncremental();
    }

    /**
     * Evaluates the given EllaScript program.
     *
     * @param script the file containing the program to execute.
     * @param args arguments to pass to the program.
     * @return the result of the evaluation of the program.
     * @throws EllaIOException if reading the program file fails.
     * @throws EllaParseException if compilation of the program fails.
     * @throws EllaException if the program throws an exception.
     */
    public static Object eval(File script, Object... args)
            throws EllaIOException, EllaParseException, EllaException {
        return eval(script, new DefaultContext(args));
    }

    /**
     * Evaluates the given EllaScript program using the given execution context.
     *
     * @param script the file containing the program to execute.
     * @param context the context the program is to be executed within.
     * @return the result of the evaluation of the program.
     * @throws EllaIOException if reading the program file fails.
     * @throws EllaParseException if compilation of the program fails.
     * @throws EllaException if the program throws an exception.
     */
    protected static Object eval(File script, Context context)
            throws EllaIOException, EllaParseException, EllaException {
        SimpleResource res = new FilesystemResource(script);
        ELLA interp = new ELLA(context, res);
        return interp.execute();
    }

    /**
     * Evaluates the given EllaScript program.
     *
     * @param script the source code of the program to execute.
     * @param args arguments to pass to the program.
     * @return the result of the evaluation of the program.
     * @throws EllaIOException if reading the program file fails.
     * @throws EllaParseException if compilation of the program fails.
     * @throws EllaException if the program throws an exception.
     */
    public static Object eval(String script, Object... args)
            throws EllaIOException, EllaParseException, EllaException {
        return eval(script, new DefaultContext(args));
    }

    /**
     * Evaluates the given EllaScript program using the given execution context.
     *
     * @param script the source code the program to execute.
     * @param context the context the program is to be executed within.
     * @return the result of the evaluation of the program.
     * @throws EllaIOException if reading the program file fails.
     * @throws EllaParseException if compilation of the program fails.
     * @throws EllaException if the program throws an exception.
     */
    protected static Object eval(String script, Context context)
            throws EllaIOException, EllaParseException, EllaException {
        SimpleResource res = new StringResource(script);
        ELLA interp = new ELLA(context, res);
        return interp.execute();
    }

    /**
     * Compiles the given EllaScript program into an executable form.
     *
     * @param script the file containing the program to compile.
     * @return the executable form of the program.
     * @throws EllaIOException if reading the program file fails.
     * @throws EllaParseException if compilation of the program fails.
     */
    public static Block compile(File script) throws EllaIOException, EllaParseException {
        SimpleResource res = new FilesystemResource(script);
        ELLA interp = new ELLA(res);
        return interp.compile();
    }

    /**
     * Compiles the given EllaScript program into an executable form.
     *
     * @param script the souce code of the program to compile.
     * @return the executable form of the program.
     * @throws EllaIOException if reading the program file fails.
     * @throws EllaParseException if compilation of the program fails.
     */
    public static Block compile(String script) throws EllaIOException, EllaParseException {
        SimpleResource res = new StringResource(script);
        ELLA interp = new ELLA(res);
        return interp.compile();
    }

    @SuppressWarnings({"UnusedDeclaration"})
    protected static void err(String msg, Exception e) {
        System.err.println(msg);
    }

    protected static void err(String msg) {
        err(msg, null);
    }

    protected static int usage(CmdLineParser parser) {
        version();
        System.err.println();
        System.err.println("usage: Ella [-url|-props] OPTION... {-i | [-large] [FILE]} [ARG]...");
        parser.printUsage(System.err);
        System.err.println();
        System.err.println("Known drivers:");
        for (Drivers driver : DBUtils.getKnownDrivers()) {
            System.err.print(driver);
            System.err.print(": ");
            System.err.println(join((Object[])driver.getDriverClasses()));
        }
        return 1;
    }

    protected static void version() {
        System.err.println(NAME + " " + VERSION);
    }

    protected static int run(String[] args) {
        Args pargs = new Args();
        CmdLineParser parser = new CmdLineParser(pargs);
        try {
            parser.parseArgument(args);
        } catch (CmdLineException e) {
            System.err.println(e.getMessage());
            return usage(parser);
        }

        if (pargs.showUsage) {
            return usage(parser);
        }

        if (pargs.showVersion) {
            version();
            return 0;
        }

        String file = pargs.args.isEmpty() ? null : pargs.args.get(0);
        if (pargs.possiblyInteractive && file == null) {
            pargs.interactive = true;
        }
        if (pargs.interactive) {
            if (file != null || pargs.ast || pargs.large) {
                return usage(parser);
            }
        }
        else if (pargs.large && pargs.ast) {
            return usage(parser);
        }

        String[] scriptArgs;
        if (pargs.args.size() > 1) {
            List<String> argsList = pargs.args.subList(1, pargs.args.size());
            scriptArgs = argsList.toArray(new String[argsList.size()]);
        }
        else {
            scriptArgs = new String[0];
        }

        FilesystemResourceLoader loader = new FilesystemResourceLoader();
        SimpleResource script = file == null ? loader.getStdinResource() : loader.getResource(file);
        Ella ella = new Ella(script, scriptArgs);
        ella.setResourceLoader(loader);
        ella.setInputStream(System.in);
        ella.setOutputStream(System.out);
        ella.setErrorStream(System.err);

        try {
            if (pargs.verbose) {
                // TODO: Provide functionality
            }

            if (pargs.quiet) {
                ella.setLogLevel(Context.LogLevel.warn);
            }

            ella.setLogOutput(pargs.log);
            ella.setLogOnly(pargs.logonly);

            if (pargs.compile) {
                ella.compile();
                return 0;
            }
            else if (pargs.ast) {
                ella.showAST();
                return 0;
            }

            if (pargs.url != null && pargs.properties != null) {
                return usage(parser);
            }
            if (pargs.properties != null) {
                ConnectionPropertiesResource connDetails =
                        new ConnectionPropertiesResource(ella.getResourceLoader(), pargs.properties);
                connDetails.setUser(pargs.user);
                connDetails.setPass(pargs.pass);
                connDetails.setDriver(pargs.driver);
                ella.setConnectionDetails(connDetails);
            }
            else if (pargs.url != null) {
                ConnectionURL connDetails =
                        new ConnectionURL(pargs.url);
                connDetails.setUser(pargs.user);
                connDetails.setPass(pargs.pass);
                connDetails.setDriver(pargs.driver);
            }

            ella.setBatchStatements(pargs.batch > 1);
            ella.setBatchSize(pargs.batch);

            if (pargs.interactive) {
                ella.executeInteractive();
            }
            else if (pargs.large) {
                ella.executeIncremental();
            }
            else {
                ella.execute();
            }
        } catch (EllaIOException e) {
            err(e.getMessage(), e);
            return 2;
        } catch (EllaParseException e) {
            err(e.getMessage(), e);
            return 3;
        } catch (EllaException e) {
            return 4;
        } catch (DBConnectionFailedException e) {
            err(e.getMessage(), e);
            return 2;
        } catch (DataSourceInitializationException e) {
            err(e.getMessage(), e);
            return 2;
        } catch (DatabaseException e) {
            return 2;
        }

        return 0;
    }

    /**
     * Provides a command line interface to the EllaScript interpreter.
     *
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        System.exit(run(args));
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

//        @Option(name = "-verbose", usage = "echo executed statements")
        public boolean verbose = false;

        @Option(name = "-quiet", usage = "don't echo SQL statements, don't print informational messages")
        public boolean quiet = false;

        @Option(name = "-log", usage = "log all output")
        public boolean log = false;

        @Option(name = "-logonly", usage = "route all output through the SLF4J logging system")
        public boolean logonly = false;

        @Option(name = "-large", usage = "optimize for large files")
        public boolean large = false;

        @Option(name = "-batch", usage = "activate batch mode with the given size")
        public int batch = 0;

        @Option(name = "-c", usage = "compile only")
        public boolean compile = false;

        @Option(name = "-i", usage = "operate in interactive mode")
        public boolean interactive = false;

        @Option(name = "-h", aliases = "-help", usage = "prints this message")
        public boolean showUsage = false;

        /**
         * This option is intended to be used by wrapper scripts to indicate that interactive mode should
         * be activated if input is stdin.
         * This avoids the need for wrapper scripts to contain logic determining when stdin would be used as input.
         */
        @Option(name = "-I")
        public boolean possiblyInteractive = false;

        @Option(name = "-version", usage = "show version number")
        public boolean showVersion = false;

        @Argument
        public List<String> args = new ArrayList<String>();
    }
    public static class ELLA {
        private static final Logger logger = LoggerFactory.getLogger(ELLA.class);

        protected Context context;
        protected SimpleResource script;
        protected String scriptName;

        protected EllaLexer lexer;
        protected LazyTokenStream tokens;

        protected EllaParser parser;
        protected CommonTree tree;

        protected EllaWalker walker;

        protected EllaEngine engine = null;
        protected Block block; // the parsed script to be run by the engine

        /**
         * Creates a new Ella instance for compilation or execution of the EllaScript program
         * specified by the given resource.
         * <p>
         * The program is to be executed in an context made up by a fresh instance of class
         * <code>DefaultContext</code>.
         *
         * @param script the resource representing the EllaScript program to compile or execute.
         * @see org.unbunt.ella.DefaultContext
         */
        public ELLA(SimpleResource script) {
            this(new DefaultContext(), script);
        }

        /**
         * Creates a new Ella instance for compilation or execution of the EllaScript program
         * specified by the given resource within the given context.
         *
         * @param context the context to execute the EllaScript program in.
         * @param script the resource representing the EllaScript program to compile or execute.
         */
        public ELLA(Context context, SimpleResource script) {
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
                    logger.trace("Readline lib {} not found...", lib.getName());
                } catch (Exception ignored) {
                }
            }
            Readline.initReadline("Ella");
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

        /**
         * Executes an EllaScript program in interactive mode. In this mode the user is presented a shell-like
         * console interface where arbitrary EllaScript statements can be entered. As soon as a statement has been entered
         * completely and submitted by pressing <code>RETURN</code>, the statement will be executed.
         * <p>
         * Execution finishes when <code>EOF</code> if read or execution is terminated explicitly via the respective
         * function of the EllaScript language.
         * <p>
         * In this mode input is always read from the standard input stream. The script resource given to this Ella object
         * via one of it's constructors is not used.
         *
         * @throws EllaIOException if reading from standard input fails.
         */
        public void executeInteractive() throws EllaIOException {
            initInteractive();
            initEngine();

            try {
                String line;
                StringBuilder buf = new StringBuilder();
                boolean incompleteString = false;
                int stringType = -1;
                while (!engine.isExited()) {
                    boolean continued = buf.length() != 0;

                    String prompt = "=>";
                    if (continued) {
                        if (incompleteString) {
                            switch (stringType) {
                                case EllaParser.SQUOT:   prompt = "'>";  break;
                                case EllaParser.DQUOT:   prompt = "\">"; break;
                                case EllaParser.BTICK:   prompt = "`>";  break;
                                case EllaParser.QQUOT:   prompt = "Q>";  break;
                                case EllaParser.DOLQUOT: prompt = "$>";  break;
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
                        throw new EllaIOException(e);
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
                        } catch (EllaRecognitionException e) {
                            if (e.isCausedBy(UnterminatedStringException.class)) {
                                UnterminatedStringException ex = e.getCause(UnterminatedStringException.class);
                                stringType = ex.getStringType();
                                incompleteInput = true;
                                incompleteString = true;
                            }
                            else if (e.isCausedBy(UnexpectedEOFException.class)
                                    || (e.isCausedBy(RecognitionException.class)
                                        && (e.getCause(RecognitionException.class)).getUnexpectedType() == EllaParser.EOF)) {
                                incompleteInput = true;
                                incompleteString = false;
                            }
                            else {
                                throw e;
                            }
                        }
                    } catch (Exception e) {
                        System.err.println("ERROR: " + e.getMessage());
                        logger.debug(e.getMessage(), e);
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

        /**
         * Executes the EllaScript program incrementally. This mode is intended to be used for large programs as it
         * requires only a limited amount of memory since only one statement from the program is compiled and executed
         * at a time.
         *
         * @return the result of the evaluation of the program.
         * @throws EllaIOException if reading the program fails.
         * @throws EllaParseException if compilation of the program fails.
         * @throws EllaException if an exception is thrown from the program.
         */
        public Object executeIncremental() throws EllaIOException, EllaParseException, EllaException {
            initParserIncremental();
            initEngine();
            try {
                Object result = null;
                while (parseTokensIncremental() && !engine.isExited()) {
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

        /**
         * Executes the EllaScript program.
         *
         * @return the result of the evaluation of the program.
         * @throws EllaIOException if reading the program fails.
         * @throws EllaParseException if compilation of the program fails.
         * @throws EllaException if an exception is thrown from the program.
         */
        public Object execute()
                throws EllaIOException, EllaParseException, EllaException {
            tokenize();
            parseTokens();
            parseTree();
            return run();
        }

        /**
         * Compiles the EllaScript program.
         *
         * @return the executable form of the program.
         * @throws EllaIOException if reading the program fails.
         * @throws EllaParseException if compilation of the program fails.
         */
        public Block compile() throws EllaIOException, EllaParseException {
            tokenize();
            parseTokens();
            parseTree();
            return block;
        }

        /**
         * Compiles the EllaScript program into an abstract syntax tree and generates a visual representation of it.
         * <p>
         * FIXME: Currently this is done in a platform specific way since it relies on the <code>dot</code> and
         *        <code>xdg-open</code> programs, which are not available on all platforms supporting Java.
         *
         * @throws EllaIOException if reading the program fails.
         * @throws EllaParseException if compilation of the program fails.
         */
        public void showAST() throws EllaIOException, EllaParseException {
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
                    throw new EllaIOException("dot command failed");
                }

                Runtime.getRuntime().exec(new String[] { "xdg-open", pngFile.getPath() });
            } catch (IOException e) {
                throw new EllaIOException(e);
            }
        }

        protected void tokenize() throws EllaIOException {
            try {
                tokenize(script.getInputStream());
            } catch (Exception e) {
                throw new EllaIOException("Failed to read sql script: " + scriptName + ": " + e.getMessage(), e);
            }
        }

        protected void tokenize(InputStream stream) throws EllaIOException {
            LazyInputStream input;
            try {
                input = new LazyInputStream(stream);
            } catch (Exception e) {
                throw new EllaIOException("Failed to read sql script: " + scriptName + ": " + e.getMessage(), e);
            }

            lexer = new EllaLexer(input);
            tokens = new LazyTokenStream(lexer);
        }

        protected void parseTokens() throws EllaParseException {
            if (parser == null) {
                parser = new EllaParser(tokens);
            }
            else {
                parser.setTokenStream(tokens);
            }

            EllaParser.script_return r;
            try {
                r = parser.parseScript();
            } catch (EllaRecognitionException e) {
                RecognitionException re = e.getCause();
                throw new EllaRecognitionException("Failed to parse sql script: " + scriptName + ": " +
                                                  parser.getErrorHeader(re) + " " +
                                                  parser.getErrorMessage(re, parser.getTokenNames()),
                                                  re);
            } catch (EllaParseException e) {
                throw new EllaParseException("Failed to parse sql script: " + scriptName + ": " + e.getMessage(), e);
            }

            tree = (CommonTree) r.getTree();
        }

        protected void initParserIncremental() throws EllaIOException {
            InputStream stream;
            try {
                stream = script.getInputStream();
            } catch (IOException e) {
                throw new EllaIOException("Failed to read sql script: " + scriptName + ": " + e.getMessage(), e);
            }

            initParserIncremental(stream);
        }

        protected void initParserIncremental(InputStream stream) {
            LazyInputStream input = new LazyInputStream(stream);

            lexer = new EllaLexer(input);
            tokens = new LazyTokenStream(lexer);
            parser = new EllaParser(tokens);
        }

        protected boolean parseTokensIncremental() throws EllaParseException {
            EllaParser.scriptIncremental_return r;
            try {
                r = parser.parseScriptIncremental();
            } catch (EllaRecognitionException e) {
                RecognitionException re = e.getCause();
                throw new EllaRecognitionException("Failed to parse sql script: " + scriptName + ": " +
                                                  parser.getErrorHeader(re) + " " +
                                                  parser.getErrorMessage(re, parser.getTokenNames()),
                                                  re);
            } catch (EllaParseException e) {
                throw new EllaParseException("Failed to parse sql script: " + scriptName + ": " + e.getMessage(), e);
            }

            tree = (CommonTree) r.getTree();

            return !parser.isEOF();
        }

        protected void parseTree() throws EllaRecognitionException {
            CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
            nodes.setTokenStream(tokens);

            EllaWalker walker = new EllaWalker(nodes);
            try {
                block = walker.walkScript(context.getEnv().toScope());
                TailCallOptimizer.process(block);
            } catch (EllaRecognitionException e) {
                RecognitionException re = e.getCause();
                throw new EllaRecognitionException("Failed to parse sql script: " + scriptName + ": " +
                                                  walker.getErrorHeader(re) + " " +
                                                  walker.getErrorMessage(re, walker.getTokenNames()),
                                                  re);
            }
        }

        protected Scope savedScope = null;

        protected void parseTreeIncremental() throws EllaRecognitionException {
            CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
            nodes.setTokenStream(tokens);

            EllaWalker walker = new EllaWalker(nodes);
            try {
                if (savedScope == null) {
                    savedScope = context.getEnv().toScope();
                }
                block = walker.walkScript(savedScope);
                savedScope = block.getScope();

                TailCallOptimizer.process(block);
            } catch (EllaRecognitionException e) {
                RecognitionException re = e.getCause();
                throw new EllaRecognitionException("Failed to parse sql script: " + scriptName + ": " +
                                                  walker.getErrorHeader(re) + " " +
                                                  walker.getErrorMessage(re, walker.getTokenNames()),
                                                  re);
            }
        }

        protected Object run() throws EllaException {
            initEngine();
            try {
                return runBlock();
            } finally {
                finish();
            }
        }

        protected Object runBlock() throws EllaException {
            return engine.eval(block);
        }

        protected void initEngine() {
            engine = EllaCPSEngine.create(context);
        }

        protected void finish() {
            if (engine == null) {
                return;
            }
            engine.finish();
        }
    }
}
