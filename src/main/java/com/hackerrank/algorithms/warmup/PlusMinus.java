package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        double positive = 0;
        double negative = 0;
        double zero = 0;

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            if (input > 0) {
                positive++;
            } else if (input < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println(String.format("%.6f", positive / n));
        System.out.println(String.format("%.6f", negative / n));
        System.out.println(String.format("%.6f", zero / n));
    }

}
