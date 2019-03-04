package com.hackerrank.algorithms.greedy;


import java.util.Arrays;

class GreedyEasy {

    static int minimumAbsoluteDifference(int[] arr) {

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length - 1; i++){
            min = Math.min(min, Math.abs(arr[i] - arr[i+1]));
        }

        return min;

    }

}
