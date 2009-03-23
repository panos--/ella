package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.lang.Obj;

import java.util.Map;

public interface PrimitiveExpression extends Expression {
    public void setArguments(Map<String, Obj> arguments);
    public Map<String, Obj> getArguments();
}