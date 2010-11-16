package org.unbunt.ella.exception;

/**
 * User: tweiss
 * Date: Nov 16, 2010
 * Time: 7:20:19 PM
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class DatabaseException extends Exception {
    public DatabaseException() {
    }

    public DatabaseException(Throwable cause) {
        super(cause);
    }

    public DatabaseException(String message) {
        super(message);
    }

    public DatabaseException(String message, Throwable cause) {
        super(message, cause);
    }
}
