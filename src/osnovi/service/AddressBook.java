package osnovi.service;


import osnovi.model.Contact;

import java.util.Scanner;

public class AddressBook {
    private static final int MAX_CONTACTS = 100;
    private Contact[] contacts;
    private int size;
    private Scanner scanner;

    public AddressBook() {
        this.contacts = new Contact[MAX_CONTACTS];
        this.size = 0;
        this.scanner = new Scanner(System.in);
    }

    public void addContact() {
        System.out.println("Новый контакт:");
        System.out.print("Введите Ф. И. О. контакта: ");
        String fullName = scanner.nextLine().trim();

        // Поиск существующего контакта (игнорируем регистр и пробелы)
        int existingIndex = findContactIndexByName(fullName);

        System.out.print("Должность: ");
        String position = scanner.nextLine();
        System.out.print("Дата рождения: ");
        String birthDate = scanner.nextLine();
        System.out.print("Номер телефона: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Адрес электронной почты: ");
        String email = scanner.nextLine();

        Contact newContact = new Contact(fullName, position, birthDate, phoneNumber, email);

        if (existingIndex != -1) {
            contacts[existingIndex] = newContact;
            System.out.println("Контакт был обновлён");
        } else {
            if (size < MAX_CONTACTS) {
                contacts[size] = newContact;
                size++;
                System.out.println("Новый контакт добавлен");
            } else {
                System.out.println("Адресная книга заполнена. Невозможно добавить контакт.");
            }
        }
    }

    public void removeContact() {
        listAllContacts(); // Показываем ID перед удалением
        System.out.print("Удаление существующего контакта\nВведите ID контакта: ");
        if (scanner.hasNextInt()) {
            int id = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            if (id >= 0 && id < size) {
                // Сдвигаем элементы влево
                for (int i = id; i < size - 1; i++) {
                    contacts[i] = contacts[i + 1];
                }
                contacts[size - 1] = null;
                size--;
                System.out.println("Контакт с ID: " + id + " удалён");
                System.out.println();
            } else {
                System.out.println("Пользователь с ID: " + id + " не найден");
            }
        } else {
            String bad = scanner.next();
            System.out.println("Пользователь с ID: " + bad + " не найден");
            scanner.nextLine(); // очистка
        }
    }

    public void listAllContacts() {
        System.out.println("Контакты, имеющиеся в адресной книге:");
        for (int i = 0; i < size; i++) {
            System.out.println("ID: " + i);
            System.out.println(contacts[i].toString());
            System.out.println(); // пустая строка между контактами
        }
        if (size == 0) {
            System.out.println("Адресная книга пуста.");
            System.out.println();
        }
    }

    private int findContactIndexByName(String fullName) {
        if (fullName == null || fullName.isEmpty()) return -1;
        String normalizedInput = fullName.trim().toLowerCase();

        for (int i = 0; i < size; i++) {
            String normalizedStored = contacts[i].getFullName().trim().toLowerCase();
            if (normalizedStored.equals(normalizedInput)) {
                return i;
            }
        }
        return -1;
    }
}