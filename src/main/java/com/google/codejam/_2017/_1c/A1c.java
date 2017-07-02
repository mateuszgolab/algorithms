package com.google.codejam._2017._1c;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A1c {

    private static double maxSurface = 0;
    private static int K;
    private static List<Pancake> PANCAKES;

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            int n = in.nextInt();
            K = in.nextInt();

            PANCAKES = new ArrayList<>(n);

            for (int j = 0; j < n; j++) {
                PANCAKES.add(new Pancake(in.nextInt(), in.nextInt()));
            }

            Collections.sort(PANCAKES);

            maxSurface = 0;

            if (n == K) {
                maxSurface = getSurface(PANCAKES);
            } else {
                findMax(new ArrayList<>(), 0);
            }


            System.out.println("Case #" + i + ": " + new DecimalFormat("#0.000000000").format(maxSurface));

        }
    }

    private static void findMax(List<Pancake> currentStack, int position) {

        if (currentStack.size() == K) {
            double surface = getSurface(currentStack);
            if (surface > maxSurface) {
                maxSurface = surface;
            }
            return;
        }

        for (int i = position; (i < PANCAKES.size()) && (currentStack.size() < K); i++) {
            ArrayList<Pancake> newStack = new ArrayList<>(currentStack);
            newStack.add(PANCAKES.get(i));
            findMax(newStack, i + 1);
        }

    }

    private static double getSurface(List<Pancake> currentStack) {

        double totalSurface = 0;

        for (Pancake p : currentStack) {
            double surface = p.getSurface();

            if (totalSurface > 0) {
                totalSurface -= p.getRadiusField();
            }

            totalSurface += surface;

        }

        return totalSurface;

    }

    static class Pancake implements Comparable<Pancake> {

        private int radius;
        private int height;


        Pancake(int radius, int height) {
            this.radius = radius;
            this.height = height;
        }

        @Override
        public int compareTo(Pancake o) {
            if (this.radius > o.radius) {
                return -1;
            } else if (this.radius < o.radius) {
                return 1;
            } else {
                return 0;
            }
        }

        double getRadiusField() {
            return Math.PI * radius * radius;
        }

        double getSurface() {
            return getRadiusField() + 2 * Math.PI * radius * height;
        }
    }


}
