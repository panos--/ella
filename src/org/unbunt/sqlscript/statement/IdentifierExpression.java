package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.lang.Str;
import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.ExpressionVisitor;

public class IdentifierExpression extends AbstractExpression {
    protected String identifier;
    protected Str value;

    public IdentifierExpression(String identifier) {
        this.identifier = identifier;
        value = new Str(identifier).intern();
    }

    public IdentifierExpression() {
    }

    public Str getValue() {
        return value;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void accept(ScriptProcessor processor, Env env) {
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
