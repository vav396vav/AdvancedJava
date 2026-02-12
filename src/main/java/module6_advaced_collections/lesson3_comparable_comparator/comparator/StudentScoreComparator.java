package module6_advaced_collections.lesson3_comparable_comparator.comparator;

import java.util.Comparator;

// Класс САМ является компаратором
public class StudentScoreComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // Сравниваем по убыванию: лучший балл — первый
        // Поэтому сравниваем o2 с o1 (инвертируем порядок)
        return Double.compare(o2.getAverageScore(), o1.getAverageScore());
    }
}