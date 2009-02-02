package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.Env;

public class IdentifierExpression extends AbstractExpression {
    protected String identifier;

    public IdentifierExpression(String identifier) {
        this.identifier = identifier;
    }

    public IdentifierExpression() {
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void accept(ScriptProcessor processor, Env env) {
    }
}
