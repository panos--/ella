package org.unbunt.sqlscript.commands;

import org.unbunt.sqlscript.SQLScriptContext;
import org.unbunt.sqlscript.exception.CommandFailedException;
import org.unbunt.sqlscript.support.Parameters;

public interface Command {
    public void execute(SQLScriptContext ctx, Parameters params) throws CommandFailedException;
}
