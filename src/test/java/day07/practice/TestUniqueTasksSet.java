package day07.practice;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.*;
import java.time.LocalDate;


public class TestUniqueTasksSet {

	
	  @Test
	    public void testUniqueTasksSet() {
	        ArrayList<Tasks> tasksList = new ArrayList<>();

	        Tasks task1 = new Tasks(1, "Task A", LocalDate.of(2023, 7, 20));
	        Tasks task2 = new Tasks(2, "Task B", LocalDate.of(2023, 7, 21));
	        Tasks task3 = new Tasks(1, "Task A", LocalDate.of(2023, 7, 22));

	        tasksList.add(task1);
	        tasksList.add(task2);
	        tasksList.add(task3);

	        HashSet<Tasks> uniqueTasksSet = new HashSet<>(tasksList);

	        // Verify that the HashSet contains only unique tasks
	        assertEquals(tasksList.size() - 1, uniqueTasksSet.size());

	        // Verify that the HashSet does not contain duplicates
	        for (Tasks task : uniqueTasksSet) {
	            assertTrue(tasksList.contains(task));
	        }
	    }
	}

