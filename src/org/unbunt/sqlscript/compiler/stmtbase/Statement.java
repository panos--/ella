package org.unbunt.ella.compiler.stmtbase;

import org.unbunt.ella.compiler.statement.ExpressionVisitor;

public interface Statement {
    public void accept(ExpressionVisitor visitor);
}
