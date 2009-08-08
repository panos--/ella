package org.unbunt.sqlscript.compiler.support;

public class SQLStringSyntaxRules {
    public final boolean doubleQuote;
    public final boolean singleQuote;
    public final boolean backTick;
    public final boolean qQuote;
    public final boolean dollarQuote;

    public SQLStringSyntaxRules(boolean doubleQuote, boolean singleQuote, boolean backTick,
                             boolean qQuote, boolean dollarQuote) {
        this.doubleQuote = doubleQuote;
        this.singleQuote = singleQuote;
        this.backTick = backTick;
        this.qQuote = qQuote;
        this.dollarQuote = dollarQuote;
    }
}
