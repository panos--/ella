package org.unbunt.ella.compiler.stmtbase;

import org.unbunt.ella.compiler.statement.ExpressionVisitor;

/**
 * Represents statements of the EllaScript language.
 * <p>
 * Also this represents the element in the visitor pattern realized for statement objects.
 */
public interface Statement {
    public void accept(ExpressionVisitor visitor);
}
