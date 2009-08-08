package org.unbunt.sqlscript.compiler.statement;

import org.unbunt.sqlscript.compiler.statement.ExpressionVisitor;
import org.unbunt.sqlscript.compiler.stmtbase.Expression;

public class BooleanLiteralExpression implements Expression {
    protected boolean value;

    public BooleanLiteralExpression(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
