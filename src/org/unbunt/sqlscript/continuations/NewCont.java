package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.support.ContinuationVisitor;

import java.util.Map;

public class NewCont implements Continuation {
    protected Map<String, Expression> args;

    public NewCont(Map<String, Expression> args) {
        this.args = args;
    }

    public Map<String, Expression> getArgs() {
        return args;
    }

    public void accept(ContinuationVisitor visitor) {
        visitor.processContinuation(this);
    }
}
