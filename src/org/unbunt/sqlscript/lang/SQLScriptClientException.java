package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;
import org.unbunt.sqlscript.engine.corelang.Obj;

public class SQLScriptClientException extends SQLScriptRuntimeException {
    protected Obj exception;

    public SQLScriptClientException(Obj exception) {
        super(exception.toString());
        this.exception = exception;
    }

    public Obj getException() {
        return exception;
    }
}
