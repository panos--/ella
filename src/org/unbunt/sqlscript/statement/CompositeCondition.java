package org.unbunt.sqlscript.statement;

import java.util.List;
import java.util.ArrayList;

public abstract class CompositeCondition extends AbstractCondition implements ExpressionContainer {
    protected List<Expression> expressions = new ArrayList<Expression>();

    public CompositeCondition() {
    }

    public CompositeCondition(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public void addStatement(Expression expression) {
        expressions.add(expression);
    }
}
