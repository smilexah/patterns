package org.sdu.edu.kz;

import java.sql.*;

public class DatabaseLogger extends Logger{
    private Connection connection;

    public DatabaseLogger(String databaseUrl, String username, String password) throws SQLException {
        connection = DriverManager.getConnection(databaseUrl, username, password);
    }

    public void log(String message) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO logs (message) VALUES (?)", Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, message);
        statement.executeUpdate();

        // Retrieve the generated ID
        ResultSet generatedKeys = statement.getGeneratedKeys();
        if (generatedKeys.next()) {
            setId(generatedKeys.getInt(1));
        }
    }
}
