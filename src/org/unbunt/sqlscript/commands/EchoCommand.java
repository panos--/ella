package org.unbunt.sqlscript.commands;

import org.unbunt.sqlscript.SQLScriptContext;
import org.unbunt.sqlscript.support.Parameters;

public class EchoCommand implements Command {
    public void execute(SQLScriptContext ctx, Parameters params) {
        String msg = params.getValue("msg");
        System.out.println(msg);
    }
}