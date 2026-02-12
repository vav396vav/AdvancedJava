package module6_advaced_collections.practice;

import java.util.Objects;

public class User implements Comparable<User> {
    private final String passportNumber;
    private final String name;
    private final int age;

    public User(String passportNumber, String name, int age) {
        this.passportNumber = passportNumber;
        this.name = name;
        this.age = age;
    }

    public String getPassportNumber() { return passportNumber; }
    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(passportNumber, user.passportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber);
    }

    // Для TreeSet: сначала по возрасту, затем по паспорту (чтобы избежать "равных" пользователей)
    @Override
    public int compareTo(User other) {
        int ageCompare = Integer.compare(this.age, other.age);
        if (ageCompare != 0) {
            return ageCompare;
        }
        return this.passportNumber.compareTo(other.passportNumber);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}