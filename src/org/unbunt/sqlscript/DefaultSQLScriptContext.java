package org.unbunt.sqlscript;

import org.unbunt.sqlscript.statement.SQLStatement;
import org.unbunt.utils.res.FilesystemResourceLoader;
import org.unbunt.utils.res.SimpleResource;
import org.unbunt.utils.res.SimpleResourceLoader;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class DefaultSQLScriptContext implements SQLScriptContext {
    public static final String DEFAULT = "DEFAULT";

    protected SimpleResource script;

    protected SQLScriptOptions options = new SQLScriptOptions();

    protected Map<String, DataSource> dataSources = new HashMap<String, DataSource>();
    protected Map<String, Connection> connections = new HashMap<String, Connection>();

    protected Map<String, PreparedStatement> preparedStatements = new HashMap<String, PreparedStatement>();

    protected SimpleResourceLoader resourceLoader = new FilesystemResourceLoader();

    protected SQLStatement lastSQLStatement = null;
    protected ResultSet lastSQLResult = null;
    protected int lastUpdateCount = -1;

    public SimpleResource getScript() {
        return script;
    }

    public void setScript(SimpleResource script) {
        this.script = script;
    }

    public Connection getConnection() {
        return getConnection(DEFAULT);
    }

    public Connection getConnection(String alias) {
        return connections.get(alias);
    }

    public void setConnection(Connection connection) {
        setConnection(DEFAULT, connection);
    }

    public void setConnection(String alias, Connection connection) {
        connections.put(alias, connection);
    }

    public DataSource getDataSource() {
        return getDataSource(DEFAULT);
    }

    public void setDataSource(DataSource dataSource) {
        setDataSource(DEFAULT, dataSource);
    }

    public DataSource getDataSource(String alias) {
        return dataSources.get(alias);
    }

    public void setDataSource(String alias, DataSource dataSource) {
        dataSources.put(alias, dataSource);
    }

    public Map<String, Connection> getConnections() {
        return connections;
    }

    public void setConnections(Map<String, Connection> connections) {
        this.connections = connections;
    }

    public Map<String, DataSource> getDataSources() {
        return dataSources;
    }

    public void setDataSources(Map<String, DataSource> dataSources) {
        this.dataSources = dataSources;
    }

    public ResultSet getLastSQLResult() {
        return lastSQLResult;
    }

    public void setLastSQLResult(ResultSet lastSQLResult) {
        this.lastSQLResult = lastSQLResult;
    }

    public SQLStatement getLastSQLStatement() {
        return lastSQLStatement;
    }

    public void setLastSQLStatement(SQLStatement lastSQLStatement) {
        this.lastSQLStatement = lastSQLStatement;
    }

    public int getLastUpdateCount() {
        return lastUpdateCount;
    }

    public void setLastUpdateCount(int lastUpdateCount) {
        this.lastUpdateCount = lastUpdateCount;
    }

    public void setPreparedStatement(String alias, PreparedStatement stmt) {
        preparedStatements.put(alias, stmt);
    }

    public PreparedStatement getPreparedStatement(String alias) {
        return preparedStatements.get(alias);
    }

    public SQLScriptOptions getOptions() {
        return options;
    }
}
