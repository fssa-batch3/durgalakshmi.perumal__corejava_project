package day06.practice;

public class TestTask {

    public static void main(String[] args) {
        Task task1 = new Task("Completed Project", 3);
        Task task2 = new Task("Buy cookies", 2);

        System.out.println("Task 1: " + task1.getTaskName() + " Priority: " + task1.getPriority());
        System.out.println("Task 2: " + task2.getTaskName() + " Priority: " + task2.getPriority());

        task1.setTaskName("Submit Report");
        task1.setPriority(1);

        task2.setTaskName("Pay Bills");
        task2.setPriority(4);

        
        System.out.println("Task 1 (After update): " + task1.getTaskName() + " Priority: " + task1.getPriority());
        System.out.println("Task 2 (After update): " + task2.getTaskName() + " Priority: " + task2.getPriority());
    }
}

