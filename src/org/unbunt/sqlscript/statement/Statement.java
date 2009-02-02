package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.ScriptProcessor;
import org.unbunt.sqlscript.support.Scope;
import org.unbunt.sqlscript.support.Env;

public interface Statement {
    public Scope getScope();
    public void setScope(Scope scope);
    public void accept(ScriptProcessor processor, Env env);
}
