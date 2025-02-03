package com.tit.week03.day02.hashmap;

import java.util.HashSet;

class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : nums) {
            if (!set.contains(num - 1)) { // Start a new sequence
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {9,1,2,3,5,6,4};
        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(arr));
    }
}
