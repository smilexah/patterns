package org.sdu.edu.kz;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogger extends Logger{
    private String logFileName;

    public FileLogger() {
        this.logFileName = "log.txt";
    }

    @Override
    public void log(String message) {
        try {
            FileWriter fw = new FileWriter(logFileName, true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println("File: " + message);
            pw.close();
        } catch (IOException e) {
            System.err.println("Error while writing to the log file: " + e.getMessage());
        }
    }
}
