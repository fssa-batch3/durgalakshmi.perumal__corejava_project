package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortListOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");
       
        ArrayList<Integer> numbers = new ArrayList<>();
      
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.add(number);
            
        }  Collections.sort(numbers);
        scanner.close();
     
        for (int number : numbers) {
            System.out.print("Sorted list: "+ number + " ");
        }

    
      

    }
}

