package practical_basics;

public class Contact {
    private String name;
    private String position;
    private int dateOfBirth;
    private int phone;
    private String email;

    public Contact(String name,String position,int dateOfBirth, int phone, String email) {
        if (!name.isEmpty()) {
            this.name = name;
        }
        if (!position.isEmpty()){
            this.position = name;
        }
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
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
