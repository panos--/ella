package org.unbunt.ella.utils;

import org.unbunt.ella.resource.SimpleResourceLoader;
import org.unbunt.ella.exception.DBConnectionFailedException;
import org.unbunt.ella.lang.sql.DBUtils;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.io.File;
import java.io.IOException;

/**
 * User: tweiss
 * Date: Nov 16, 2010
 * Time: 7:58:58 PM
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class ConnectionPropertiesResource extends ConnectionDetails {
    protected final SimpleResourceLoader resourceLoader;
    protected final String propertiesResource;

    public ConnectionPropertiesResource(SimpleResourceLoader resourceLoader, String propertiesResource) {
        this.resourceLoader = resourceLoader;
        this.propertiesResource = propertiesResource;
    }

    public DriverManagerDataSource createDataSource()
            throws DataSourceInitializationException, DBConnectionFailedException {
        File propsFile;
        try {
            propsFile = resourceLoader.loadResource(propertiesResource);
        } catch (IOException e) {
            throw new DataSourceInitializationException("Failed to load datasource properties: " +
                                                  propertiesResource + ": " + e.getMessage(), e);
        }
        return DBUtils.createDataSourceFromProps(propsFile.getAbsolutePath(), user, pass, driver);
    }

    public SimpleResourceLoader getResourceLoader() {
        return resourceLoader;
    }

    public String getPropertiesResource() {
        return propertiesResource;
    }
}
