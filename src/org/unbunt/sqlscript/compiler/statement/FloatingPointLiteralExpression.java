package org.unbunt.sqlscript.compiler.statement;

import org.unbunt.sqlscript.engine.corelang.Obj;
import org.unbunt.sqlscript.lang.NReal;
import org.unbunt.sqlscript.compiler.stmtbase.Expression;

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