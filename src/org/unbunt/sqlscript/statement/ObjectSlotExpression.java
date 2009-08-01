package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.statement.ExpressionVisitor;

public class ObjectSlotExpression implements Expression {
    public void accept(ExpressionVisitor visitor) {
        throw new UnsupportedOperationException();
    }
}
