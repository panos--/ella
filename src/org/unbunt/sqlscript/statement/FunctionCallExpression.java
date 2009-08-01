package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.statement.ExpressionVisitor;

public class FunctionCallExpression extends AbstractFunctionCallExpression {
    protected Expression expression;

    public FunctionCallExpression(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
