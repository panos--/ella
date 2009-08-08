package org.unbunt.sqlscript.compiler.statement;

import org.unbunt.sqlscript.compiler.statement.ExpressionVisitor;
import org.unbunt.sqlscript.compiler.support.StringLiteral;
import org.unbunt.sqlscript.compiler.stmtbase.Expression;

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
