package com.hackerrank.algorithms.dynamic_programming;

import java.util.*;

public class Equal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            List<Integer> data = new ArrayList<>(n);
            for (int j = 0; j < n; j++) {
                data.add(in.nextInt());
            }

            int min = getMin(data);

            int minSteps = Integer.MAX_VALUE;
            for (int base = 0; base < 6; base++) {
                int minStepsCandidate = 0;
                for(int j : data) {
                    minStepsCandidate += getNumberOfCoins(j + base - min);
                }
                if(minStepsCandidate < minSteps) {
                    minSteps = minStepsCandidate;
                }
            }

            System.out.println(minSteps);
        }
    }

    private static int getMin(List<Integer> data) {

        int min = Integer.MAX_VALUE;
        for (int d : data) {
            if (d < min) {
                min = d;
            }
        }

        return min;

    }

    private static int getNumberOfCoins(int n) {

        int steps = n / 5;
        n %= 5;
        steps += (n / 2);
        n %= 2;
        steps += n;

        return steps;
    }

}
