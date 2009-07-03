package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.lang.Bool;
import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.support.ExpressionVisitor;

public class BooleanLiteralExpression extends AbstractExpression {
    protected boolean value;

    public BooleanLiteralExpression(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
