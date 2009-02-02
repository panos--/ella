package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.support.Variable;

public abstract class Assign extends AbstractStatement {
    protected Variable variable;
    protected Obj value;

    public Assign(Variable variable, Obj value) {
        this.variable = variable;
        this.value = value;
    }

    public Variable getVariable() {
        return variable;
    }

    public Obj getValue() {
        return value;
    }

//    public void accept(ScriptProcessor processor) {
//        processor.process(this);
//    }
}
