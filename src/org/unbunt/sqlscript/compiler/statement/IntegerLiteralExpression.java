package org.unbunt.sqlscript.compiler.statement;

import org.unbunt.sqlscript.engine.natives.Obj;
import org.unbunt.sqlscript.lang.NNum;
import org.unbunt.sqlscript.compiler.stmtbase.Expression;

public class IntegerLiteralExpression implements Expression {
    protected String literal;
    protected NNum value;

    public IntegerLiteralExpression(String literal) {
        this.literal = literal;
        this.value = new NNum(Long.valueOf(literal));
    }

    public Obj getValue() {
        return value;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
