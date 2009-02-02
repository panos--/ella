package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.lang.Obj;

import java.util.Map;

public class FunCont implements Continuation {
    protected Obj context = null;
    protected Map<String, Expression> args;

    public FunCont(Obj context, Map<String, Expression> args) {
        this.context = context;
        this.args = args;
    }

    public FunCont(Map<String, Expression> args) {
        this.args = args;
    }

    public Obj getContext() {
        return context;
    }

    public Map<String, Expression> getArgs() {
        return args;
    }
}
