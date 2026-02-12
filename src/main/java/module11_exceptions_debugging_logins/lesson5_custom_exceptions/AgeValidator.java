package module11_exceptions_debugging_logins.lesson5_custom_exceptions;

public class AgeValidator {

    public static void validateAge(int age) {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException(age);
        }
    }

    public static void main(String[] args) {
        // Проверка возраста -5
        try {
            validateAge(-5);
            System.out.println("Возраст -5 корректен");
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Проверка возраста 25
        try {
            validateAge(25);
            System.out.println("Возраст 25 корректен");
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }


        // Проверка возраста 200
        try {
            validateAge(200);
            System.out.println("Возраст 200 корректен");
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}