package module5_collections.lesson4_arrayList.tasks;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask("Проверить почту");
        taskManager.addTask("Прочитать документацию");
        taskManager.addTask("Написать отчёт");

        taskManager.addUrgentTask("Срочный звонок клиенту");
        taskManager.addUrgentTask("Исправить критическую ошибку");

        taskManager.printAllTasks();
        System.out.println("Всего задач: " + taskManager.getTotalTasks());
    }
}
