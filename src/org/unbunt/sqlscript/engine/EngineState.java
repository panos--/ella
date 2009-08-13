package org.unbunt.ella.engine;

import org.unbunt.ella.engine.environment.Env;

public class EngineState {
    protected Env env;
    protected int pc;

    public EngineState(Env env, int pc) {
        this.env = env;
        this.pc = pc;
    }
}
