package com.tit.week03.day03.bubblesort;

import java.util.Arrays;

class BubbleSort {
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap marks[j] and marks[j+1]
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps happened in this pass, array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] studentMarks = {85, 72, 90, 60, 78, 88, 95};

        System.out.println("Before Sorting: " + Arrays.toString(studentMarks));
        bubbleSort(studentMarks);
        System.out.println("After Sorting: " + Arrays.toString(studentMarks));
    }
}

