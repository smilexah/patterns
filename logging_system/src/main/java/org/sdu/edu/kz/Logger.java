package org.sdu.edu.kz;

import java.sql.SQLException;

public abstract class Logger {
    private int id;
    public Logger () {
        this.id = getId();
    }
    public abstract void log(String message) throws SQLException;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
