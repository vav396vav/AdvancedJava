package practical_basics;

import java.util.Scanner;

public class MenuNavigator {
    private final Scanner scanner = new Scanner(System.in);
    private final AddressBook addressBook;

    public MenuNavigator(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    String menu = """
            Адресная книга
            
            1 - новый контакт
            2 - удалить контакт
            3 - вывод всех контактов
            0 - завершение работы
            
            Введите нужную опцию и нажмите Enter [1, 2, 3, 0]:
            """;

    public void start(){
        while (true){
            System.out.println(menu);

            if (scanner.hasNextInt()){
                int input = scanner.nextInt();
                scanner.nextLine();

                switch (input){
                    case 1 -> addressBook.addContact();

                }
            }
        }
    }
}
