package com.hackerrank.algorithms.bit_manipulation;

import java.util.Arrays;

class BitManipulationEasy {

    static int lonelyinteger(int[] a) {
        return Arrays.stream(a).reduce(0, (x, y) -> x ^ y);
    }

    static int maximizingXor(int l, int r) {

        int max = 0;

        for (int i = l; i <= r; i++) {
            for (int j = i + 1; j <= r; j++) {
                max = Math.max(max, i ^ j);
            }
        }

        return max;

    }

    static long sumXor(long n) {

        if(n == 0) return 1;

        long numOfZeroes = Long.toBinaryString(n).
                chars().
                filter(i -> (char) i == '0').
                count();

        return (long) Math.pow(2, numOfZeroes);

    }

}
