package com.google.codejam._2018.q;

import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            int d = in.nextInt();
            String p = in.next();

            if (!p.contains("S")) {
                System.out.println("Case #" + i + ": 0");
                continue;
            }

            int count = evaluate(p);

            if (count <= d) {
                System.out.println("Case #" + i + ": 0");
                continue;
            }

            boolean impossible = false;
            int moves = 0;
            while (count > d) {

                String newP = reduce(p);
                if (newP.compareToIgnoreCase(p) == 0) {
                    System.out.println("Case #" + i + ": IMPOSSIBLE");
                    impossible = true;
                    break;
                }

                p = newP;
                count = evaluate(p);
                moves++;
            }

            if (!impossible) {
                System.out.println("Case #" + i + ": " + moves);
            }

        }
    }

    private static int evaluate(final String s) {

        int counter = 0;
        int strength = 1;

        for (Character c : s.toCharArray()) {
            if (c == 'S') {
                counter += strength;
            } else if (c == 'C') {
                strength *= 2;
            }
        }

        return counter;

    }

    private static String reduce(final String s) {

        for (int i = s.length() - 1; i > 0; i--) {

            if (s.charAt(i) == 'S' && s.charAt(i - 1) == 'C') {
                return swap(s, i, i - 1);
            }
        }
        return s;
    }


    private static String swap(final String s, int index1, int index2) {

        StringBuilder builder = new StringBuilder(s);
        builder.setCharAt(index1, s.charAt(index2));
        builder.setCharAt(index2, s.charAt(index1));

        return builder.toString();

    }

}
