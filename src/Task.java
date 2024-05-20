import java.time.LocalDate;

import enums.Priority;

public class Task {
    private String title;
    private String description;
    private Priority priority;
    private LocalDate dueDate;
    private Boolean completed;

    public Task(String title, String description, Priority priority, LocalDate dueDate) {
        setTitle(title);
        setDescription(description);
        setPriority(priority);
        setdueDate(dueDate);
        this.completed = false;
    }

    public Task(Task source) {
        setTitle(source.title);
        setDescription(source.description);
        setPriority(source.priority);
        setdueDate(source.dueDate);
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        if (title.isBlank() || title == null) {
            throw new IllegalArgumentException("Title cannot be null or blank");
        }
        this.title = title;
    }

    public Priority getPriority() {
        return this.priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Boolean getCompleted() {
        return this.completed;
    }


    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        if (description.isBlank() || description == null) {
            throw new IllegalArgumentException("Description cannot be null or blank");
        }
        this.description = description;
    }

    public LocalDate getDueDate() {
        return this.dueDate;
    }

    public void setdueDate(LocalDate date) {
        this.dueDate = date;
    }

    public Boolean isCompleted() {
        return this.completed;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", priority=" + priority +
                ", completed=" + completed +
                '}';
    }
}
