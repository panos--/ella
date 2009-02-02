package org.unbunt.sqlscript;

public interface SQLScriptChildContext extends SQLScriptContext {
    public SQLScriptContext getBaseContext();
    public void setBaseContext(SQLScriptContext baseContext);
}
