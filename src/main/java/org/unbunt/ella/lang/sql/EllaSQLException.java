package org.unbunt.ella.lang.sql;

import org.unbunt.ella.exception.EllaRuntimeException;
import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.utils.StringUtils;

import java.util.Map;

/**
 * User: tweiss
 * Date: Dec 9, 2010
 * Time: 10:07:14 AM
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
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
