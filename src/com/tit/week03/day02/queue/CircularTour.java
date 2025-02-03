package com.tit.week03.day02.queue;

class CircularTour {
    // Function to find the starting petrol pump index
    public static int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        int start = 0, totalSurplus = 0, surplus = 0;

        for (int i = 0; i < n; i++) {
            surplus += petrol[i] - distance[i];  // Calculate surplus at each pump
            totalSurplus += petrol[i] - distance[i];

            // If surplus becomes negative, reset starting point
            if (surplus < 0) {
                start = i + 1; // Move start to next pump
                surplus = 0; // Reset current surplus
            }
        }

        return (totalSurplus >= 0) ? start : -1; // If totalSurplus is negative, no solution
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int startIndex = findStartingPoint(petrol, distance);
        System.out.println("Starting Petrol Pump Index: " + startIndex);
    }
}

