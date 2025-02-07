package challengeproblem;
import com.tit.challengeproblem.SearchAlgorithm;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class SearchAlgorithmTest {

    @Test
    public void testFindFirstMissingPositive() {
        int[] arr1 = {3, 4, -1, 1};
        assertEquals(2, SearchAlgorithm.findFirstMissingPositive(arr1));

        int[] arr3 = {7, 8, 9, 11, 12};
        assertEquals(1, SearchAlgorithm.findFirstMissingPositive(arr3));
    }

    @Test
    public void testBinarySearch() {
        int[] arr1 = {6, 1, 3, 5, 2, 4};
        assertEquals(3, SearchAlgorithm.binarySearch(arr1, 4));

        int[] arr3 = {10, 20, 30, 40, 50};
        assertEquals(-1, SearchAlgorithm.binarySearch(arr3, 25));
    }
}

