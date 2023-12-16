package org.sdu.edu.kz;

import java.sql.SQLException;

public class DatabaseLoggerFactory implements LoggerFactory {
    private String databaseUrl;
    private String username;
    private String password;

    public DatabaseLoggerFactory(String databaseUrl, String username, String password) {
        this.databaseUrl = databaseUrl;
        this.username = username;
        this.password = password;
    }

    @Override
    public Logger createLogger() throws SQLException {
        return new DatabaseLogger(databaseUrl, username, password);
    }
}
