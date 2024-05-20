import java.time.LocalDate;
import java.util.Scanner;

import enums.Priority;

public class TaskManagerApp {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTask Manager");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. Display All Tasks");
            System.out.println("4. Display Incomplete Tasks");
            System.out.println("5. Display Completed Tasks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title of the task: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter description of the task: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter priority of the task (HIGH, MEDIUM, LOW): ");
                    Priority priority = Priority.valueOf(scanner.nextLine().toUpperCase());
                    System.out.print("Enter due date of the task (yyyy-mm-dd): ");
                    LocalDate dueDate = LocalDate.parse(scanner.nextLine());
                    taskManager.addTask(new Task(title, description, priority, dueDate));
                    break;
                case 2:
                    System.out.print("Enter title of the task to mark as completed: ");
                    String completeTitle = scanner.nextLine();
                    taskManager.markTaskAsCompleted(completeTitle);
                    break;
                case 3:
                    taskManager.displayAllTasks();
                    break;
                case 4:
                    taskManager.displayIncompleteTasks();
                    break;
                case 5:
                    taskManager.displayCompletedTasks();
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 6.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
