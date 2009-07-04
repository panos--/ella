package org.unbunt.sqlscript.support;

import java.util.HashMap;
import java.util.Map;

public enum SQLStringType {
    sql92(new SQLStringSyntaxRules(true, true, false, false, false)),
    oracle(new SQLStringSyntaxRules(true, true, false, true, false), "ora"),
    postgresql(new SQLStringSyntaxRules(true, true, false, false, true), "postgres", "pg"),
    mysql(new SQLStringSyntaxRules(true, true, true, false, false));

    private final SQLStringSyntaxRules rules;
    private final String[] aliases;

    private static final Map<String, SQLStringType> aliasMap = new HashMap<String, SQLStringType>();

    static {
        for (SQLStringType stringType : SQLStringType.class.getEnumConstants()) {
            String[] aliases = stringType.aliases;
            for (String alias : aliases) {
                if (aliasMap.containsKey(alias)) {
                    throw new RuntimeException("Duplicate string type alias: " + alias + "; " +
                                               "String types: " + stringType + ", " + aliasMap.get(alias));
                }
                aliasMap.put(alias, stringType);
            }
        }
    }

    SQLStringType(SQLStringSyntaxRules rules, String... aliases) {
        this.rules = rules;
        this.aliases = aliases;
    }

    public SQLStringSyntaxRules getRules() {
        return this.rules;
    }

    public boolean hasDoubleQuote() {
        return rules.doubleQuote;
    }

    public boolean hasSingleQuote() {
        return rules.singleQuote;
    }

    public boolean hasBackTick() {
        return rules.backTick;
    }

    public boolean hasQQuote() {
        return rules.qQuote;
    }

    public boolean hasDollarQuote() {
        return rules.dollarQuote;
    }

//    protected String[] getAliases() {
//        return this.aliases;
//    }

    public static SQLStringType valueOfAlias(String alias) throws IllegalArgumentException {
        SQLStringType stringType = aliasMap.get(alias);
        if (stringType == null) {
            throw new IllegalArgumentException("Unknown string type alias: " + alias);
        }
        return stringType;
    }
}
