package com.hackerrank.algorithms.bit_manipulation;

import java.util.Arrays;

class BitManipulationEasy {

    static int lonelyinteger(int[] a) {
        return Arrays.stream(a).reduce(0, (x, y) -> x^y);
    }

    static int maximizingXor(int l, int r) {

        int max = 0;

        for(int i = l; i <= r; i++){
            for(int j = i+1; j <= r; j++){
                max = Math.max(max, i ^ j );
            }
        }

        return max;

    }

}
