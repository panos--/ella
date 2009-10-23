package org.unbunt.ella.compiler.statement;

import org.unbunt.ella.compiler.statement.ExpressionVisitor;
import org.unbunt.ella.compiler.stmtbase.Expression;
import org.unbunt.ella.compiler.stmtbase.Statement;

public class ReturnStatement implements Statement {
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
