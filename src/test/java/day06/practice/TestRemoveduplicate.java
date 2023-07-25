package day06.practice;
import java.util.ArrayList;

public class TestRemoveduplicate {
    public static void main(String[] args) {
        ArrayList<String> taskList = new ArrayList<>();
        taskList.add("Chennai");
        taskList.add("Bangalore");
        taskList.add("Mumbai");
        taskList.add("Mumbai");
        taskList.add("Chennai");

        removeDuplicates(taskList);

        for (String task : taskList) {
            System.out.println(task);
        }
    }

    public static void removeDuplicates(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
         String task = list.get(i);
        for (int j = i + 1; j < list.size(); j++) {
        if (task.equals(list.get(j))) {
        list.remove(j);j--;
        }
       }
      }
    }
}

