package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class AppleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long s = in.nextInt();
        long t = in.nextInt();
        long a = in.nextInt();
        long b = in.nextInt();
        long m = in.nextInt();
        long n = in.nextInt();

        long counter = 0;

        for (int apple_i = 0; apple_i < m; apple_i++) {
            long d = in.nextInt();
            if ((a + d) >= s && (a + d <= t)) {
                counter++;
            }
        }

        System.out.println(counter);

        counter = 0;
        for (int orange_i = 0; orange_i < n; orange_i++) {
            long d = in.nextInt();
            if ((b + d) >= s && (b + d <= t)) {
                counter++;
            }
        }

        System.out.println(counter);

    }

}
