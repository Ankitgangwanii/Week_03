package com.tit.week03.day03.insertionsort;

import java.util.Arrays;

class InsertionSort {
    public static void insertionSort(int[] empIDs) {
        int n = empIDs.length;

        for (int i = 1; i < n; i++) {
            int key = empIDs[i]; // Pick the element
            int j = i - 1;

            // Shift elements that are greater than 'key' to the right
            while (j >= 0 && empIDs[j] > key) {
                empIDs[j + 1] = empIDs[j];
                j--;
            }

            empIDs[j + 1] = key; // Insert the key at correct position
        }
    }

    public static void main(String[] args) {
        int[] employeeIDs = {105, 102, 110, 101, 108, 103, 107};

        System.out.println("Before Sorting: " + Arrays.toString(employeeIDs));
        insertionSort(employeeIDs);
        System.out.println("After Sorting: " + Arrays.toString(employeeIDs));
    }
}
