package com.google.codejam._2022.q;

import java.util.Collections;
import java.util.Scanner;

public class PunchedCards {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            int r = in.nextInt();
            int c = in.nextInt();

            System.out.println("Case #" + i + ":");
            punchedCards(r, c);

        }
    }

    static void punchedCards(int r, int c) {

        for (int i = 0; i < r; i++) {
            if (i == 0) {
                System.out.println(".." + String.join("", Collections.nCopies(c - 1, "+-")) + "+");
                System.out.println(".." + String.join("", Collections.nCopies(c - 1, "|.")) + "|");
            } else {
                System.out.println(String.join("", Collections.nCopies(c, "+-")) + "+");
                System.out.println(String.join("", Collections.nCopies(c, "|.")) + "|");
            }
        }
        System.out.println(String.join("", Collections.nCopies(c, "+-")) + "+");

    }
}
