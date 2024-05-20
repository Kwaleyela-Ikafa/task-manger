import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        this.tasks.add(task);
        System.out.println("Task '" + task.getTitle() + "' added to the task manager.");
    }

    public void markTaskAsCompleted(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                if (!task.isCompleted()) {
                    task.markAsCompleted();;
                    System.out.println("Task '" + title + "' marked as completed.");
                } else {
                    System.out.println("Task '" + title + "' is already completed.");
                }
                return;
            }
        }
        System.out.println("Task '" + title + "' not found in the task manager.");
    }

    public void displayAllTasks() {
        System.out.println("All Tasks:");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void displayIncompleteTasks() {
        System.out.println("Incomplete Tasks:");
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                System.out.println(task);
            }
        }
    }

    public void displayCompletedTasks() {
        System.out.println("Completed Tasks:");
        for (Task task : tasks) {
            if (task.isCompleted()) {
                System.out.println(task);
            }
        }
    }
}
