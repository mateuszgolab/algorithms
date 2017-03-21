package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int diagLeft = 0;
        int diagRight = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = in.nextInt();
                if (i == j) {
                    diagLeft += x;
                }

                if ((n - i - 1) == j) {
                    diagRight += x;
                }
            }
        }
        System.out.println(abs(diagLeft - diagRight));
    }

}
