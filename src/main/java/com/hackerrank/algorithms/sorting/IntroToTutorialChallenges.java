package com.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class IntroToTutorialChallenges {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int n = in.nextInt();
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (in.nextInt() == v) {
                index = i;
            }
        }

        System.out.println(index);
    }

}
