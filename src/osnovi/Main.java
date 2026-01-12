package osnovi;


import osnovi.console.MenuNavigator;
import osnovi.service.AddressBook;

public class Main {
    public static void main(String[] args) {
        // 1. Создаём AddressBook
        AddressBook addressBook = new AddressBook();

        // 2. Передаём его в MenuNavigator
        MenuNavigator menuNavigator = new MenuNavigator(addressBook);

        // 3. Запускаем
        menuNavigator.start();
    }
}