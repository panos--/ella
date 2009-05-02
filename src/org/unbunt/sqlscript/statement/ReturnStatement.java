package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.ExpressionVisitor;

public class ReturnStatement extends AbstractStatement {
    protected Expression expression = null;

    protected boolean optimizeForTailCall = false;

    public ReturnStatement() {
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

    public boolean isOptimizeForTailCall() {
        return optimizeForTailCall;
    }

    public void setOptimizeForTailCall(boolean optimizeForTailCall) {
        this.optimizeForTailCall = optimizeForTailCall;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
