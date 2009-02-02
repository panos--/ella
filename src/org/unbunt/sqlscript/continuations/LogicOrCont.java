package org.unbunt.sqlscript.continuations;

import org.unbunt.sqlscript.statement.Expression;

import java.util.Collection;
import java.util.Iterator;

public class LogicOrCont implements Continuation {
    protected Iterator<Expression> iterator;

    public LogicOrCont(Collection<Expression> expressions) {
        iterator = expressions.iterator();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }

    public Expression next() {
        return iterator.next();
    }
}