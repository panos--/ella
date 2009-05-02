package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.ExpressionVisitor;
import org.unbunt.sqlscript.support.Scope;

public interface Statement {
    public Scope getScope();
    public void setScope(Scope scope);
    public void accept(ExpressionVisitor visitor);
}
