package module11_exceptions_debugging_logins.lesson5_custom_exceptions;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(int age) {
        super("Недопустимый возраст: " + age + ". Возраст должен быть от 0 до 150.");
    }
}