/* RawParamedSQL.java
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

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * Represents an SQL statement containing named parameters.
 */
public class RawParamedSQL {
    protected StringBuilder statement;
    protected Map<String, List<Integer>> paramIndices;
    protected int paramIndex;

    /**
     * Creates a new empty statement object.
     */
    public RawParamedSQL() {
        statement = new StringBuilder();
        paramIndices = new HashMap<String, List<Integer>>();
        paramIndex = 0;
    }

    public void appendToken(String text) {
        statement.append(text);
    }

    public void appendToken(char text) {
        statement.append(text);
    }

    public void addParam(String param) {
        List<Integer> indices = paramIndices.get(param);
        if (indices == null) {
            indices = new ArrayList<Integer>();
            paramIndices.put(param, indices);
        }
        indices.add(++paramIndex);
    }

    /**
     * Returns the statement text of the SQL statement with occurrances of named parameters replaced by positional
     * parameters.
     *
     * @return the statement text.
     */
    public String getStatement() {
        return statement.toString();
    }

    /**
     * Returns a mapping of parameters names to their corresponding positional parameter indices.
     *
     * @return the mapping.
     */
    public Map<String, List<Integer>> getParameters() {
        return paramIndices;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("RawParamedSQL[\n")
           .append("\tquery=[").append(statement).append("]\n")
           .append("\tparams=[\n");
        for (Map.Entry<String, List<Integer>> entry : paramIndices.entrySet()) {
            buf.append("\t\t").append(entry.getKey()).append("={");
            boolean first = true;
            for (Integer index : entry.getValue()) {
                if (first) {
                    first = false;
                }
                else {
                    buf.append(", ");
                }
                buf.append(index);
            }
            buf.append("}\n");
        }
        buf.append("\t]\n]\n");
        return buf.toString();
    }
}

