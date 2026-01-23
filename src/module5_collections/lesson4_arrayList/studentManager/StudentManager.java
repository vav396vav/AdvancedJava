package module5_collections.lesson4_arrayList.studentManager;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<String> students = new ArrayList<>();

    public void addStudent(String name) {
        students.add(name);
    }

    public void removeStudent(String name) {
        students.remove(name);
    }

    public void printAllStudents(){
        System.out.println("Список студентов: " + students);
    }

    public int getStudentCount(){
        return students.size();
    }
}
