package practical_basics;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {
    private String name;
    private String position;
    private int dateOfBirth;
    private int phone;
    private String email;

    public Contact(String name,String position,int dateOfBirth, int phone, String email) {
        if (name.isEmpty() || position.isEmpty()){
            throw new IllegalArgumentException("Поля не должны быть пустыми");
        }
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
    }


    @Override
    public String toString() {
        return "Ф.И.О: " + name + '\'' +
                ", Должность: " + position + '\'' +
                ", Дата рождения: " + dateOfBirth +
                ", Номер телефон: " + phone +
                ", Адрес электронной почты: " + email;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;

        return name.equals(contact.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
