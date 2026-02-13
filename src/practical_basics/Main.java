package practical_basics;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        MenuNavigator menuNavigator = new MenuNavigator(addressBook);

        menuNavigator.start();
    }
}
