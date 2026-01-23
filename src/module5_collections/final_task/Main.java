package module5_collections.final_task;

import java.util.Arrays;
import java.util.List;

/**
 * Главный класс для демонстрации работы системы учёта посещаемости.
 */
public class Main {
    public static void main(String[] args) {
        // Создаём систему
        AttendanceSystem system = new AttendanceSystem();

        // Добавляем студентов
        system.addStudent("Александр");
        system.addStudent("Мария");
        system.addStudent("Дмитрий");

        // Занятие 1: все присутствовали
        system.markAttendanceForAll(Arrays.asList("Александр", "Мария", "Дмитрий"));

        // Занятие 2: все присутствовали
        system.markAttendanceForAll(Arrays.asList("Александр", "Мария", "Дмитрий"));

        // Занятие 3: Дмитрий отсутствовал
        system.markAttendanceForAll(Arrays.asList("Александр", "Мария"));

        // Выводим полный отчёт
        system.printAttendanceReport();

        // Студенты без пропусков
        System.out.println("Студенты без пропусков:");
        for (Student student : system.getPerfectAttendanceStudents()) {
            System.out.println(student.name());
        }

        System.out.println();

        // Студенты с пропусками
        System.out.println("Студенты с пропусками:");
        for (Student student : system.getStudentsWithAbsences()) {
            System.out.println(student.name());
        }
    }
}