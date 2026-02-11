package practical_basics;

public class AddressBook {
    int size = 1;
    int id;
    Contact[] contacts = new Contact[size];

    public void addContact(Contact contact){
        if (contacts.length > size){
            System.out.println("Адресная книга полная!");
        }
        for (int i = 0; i < contacts.length; i++){
            if(contacts[i] == contact){
                System.out.println("Пользователь " + contact.getName() + " уже присутствует в списке\n" +
                        "контактов, он будет обновлён в соответствии с новыми данными.");
                contacts[i] = contact;
                System.out.println("Контакт успешно обновлён!");
            }
            if (contacts[i] == null){
                contacts[i] = contact;
                id = i;
                System.out.println("Контакт был успешно добавлен!");
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
