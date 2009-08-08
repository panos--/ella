package org.unbunt.sqlscript.exception;

import org.unbunt.sqlscript.exception.ExceptionUtils;

/**
 * User: tweiss
 * Date: 10.04.2008
 * Time: 13:05:21
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class GenericRuntimeException extends RuntimeException {
    public GenericRuntimeException() {
    }

    public GenericRuntimeException(Throwable cause) {
        super(cause);
    }

    public GenericRuntimeException(String message) {
        super(message);
    }

    public GenericRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public boolean isCausedBy(Class... classes) {
        return ExceptionUtils.isCausedBy(this, classes);
    }

    public <T extends Throwable> T getCause(Class<T> cls) {
        return ExceptionUtils.getCause(this, cls);
    }
}