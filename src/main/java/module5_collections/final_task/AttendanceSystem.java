package module5_collections.final_task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Система учёта посещаемости студентов.
 * Хранит:
 * - список всех студентов (ArrayList)
 * - карту посещаемости: студент → список отметок (true/false)
 */
public class AttendanceSystem {

    // Список всех студентов группы
    private final List<Student> students = new ArrayList<>();

    // Карта: студент → его посещаемость (список true/false)
    private final Map<Student, List<Boolean>> attendanceRecords = new HashMap<>();

    /**
     * Добавляет нового студента в группу.
     * Если студент с таким именем уже существует — игнорирует.
     *
     * @param name имя студента
     */
    public void addStudent(String name) {
        // Проверяем, нет ли уже студента с таким именем
        boolean alreadyExists = false;
        for (Student student : students) {
            if (student.name().equals(name)) {
                alreadyExists = true;
                break;
            }
        }

        if (!alreadyExists) {
            Student newStudent = new Student(name);
            students.add(newStudent);
            // Создаём пустой список посещаемости для нового студента
            attendanceRecords.put(newStudent, new ArrayList<>());
        }
    }

    /**
     * Отмечает посещаемость на новом занятии.
     * Для каждого студента в группе добавляется true/false в его список.
     *
     * @param presentStudents список имён студентов, которые присутствовали
     */
    public void markAttendanceForAll(List<String> presentStudents) {
        // Преобразуем список имён в Set для быстрой проверки
        Set<String> presentSet = new HashSet<>(presentStudents);

        // Для каждого студента в группе
        for (Student student : students) {
            // Получаем его список посещаемости
            List<Boolean> attendance = attendanceRecords.get(student);
            // Проверяем, был ли он на занятии
            boolean wasPresent = presentSet.contains(student.name());
            // Добавляем новую отметку
            attendance.add(wasPresent);
        }
    }

    /**
     * Возвращает список студентов, у которых НИКОГДА не было пропусков.
     * То есть все значения в их списке — true.
     *
     * @return список студентов с идеальной посещаемостью
     */
    public List<Student> getPerfectAttendanceStudents() {
        List<Student> perfect = new ArrayList<>();
        for (Student student : students) {
            List<Boolean> records = attendanceRecords.get(student);
            // Если нет занятий — считаем, что посещаемость идеальна (можно уточнить по ТЗ)
            if (records.isEmpty()) {
                continue; // или добавлять? В нашем случае занятия есть — пропускаем
            }
            boolean allPresent = true;
            for (Boolean present : records) {
                if (!present) {
                    allPresent = false;
                    break;
                }
            }
            if (allPresent) {
                perfect.add(student);
            }
        }
        return perfect;
    }

    /**
     * Возвращает список студентов, у которых ЕСТЬ хотя бы один пропуск.
     *
     * @return список студентов с пропусками
     */
    public List<Student> getStudentsWithAbsences() {
        List<Student> absentees = new ArrayList<>();
        for (Student student : students) {
            List<Boolean> records = attendanceRecords.get(student);
            if (records.isEmpty()) {
                continue;
            }
            boolean hasAbsence = false;
            for (Boolean present : records) {
                if (!present) {
                    hasAbsence = true;
                    break;
                }
            }
            if (hasAbsence) {
                absentees.add(student);
            }
        }
        return absentees;
    }

    /**
     * Выводит полный отчёт по посещаемости.
     */
    public void printAttendanceReport() {
        System.out.println("Отчёт по посещаемости:");
        for (Student student : students) {
            List<Boolean> records = attendanceRecords.get(student);
            System.out.println(student.name() + ": " + records);
        }
        System.out.println(); // пустая строка для читаемости
    }
}