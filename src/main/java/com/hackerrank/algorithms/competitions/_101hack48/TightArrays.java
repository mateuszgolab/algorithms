package com.hackerrank.algorithms.competitions._101hack48;

import java.util.Scanner;

public class TightArrays {

    private static int shortestTightArray(int a, int b, int c) {
        int distance1 = Math.abs(b - a) + 1;
        int distance2 = Math.abs(c - b) + 1;

        return distance1 + distance2 - 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int result = shortestTightArray(a, b, c);
        System.out.println(result);
    }

}
