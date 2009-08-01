package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;
import org.unbunt.sqlscript.engine.Obj;

public class ScriptClientException extends SQLScriptRuntimeException {
    protected Obj exception;

    public ScriptClientException(Obj exception) {
        super(exception.toString());
        this.exception = exception;
    }

    public Obj getException() {
        return exception;
    }
}
