package org.unbunt.sqlscript.commands;

import org.unbunt.sqlscript.SQLScriptContext;
import org.unbunt.sqlscript.SQLScriptOptions;
import org.unbunt.sqlscript.exception.CommandFailedException;
import org.unbunt.sqlscript.exception.IllegalCommandArgumentsException;
import org.unbunt.sqlscript.support.Parameters;

import java.lang.reflect.Field;

public class SetCommand implements Command {
    public void execute(SQLScriptContext ctx, Parameters params) throws CommandFailedException {
        SQLScriptOptions options = ctx.getOptions();

        for (String pname : params.getNames()) {
            Field field = null;
            try {
                field = options.getClass().getField(pname);
            } catch (NoSuchFieldException ignored) {
            }

            if (field != null) {
                if (!Boolean.TYPE.equals(field.getType())) {
                    field = null;
                }
                else {
                    try {
                        field.set(options, params.getBool(pname));
                    } catch (Exception e) {
                        field = null;
                    }
                }
            }

            if (field == null) {
                throw new IllegalCommandArgumentsException("Unknown option: " + pname);
            }
        }
    }
}
