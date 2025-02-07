package binarysearch;

import static org.junit.jupiter.api.Assertions.*;

import com.tit.binarysearch.FirstLastOccurence;
import org.junit.jupiter.api.Test;

class FirstLastOccurenceTest {

    @Test
    public void testFindFirstAndLastOccurrence() {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        int[] result = FirstLastOccurence.findFirstAndLast(arr, target);
        assertArrayEquals(new int[]{1, 3}, result);
    }

    @Test
    public void testFindFirstAndLastOccurrenceNotFound() {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 6;
        int[] result = FirstLastOccurence.findFirstAndLast(arr, target);
        assertArrayEquals(new int[]{-1, -1}, result);
    }
}

