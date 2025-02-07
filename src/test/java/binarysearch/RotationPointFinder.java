package binarysearch;

import static org.junit.jupiter.api.Assertions.*;

import com.tit.binarysearch.RotationPointFinder;
import org.junit.jupiter.api.Test;

class RotationPointFinderTest {

    @Test
    public void testFindRotationPoint() {
        int[] arr = {15, 18, 2, 3, 6, 12};
        int rotationIndex = RotationPointFinder.findRotationPoint(arr);
        assertEquals(2, rotationIndex);
    }

    @Test
    public void testFindRotationPointNoRotation() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int rotationIndex = RotationPointFinder.findRotationPoint(arr);
        assertEquals(0, rotationIndex);
    }
}
