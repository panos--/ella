package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.statement.ExpressionVisitor;

public interface Statement {
    public void accept(ExpressionVisitor visitor);
}
