package org.sdu.edu.kz;

import java.sql.SQLException;

public interface LoggerFactory {
    Logger createLogger() throws SQLException;
}
