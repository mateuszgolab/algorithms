package com.hackerrank.algorithms.bit_manipulation;

import java.util.Arrays;

class BitManipulationEasy {

    static int lonelyinteger(int[] a) {
        return Arrays.stream(a).reduce(0, (x, y) -> x^y);
    }

}
