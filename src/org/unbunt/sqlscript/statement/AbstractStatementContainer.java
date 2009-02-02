package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.Scope;

public abstract class AbstractStatementContainer extends AbstractStatement {

    protected AbstractStatementContainer() {
    }

    protected AbstractStatementContainer(Scope scope) {
        super(scope);
    }

}
