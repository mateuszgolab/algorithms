package com.hackerrank.algorithms.competitions.hour_rank_22;

import java.util.Arrays;
import java.util.Scanner;

public class ParityGame {

    private static int smallestSizeSubsequence(int n, int[] A) {

        if (A.length == 1) return -1;

        int sum = Arrays.stream(A).sum();
        if (sum % 2 == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for (int A_i = 0; A_i < n; A_i++) {
            A[A_i] = in.nextInt();
        }
        int result = smallestSizeSubsequence(n, A);
        System.out.println(result);
    }
}
