package org.sdu.edu.kz;

public class ConsoleLogger extends Logger {
    @Override
    public void log(String message) {
        System.out.println("Writing to console: " + message);
    }
}
