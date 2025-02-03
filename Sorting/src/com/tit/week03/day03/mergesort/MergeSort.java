package com.tit.week03.day03.mergesort;

import java.util.Arrays;

class MergeSort {
    public static void mergeSort(double[] prices, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2; // Find the middle point

            mergeSort(prices, left, mid);  // Sort first half
            mergeSort(prices, mid + 1, right); // Sort second half

            merge(prices, left, mid, right); // Merge sorted halves
        }
    }

    public static void merge(double[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        double[] leftArray = new double[n1];
        double[] rightArray = new double[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = prices[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = prices[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // Merge the temp arrays back into prices[]
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                prices[k] = leftArray[i];
                i++;
            } else {
                prices[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[]
        while (i < n1) {
            prices[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[]
        while (j < n2) {
            prices[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        double[] bookPrices = {499.99, 199.99, 349.50, 99.99, 599.00, 299.75};

        System.out.println("Before Sorting: " + Arrays.toString(bookPrices));
        mergeSort(bookPrices, 0, bookPrices.length - 1);
        System.out.println("After Sorting: " + Arrays.toString(bookPrices));
    }
}

