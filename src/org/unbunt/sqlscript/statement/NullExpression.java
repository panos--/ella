package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.ExpressionVisitor;

public class NullExpression implements Expression {
    public void accept(ExpressionVisitor visitor) {
        throw new UnsupportedOperationException();
    }
}
