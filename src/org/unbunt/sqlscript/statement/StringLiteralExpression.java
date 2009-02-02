package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.StringLiteral;
import org.unbunt.sqlscript.support.Env;

public class StringLiteralExpression extends AbstractExpression {
    protected StringLiteral stringLiteral;

    public StringLiteralExpression(StringLiteral stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public StringLiteral getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(StringLiteral stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public void accept(ScriptProcessor processor, Env env) {
        processor.process(env, this);
    }
}
