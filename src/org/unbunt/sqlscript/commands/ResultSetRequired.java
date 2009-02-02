package org.unbunt.sqlscript.commands;

import java.sql.ResultSet;

public interface ResultSetRequired extends StatementRequired {
    public void setResultSet(ResultSet rs);
}
