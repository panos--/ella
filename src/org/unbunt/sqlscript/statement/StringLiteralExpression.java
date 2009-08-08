package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.statement.ExpressionVisitor;
import org.unbunt.sqlscript.compiler.StringLiteral;

public class StringLiteralExpression implements Expression {
    protected StringLiteral stringLiteral;

    public StringLiteralExpression(StringLiteral stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public StringLiteral getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(StringLiteral stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
