package com.tit.week03.day03.quicksort;

import java.util.Arrays;

class QuickSort {
    public static void quickSort(double[] prices, int low, int high) {
        if (low < high) {
            // Find pivot index
            int pivotIndex = partition(prices, low, high);

            // Recursively apply quick sort to left and right parts
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    public static int partition(double[] prices, int low, int high) {
        // Choose the pivot as the last element
        double pivot = prices[high];
        int i = low - 1;

        // Rearrange the elements such that smaller ones are on left, larger on right
        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;
                // Swap prices[i] and prices[j]
                double temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Swap pivot element with element at i+1
        double temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        // Return the pivot index
        return i + 1;
    }

    public static void main(String[] args) {
        double[] productPrices = {499.99, 199.99, 349.50, 99.99, 599.00, 299.75};

        System.out.println("Before Sorting: " + Arrays.toString(productPrices));
        quickSort(productPrices, 0, productPrices.length - 1);
        System.out.println("After Sorting: " + Arrays.toString(productPrices));
    }
}

