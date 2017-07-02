package com.hackerrank.algorithms.competitions.world_code_sprint_10;

import java.util.Scanner;

public class ZigzagArray {

    private static int minimumDeletions(int[] a) {

        int counter = 0;

        for (int i = 1; i < a.length - 1; i++) {
            if (!((a[i - 1] < a[i] && a[i] > a[i + 1]) || (a[i - 1] > a[i] && a[i] < a[i + 1]))) {
                counter++;
            }
        }

        return counter;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        // Return the minimum number of elements to delete to make the array zigzag
        int result = minimumDeletions(a);
        System.out.println(result);
    }


}
