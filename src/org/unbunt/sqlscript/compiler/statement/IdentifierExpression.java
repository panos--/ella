package org.unbunt.sqlscript.compiler.statement;

import org.unbunt.sqlscript.lang.Str;
import org.unbunt.sqlscript.compiler.statement.ExpressionVisitor;
import org.unbunt.sqlscript.compiler.stmtbase.Expression;

public class IdentifierExpression implements Expression {
    protected String identifier;
    protected Str value;

    public IdentifierExpression(String identifier) {
        this.identifier = identifier;
        value = Str.toSym(identifier);
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

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
