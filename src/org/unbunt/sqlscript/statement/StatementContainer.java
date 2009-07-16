package org.unbunt.sqlscript.statement;

public interface StatementContainer extends Expression {
    public void addStatement(Statement statement);
    public void addStatement(Expression expression);
}
