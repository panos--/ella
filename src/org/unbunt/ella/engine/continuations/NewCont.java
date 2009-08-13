package org.unbunt.ella.engine.continuations;

import org.unbunt.ella.compiler.stmtbase.Expression;
import org.unbunt.ella.engine.continuations.ContinuationVisitor;

import java.util.List;
import java.util.ArrayList;

public class NewCont implements Continuation {
    protected List<Expression> arguments;

    public NewCont(List<Expression> arguments) {
        this.arguments = arguments;
    }

    public List<Expression> getArguments() {
        return arguments == null ? new ArrayList<Expression>() : arguments;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}