package org.unbunt.sqlscript.compiler;

import org.antlr.runtime.CommonToken;

public class SQLModeToken extends CommonToken {
    protected SQLParseMode parseMode;

    public SQLModeToken(int type, SQLParseMode parseMode) {
        super(type);
        this.parseMode = parseMode;
    }

    public SQLParseMode getParseMode() {
        return parseMode;
    }
}
