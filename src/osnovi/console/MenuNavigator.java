package osnovi.console;


import osnovi.service.AddressBook;

import java.util.Scanner;

public class MenuNavigator {
    private final Scanner scanner = new Scanner(System.in);
    private final AddressBook addressBook; // ← зависимость внедряется

    // Конструктор — получаем AddressBook извне
    public MenuNavigator(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    public void start() {
        while (true) {
            showMenu();

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine(); // очистка буфера после nextInt()

                switch (choice) {
                    case 1 -> addressBook.addContact();      // ← вызов
                    case 2 -> addressBook.removeContact();   // ← вызов
                    case 3 -> addressBook.listAllContacts(); // ← вызов
                    case 4 -> {
                        System.out.println("Работа программы завершена, ждём вас снова!");
                        scanner.close();
                        return;
                    }
                    default -> System.out.println("Выбрана неверная опция! Попробуйте заново.");
                }
            } else {
                String bad = scanner.next();
                System.out.println("Выбрана неверная опция! Попробуйте заново.");
                System.out.println();
            }
        }
    }

    private void showMenu() {
        System.out.println("""
                Адресная книга
                
                1 – новый контакт
                2 – удаление существующего контакта
                3 – вывод всех контактов
                4 – завершение работы
                """);
        System.out.print("Введите нужную опцию и нажмите Enter [1..4]: ");
    }
}