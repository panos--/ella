package org.unbunt.sqlscript.compiler.statement;

import org.unbunt.sqlscript.compiler.statement.ExpressionVisitor;
import org.unbunt.sqlscript.compiler.stmtbase.Expression;

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
