package org.unbunt.ella.exception;

/**
 * User: tweiss
 * Date: Nov 18, 2010
 * Time: 5:46:01 PM
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class EllaInterruptedException extends EllaRuntimeException {
    public EllaInterruptedException() {
    }

    public EllaInterruptedException(Throwable cause) {
        super(cause);
    }

    public EllaInterruptedException(String message) {
        super(message);
    }

    public EllaInterruptedException(String message, Throwable cause) {
        super(message, cause);
    }
}
