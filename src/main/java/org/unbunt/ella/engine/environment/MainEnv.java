package org.unbunt.ella.engine.environment;

import org.unbunt.ella.compiler.support.Variable;
import org.unbunt.ella.engine.corelang.Obj;

/**
 * Acts as a global environment. Default bindings may be placed here using the <code>add</code> method.
 */
public class MainEnv extends StaticEnv {
    /**
     * Creates a new MainEnv. This is set up so that variables looked up here and which could not be found
     * (meaning these variables must have been undefined) are looked up using the given resolver. Any variables that
     * could not be resolved by this resolver looked up in a <code>TopEnv</code> environment which in turn is set up
     * to return the given value for undefined variables.
     *
     * @param undefValue the value to return for undefined variables.
     * @param resolver the resolver to use when looking up undefined variables.
     */
    public MainEnv(Obj undefValue, DynamicVariableResolver resolver) {
        super(new DynamicEnv(new TopEnv(undefValue), resolver));
    }

    /**
     * Add a default binding. Associates the given value with a variable of the given name.
     *
     * @param var the variable's name.
     * @param value the value.
     */
    public void add(String var, Obj value) {
        add(new Variable(-1, var, true, false), value);
    }
}
