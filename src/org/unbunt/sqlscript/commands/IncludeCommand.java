package org.unbunt.sqlscript.commands;

import org.unbunt.sqlscript.SQLScript;
import org.unbunt.sqlscript.DefaultSQLScriptChildContext;
import org.unbunt.sqlscript.SQLScriptContext;
import org.unbunt.sqlscript.exception.CommandFailedException;
import org.unbunt.sqlscript.exception.IllegalCommandArgumentsException;
import org.unbunt.sqlscript.support.Parameters;
import org.unbunt.utils.VolatileObservable;
import org.unbunt.utils.res.SimpleResource;

import java.util.Observable;
import java.util.Observer;

public class IncludeCommand extends VolatileObservable implements Command, Observer {
    public void execute(SQLScriptContext ctx, Parameters params) throws CommandFailedException {
        String file = params.getValue("file");
        if (file == null) {
            throw new IllegalCommandArgumentsException("Missing required argument: file");
        }

        try {
            DefaultSQLScriptChildContext childCtx = new DefaultSQLScriptChildContext(ctx);
            SimpleResource script = ctx.getScript().createRelative(file);
            SQLScript interp = new SQLScript(childCtx, script);
            interp.addObserver(this);
            interp.execute();
        } catch (Exception e) {
            throw new CommandFailedException("Script failed in include: " + file + ": " + e.getMessage(), e);
        }
    }

    public void update(Observable o, Object arg) {
        notifyObservers(arg);
    }
}
