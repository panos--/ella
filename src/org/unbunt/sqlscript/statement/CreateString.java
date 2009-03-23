package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.StringLiteral;
import org.unbunt.sqlscript.support.Variable;
import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.ExpressionVisitor;

public class CreateString extends AbstractStatement {
    protected StringLiteral stringLiteral;
    protected Variable destVariable;

    public CreateString(StringLiteral stringLiteral, Variable destVariable) {
        this.stringLiteral = stringLiteral;
        this.destVariable = destVariable;
    }

    public StringLiteral getStringLiteral() {
        return stringLiteral;
    }

    public Variable getDestVariable() {
        return destVariable;
    }

    public void accept(ScriptProcessor processor, Env env) {
        processor.process(env, this);
    }

    public void accept(ExpressionVisitor visitor) {
        throw new UnsupportedOperationException();
    }
}
