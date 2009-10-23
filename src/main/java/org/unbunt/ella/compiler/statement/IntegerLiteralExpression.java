package org.unbunt.ella.compiler.statement;

import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.lang.NNum;
import org.unbunt.ella.compiler.stmtbase.Expression;

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
