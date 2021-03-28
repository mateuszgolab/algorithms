package com.google.codejam._2021.q;

import java.util.Scanner;

public class MoonsAndUmbrellas {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            int x = in.nextInt();
            int y = in.nextInt();
            String input = in.next();

            int output = moonsAndUmbrellas(input, x, y);

            System.out.println("Case #" + i + ": " + output);

        }
    }

    static int moonsAndUmbrellas(String str, int x, int y) {

        char[] input = str.toCharArray();

        int cost = 0;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] == 'C') {
                if (input[i + 1] == 'J') {
                    cost += x;
                } else if (input[i + 1] == '?') {
                    input[i + 1] = 'C';
                }
            } else if (input[i] == 'J') {
                if (input[i + 1] == 'C') {
                    cost += y;
                } else if (input[i + 1] == '?') {
                    input[i + 1] = 'J';
                }
            }
        }

        return cost;

    }


}
