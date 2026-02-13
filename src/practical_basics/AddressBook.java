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

    public void addContact() {
        if (size >= MAX_SIZE) {
            System.out.println("Книга заполнена.");
        }

        System.out.println("Новый контакт...");
        System.out.print("Ведете Фамилию, Имя, Отчество: ");
        String name = scanner.nextLine();
//        boolean newName = nameCheck(name);
        System.out.print("Введите должность: ");
        String position = scanner.nextLine();
        System.out.print("Введите дату рождения: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Введите номер телефона: ");
        String phone = scanner.nextLine();
        System.out.print("Введите адрес электронной почты: ");
        String email = scanner.nextLine();

        Contact newContact = new Contact(name, position, dateOfBirth, phone, email);

        for (int i = 0; i < size; i++) {
            Contact contact = contacts[i];
            if (contact != null) {
                String existingName = contact.getName();
                if (existingName != null && existingName.trim().equalsIgnoreCase(name.trim())) {
                    contacts[i] = newContact;
                    System.out.println("Контакт обновлён.");
                    return;
                }
            }
        }

        contacts[size] = newContact;
        size++;
        System.out.println("Добавлен новый Контакт." + "\n");
    }

//    public boolean nameCheck(String name){
//
//    }

    public void deleteContact() {
        displayAllContacts();

        for (int i = 0; i < size; i++){
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
        if (size == 0){
            System.out.println("Адресная книга пуста!");
        }
        System.out.println("Контакты адресной книги: ");
        for (int i = 0; i < size; i++) {
            System.out.println("ID: " + i + "\n"+ contacts [i]);
        }
    }
}
