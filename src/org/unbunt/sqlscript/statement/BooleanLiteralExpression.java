package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.lang.Bool;
import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.support.ExpressionVisitor;

public class BooleanLiteralExpression extends AbstractExpression {
    protected Bool bool;

    public BooleanLiteralExpression(Bool bool) {
        this.bool = bool;
    }

    public Bool getBool() {
        return bool;
    }

    @Override
    public Obj getValue() {
        return getBool();
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
