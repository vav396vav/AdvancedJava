package practical_basics;

import java.util.Scanner;

public class AddressBook {
    private int MAX_SIZE = 10;
    private Scanner scanner;
    private Contact[] contacts;
    private int size;
    private int id;

    public AddressBook() {
        this.scanner = new Scanner(System.in);
        this.contacts = new Contact[MAX_SIZE];
        this.size = 0;
    }

    public void addContact(){
        System.out.println("Новый контакт...");
        System.out.print("Ведете Фамилию, Имя, Отчество: ");
        String name = scanner.nextLine();

        for(int i = 0; i < MAX_SIZE; i++) {
            if(contacts[i].getName().trim().equalsIgnoreCase(name.trim())){
                System.out.println("Такой пользователь уже существует.");

            }
        }
    }

    public void deleteContact(int id) {
        if(contacts == null){
            System.out.println("Адресная книга пустая! ");
        }

        for (int i = 0; i < contacts.length; i++){
            if (i == id){
                contacts[i] = null;
                System.out.println("Контакт с ID: " + id + " удалён.");
            }
            if (contacts[i] == null){
                contacts[i] = contacts[i + 1];
            }
            System.out.println("Контакт с ID: " + id + "Не найден.");
        }
    }

    public void displayAllContacts(){
        System.out.println("Контакты адресной книги: ");
        for (int i = 0; i < contacts.length; i++){
            System.out.println("ID: " + id);
            contacts[i].toString();
        }
    }
}
