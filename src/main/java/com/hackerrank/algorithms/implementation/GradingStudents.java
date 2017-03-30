package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class GradingStudents {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int a0 = 0; a0 < n; a0++) {
            int grade = in.nextInt();
            if (grade > 37) {
                int diff = 5 - (grade % 5);
                if (diff < 3) {
                    grade += diff;
                }
            }

            System.out.println(grade);

        }
    }
}
