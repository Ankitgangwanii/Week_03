package linearsearch;
import com.tit.linearsearch.FirstNegativeNumberSearch;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FirstNegativeNumberTesting {

    @Test
    public void testWithNegativeNumbers() {
        int[] arr = {3, 7, 1, -5, 9, -2};
        int index = FirstNegativeNumberSearch.findFirstNegative(arr);
        assertEquals(3, index);
    }

    @Test
    public void testWithoutNegativeNumbers() {
        int[] arr = {3, 7, 1, 5, 9, 2};
        int index = FirstNegativeNumberSearch.findFirstNegative(arr);
        assertEquals(-1, index);
    }
}

