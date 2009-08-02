package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.engine.Obj;
import org.unbunt.sqlscript.lang.NReal;

public class FloatingPointLiteralExpression implements Expression {
    protected String literal;
    protected NReal value;

    public FloatingPointLiteralExpression(String literal) {
        this.literal = literal;
        this.value = new NReal(Double.valueOf(literal));
    }

    public Obj getValue() {
        return value;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}