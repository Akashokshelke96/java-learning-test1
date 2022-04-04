package java1;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LogManagerTrial {
            public static void main(String args[]) {
          java.util.logging.LogManager logManager = java.util.logging.LogManager.getLogManager();

          Logger logger = logManager.getLogger(Logger.GLOBAL_LOGGER_NAME);
          logger.log(Level.INFO,"yes");
        }
    }
