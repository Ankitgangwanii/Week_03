package binarysearch;

import static org.junit.jupiter.api.Assertions.*;

import com.tit.binarysearch.PeakElement;
import org.junit.jupiter.api.Test;

class PeakElementTesting {

    @Test
    public void testFindPeakElement() {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = PeakElement.findPeakElement(arr);
        assertTrue(peakIndex >= 0 && peakIndex < arr.length);
        if (peakIndex > 0) {
            assertTrue(arr[peakIndex] >= arr[peakIndex - 1]);
        }
        if (peakIndex < arr.length - 1) {
            assertTrue(arr[peakIndex] >= arr[peakIndex + 1]);
        }
    }

    @Test
    public void testFindPeakElementSingleElement() {
        int[] arr = {10};
        assertEquals(0, PeakElement.findPeakElement(arr));
    }
}

