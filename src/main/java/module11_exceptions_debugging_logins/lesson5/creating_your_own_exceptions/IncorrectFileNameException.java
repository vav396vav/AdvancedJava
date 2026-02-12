package module11_exceptions_debugging_logins.lesson5.creating_your_own_exceptions;

public class IncorrectFileNameException extends RuntimeException{
    public IncorrectFileNameException() {
        super();
    }

    public IncorrectFileNameException(String message) {
        super(message);
    }

}
