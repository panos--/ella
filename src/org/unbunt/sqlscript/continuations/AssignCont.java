package org.unbunt.sqlscript.continuations;

public class AssignCont implements Continuation {
    protected String variable;

    public AssignCont(String variable) {
        this.variable = variable;
    }

    public String getVariable() {
        return variable;
    }
}
