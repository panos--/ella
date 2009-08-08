package org.unbunt.sqlscript.compiler.stmtbase;

import org.unbunt.sqlscript.compiler.statement.ExpressionVisitor;

public interface Statement {
    public void accept(ExpressionVisitor visitor);
}
