package org.unbunt.sqlscript.support;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    protected Scope parent;

    protected Map<String, Variable> variables = new HashMap<String, Variable>();
    protected Map<String, Function> functions = new HashMap<String, Function>();

    public Scope() {
        this(null);
    }

    public Scope(Scope parent) {
        this.parent = parent;
    }

    public void setVariable(Variable variable) {
        variables.put(variable.getName(), variable);
    }

    public Variable getVariable(String name) {
        Variable variable = variables.get(name);
        if (variable != null) {
            // TODO: throw warning if not set
            return variable;
        }
        return parent == null ? null : parent.getVariable(name);
    }

    public void setFunction(String name, Function function) {
        functions.put(name, function);
    }

    public Function getFunction(String name) {
        Function function = functions.get(name);
        if (function != null) {
            return function;
        }
        return parent == null ? null : parent.getFunction(name);
    }
}
