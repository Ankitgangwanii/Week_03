package binarysearch;

import static org.junit.jupiter.api.Assertions.*;

import com.tit.binarysearch.MatricsSearch;
import org.junit.jupiter.api.Test;

class MatricsSearchTesting {

    @Test
    public void testSearchMatrixFound() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;
        assertTrue(MatricsSearch.searchMatrix(matrix, target));
    }

    @Test
    public void testSearchMatrixNotFound() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 13;
        assertFalse(MatricsSearch.searchMatrix(matrix, target));
    }
}

