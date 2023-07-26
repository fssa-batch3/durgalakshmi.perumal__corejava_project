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

        List<Integer> originalList = new ArrayList<>(numbers);

        Collections.sort(numbers);

        List<Integer> expectedSorted = Arrays.asList(1, 8, 9, 12, 45);
        assertEquals(expectedSorted, numbers);

        assertEquals(originalList, numbers);
    }
}

