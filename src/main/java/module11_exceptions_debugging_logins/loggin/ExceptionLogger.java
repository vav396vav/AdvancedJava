package module11_exceptions_debugging_logins.loggin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionLogger {
    private static final Logger log = LoggerFactory.getLogger(ExceptionLogger.class);

    public static void main(String[] args) {

        try{
            int result = 10/0;
        } catch (ArithmeticException e){
            log.error("Ощибка при делении на ноль",e);
            log.debug("Просто поверка");
        }
    }
}
