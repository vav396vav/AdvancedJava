package module6_advaced_collections.lesson3_comparable_comparator.comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Анна", "Иванова", 4.7));
        students.add(new Student("Борис", "Петров", 3.9));
        students.add(new Student("Анна", "Сидорова", 4.2));
        students.add(new Student("Виктор", "Иванов", 4.7));
        students.add(new Student("Алексей", "Кузнецов", 4.7));

        // Копии для разных сортировок
        List<Student> byScore = new ArrayList<>(students);
        List<Student> byName = new ArrayList<>(students);

        // Сортировка по баллу
        Collections.sort(byScore, new StudentScoreComparator());

        // Сортировка по имени
        byName.sort(new StudentNameComparator());

        // Вывод
        System.out.println("Студенты по успеваемости:");
        for (Student s : byScore) {
            System.out.println(s);
        }

        System.out.println("\nСтуденты по алфавиту:");
        for (Student s : byName) {
            System.out.println(s);
        }
    }
}