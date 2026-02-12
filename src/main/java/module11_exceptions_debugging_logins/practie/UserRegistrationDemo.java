package module11_exceptions_debugging_logins.practie;

public class UserRegistrationDemo {
    public static void main(String[] args) {
        UserRegistrationService service = new UserRegistrationService();

        // 1. Корректный пользователь
        service.registerUser("user@example.com", 25);

        // 2. Некорректный email
        service.registerUser("bad-email", 30);

        // 3. Некорректный возраст
        service.registerUser("test@test.com", -5);
    }
}