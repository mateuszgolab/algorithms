package com.hackerrank.algorithms.competitions.world_code_sprint_10;

import java.util.*;

public class PermutationHappiness2 {

    private static long MODULO = 1000000007;
    private static long counter;
    private static long k;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            long n = in.nextLong();
            k = in.nextLong();

            counter = 0;
            long result = query(n);
            System.out.println(result);
        }
    }

    private static long query(long n) {

        if (k <= n / 2) {
            return factorial(n);
        } else if (k == n) {
            return 0;
        } else if (k == n - 1) {
            return power2(n - 1);
        } else if (k == n - 2) {
            return (MODULO + factorial(n) - power2(n - 1)) % MODULO;
        } else {
            return calculate(n);
        }

    }

    private static long calculate(long n) {

        List<Integer> array = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            array.add(i);
        }

        permutation(array);

        return counter;
    }

    private static long power2(long n) {

        long res = 1;

        for (long i = 1; i <= n; i++) {
            res = (res * 2) % MODULO;
        }

        return res;

    }


    private static long numberOfHappyNumbers(List<Integer> a) {
        long counter = 0;
        for (int i = 1; i < a.size() - 1; i++) {
            if ((a.get(i) < a.get(i - 1)) || (a.get(i) < a.get(i + 1))) {
                counter++;
            }
        }

        if (a.size() > 1) {

            if (a.get(0) < a.get(1)) {
                counter++;
            }

            if (a.get(a.size() - 1) < a.get(a.size() - 2)) {
                counter++;
            }
        }

        return counter;
    }


    private static void permutation(List<Integer> array) {
        permutation(new ArrayList<>(0), array);
    }

    private static void permutation(List<Integer> prefix, List<Integer> array) {
        int n = array.size();

        if (n == 0) {
            addPermutation(prefix);
        } else {
            long add = (n == 2) ? 1 : 0;
            long prefixScore = numberOfHappyNumbers(prefix);

            if (prefixScore + add >= k) {
                counter = (counter + factorial(array.size()) % MODULO);
                return;
            } else if (prefixScore + array.size() < k) {
                return;
            }


            for (int i = 0; i < n; i++) {
                List<Integer> newPrefix = new ArrayList<>(prefix);
                newPrefix.add(array.get(i));

                List<Integer> newArray = new ArrayList<>(array.subList(0, i));
                newArray.addAll(array.subList(i + 1, n));

                permutation(newPrefix, newArray);

            }
        }
    }

    private static void addPermutation(List<Integer> prefix) {

        long l = numberOfHappyNumbers(prefix);
        if (l >= k) {
            counter++;
        }
    }

    private static long factorial(long n) {

        if (n == 0) return 1;
        if (n < 3) return n;

        long res = 2;

        for (long l = 3; l <= n; l++) {
            res = (res * l) % MODULO;
        }

        return res;
    }
}
