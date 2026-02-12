package module6_advaced_collections.practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Две коллекции для соблюдения требований по сложности
        Map<String, User> userMap = new HashMap<>();      // O(1) для in/del/count
        SortedSet<User> userSet = new TreeSet<>();        // O(log n) для young/old

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду (help — справка):");

        while (true) {
            String command = scanner.nextLine().trim();

            switch (command) {
                case "in":
                    handleIn(scanner, userMap, userSet);
                    break;
                case "del":
                    handleDel(scanner, userMap, userSet);
                    break;
                case "count":
                    System.out.println("Количество пользователей: " + userMap.size());
                    break;
                case "avg":
                    handleAvg(userMap);
                    break;
                case "median":
                    handleMedian(userMap);
                    break;
                case "young":
                    handleYoung(userSet);
                    break;
                case "old":
                    handleOld(userSet);
                    break;
                case "print":
                    handlePrint(userSet);
                    break;
                case "help":
                    printHelp();
                    break;
                case "exit":
                    System.out.println("Программа завершена");
                    return;
                default:
                    System.out.println("Неизвестная команда. Попробуйте снова");
            }
        }
    }

    private static void handleIn(Scanner scanner, Map<String, User> userMap, SortedSet<User> userSet) {
        System.out.print("Введите номер паспорта: ");
        String passport = scanner.nextLine().trim();

        if (userMap.containsKey(passport)) {
            System.out.println("Пользователь с таким паспортом уже существует.");
            return;
        }

        System.out.print("Введите имя: ");
        String name = scanner.nextLine().trim();

        System.out.print("Введите возраст: ");
        String ageStr = scanner.nextLine().trim();

        // Без try-catch: проверяем вручную
        if (!ageStr.matches("\\d+")) {
            System.out.println("Возраст должен быть целым неотрицательным числом.");
            return;
        }

        int age = Integer.parseInt(ageStr);
        User user = new User(passport, name, age);
        userMap.put(passport, user);
        userSet.add(user);
        System.out.println("Пользователь добавлен.");
    }

    private static void handleDel(Scanner scanner, Map<String, User> userMap, SortedSet<User> userSet) {
        System.out.print("Введите номер паспорта: ");
        String passport = scanner.nextLine().trim();

        User user = userMap.get(passport);
        if (user == null) {
            System.out.println("Пользователь с таким паспортом не найден.");
            return;
        }

        userMap.remove(passport);
        userSet.remove(user);
        System.out.println("Пользователь удалён.");
    }

    private static void handleAvg(Map<String, User> userMap) {
        if (userMap.isEmpty()) {
            System.out.println("Нет пользователей.");
            return;
        }

        long totalAge = 0;
        for (User user : userMap.values()) {
            totalAge += user.getAge();
        }
        double avg = (double) totalAge / userMap.size();
        System.out.printf("Средний возраст: %.2f%n", avg);
    }

    private static void handleMedian(Map<String, User> userMap) {
        if (userMap.isEmpty()) {
            System.out.println("Нет пользователей.");
            return;
        }



        List<Integer> ages = new ArrayList<>();
        for (User user : userMap.values()) {
            ages.add(user.getAge());
        }
        Collections.sort(ages);
        int n = ages.size();
        double median;
        if (n % 2 == 1) {
            median = ages.get(n / 2);
        } else {
            median = (ages.get(n / 2 - 1) + ages.get(n / 2)) / 2.0;
        }
        System.out.printf("Медиана возраста: %.2f%n", median);
    }

    private static void handleYoung(SortedSet<User> userSet) {
        if (userSet.isEmpty()) {
            System.out.println("Нет пользователей.");
            return;
        }
        System.out.println("Самый молодой: " + userSet.first());
    }

    private static void handleOld(SortedSet<User> userSet) {
        if (userSet.isEmpty()) {
            System.out.println("Нет пользователей.");
            return;
        }
        System.out.println("Самый старший: " + userSet.last());
    }

    private static void handlePrint(SortedSet<User> userSet) {
        if (userSet.isEmpty()) {
            System.out.println("Нет пользователей.");
            return;
        }
        for (User user : userSet) {
            System.out.println(user);
        }
    }

    private static void printHelp() {
        System.out.println("""
                Доступные команды:
                in     — добавить пользователя
                del    — удалить пользователя
                count  — количество пользователей
                avg    — средний возраст
                median — медиана возраста
                young  — самый молодой
                old    — самый старший
                print  — все пользователи (по возрасту)
                help   — эта справка
                exit   — завершить программу
                """);
    }
}