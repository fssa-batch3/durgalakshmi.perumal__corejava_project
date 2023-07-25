package day07.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.*;

public class TestRemoveDuplicates {

    @Test
    public void testRemoveDuplicates() {
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(5);
        numbersList.add(10);
        numbersList.add(5);
        numbersList.add(20);
        numbersList.add(10);
        numbersList.add(30);

        HashSet<Integer> uniqueNumbersSet = new HashSet<>(numbersList);

        // Verify that the HashSet contains only unique elements
        assertEquals(numbersList.size(), uniqueNumbersSet.size());

        // Verify that the HashSet does not contain duplicates
        for (int num : uniqueNumbersSet) {
            assertTrue(numbersList.contains(num));
        }
    }
}

