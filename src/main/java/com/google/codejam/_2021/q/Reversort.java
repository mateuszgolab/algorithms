package com.google.codejam._2021.q;

import java.util.Scanner;

public class Reversort {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            int n = in.nextInt();
            int[] numbers = new int[n];

            for (int j = 0; j < n; j++) {
                numbers[j] = in.nextInt();
            }

            int output = reversort(numbers);

            System.out.println("Case #" + i + ": " + output);

        }
    }

    static int reversort(int[] numbers) {

        int sum = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            int min = Integer.MAX_VALUE;
            int j = i;
            for (int k = i; k < numbers.length; k++) {
                if (numbers[k] < min) {
                    min = numbers[k];
                    j = k;
                }
            }

            sum += (j - i + 1);
            reverse(i, j, numbers);

        }

        return sum;

    }

    private static void reverse(int start, int stop , int[] numbers) {

        for(int i = start, j = stop; i < j; i++, j--){
            int tmp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = tmp;
        }

    }


}
