public class Task {
    private String title;
    private String description;
    private String due_date;
    private Boolean completed;

    public Task(String title, String description, String due_date) {
        setTitle(title);
        setDescription(description);
        setDue_date(due_date);
        this.completed = false;
    }

    public Task(Task source) {
        setTitle(source.title);
        setDescription(source.description);
        setDue_date(source.due_date);
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDue_date() {
        return this.due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public Boolean isCompleted() {
        return this.completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

}
