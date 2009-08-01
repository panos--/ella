package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.statement.ExpressionVisitor;
import org.unbunt.sqlscript.support.ObjectLiteral;

public class ObjectLiteralExpression implements Expression {
    protected ObjectLiteral objectLiteral;

    public ObjectLiteralExpression(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    public void setObjectLiteral(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}