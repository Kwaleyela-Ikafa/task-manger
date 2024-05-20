import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        this.tasks.add(task);
        System.out.println("Task '" + task.getTitle() + "' added to the task list.");
    }

    public void markTaskAsCompleted(Task task) {
        task.setCompleted(true);
    }

    public void displayAllTasks() {
        for (Task task : tasks) {
            System.out.println("All Tasks: ");
            System.out.println("Task: " + task.getTitle() + "  " + task.getDescription() + " Due on: " + task.getDue_date());
        }
    }

    public void displayIncompleteTasks() {
        for(Task task : tasks) {
            if (!task.isCompleted()) {
                System.out.println("Incomplete Tasks: ");
                System.out.println("Task: " + task.getTitle() + "  " + task.getDescription() + " Due on: " + task.getDue_date());
            }
        }
    }

    public void displayCompletedTasks() {
        for(Task task : tasks) {
            if (task.isCompleted()) {
                System.out.println("Complete Tasks: ");
                System.out.println("Task: " + task.getTitle() + "  " + task.getDescription() + " Due on: " + task.getDue_date());
            }
        }
    }
}
