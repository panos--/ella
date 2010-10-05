package org.unbunt.ella.engine.environment;

import org.unbunt.ella.compiler.support.StringVariableInterpolator;
import org.unbunt.ella.compiler.support.Variable;

/**
 * User: tweiss
 * Date: 05.10.2010
 * Time: 17:05:01
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class EnvVariableInterpolator implements StringVariableInterpolator {
    protected Env env;

    public EnvVariableInterpolator(Env env) {
        this.env = env;
    }

    public String interpolate(Variable variable) {
        return env.get(variable).toString();
    }

    public Env getEnv() {
        return env;
    }

    public void setEnv(Env env) {
        this.env = env;
    }
}
