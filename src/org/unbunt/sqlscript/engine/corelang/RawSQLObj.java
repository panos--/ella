package org.unbunt.ella.engine.corelang;

import org.unbunt.ella.compiler.support.RawSQL;
import org.unbunt.ella.compiler.support.SQLParseMode;
import org.unbunt.ella.engine.context.Context;

import java.util.Map;

public class RawSQLObj implements Obj, RawSQL {
    protected String statement;
    protected SQLParseMode parseMode;

    public RawSQLObj(String statement, SQLParseMode parseMode) {
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

    public Obj removeSlot(Context ctx, Obj key) {
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
