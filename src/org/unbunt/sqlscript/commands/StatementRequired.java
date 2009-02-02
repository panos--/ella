package org.unbunt.sqlscript.commands;

import org.unbunt.sqlscript.statement.SQLStatement;

public interface StatementRequired extends ConnectionRequired {
    public void setStatement(SQLStatement statement);
}
