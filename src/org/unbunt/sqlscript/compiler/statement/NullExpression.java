package org.unbunt.sqlscript.compiler.statement;

import org.unbunt.sqlscript.compiler.statement.ExpressionVisitor;
import org.unbunt.sqlscript.compiler.stmtbase.Expression;

public class NullExpression implements Expression {
    public void accept(ExpressionVisitor visitor) {
        throw new UnsupportedOperationException();
    }
}
