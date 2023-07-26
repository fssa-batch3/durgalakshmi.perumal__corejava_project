package day09.practice;

import java.util.*;

public class CollectionNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(8);
        numbers.add(9);
        numbers.add(45);
        numbers.add(12);
        numbers.add(1);

        System.out.println("Test Case 1:");
        System.out.println("Input: " + numbers);
        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);
        System.out.println("Expected Output: [1, 8, 9, 12, 45]");
        System.out.println("Actual Output: " + sortedNumbers);
        System.out.println();

        List<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(-5);
        numbers2.add(-2);
        numbers2.add(-10);
        numbers2.add(-1);
        numbers2.add(-8);

        System.out.println("Test Case 2:");
        System.out.println("Input: " + numbers2);
        List<Integer> sortedNumbers2 = new ArrayList<>(numbers2);
        Collections.sort(sortedNumbers2);
        System.out.println("Expected Output: [-10, -8, -5, -2, -1]");
        System.out.println("Actual Output: " + sortedNumbers2);
        System.out.println();

        List<Integer> numbers3 = new ArrayList<Integer>();
        numbers3.add(6);
        numbers3.add(-3);
        numbers3.add(0);
        numbers3.add(2);
        numbers3.add(-9);

        System.out.println("Test Case 3:");
        System.out.println("Input: " + numbers3);
        List<Integer> sortedNumbers3 = new ArrayList<>(numbers3);
        Collections.sort(sortedNumbers3);
        System.out.println("Expected Output: [-9, -3, 0, 2, 6]");
        System.out.println("Actual Output: " + sortedNumbers3);
        System.out.println();

        List<Integer> numbers4 = new ArrayList<Integer>();
        numbers4.add(7);
        numbers4.add(3);
        numbers4.add(7);
        numbers4.add(2);
        numbers4.add(3);
        numbers4.add(5);
        numbers4.add(2);

        System.out.println("Test Case 4:");
        System.out.println("Input: " + numbers4);
        List<Integer> sortedNumbers4 = new ArrayList<>(numbers4);
        Collections.sort(sortedNumbers4);
        System.out.println("Expected Output: [2, 2, 3, 3, 5, 7, 7]");
        System.out.println("Actual Output: " + sortedNumbers4);
        System.out.println();

        List<Integer> numbers5 = new ArrayList<Integer>();
        numbers5.add(9);

        System.out.println("Test Case 5:");
        System.out.println("Input: " + numbers5);
        List<Integer> sortedNumbers5 = new ArrayList<>(numbers5);
        Collections.sort(sortedNumbers5);
        System.out.println("Expected Output: [9]");
        System.out.println("Actual Output: " + sortedNumbers5);
    }
}