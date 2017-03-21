package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                char x = (j > i) ? ' ' : '#';
                System.out.print(x);
            }
            System.out.println();
        }

    }

}
