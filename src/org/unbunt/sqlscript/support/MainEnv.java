package org.unbunt.sqlscript.support;

public class MainEnv extends StaticEnv {
    public MainEnv() {
        super(new TopEnv());
    }

    public MainEnv(DynamicVariableResolver resolver) {
        super(new DynamicEnv(new TopEnv(), resolver));
    }
}
