package org.unbunt.sqlscript.compiler.antlr;

import org.antlr.runtime.CommonToken;
import org.unbunt.sqlscript.compiler.SQLParseMode;

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
