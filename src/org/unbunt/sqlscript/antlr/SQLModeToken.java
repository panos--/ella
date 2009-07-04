package org.unbunt.sqlscript.antlr;

import org.antlr.runtime.CommonToken;
import org.unbunt.sqlscript.SQLScriptParser;
import org.unbunt.sqlscript.support.SQLParseMode;

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
