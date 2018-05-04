package com.google.codejam._2018._1b;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RoundingError {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = in.nextInt();
            int l = in.nextInt();

            Map<Double, Long> map = new HashMap<>(l);
            Map<Double, Long> counter = new HashMap<>();
            int sum = 0;

            for (int j = 0; j < l; j++) {
                int value = in.nextInt();
                sum += value;
                double doubleValue = value;
                doubleValue /= n;
                map.put(doubleValue * 100, Math.round(doubleValue * 100));
                addCounter(doubleValue * 100, counter);
            }

            int remaining = n - sum;
            int finalSum = 0;
            int leftToCheck = 0;
            double one = 1.0;


            double doubleVal = one / n * 100;
            long roundedVal = Math.round(doubleVal);
            double doubleRoundedVal = roundedVal;

            if (doubleRoundedVal > doubleVal) {
                finalSum += doubleRoundedVal * remaining;
            } else {
                leftToCheck = remaining;
            }


            if (leftToCheck == 0) {
                finalSum += getSum(map, counter);
            } else {
                finalSum += addAndCheck(map, leftToCheck, n, counter) + getSum(map, counter);
            }


            System.out.println("Case #" + i + ": " + finalSum);

        }
    }

    private static void addCounter(double doubleValue, Map<Double, Long> counter) {

        Long value = counter.get(doubleValue);

        if (value == null) {
            counter.put(doubleValue, 1L);
        } else {
            counter.put(doubleValue, value + 1);
        }

    }

    private static long addAndCheck(Map<Double, Long> map, int leftToCheck, int n, Map<Double, Long> counter) {

        double one = 1.0;
        double val = one / n * 100;

        final long[] sum = {0};
        final long[] remaining = {leftToCheck};


        map.forEach((k, v) -> {

            if (remaining[0] <= 0) {
                sum[0] += (v * counter.get(k));
                return;
            }


            if (Math.round(k + val) > v + Math.round(val)) {

                double sumCandidate = k + val;
                long longSumCandidate = Math.round(sumCandidate);
                double doubleLongSumCandidate = longSumCandidate;

                if (doubleLongSumCandidate > sumCandidate) {

                    long multiplier = Math.min(counter.get(k), remaining[0]);
                    sum[0] += (longSumCandidate * multiplier);
                    reduceCounter(counter, multiplier, k);
                    remaining[0] -= multiplier;
                }
            }

        });


        if (remaining[0] > 0) {
            sum[0] += getRemaining(remaining[0], val);
        }

        return sum[0];

    }

    private static long getRemaining(long l, double val) {

        long c = 0;
        double doubleSum = 0;
        long sum = 0;

        while ( c < l) {

            double rounded = Math.round(val + doubleSum);

            if(rounded > (val + doubleSum)) {
                sum += Math.round(val + doubleSum);
                doubleSum = 0;
            } else {
                doubleSum += val;
            }

            c++;

        }

        return sum + Math.round(doubleSum);

    }

    private static void reduceCounter(Map<Double, Long> counter, long multiplier, Double k) {
        Long val = counter.get(k);
        val -= multiplier;
        counter.put(k, val);
    }

    private static int getSum(Map<Double, Long> map, Map<Double, Long> counter) {

        final Long[] sum = {0L};

        map.forEach((k, v) -> {
            sum[0] += v * counter.get(k);
        });


        return sum[0].intValue();

    }
}
