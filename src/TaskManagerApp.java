import java.time.LocalDate;

import enums.Priority;

public class TaskManagerApp {
    public static void main(String[] args) {
                TaskManager taskManager = new TaskManager();
        
        // Add some tasks
        taskManager.addTask(new Task("Complete Java project", "Finish the Java project by next Monday", Priority.HIGH, LocalDate.parse("2024-05-07")));
        taskManager.addTask(new Task("Grocery shopping", "Buy groceries for the week", Priority.MEDIUM, LocalDate.parse("2024-05-05")));
        
        System.out.println("All Tasks: ");
        taskManager.displayAllTasks();
        
        System.out.println("\n");
        taskManager.markTaskAsCompleted("Complete Java project");
        taskManager.markTaskAsCompleted("Grocery shopping");

        System.out.println("\n");
        System.out.println("Incomplete Tasks: ");
        taskManager.displayIncompleteTasks();
        
        System.out.println("\n");
        System.out.println("Complete Tasks: ");
        taskManager.displayCompletedTasks();
    }
}