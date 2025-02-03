package com.tit.week03.day03.selectionsort;

import java.util.Arrays;

class SelectionSort {
    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] examScores = {85, 92, 78, 63, 91, 76, 88};

        System.out.println("Before Sorting: " + Arrays.toString(examScores));
        selectionSort(examScores);
        System.out.println("After Sorting: " + Arrays.toString(examScores));
    }
}

