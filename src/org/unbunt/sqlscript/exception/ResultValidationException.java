package org.unbunt.sqlscript.exception;

import org.unbunt.sqlscript.statement.SQLStatement;

public class ResultValidationException extends CommandFailedException {
    protected SQLStatement statement = null;

    public ResultValidationException(SQLStatement statement) {
        this.statement = statement;
    }

    public ResultValidationException(SQLStatement statement, String message) {
        super(message);
        this.statement = statement;
    }

    public SQLStatement getStatement() {
        return statement;
    }
}
