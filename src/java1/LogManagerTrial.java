package java1;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LogManagerTrial {
            public static void main(String args[]) {
        LogManager logManager = LogManager.getLogManager();
        Logger logger = logManager.getLogger(Logger.GLOBAL_LOGGER_NAME);

        logger.log(Level.SEVERE,"this is me again log manager");
                System.out.println("yes ");
        }
    }
