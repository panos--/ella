package org.unbunt.ella.compiler.support;

import org.antlr.runtime.CommonToken;
import org.unbunt.ella.compiler.support.SQLParseMode;

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
