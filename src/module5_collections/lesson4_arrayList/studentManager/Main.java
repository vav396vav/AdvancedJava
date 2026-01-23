package module5_collections.lesson4_arrayList.studentManager;

public class Main {
    public static void main(String[] args) {

        StudentManager student = new StudentManager();

        student.addStudent("Александр");
        student.addStudent("Мария");
        student.addStudent("Дмитрий");

        student.printAllStudents();
        System.out.println("Количество студентов: " + student.getStudentCount());

        student.removeStudent("Мария");
        student.printAllStudents();
        System.out.println("Количество студентов: " + student.getStudentCount());
    }
}
