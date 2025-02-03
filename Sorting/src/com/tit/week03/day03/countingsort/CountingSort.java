package com.tit.week03.day03.countingsort;

import java.util.Arrays;

public class CountingSort {

    public static void countingSort(int[] ages) {
        int min = 10, max = 18; // Age range from 10 to 18
        int range = max - min + 1;

        // Step 1: Create count array to store frequencies of ages
        int[] count = new int[range];

        // Step 2: Store the frequency of each age
        for (int i = 0; i < ages.length; i++) {
            count[ages[i] - min]++;
        }

        // Step 3: Compute cumulative frequencies
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Step 4: Place the elements in the sorted order
        int[] output = new int[ages.length];

        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - min] - 1] = ages[i];
            count[ages[i] - min]--;
        }

        // Copy the sorted output array to the original array
        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    public static void main(String[] args) {
        int[] ages = {15, 12, 17, 10, 14, 18, 13, 15, 10};

        System.out.println("Before Sorting: " + Arrays.toString(ages));
        countingSort(ages);
        System.out.println("After Sorting: " + Arrays.toString(ages));
    }
}

