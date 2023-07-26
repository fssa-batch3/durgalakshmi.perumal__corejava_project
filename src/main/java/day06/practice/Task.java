package day06.practice;

public class Task {

    private String taskName;
    private int priority;

    public Task() {
      
        this.taskName = "";
        this.priority = 0;
    }

    public Task(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public static void main(String[] args) {
        Task task1 = new Task("Complete Project", 3);
        Task task2 = new Task("Buy Groceries", 2);

        System.out.println("Task 1: " + task1.getTaskName() + " Priority: "+ task1.getPriority());
        System.out.println("Task 2: " + task2.getTaskName() + " Priority: " + task2.getPriority());
    }

	public String getEmail_id() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
}
