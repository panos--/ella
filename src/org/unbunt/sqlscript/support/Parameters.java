package org.unbunt.sqlscript.support;

import java.util.*;

public class Parameters {
    protected Map<String, List<Parameter>> params = new HashMap<String, List<Parameter>>();

    public Parameters() {
    }

    public void add(Parameter param) {
        String name = param.getName();
        List<Parameter> curParams;
        if (params.containsKey(name)) {
            curParams = params.get(name);
        }
        else {
            curParams = new ArrayList<Parameter>();
            params.put(name, curParams);
        }

        curParams.add(param);
    }

    public boolean hasParam(String name) {
        return params.containsKey(name);
    }

    public boolean getBool(String name) {
        if (!hasParam(name)) {
            return false;
        }

        String value = getValue(name);
        return value == null || "true".equals(value);
    }

    public String getValue(String name) {
        List<Parameter> curParams = params.get(name);

        if (curParams == null || curParams.isEmpty()) {
            return null;
        }

        return curParams.get(curParams.size() - 1).getValueAsString();
    }

    public List<String> getValues(String name) {
        List<Parameter> curParams = params.get(name);

        if (curParams == null || curParams.isEmpty()) {
            return new ArrayList<String>();
        }

        List<String> values = new ArrayList<String>();
        for (Parameter curParam : curParams) {
            values.add(curParam.getValueAsString());
        }

        return values;
    }

    public Set<String> getNames() {
        return params.keySet();
    }

    public List<Parameter> getAll() {
        List<Parameter> result = new ArrayList<Parameter>();
        for (List<Parameter> parameters : params.values()) {
            for (Parameter parameter : parameters) {
                result.add(parameter);
            }
        }
        return result;
    }
}
