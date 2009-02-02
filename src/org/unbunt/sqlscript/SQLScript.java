package org.unbunt.sqlscript;

import org.unbunt.sqlscript.annotations.DescriptionAnnotation;
import org.unbunt.sqlscript.exception.RuntimeRecognitionException;
import org.unbunt.sqlscript.exception.SQLScriptIOException;
import org.unbunt.sqlscript.exception.SQLScriptParseException;
import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;
import org.unbunt.sqlscript.support.Drivers;
import static org.unbunt.utils.StringUtils.isNullOrEmpty;
import org.unbunt.utils.res.FilesystemResourceLoader;
import org.unbunt.utils.res.SimpleResource;
import org.unbunt.utils.VolatileObservable;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;
import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import java.io.*;
import java.util.*;

public class SQLScript extends VolatileObservable implements Observer {
    protected SQLScriptContext context;
    protected SimpleResource script;
    protected String scriptName;

    protected SQLScriptLexer lexer;
    protected CommonTokenStream tokens;

    protected SQLScriptParser parser;
    protected CommonTree tree;

    protected SQLScriptWalker walker;

    public SQLScript(SQLScriptContext context, SimpleResource script) {
        this.context = context;
        this.script = script;
        this.scriptName = script.getFilename();
        context.setScript(script);
    }

    public void execute() throws SQLScriptIOException, SQLScriptParseException, SQLScriptRuntimeException {
        tokenize();
        parseTokens();
        parseAndRunTree();
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
        ANTLRInputStream input;
        try {
            input = new ANTLRInputStream(script.getInputStream());
        } catch (Exception e) {
            throw new SQLScriptIOException("Failed to read sql script: " + scriptName + ": " + e.getMessage(), e);
        }

        lexer = new SQLScriptLexer(input);
        tokens = new CommonTokenStream(lexer);
    }

