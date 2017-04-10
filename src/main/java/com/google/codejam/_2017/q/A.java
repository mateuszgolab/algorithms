package com.google.codejam._2017.q;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            List<Character> pancakes = in.next().
                    chars().
                    mapToObj(e -> ((char) e)).
                    collect(Collectors.toList());

            int k = in.nextInt();

            if (!pancakes.contains('-')) {
                System.out.println("Case #" + i + ": 0");

            } else {

                int index = 0;
                int counter = 0;

                while (index < pancakes.size()) {

                    while ((index + k) < pancakes.size() && pancakes.get(index) == '+') {
                        index++;
                    }

                    if ((index + k) >= pancakes.size()) {
                        int blankCounter = 0;
                        for (int j = index; j < pancakes.size(); j++) {
                            if (pancakes.get(j) == '-') {
                                blankCounter++;
                            }
                        }
                        if (blankCounter > 0 && blankCounter < k) {
                            System.out.println("Case #" + i + ": IMPOSSIBLE");
                        } else {
                            if (blankCounter == k) {
                                counter++;
                            }
                            System.out.println("Case #" + i + ": " + counter);
                        }
                        break;
                    } else {
                        for (int j = index; j < index + k; j++) {
                            pancakes.set(j, flip(pancakes.get(j)));
                        }
                        counter++;
                        index++;
                    }
                }
            }
        }
    }

    private static Character flip(Character character) {
        if (character == '-') return '+';
        return '-';
    }
}
