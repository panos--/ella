package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Expression;

public class CondEqCont implements Continuation {
    protected Expression expression;

    public CondEqCont(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
}
