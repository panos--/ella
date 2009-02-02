package org.unbunt.sqlscript.statement;

public interface StatementContainer extends ExpressionContainer {
    public void addStatement(Statement statement);
}
