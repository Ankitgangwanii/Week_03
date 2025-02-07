package com.tit.binarysearch;

public class PeakElement {
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // If the middle element is greater than the next one, peak is on the left side (including mid)
                right = mid;
            } else {
                // If the middle element is smaller than the next one, peak is on the right side
                left = mid + 1;
            }
        }

        return left; // 'left' will eventually point to a peak element
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeakElement(arr);
        System.out.println("Peak element is at index: " + peakIndex + " with value: " + arr[peakIndex]);
    }
}
