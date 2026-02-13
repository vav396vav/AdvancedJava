package practical_basics;

import java.util.Scanner;

public class MenuNavigator {
    private final Scanner scanner = new Scanner(System.in);
    private final AddressBook addressBook;


    public MenuNavigator(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    public void start() {
        while (true) {
            menu();
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                scanner.nextLine();

                switch (input) {
                    case 1 -> addressBook.addContact();
                    case 2 -> addressBook.deleteContact();
                    case 3 -> addressBook.displayAllContacts();
                    case 0 -> System.out.println("Завершение работы");
                    default -> {
                        System.out.println("Выбран неверный пункт меню, повторите ввод");
                        scanner.close();
                        return;
                    }
                }
            } else {
                scanner.nextLine();
                System.out.println("Неверное ввод пункта, должно быть число от 0 до 3");
            }
        }
    }

    public void menu() {
        String command = """
                Адресная книга
                
                1 - новый контакт
                2 - удалить контакт
                3 - вывод всех контактов
                0 - завершение работы
                """;
        System.out.println(command);
        System.out.print("Введите нужную опцию и нажмите Enter [1, 2, 3, 0]: ");
    }
}
