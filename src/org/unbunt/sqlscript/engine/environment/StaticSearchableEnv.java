package org.unbunt.sqlscript.engine.environment;

import org.unbunt.sqlscript.engine.corelang.Obj;
import org.unbunt.sqlscript.engine.environment.Env;
import org.unbunt.sqlscript.compiler.support.Variable;

public class StaticSearchableEnv extends StaticEnv implements SearchableEnv {
    /**
     * Tells this env to stop normal variable lookups (return null instead) so that this environment
     * can be searched manually via the methods of the SearchEnv interface.
     */
    protected boolean stopHere = false;

    public StaticSearchableEnv(Env parent) {
        super(parent);
    }

    @Override
    public Obj get(Variable var, int addr) {
        if (stopHere) {
            return null;
        }
        return super.get(var, addr);
    }

    @Override
    public Obj get(Variable var) {
        if (stopHere) {
            return null;
        }
        return super.get(var);
    }

    public Obj findLocal(String name) {
        int nvars = vars.size();
        for (int i = 0; i < nvars; i++) {
            if (name.equals(vars.get(i).name)) {
                return values.get(i);
            }
        }
        return null;
    }

    public void putLocal(String name, Obj value) {
        int nvars = vars.size();
        for (int i = 0; i < nvars; i++) {
            if (name.equals(vars.get(i).name)) {
                values.set(i, value);
            }
        }
    }

    public boolean isStopHere() {
        return stopHere;
    }

    public void setStopHere(boolean stopHere) {
        this.stopHere = stopHere;
    }
}
