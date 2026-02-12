package module11_exceptions_debugging_logins.practie;

public class InvalidEmailException extends RuntimeException{
    public InvalidEmailException(String email){
        super("Неверный email: " + email);
    }
}
