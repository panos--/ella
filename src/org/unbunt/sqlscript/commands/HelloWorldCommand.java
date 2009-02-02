package org.unbunt.sqlscript.commands;

import org.unbunt.sqlscript.SQLScriptContext;
import org.unbunt.sqlscript.support.Parameters;
import org.unbunt.utils.StringUtils;

public class HelloWorldCommand implements Command {
    public void execute(SQLScriptContext ctx, Parameters params) {
        System.out.println("Hello World! (params: " + StringUtils.joinList(params.getAll()) + ")");
    }
}
