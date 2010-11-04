package org.unbunt.ella.engine.context;

import org.unbunt.ella.ContextLogger;

import java.io.PrintStream;

/**
 * User: tweiss
 * Date: Nov 2, 2010
 * Time: 5:29:29 PM
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class PrintStreamLogger implements ContextLogger {
    protected final PrintStream outputStream;
    protected final PrintStream errorStream;

    public PrintStreamLogger(PrintStream outputStream, PrintStream errorStream) {
        this.outputStream = outputStream;
        this.errorStream = errorStream;
    }

    public void trace(String msg, Object[] args) {
        log(errorStream, msg, args);
    }

    public void debug(String msg, Object[] args) {
        log(errorStream, msg, args);
    }

    public void info(String msg, Object[] args) {
        log(outputStream, msg, args);
    }

    public void warn(String msg, Object[] args) {
        log(errorStream, msg, args);
    }

    public void error(String msg, Object[] args) {
        log(errorStream, msg, args);
    }

    protected void log(PrintStream out, String msg, Object[] args) {
        if (args.length == 0) {
            out.println(msg);
        }
        else {
            out.println(String.format(msg, (Object[]) args));
        }
    }

}
