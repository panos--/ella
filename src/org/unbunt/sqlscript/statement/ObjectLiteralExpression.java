package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.ObjectLiteral;
import org.unbunt.sqlscript.support.ExpressionVisitor;

public class ObjectLiteralExpression extends AbstractExpression {
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

    public void accept(ScriptProcessor processor, Env env) {
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}