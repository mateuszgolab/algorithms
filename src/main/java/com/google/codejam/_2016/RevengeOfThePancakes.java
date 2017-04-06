package com.google.codejam._2016;

import java.util.Scanner;

public class RevengeOfThePancakes {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            String stack = in.next();
            int index = 0;
            char pancakeSide = stack.charAt(index);
            long counter = 0;

            while (index < stack.length()) {

                while (index < stack.length() && stack.charAt(index) == pancakeSide) {
                    index++;
                }

                if (index == stack.length()) {
                    if (stack.charAt(index - 1) == '-') {
                        counter++;
                    }
                    System.out.println("Case #" + i + ": " + counter);
                    break;
                } else {
                    counter++;
                    pancakeSide = reverse(stack.charAt(index - 1));
                }
            }

        }

    }


    private static char reverse(char side) {
        if (side == '-') return '+';
        return '-';
    }
}
