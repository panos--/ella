package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.Scope;

public abstract class AbstractStatement implements Statement {
    protected Scope scope;

    protected AbstractStatement() {
        scope = null;
    }

    protected AbstractStatement(Scope scope) {
        this.scope = scope;
    }

    public Scope getScope() {
        assert scope != null : "scope must be initialized before use";
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }
}
