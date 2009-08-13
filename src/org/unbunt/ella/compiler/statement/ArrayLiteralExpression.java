package org.unbunt.ella.compiler.statement;

import org.unbunt.ella.compiler.statement.ExpressionVisitor;
import org.unbunt.ella.compiler.stmtbase.Expression;

import java.util.List;

public class ArrayLiteralExpression implements Expression {
    protected final Expression[] components;

    public ArrayLiteralExpression(List<Expression> components) {
        this.components = components.toArray(new Expression[components.size()]);
    }

    public Expression[] getComponents() {
        return components;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}