package org.unbunt.sqlscript.engine.environment;

import org.unbunt.sqlscript.engine.natives.Obj;
import org.unbunt.sqlscript.engine.environment.Env;

public interface SearchableEnv extends Env {
    public Obj findLocal(String name);
    public void putLocal(String name, Obj value);
}
