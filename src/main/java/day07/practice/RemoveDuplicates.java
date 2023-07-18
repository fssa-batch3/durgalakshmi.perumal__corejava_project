package day07.practice;
import java.util.ArrayList;
import java.util.HashSet;

	public class RemoveDuplicates {

	    public static void main(String[] args) {
	        ArrayList<Integer> numbersList = new ArrayList<>();
	        numbersList.add(5);
	        numbersList.add(10);
	        numbersList.add(5);
	        numbersList.add(20);
	        numbersList.add(10);
	        numbersList.add(30);

	        HashSet<Integer> uniqueNumbersSet = new HashSet<>(numbersList);

	        System.out.println("Unique values:");
	        for (int num : uniqueNumbersSet) {
	            System.out.println(num);
	        }
	    }
	}
