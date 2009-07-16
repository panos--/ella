package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.ExpressionVisitor;

public interface Statement {
    public void accept(ExpressionVisitor visitor);
}
