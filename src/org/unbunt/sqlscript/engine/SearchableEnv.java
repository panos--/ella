package org.unbunt.sqlscript.engine;

import org.unbunt.sqlscript.engine.Obj;
import org.unbunt.sqlscript.engine.Env;

public interface SearchableEnv extends Env {
    public Obj findLocal(String name);
    public void putLocal(String name, Obj value);
}
