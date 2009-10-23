package org.unbunt.ella.compiler.stmtbase;

/**
 * Represents statements or expressions of the EllaScript language that can contain other statements or expressions.
 */
public interface StatementContainer extends Expression {
    public void addStatement(Statement statement);
    public void addStatement(Expression expression);
}
