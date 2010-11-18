package org.unbunt.ella.exception;

/**
 * User: tweiss
 * Date: Nov 18, 2010
 * Time: 5:50:20 PM
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class EllaStoppedException extends GenericException {
    public EllaStoppedException() {
    }

    public EllaStoppedException(Throwable cause) {
        super(cause);
    }

    public EllaStoppedException(String message) {
        super(message);
    }

    public EllaStoppedException(String message, Throwable cause) {
        super(message, cause);
    }
}
