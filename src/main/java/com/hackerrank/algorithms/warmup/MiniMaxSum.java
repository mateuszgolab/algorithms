package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            long n = in.nextLong();
            sum += n;
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }

        System.out.println((sum - max) + " " + (sum - min));

    }

}
