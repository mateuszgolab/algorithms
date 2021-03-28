package com.google.codejam._2021.q;

import java.util.*;

public class ReversortEngineering {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            int n = in.nextInt();
            int c = in.nextInt();

            String output = reversortEng(n, c);

            System.out.println("Case #" + i + ": " + output);
        }
    }

    static String reversortEng(int n, int c) {

        if (c < (n - 1) || c > (((n - 1) * (n + 2)) / 2)) return "IMPOSSIBLE";

        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = i + 1;
        }

        if (c == (n - 1)) return toString(input);

        int remainingMoves = c - (n - 1);
        for (int i = 0, j = input.length - 1; i <= j && remainingMoves > 0; i++, j--) {
            int nextMove = remainingMoves + 1;
            int maxMove = (j - i);
            if (nextMove > maxMove) {
                remainingMoves -= maxMove;
                reverse(i, j, input);
            } else {
                remainingMoves = 0;
                reverse(i, nextMove + i - 1, input);
            }
        }


        int[] copy = Arrays.copyOf(input, input.length);

        if (reversort(copy) == c) {
            return toString(input);
        } else {
            int[] result = findPermutation(n, c);
            return toString(result);
        }

    }

    private static int[] findPermutation(int n, int c) {

        List<Integer> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        while (true) {

            Collections.shuffle(list);
            int[] candidate = list.stream().mapToInt(Integer::intValue).toArray();
            if (reversort(candidate) == c) {
                return list.stream().mapToInt(Integer::intValue).toArray();
            }
        }

    }


    private static String toString(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length - 1; i++) {
            sb.append(numbers[i]);
            sb.append(" ");
        }
        sb.append(numbers[numbers.length - 1]);
        return sb.toString();
    }

    private static void reverse(int start, int stop, int[] numbers) {

        for (int i = start, j = stop; i < j; i++, j--) {
            int tmp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = tmp;
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


}
