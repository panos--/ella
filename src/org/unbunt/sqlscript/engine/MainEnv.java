package org.unbunt.sqlscript.engine;

import org.unbunt.sqlscript.engine.Obj;
import org.unbunt.sqlscript.engine.DynamicVariableResolver;
import org.unbunt.sqlscript.compiler.Variable;

/**
 * Acts as global environment. Default bindings may be placed here using the add(String, Obj) method.
 */
public class MainEnv extends StaticEnv {
    public MainEnv(Obj undefValue) {
        super(new TopEnv(undefValue));
    }

    public MainEnv(Obj undefValue, DynamicVariableResolver resolver) {
        super(new DynamicEnv(new TopEnv(undefValue), resolver));
    }

    public void add(String var, Obj value) {
        add(new Variable(-1, var, true, false), value);
    }
}
