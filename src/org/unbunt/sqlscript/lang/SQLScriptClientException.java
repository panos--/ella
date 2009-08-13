package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.exception.EllaRuntimeException;
import org.unbunt.sqlscript.engine.corelang.Obj;

public class EllaClientException extends EllaRuntimeException {
    protected Obj exception;

    public EllaClientException(Obj exception) {
        super(exception.toString());
        this.exception = exception;
    }

    public Obj getException() {
        return exception;
    }
}
