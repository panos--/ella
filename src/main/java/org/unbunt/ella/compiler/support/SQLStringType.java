/* SQLStringType.java
   Copyright (C) 2009, 2010 Thomas Weiß <panos@unbunt.org>

This file is part of the Ella scripting language interpreter.

Ella is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

Ella is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with Ella; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

package org.unbunt.ella.compiler.support;

import java.util.HashMap;
import java.util.Map;

/**
 * Defines various string syntax rules as well as rule dependent operations on strings.
 */
public enum SQLStringType {
    _single(new SQLStringSyntaxRules(false, true, false, false, false), "single"),
    _double (new SQLStringSyntaxRules(true, false, false, false, false), "double"),
    sql92 (new SQLStringSyntaxRules(true, true, false, false, false)),
    oracle (new SQLStringSyntaxRules(true, true, false, true, false), "ora"),
    postgresql (new SQLStringSyntaxRules(true, true, false, false, true), "postgres", "pg"),
    mysql (new SQLStringSyntaxRules(true, true, true, false, false));

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

    public String escape(String value, String delim) {
        if (rules.singleQuote && "'".equals(delim)) {
            return escapeSingleQuote(value);
        }
        else if (rules.doubleQuote && "\"".equals(delim)) {
            return escapeDoubleQuote(value);
        }
        else if (rules.backTick && "`".equals(delim)) {
            return escapeBackTick(value);
        }
        else {
            // the other string types do not support escaping
            // TODO: we should possibly detect sequences contained in the value which could terminate the string
            // TODO: (like $foo$ in a dollar-quoted string using $foo$ as separator) and generate a warning or an
            // TODO: error.
            return value;
        }
    }

    protected String escapeSingleQuote(String value) {
        return value.replace("'", "''");
    }

    protected String escapeDoubleQuote(String value) {
        return value.replace("\"", "\"\"");
    }

    protected String escapeBackTick(String value) {
        return value.replace("`", "``");
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
