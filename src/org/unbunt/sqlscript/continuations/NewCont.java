package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.continuations.ContinuationVisitor;

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
