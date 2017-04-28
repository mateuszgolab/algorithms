package com.hackerrank.algorithms.competitions._101hack48;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WalkingRobots {

    private static int howManyCollisions(String s) {
        int totalCollisions = 0;
        int collisions = 0;

        List<Character> robots = new ArrayList<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            robots.add(s.charAt(i));
        }

        do {

            totalCollisions += collisions;
            collisions = 0;


            for (int i = 0; i < s.length(); i++) {
                if (robots.get(i) == 'l') {
                    if (i > 0 && robots.get(i - 1) == 'd') {
                        collisions++;
                        robots.set(i, 'd');

                    }
                } else if (robots.get(i) == 'r') {
                    if (i < s.length() - 1) {
                        if (robots.get(i + 1) == 'd') {
                            collisions++;
                            robots.set(i, 'd');
                        } else if (robots.get(i + 1) == 'l') {
                            collisions += 2;
                            robots.set(i, 'd');
                            robots.set(i + 1, 'd');
                        }
                    }
                }
            }


        } while (collisions > 0);


        return totalCollisions;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            // Returns the number of times moving robots collide.
            int result = howManyCollisions(s);
            System.out.println(result);
        }
    }
}
