package com.tit.week03.day02.hashmap;

import java.util.*;

class ZeroSumSubArrays {
    public static void findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> prefixSumMap = new HashMap<>();
        int prefixSum = 0;

        // Initialize the map with prefixSum 0 at index -1 (important for subarrays starting from index 0)
        prefixSumMap.put(0, new ArrayList<>());
        prefixSumMap.get(0).add(-1);

        System.out.println("Zero Sum Subarrays: ");

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            // If prefixSum exists in map, subarrays exist
            if (prefixSumMap.containsKey(prefixSum)) {
                for (int startIdx : prefixSumMap.get(prefixSum)) {
                    System.out.println(Arrays.toString(Arrays.copyOfRange(arr, startIdx + 1, i + 1)));
                }
            }

            // Store the current prefixSum with the index
            prefixSumMap.putIfAbsent(prefixSum, new ArrayList<>());
            prefixSumMap.get(prefixSum).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        findZeroSumSubarrays(arr);
    }
}

