package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.Parameters;
import org.unbunt.sqlscript.support.Parameter;
import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.ScriptProcessor;

public class EvalCommand extends AbstractAnnotatableStatement {
    protected String name;
    protected Parameters params = new Parameters();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parameters getParams() {
        return params;
    }

    public void setParams(Parameters params) {
        this.params = params;
    }

    public void addParam(Parameter param) {
        params.add(param);
    }

    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append(name);
        for (Parameter param : params.getAll()) {
            buf.append(" ").append(param.toString());
        }
        return buf.toString();
    }

    public void accept(ScriptProcessor processor, Env env) {
        processor.process(env, this);
    }
}
