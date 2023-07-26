package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortListOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by space: ");
       
        ArrayList<Integer> numbers = new ArrayList<>();
      
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.add(number);
        }
        scanner.close();
        
        Collections.sort(numbers);
        
        System.out.print("Sorted list: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
