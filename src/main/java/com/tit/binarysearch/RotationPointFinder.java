package com.tit.binarysearch;


public class RotationPointFinder {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12}; // Example rotated sorted array
        int rotationIndex = findRotationPoint(arr);
        System.out.println("Rotation point index: " + rotationIndex);
    }

    public static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}

