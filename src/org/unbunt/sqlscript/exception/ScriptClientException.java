package org.unbunt.sqlscript.exception;

import org.unbunt.sqlscript.lang.Obj;

public class ScriptClientException extends SQLScriptRuntimeException {
    protected Obj exception;

    public ScriptClientException(Obj exception) {
        this.exception = exception;
    }

    public Obj getException() {
        return exception;
    }
}
