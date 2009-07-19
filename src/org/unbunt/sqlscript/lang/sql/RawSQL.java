package org.unbunt.sqlscript.lang.sql;

import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.support.SQLParseMode;

import java.util.Map;

public class RawSQL implements Obj {
    protected String statement;
    protected SQLParseMode parseMode;

    public RawSQL(String statement, SQLParseMode parseMode) {
        this.statement = statement;
        this.parseMode = parseMode;
    }

    public String getStatement() {
        return statement;
    }

    public SQLParseMode getParseMode() {
        return parseMode;
    }

    public int getObjectID() {
        return -1;
    }

    public Obj setSlot(Context ctx, Obj key, Obj value) {
        return null;
    }

    public Obj getSlot(Context ctx, Obj key) {
        return null;
    }

    public Map<Obj,Obj> getSlots() {
        return null;
    }

    public void setSlots(Map<Obj, Obj> slots) {
    }

    public Object toJavaObject() {
        return this;
    }

    @Override
    public String toString() {
        return "RawSQL[parseMode=[" + parseMode + "] query=[" + statement + "]]";
    }
}
