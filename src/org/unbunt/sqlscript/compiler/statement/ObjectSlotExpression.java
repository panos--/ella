package org.unbunt.sqlscript.compiler.statement;

import org.unbunt.sqlscript.compiler.statement.ExpressionVisitor;
import org.unbunt.sqlscript.compiler.stmtbase.Expression;

public class ObjectSlotExpression implements Expression {
    public void accept(ExpressionVisitor visitor) {
        throw new UnsupportedOperationException();
    }
}
