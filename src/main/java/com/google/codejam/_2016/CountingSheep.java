package com.google.codejam._2016;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountingSheep {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            long n = in.nextInt();
            if (n == 0) {
                System.out.println("Case #" + i + ": INSOMNIA");
            } else {
                Set<Integer> numbers = new HashSet<>();
                long number;
                long multiplayer = 1;

                while (numbers.size() < 10) {

                    number = n * multiplayer;

                    while (number > 0) {
                        numbers.add((int) (number % 10));
                        number /= 10;
                    }

                    multiplayer++;
                }

                System.out.println("Case #" + i + ": " + n * (multiplayer - 1));
            }
        }
    }
}
