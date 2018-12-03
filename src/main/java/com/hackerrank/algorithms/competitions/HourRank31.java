package com.hackerrank.algorithms.competitions;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.List;

class HourRank31 {


    static int solve(int h, List<Integer> wallPoints, List<Integer> lengths) {

        Long min = 0L;
        BigDecimal four = new BigDecimal(4);

        for (int i = 0; i < wallPoints.size(); i++) {

            BigDecimal wallPoint = new BigDecimal(wallPoints.get(i));
            BigDecimal length = new BigDecimal(lengths.get(i));
            BigDecimal hangingPoint = wallPoint.subtract(length.divide(four));

            long hangingPointInt = hangingPoint.
                    setScale(0, RoundingMode.CEILING).
                    toBigInteger().
                    longValue();


            min = Math.max(min, hangingPointInt - h);

        }

        return min.intValue();


    }


    static double solve(int n, List<Integer> a) {

        a.sort(Comparator.naturalOrder());

        if (n == a.size()) return a.get(0);

        if (n == 1) {
            return a.stream().mapToInt(i -> i).sum();
        }

        int diff = a.size() - n;

        long toFill = 0;

        for (int i = 0; i < diff; i++) {
            toFill += a.get(i);
        }

        long min = a.get(diff);
        double counter = 1;
        long filled = 0;

        for (int i = diff + 1; i < a.size() && toFill > 0; i++) {

            long diffLevel = a.get(i) - a.get(i - 1);

            if (diffLevel * counter > toFill) {
                break;
            } else {
                filled += (diffLevel * counter);
                min += diffLevel;
                toFill -= diffLevel * counter;
                counter++;

            }
        }

        return min + toFill / counter;

    }


}
