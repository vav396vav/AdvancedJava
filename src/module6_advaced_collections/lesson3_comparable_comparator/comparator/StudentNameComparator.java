package module6_advaced_collections.lesson3_comparable_comparator.comparator;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int firstNameCompare = o1.getFirstname().compareTo(o2.getFirstname());
        if (firstNameCompare != 0) {
            return firstNameCompare;
        }
        // Имена равны — сравниваем фамилии
        return o1.getLastname().compareTo(o2.getLastname());
    }
}