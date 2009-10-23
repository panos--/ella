package org.unbunt.ella.compiler.statement;

import org.unbunt.ella.compiler.stmtbase.Expression;

public class SuperExpression implements Expression {
    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}