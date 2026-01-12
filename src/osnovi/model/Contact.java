package osnovi.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Contact {
    private String fullName;
    private String position;
    private String birthDate;
    private String phoneNumber;
    private String email;

    public Contact(String fullName, String position, String birthDate, String phoneNumber, String email) {
        if (fullName == null || fullName.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.fullName = fullName.trim();
        this.position = position;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }

    @Override
    public String toString() {
        return "ID: " + "\n" +
                "Ф. И. О.: " + fullName + "\n" +
                "Должность: " + position + "\n" +
                "Дата рождения: " + birthDate + "\n" +
                "Номер телефона: " + phoneNumber + "\n" +
                "Адрес электронной почты: " + email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;
        return  fullName.equalsIgnoreCase(contact.fullName);
    }

}
