package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Statement;
import org.unbunt.sqlscript.support.ContinuationVisitor;

public class IfCont implements Continuation {
    protected Statement trueStatement;
    protected Statement falseStatement;

    public IfCont(Statement trueStatement, Statement falseStatement) {
        this.trueStatement = trueStatement;
        this.falseStatement = falseStatement;
    }

    public Statement getTrueStatement() {
        return trueStatement;
    }

    public Statement getFalseStatement() {
        return falseStatement;
    }

    public boolean hasFalseStatement() {
        return falseStatement != null;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
