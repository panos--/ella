package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Expression;

import java.util.Map;

public class NewCont implements Continuation {
    protected Map<String, Expression> args;

    public NewCont(Map<String, Expression> args) {
        this.args = args;
    }

    public Map<String, Expression> getArgs() {
        return args;
    }
}
