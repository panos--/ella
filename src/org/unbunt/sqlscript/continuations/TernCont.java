package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Expression;

public class TernCont implements Continuation {
    protected Expression trueExpression;
    protected Expression falseExpression;

    public TernCont(Expression trueExpression, Expression falseExpression) {
        this.trueExpression = trueExpression;
        this.falseExpression = falseExpression;
    }

    public Expression getTrueExpression() {
        return trueExpression;
    }

    public Expression getFalseExpression() {
        return falseExpression;
    }
}
