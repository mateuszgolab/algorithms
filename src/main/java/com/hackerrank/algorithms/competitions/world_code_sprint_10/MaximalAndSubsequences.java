package com.hackerrank.algorithms.competitions.world_code_sprint_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximalAndSubsequences {

    private static final Map<Long, Long> dividersMap = getDividersMap();
    private static long result;
    private static long MODULO = 1000000007;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long k = in.nextLong();
        long[] a = new long[Math.toIntExact(n)];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextLong();
        }

        result = 0;
        long results = solve(k, a, 59);
        long numberOfResults = getNumberOfResults(results, k);
        System.out.println(result);
        System.out.println(numberOfResults);

    }

    private static long solve(long k, long[] a, long highestDiv) {

        Map<Long, Long> numberOfDivisions = getMapOfDividers(a, highestDiv);

        long highestDivider = getHighestDivider(numberOfDivisions, k, highestDiv);

        if (highestDivider > 0) {
            result += dividersMap.get(highestDivider);
            long subset[] = getSubset(a, dividersMap.get(highestDivider), numberOfDivisions.get(highestDivider));
            return solve(k, subset, highestDivider - 1);
        } else {
            if(numberOfDivisions.get(highestDivider) >= k) {
                result++;
                return numberOfDivisions.get(highestDivider);
            }
            return a.length;
        }

    }

    private static long[] getSubset(long[] a, long divider, long n) {

        long subset[] = new long[(int) n];
        int i = 0;

        for (Long l : a) {
            if ((l & divider) >= divider) {
                subset[i] = l;
                i++;
            }
        }

        return subset;

    }

    private static long getHighestDivider(Map<Long, Long> numberOfDivisions, long k, long highestDiv) {

        long highestDivider = 0;
        for (long l = highestDiv; l >= 0; l--) {
            if (numberOfDivisions.get(l) >= k) {
                highestDivider = l;
                break;
            }
        }

        return highestDivider;
    }

    private static Map<Long, Long> getMapOfDividers(long[] a, long highestDiv) {

        Map<Long, Long> result = new HashMap<>();

        for (long l = 0; l <= highestDiv; l++) {
            long counter = 0;
            for (Long la : a) {
                if ((la & dividersMap.get(l)) >= dividersMap.get(l)) {
                    counter++;
                }
            }
            result.put(l, counter);
        }

        return result;
    }

    private static long getNumberOfResults(long n, long k) {

        long nominator = 1;

        for (long l = n-k+1; l <= n; l++) {
            nominator = (nominator * l) % MODULO;
        }

        long denominator = 1;

        for (long l = 2; l <= k; l++) {
            denominator = (denominator * power(l, MODULO - 2)) % MODULO;
        }

        return (nominator * denominator) % MODULO;

    }

    private static Map<Long, Long> getDividersMap() {

        Map<Long, Long> result = new HashMap<>(59);
        long current = 1;
        for (long i = 0; i < 60; i++) {
            result.put(i, current);
            current *= 2;
        }

        return result;

    }


    private static long power(long a, long k) {
        long res = 1;
        long cur = a;

        while (k > 0) {
            if ((k % 2) != 0) {
                res = (res * cur) % MODULO;
            }
            k /= 2;
            cur = (cur * cur) % MODULO;
        }
        return res;
    }

}
