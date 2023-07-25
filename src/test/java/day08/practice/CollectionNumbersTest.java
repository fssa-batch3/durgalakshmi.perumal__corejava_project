package day08.practice;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;


public class CollectionNumbersTest {

    @Test
    public void testSortNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(9);
        numbers.add(45);
        numbers.add(12);
        numbers.add(1);

        // Verify the list before sorting
        List<Integer> originalList = new ArrayList<>(numbers);

        // Sort the list using Collections.sort()
        Collections.sort(numbers);

        // Verify that the list is sorted correctly
        List<Integer> expectedSorted = Arrays.asList(1, 8, 9, 12, 45);
        assertEquals(expectedSorted, numbers);

        // Verify that the original list remains unchanged
        assertEquals(originalList, numbers);
    }
}

