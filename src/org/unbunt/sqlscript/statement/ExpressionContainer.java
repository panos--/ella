package org.unbunt.sqlscript.statement;

public interface ExpressionContainer extends Statement {
    public void addStatement(Expression expression);
}
