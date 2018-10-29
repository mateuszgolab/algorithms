package com.showcode.java;

import java.util.Arrays;

class Q1 {

    static int BalancePoint(int[] input) {

        long totalSum = Arrays.stream(input).sum();
        long left = 0;

        for(int i = 0; i < input.length; i++) {
            totalSum -= input[i];
            if(left == totalSum) return i;
            else left += input[i];
        }

        return -1;

    }

}
