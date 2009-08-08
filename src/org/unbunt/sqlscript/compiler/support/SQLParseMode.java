package org.unbunt.sqlscript.compiler.support;

import org.unbunt.sqlscript.compiler.support.SQLStringType;

public class SQLParseMode {
    protected SQLStringType stringType;

    public SQLParseMode(SQLStringType stringType) {
        this.stringType = stringType;
    }

    public SQLStringType getStringType() {
        return stringType;
    }

    @Override
    public String toString() {
        return "SQLParseMode[stringType=" + stringType + "]";
    }
}
