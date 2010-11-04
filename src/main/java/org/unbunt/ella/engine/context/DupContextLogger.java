package org.unbunt.ella.engine.context;

/**
 * User: tweiss
 * Date: Nov 2, 2010
 * Time: 5:25:55 PM
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class DupContextLogger implements ContextLogger {
    protected final ContextLogger baseLogger;
    protected final ContextLogger logger;

    public DupContextLogger(ContextLogger baseLogger, ContextLogger logger) {
        this.baseLogger = baseLogger;
        this.logger = logger;
    }

    public void trace(String msg, Object[] args) {
        baseLogger.trace(msg, args);
        logger.trace(msg, args);
    }

    public void debug(String msg, Object[] args) {
        baseLogger.debug(msg, args);
        logger.debug(msg, args);
    }

    public void info(String msg, Object[] args) {
        baseLogger.info(msg, args);
        logger.info(msg, args);
    }

    public void warn(String msg, Object[] args) {
        baseLogger.warn(msg, args);
        logger.warn(msg, args);
    }

    public void error(String msg, Object[] args) {
        baseLogger.error(msg, args);
        logger.error(msg, args);
    }
}