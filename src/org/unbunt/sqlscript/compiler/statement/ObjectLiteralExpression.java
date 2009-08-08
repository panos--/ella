package org.unbunt.sqlscript.compiler.statement;

import org.unbunt.sqlscript.compiler.stmtbase.Expression;
import org.unbunt.sqlscript.compiler.support.ObjectLiteral;

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