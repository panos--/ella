package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.ExpressionVisitor;

public class TernaryCondExpression extends AbstractExpression {
    protected Expression condition;
    protected Expression trueExpression;
    protected Expression falseExpression;

    public TernaryCondExpression(Expression condition,
                                 Expression trueExpression,
                                 Expression falseExpression) {
        this.condition = condition;
        this.trueExpression = trueExpression;
        this.falseExpression = falseExpression;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Expression getTrueExpression() {
        return trueExpression;
    }

    public void setTrueExpression(Expression trueExpression) {
        this.trueExpression = trueExpression;
    }

    public Expression getFalseExpression() {
        return falseExpression;
    }

    public void setFalseExpression(Expression falseExpression) {
        this.falseExpression = falseExpression;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
