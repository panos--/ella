package org.unbunt.sqlscript;

import org.unbunt.sqlscript.statement.SQLStatement;
import org.unbunt.utils.res.SimpleResource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

public class DefaultSQLScriptChildContext implements SQLScriptChildContext {
    protected SQLScriptContext baseContext;

    protected SimpleResource script = null;

    public DefaultSQLScriptChildContext(SQLScriptContext baseContext) {
        this.baseContext = baseContext;
    }

    public SQLScriptContext getBaseContext() {
        return baseContext;
    }

    public void setBaseContext(SQLScriptContext baseContext) {
        this.baseContext = baseContext;
    }

    public SimpleResource getScript() {
        return script != null ? script : baseContext.getScript();
    }

    public void setScript(SimpleResource script) {
        this.script = script;
    }

    public Connection getConnection() {
        return baseContext.getConnection();
    }

    public Connection getConnection(String alias) {
        return baseContext.getConnection(alias);
    }

    public Map<String, Connection> getConnections() {
        return baseContext.getConnections();
    }

    public DataSource getDataSource() {
        return baseContext.getDataSource();
    }

    public DataSource getDataSource(String alias) {
        return baseContext.getDataSource(alias);
    }

    public Map<String, DataSource> getDataSources() {
        return baseContext.getDataSources();
    }

    public ResultSet getLastSQLResult() {
        return baseContext.getLastSQLResult();
    }

    public SQLStatement getLastSQLStatement() {
        return baseContext.getLastSQLStatement();
    }

    public int getLastUpdateCount() {
        return baseContext.getLastUpdateCount();
    }

    public PreparedStatement getPreparedStatement(String alias) {
        return baseContext.getPreparedStatement(alias);
    }

    public void setConnection(String alias, Connection connection) {
        baseContext.setConnection(alias, connection);
    }

    public void setConnection(Connection connection) {
        baseContext.setConnection(connection);
    }

    public void setConnections(Map<String, Connection> connections) {
        baseContext.setConnections(connections);
    }

    public void setDataSource(String alias, DataSource dataSource) {
        baseContext.setDataSource(alias, dataSource);
    }

    public void setDataSource(DataSource dataSource) {
        baseContext.setDataSource(dataSource);
    }

    public void setDataSources(Map<String, DataSource> dataSources) {
        baseContext.setDataSources(dataSources);
    }

    public void setLastSQLResult(ResultSet lastSQLResult) {
        baseContext.setLastSQLResult(lastSQLResult);
    }

    public void setLastSQLStatement(SQLStatement lastSQLStatement) {
        baseContext.setLastSQLStatement(lastSQLStatement);
    }

    public void setLastUpdateCount(int lastUpdateCount) {
        baseContext.setLastUpdateCount(lastUpdateCount);
    }

    public void setPreparedStatement(String alias, PreparedStatement stmt) {
        baseContext.setPreparedStatement(alias, stmt);
    }

    public SQLScriptOptions getOptions() {
        return baseContext.getOptions();
    }
}
