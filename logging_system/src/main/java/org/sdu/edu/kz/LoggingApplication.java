package org.sdu.edu.kz;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class LoggingApplication {
    public static void main(String[] args) throws IOException, SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String msg = sc.nextLine();
        System.out.print("Enter the type(console/file/database): ");
        String type = sc.nextLine();
        // Get the logger type from the configuration setting
        String loggerType = System.getProperty("logger.type", type);

        // Create a logger factory instance
        LoggerFactory loggerFactory;
        switch (loggerType) {
            case "console":
                loggerFactory = new ConsoleLoggerFactory();
                break;
            case "file":
                loggerFactory = new FileLoggerFactory();
                break;
            case "database":
                loggerFactory = new DatabaseLoggerFactory("jdbc:postgresql://localhost:8888/logging_database", "postgres", "TheMiko05Khan!");
                break;
            default:
                throw new IllegalArgumentException("Invalid logger type: " + loggerType);
        }

        // Create a logger instance
        Logger logger = loggerFactory.createLogger();

        // Log a sample message

        logger.log(msg);
    }
}