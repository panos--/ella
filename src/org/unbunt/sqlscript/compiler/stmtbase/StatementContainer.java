package org.unbunt.sqlscript.compiler.stmtbase;

public interface StatementContainer extends Expression {
    public void addStatement(Statement statement);
    public void addStatement(Expression expression);
}
