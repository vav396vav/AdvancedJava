package practical_basics;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {
    private String name;
    private String position;
    private String dateOfBirth;
    private String phone;
    private String email;

    public Contact(String name, String position, String dateOfBirth, String phone, String email) {
        if (name == null || name.isEmpty() || position == null || position.isEmpty()) {
            throw new IllegalArgumentException("Поля не должны быть пустыми");
        }
        this.name = name;
        this.position=position;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
    }


    @Override
    public String toString() {
        return "Ф.И.О: " + name + '\n' +
                "Должность: " + position + '\n' +
                "Дата рождения: " + dateOfBirth + '\n' +
                "Номер телефон: " + phone + '\n' +
                "Адрес электронной почты: " + email + '\n';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;
        if (name == null) return contact.name == null;
        return name.equals(contact.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
