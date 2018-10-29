package com.showcode.java;

import java.util.Arrays;

class Q3 {


    private static int[] inputCopy;
    private static int size;

    static Boolean SplitArray(int[] input) {
        int sum = Arrays.stream(input).sum();
        if (sum % 2 > 0) return false;

        inputCopy = input;
        size = inputCopy.length;
        int limit = sum / 2;

        return isSummarizible(limit, 0, 0);
    }

    private static Boolean isSummarizible(int limit, int index, int current) {
        if (current == limit) return true;
        else if (current > limit) return false;
        else {
            for (int i = index; i < size; i++) {
                if (isSummarizible(limit, i + 1, current + inputCopy[i])) return true;
            }
            return false;
        }

    }

}