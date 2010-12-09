/* EllaSQLException.java
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

package org.unbunt.ella.lang.sql;

import org.unbunt.ella.exception.EllaRuntimeException;
import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.utils.StringUtils;

import java.util.Map;

public class EllaSQLException extends EllaRuntimeException {
    protected final String statement;
    protected final Params params;

    public EllaSQLException(Stmt stmt, Throwable cause) {
        this(stmt, "Query failed: " + cause.getMessage(), cause);
    }

    public EllaSQLException(Stmt stmt, String message, Throwable cause) {
        super(message, cause);
        statement = stmt.rawStatement.getStatement();
        params = createParams(stmt.params, stmt.namedParams);
    }

    protected Params createParams(Obj[] params, Map<String, Obj> namedParams) {
        return params != null
               ? new PosParams(params) : namedParams != null
                                         ? new NamedParams(namedParams) : new NullParams();
    }

    @Override
    public String getMessage() {
        StringBuilder buf = new StringBuilder(super.getMessage());
        buf.append("\nQuery={\n\t").append(statement.replace("\n", "\n\t")).append("\n}");
        String paramsStr = params.toString();
        if (paramsStr.length() > 0) {
            buf.append("\nParams={\n\t").append(paramsStr.replace("\n", "\n\t")).append("\n}");
        }
        return buf.toString();
    }

    protected static interface Params {
    }

    protected static class PosParams implements Params {
        protected final Obj[] params;

        public PosParams(Obj[] params) {
            this.params = params;
        }

        public String toString() {
            String[] strParams = new String[params.length];
            for (int i = 0; i < params.length; i++) {
                strParams[i] = "\"" + params[i].toString().replace("\\", "\\\\").replace("\"", "\\\"") + "\"";
            }
            return StringUtils.join(",\n", (Object[]) strParams);
        }
    }

    protected static class NamedParams implements Params {
        protected final Map<String, Obj> namedParams;

        public NamedParams(Map<String, Obj> namedParams) {
            this.namedParams = namedParams;
        }

        public String toString() {
            String[] strParams = new String[namedParams.size()];
            int i = 0;
            for (Map.Entry<String, Obj> entry : namedParams.entrySet()) {
                strParams[i++] = entry.getKey() + "=" +
                                 "\"" + entry.getValue().toString().replace("\\", "\\\\").replace("\"", "\\\"") + "\"";
            }
            return StringUtils.join(",\n", (Object[]) strParams);
        }
    }

    protected static class NullParams implements Params {
        public String toString() {
            return "";
        }
    }
}
