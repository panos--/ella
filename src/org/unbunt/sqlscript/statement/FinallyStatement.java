package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.ExpressionVisitor;

public class FinallyStatement extends AbstractStatement {
    protected Statement body;

    public FinallyStatement(Statement body) {
        this.body = body;
    }

    public Statement getBody() {
        return body;
    }

    public void setBody(Statement body) {
        this.body = body;
    }

    public void accept(ExpressionVisitor visitor) {
        throw new UnsupportedOperationException();
    }
}
