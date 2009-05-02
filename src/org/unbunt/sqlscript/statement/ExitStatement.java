package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.ExpressionVisitor;

public class ExitStatement extends AbstractStatement {
    protected Expression expression = null;

    public ExitStatement() {
    }

    public boolean hasExpression() {
        return expression != null;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}