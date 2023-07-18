package day07.practice;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.HashSet;

public class Tasks {
    
    private int id;
    private String name;
    private LocalDate deadline;

    public Tasks(int id, String name, LocalDate deadline) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public static void main(String[] args) {
        ArrayList<Tasks> tasksList = new ArrayList<>();

        Tasks task1 = new Tasks(1, "Task A", LocalDate.of(2023, 7, 20));
        Tasks task2 = new Tasks(2, "Task B", LocalDate.of(2023, 7, 21));
        Tasks task3 = new Tasks(1, "Task A", LocalDate.of(2023, 7, 22)); 

        tasksList.add(task1);
        tasksList.add(task2);
        tasksList.add(task3);

        HashSet<Tasks> uniqueTasksSet = new HashSet<>(tasksList);

        System.out.println("Unique Tasks:");
        for (Tasks task : uniqueTasksSet) {
            System.out.println(task.getId() + " " + task.getName() + " " + task.getDeadline());
        }
    }
}

