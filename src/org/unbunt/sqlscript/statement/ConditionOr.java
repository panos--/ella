package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.ExpressionVisitor;

import java.util.List;

public class ConditionOr extends CompositeCondition {
    public ConditionOr() {
    }

    public ConditionOr(List<Expression> expressions) {
        super(expressions);
    }

    public List<Expression> getExpressions() {
        assert expressions.size() > 0 : "expressions must have at least one element";
        return expressions;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}