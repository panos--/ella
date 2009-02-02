package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.Variable;

public abstract class AssignVariable extends AbstractStatement {
    protected Variable variable;
    protected Variable value;

    public AssignVariable(Variable variable, Variable value) {
        this.variable = variable;
        this.value = value;
    }

    public Variable getVariable() {
        return variable;
    }

    public Variable getValue() {
        return value;
    }

//    public void accept(ScriptProcessor processor) {
//        processor.process(this);
//    }
}