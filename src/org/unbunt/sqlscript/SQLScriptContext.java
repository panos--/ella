package org.unbunt.sqlscript;

import org.unbunt.sqlscript.statement.SQLStatement;
import org.unbunt.utils.res.SimpleResource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Map;

public interface SQLScriptContext {
    Connection getConnection();

    Connection getConnection(String alias);

    void setConnection(Connection connection);

    void setConnection(String alias, Connection connection);

    DataSource getDataSource();

    void setDataSource(DataSource dataSource);

    DataSource getDataSource(String alias);

    void setDataSource(String alias, DataSource dataSource);

    Map<String, Connection> getConnections();

    void setConnections(Map<String, Connection> connections);

    Map<String, DataSource> getDataSources();

    void setDataSources(Map<String, DataSource> dataSources);

    SimpleResource getScript();

    void setScript(SimpleResource res);

    ResultSet getLastSQLResult();

    void setLastSQLResult(ResultSet lastSQLResult);

    SQLStatement getLastSQLStatement();

    void setLastSQLStatement(SQLStatement lastSQLStatement);

    Statement getLastSQLStatementResource();

    void setLastSQLStatementResource(Statement stmt);

    int getLastUpdateCount();

    void setLastUpdateCount(int lastUpdateCount);

    void setPreparedStatement(String alias, PreparedStatement stmt);

    PreparedStatement getPreparedStatement(String alias);

    SQLScriptOptions getOptions();
}