    protected void parseTokens() throws SQLScriptParseException, SQLScriptRuntimeException {
        SQLScriptParser parser;
        try {
            parser = new SQLScriptParser(tokens);
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

    protected void parseAndRunTree() throws SQLScriptParseException, SQLScriptRuntimeException {
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
        nodes.setTokenStream(tokens);

        SQLScriptWalker walker = new SQLScriptWalker(nodes);
        walker.setScriptContext(context);
        try {
            walker.run(this);
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

    public void update(Observable o, Object arg) {
        notifyObservers(arg);
    }
/*
     * Static methods / Main program
     */

    protected static void usage(CmdLineParser parser) {
        System.err.println("usage: SQLScript OPTION... [FILE]");
        parser.printUsage(System.err);
        System.exit(1);
    }

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

    public static void main(String[] args) {
        class ScriptObserver implements Observer {
            public void update(Observable o, Object arg) {
                if (arg instanceof SQLScriptEngine.EvalCommandState) {
                    SQLScriptEngine.EvalCommandState state = (SQLScriptEngine.EvalCommandState) arg;
                    if (SQLScriptEngine.CommandState.STARTING.equals(state.state)) {
                        String title = null;
                        if (state.command.isAnnotationPresent(DescriptionAnnotation.class)) {
                            DescriptionAnnotation desc = state.command.getAnnotation(DescriptionAnnotation.class);
                            title = desc.getTitle();
                        }
                        System.err.println("Command: " + (title == null ? state.command : title));
                    }
                    else if (SQLScriptEngine.CommandState.PROGRESSED.equals(state.state) && state.progessMsg != null) {
                        System.err.println(state.progessMsg);
                    }
                }
                else if (arg instanceof SQLScriptEngine.SQLStatementState) {
                    SQLScriptEngine.SQLStatementState state = (SQLScriptEngine.SQLStatementState) arg;
                    if (SQLScriptEngine.CommandState.STARTING.equals(state.state)) {
                        String title = null;
                        if (state.statement.isAnnotationPresent(DescriptionAnnotation.class)) {
                            DescriptionAnnotation desc = state.statement.getAnnotation(DescriptionAnnotation.class);
                            title = desc.getTitle();
                        }
                        System.err.println("Statement: " + (title == null ? state.queryString : title));
                    }
                }
                else {
                    // ignoring unknown notification object
                }
            }
        }

        class Args {
            @Option(name = "-props", usage = "the properties file to be used to configure the database connection")
            public String properties = null;

            @Option(name = "-type", usage = "the database type - can be used instead of -driver option for known databases",
                    metaVar = "postgresql/mysql")
            public String type = null;

            @Option(name = "-driver", usage = "the driver class to be used")
            public String driver = null;

            @Option(name = "-url", usage = "the URL of the database to connect to")
            public String url = null;

            @Option(name = "-user", usage = "the username to use for connections")
            public String user = null;

            @Option(name = "-pass", usage = "the password to use for connections")
            public String pass = null;

            @Option(name = "-ast", usage = "show AST instead of executing script")
            public boolean ast = false;

            @Option(name = "-verbose")
            public boolean verbose = false;

            @Argument
            public List<String> args = new ArrayList<String>();
        }

        Args pargs = new Args();
        CmdLineParser parser = new CmdLineParser(pargs);
        try {
            parser.parseArgument(args);
        } catch (CmdLineException e) {
            System.err.println(e.getMessage());
            usage(parser);
        }

        if (pargs.args.size() > 1) {
            usage(parser);
        }
        String file = pargs.args.isEmpty() ? null : pargs.args.get(0);

        DriverManagerDataSource ds = new SingleConnectionDataSource();

        Properties props = null;
        if (!isNullOrEmpty(pargs.properties)) {
            props = new Properties();
            try {
                props.load(new FileInputStream(pargs.properties));
            } catch (IOException e) {
                die("Failed to load properties: " + e.getMessage(), 1);
            }

            if (props.getProperty("username") != null && props.getProperty("user") == null) {
                props.setProperty("user", props.getProperty("username"));
            }
            else if (props.getProperty("user") != null && props.getProperty("username") == null) {
                props.setProperty("username", props.getProperty("user"));
            }
        }

        String driverClassName = null;
        if (!isNullOrEmpty(pargs.driver)) {
            try {
                Class.forName(pargs.driver);
                driverClassName = pargs.driver;
            } catch (Exception e) {
                die("Could not load database driver: " + pargs.driver + ": " + e.getMessage(), 1);
            }
        }
        else if (!isNullOrEmpty(pargs.type)) {
            String[] typeDrivers = null;
            try {
                typeDrivers = Drivers.valueOf(pargs.type).getDriverClasses();
            } catch (IllegalArgumentException ignored) {
            }
            if (typeDrivers == null || typeDrivers.length == 0) {
                die("Unknown driver type: " + pargs.type + " - Use -driver option to specify a driver class", 1);
            }

            boolean loaded = false;
            for (String typeDriver : typeDrivers) {
                try {
                    Class.forName(typeDriver);
                    driverClassName = typeDriver;
                    loaded = true;
                    break;
                } catch (Exception ignored) {
                }
            }

            if (!loaded) {
                die("Could not load driver for database type: " + pargs.type + " - Try using -driver");
            }
        }
        else if (props != null) {
            String dcnProp = props.getProperty("driverClassName");
            if (dcnProp != null) {
                driverClassName = dcnProp;
            }
        }

        if (driverClassName != null) {
            ds.setDriverClassName(driverClassName);
        }

        if (!isNullOrEmpty(pargs.url)) {
            ds.setUrl(pargs.url);
        }
        else if (props != null && props.getProperty("url") != null) {
            ds.setUrl(props.getProperty("url"));
        }

        if (!isNullOrEmpty(pargs.user)) {
            ds.setUsername(pargs.user);
        }
        else if (props != null && props.getProperty("user") != null) {
            ds.setUsername(pargs.user);
        }

        if (pargs.pass != null) { // NOTE: not using isNullOrEmpty to allow empty string as password
            ds.setPassword(pargs.pass);
        }
        else if (props != null && props.getProperty("password") != null) {
            ds.setPassword(props.getProperty("password"));
        }

        if (props != null) {
            ds.setConnectionProperties(props);
        }

        DefaultSQLScriptContext ctx = new DefaultSQLScriptContext();
        ctx.setDataSource(ds);

        try {
            FilesystemResourceLoader loader = new FilesystemResourceLoader();
            SimpleResource script = file == null ? loader.getStdinResource() : loader.getResource(file);
            SQLScript interp = new SQLScript(ctx, script);
            if (pargs.verbose) {
                interp.addObserver(new ScriptObserver());
            }
            if (pargs.ast) {
                interp.showAST();
            }
            else {
                interp.execute();
            }
        } catch (SQLScriptIOException e) {
            die(e.getMessage(), e, 2);
        } catch (SQLScriptParseException e) {
            die(e.getMessage(), e, 3);
        } catch (SQLScriptRuntimeException e) {
            die(e.getClass().getSimpleName() + (e.getMessage() == null ? "" : ": " + e.getMessage()), e, 4);
        }
    }
}
