package org.unbunt.ella.utils;

/**
 * User: tweiss
 * Date: Nov 16, 2010
 * Time: 7:58:35 PM
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class DataSourceInitializationException extends Exception {
    public DataSourceInitializationException() {
    }

    public DataSourceInitializationException(Throwable cause) {
        super(cause);
    }

    public DataSourceInitializationException(String message) {
        super(message);
    }

    public DataSourceInitializationException(String message, Throwable cause) {
        super(message, cause);
    }
}
