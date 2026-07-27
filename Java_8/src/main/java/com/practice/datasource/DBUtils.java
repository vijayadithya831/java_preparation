package com.practice.datasource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.io.InputStream;
import java.util.Properties;

public abstract class DBUtils {

    private static final JdbcTemplate jdbcTemplate;

    static {

        try {

            Properties properties = new Properties();

            InputStream input = DBUtils.class.getClassLoader()
                    .getResourceAsStream("database.properties");

            properties.load(input);

            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName(properties.getProperty("db.driver"));
            dataSource.setUrl(properties.getProperty("db.url"));
            dataSource.setUsername(properties.getProperty("db.username"));
            dataSource.setPassword(properties.getProperty("db.password"));

            jdbcTemplate = new JdbcTemplate(dataSource);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}