package org.unbunt.ella.engine.context;

/**
 * User: tweiss
 * Date: Nov 2, 2010
 * Time: 5:26:28 PM
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public interface ContextLogger {
    public void trace(String msg, Object[] args);
    public void debug(String msg, Object[] args);
    public void info(String msg, Object[] args);
    public void warn(String msg, Object[] args);
    public void error(String msg, Object[] args);
}

