package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.lang.Int;
import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.Scope;
import org.unbunt.sqlscript.support.ExpressionVisitor;

public class IntegerLiteralExpression implements Expression {
    protected String literal;
    protected Int value;

    public IntegerLiteralExpression(String literal) {
        this.literal = literal;
        this.value = new Int(Integer.valueOf(literal));
    }

    public Obj getValue() {
        return value;
    }

    public Scope getScope() {
        return null;
    }

    public void setScope(Scope scope) {
    }

    public void accept(ScriptProcessor processor, Env env) {
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
