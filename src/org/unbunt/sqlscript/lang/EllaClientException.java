package org.unbunt.ella.lang;

import org.unbunt.ella.exception.EllaRuntimeException;
import org.unbunt.ella.engine.corelang.Obj;

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
