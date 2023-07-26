package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableTask {
	public class ComparableTask {
	    public static void main(String[] args) {

	        Task task1 = new Task(3, "Coding", LocalDate.of(2022, 10, 22));
	        Task task2 = new Task(5, "Product Design", LocalDate.of(2022, 10, 01));
	        Task task3 = new Task(1, "Software Design", LocalDate.of(2022, 10, 07));
	        Task task4 = new Task(3, "Coding", LocalDate.of(2022, 10, 22));

	        ArrayList<Task> tasks = new ArrayList<>();
	        tasks.add(task1);
	        tasks.add(task2);
	        tasks.add(task3);
	        tasks.add(task4);

	        System.out.println("Before Sorting");
	        System.out.println(tasks);

	        System.out.println("After Sorting");
	        Collections.sort(tasks);
	        System.out.println(tasks);

	    }
	}
}
