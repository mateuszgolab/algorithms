package com.hackerrank.algorithms.greedy;


import java.util.Arrays;

class GreedyEasy {

    static int minimumAbsoluteDifference(int[] arr) {

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            min = Math.min(min, Math.abs(arr[i] - arr[i + 1]));
        }

        return min;

    }

    static long marcsCakewalk(int[] calorie) {

        Arrays.sort(calorie);

        long result = 0;

        for (int i = 0; i < calorie.length; i++) {
            result += Math.pow(2.0, i) * calorie[calorie.length - 1 - i];
        }

        return result;

    }

}
