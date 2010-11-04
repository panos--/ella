package org.unbunt.ella.engine.context;

import org.slf4j.Logger;

/**
 * User: tweiss
 * Date: Nov 2, 2010
 * Time: 5:26:12 PM
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class SLF4JContextLogger implements ContextLogger {
    protected final Logger logger;

    public SLF4JContextLogger(Logger logger) {
        this.logger = logger;
    }

    public void trace(String msg, Object[] args) {
        if (args.length == 0) {
            logger.trace(msg);
        }
        else {
            logger.trace(String.format(msg, (Object[]) args));
        }
    }

    public void debug(String msg, Object[] args) {
        if (args.length == 0) {
            logger.debug(msg);
        }
        else {
            logger.debug(String.format(msg, (Object[]) args));
        }
    }

    public void info(String msg, Object[] args) {
        if (args.length == 0) {
            logger.info(msg);
        }
        else {
            logger.info(String.format(msg, (Object[]) args));
        }
    }

    public void warn(String msg, Object[] args) {
        if (args.length == 0) {
            logger.warn(msg);
        }
        else {
            logger.warn(String.format(msg, (Object[]) args));
        }
    }

    public void error(String msg, Object[] args) {
        if (args.length == 0) {
            logger.error(msg);
        }
        else {
            logger.error(String.format(msg, (Object[]) args));
        }
    }
}
