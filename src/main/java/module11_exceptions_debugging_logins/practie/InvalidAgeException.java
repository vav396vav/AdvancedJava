package module11_exceptions_debugging_logins.practie;

public class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(int age) {
        super ("Недопустимый возраст: " + age + ". Должен быть от 0 до 150.");
    }
}
