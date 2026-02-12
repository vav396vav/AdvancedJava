package module6_advaced_collections.lesson3_comparable_comparator.comparator;

import lombok.Getter;

@Getter
public class Student {
    private final String firstname;
    private final String lastname;
    private final double averageScore;

    public Student(String firstname, String lastname, double averageScore) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname + " (средний балл: " + averageScore + ")";
    }
}
