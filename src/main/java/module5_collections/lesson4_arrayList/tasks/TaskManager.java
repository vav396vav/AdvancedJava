package module5_collections.lesson4_arrayList.tasks;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    List<Task> tasks = new ArrayList<>();

    public void addTask(String description) {
        boolean isUrgent = false;
        tasks.add(new Task(description, isUrgent));
    }

    public void addUrgentTask(String description) {
        tasks.add(0, new Task(description, true));
    }

    public void printAllTasks() {
        for (Task task : tasks) {
            if (task.isUrgent()) {
                System.out.println("[СРОЧНО] " + task.description());
            }else {
            System.out.println(task.description());
            }
        }
    }
    public int getTotalTasks() {
        return tasks.size();
    }
}
