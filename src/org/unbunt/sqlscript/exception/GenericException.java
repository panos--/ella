package org.unbunt.sqlscript.exception;

import org.unbunt.sqlscript.utils.ExceptionUtils;

/**
 * User: tweiss
 * Date: 10.04.2008
 * Time: 13:05:21
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class GenericException extends Exception {
    public GenericException() {
    }

    public GenericException(Throwable cause) {
        super(cause);
    }

    public GenericException(String message) {
        super(message);
    }

    public GenericException(String message, Throwable cause) {
        super(message, cause);
    }

    public boolean isCausedBy(Class... classes) {
        return ExceptionUtils.isCausedBy(this, classes);
    }

    public <T extends Throwable> T getCause(Class<T> cls) {
        return ExceptionUtils.getCause(this, cls);
    }
}
