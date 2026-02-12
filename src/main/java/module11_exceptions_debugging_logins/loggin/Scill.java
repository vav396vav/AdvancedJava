package module11_exceptions_debugging_logins.loggin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Scill {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Scill.class);
        logger.debug("Debug message - пишется в консоль");
        logger.info("Info message - пишется в stdout.log");
        logger.error("Error Message - пишется в stderr.log");
    }
}
