package module3_dates_and_strings.lesson5_string;

import java.util.Scanner;

public class UsernameAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите имя пользователя: ");
        String username = sc.nextLine();

        if (username.isEmpty()) {
            System.out.println("Имя пользователя не может быть пустым");
            return; // завершаем программу
        }

// Проверка, что все символы — буквы
        boolean isValid = true;
        for (int i = 0; i < username.length(); i++) {
            if (!Character.isAlphabetic(username.charAt(i))) {
                isValid = false;
                break; // выходим из цикла при первой ошибке
            }
        }

        if (!isValid) {
            System.out.println("Имя должно содержать только буквы");
            return;
        }
        System.out.println();

        System.out.println("Длина имени пользователя: " + username.length());
        System.out.println("Первый символ: " + username.charAt(0));
        System.out.println("Последний символ: " + username.charAt(username.length() - 1));
        System.out.println("Имя пользователя в верхнем регистре: " + username.toUpperCase());
        System.out.println("Имя пользователя в нижнем регистре: " + username.toLowerCase());
        System.out.println("Имя пользователя содержит букву 'a': " + username.contains("a"));
    }
}
