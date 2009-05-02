package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.lang.Int;
import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.lang.Str;
import org.unbunt.sqlscript.support.ExpressionVisitor;
import org.unbunt.sqlscript.support.Scope;

public class IntegerLiteralExpression implements Expression {
    protected String literal;
    protected Int value;

    public IntegerLiteralExpression(String literal) {
        this.literal = literal;
        this.value = new Int(Integer.valueOf(literal));
    }

    public Obj getValue() {
        return value;
    }

    public Scope getScope() {
        return null;
    }

    public void setScope(Scope scope) {
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
