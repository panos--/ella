package org.unbunt.sqlscript.engine.environment;

import org.unbunt.sqlscript.engine.corelang.Obj;
import org.unbunt.sqlscript.engine.environment.Env;

public interface SearchableEnv extends Env {
    public Obj findLocal(String name);
    public void putLocal(String name, Obj value);
}
