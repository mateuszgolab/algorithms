package com.hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

class Easy {


    static int countingValleys(int n, String s) {

        int seaLevel = 0;
        int valleyCount = 0;

        for (Character ch : s.toCharArray()) {

            if (ch == 'D') seaLevel--;
            else {
                seaLevel++;
                if (seaLevel == 0) valleyCount++;
            }
        }

        return valleyCount;

    }

    static String dayOfProgrammer(int year) {

        String leapYear = "12.09.";
        String nonLeapYear = "13.09.";

        if (year < 1918) {
            if (isJulianLeapYear(year)) return leapYear + String.valueOf(year);
            else return nonLeapYear + String.valueOf(year);
        } else if (year == 1918) {
            return "26.09.1918";
        } else {
            if (isGregorianLeapYear(year)) return leapYear + String.valueOf(year);
            else return nonLeapYear + String.valueOf(year);
        }
    }

    static int pageCount(int n, int p) {
        return Math.min(p / 2, (n - p + (n + 1) % 2) / 2);
    }

    static int sockMerchant(int n, int[] ar) {

        return Arrays.stream(ar).
                boxed().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                values().stream().
                mapToInt(v -> (int) (v / 2)).
                sum();

    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        Arrays.sort(keyboards);
        Arrays.sort(drives);

        int price = -1;

        for (int keyboard : keyboards) {
            if (keyboard < b) {
                for (int drive : drives) {
                    int tmp = keyboard + drive;
                    if (tmp <= b) {
                        if (tmp > price) {
                            price = tmp;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                break;
            }
        }

        return price;
    }


    private static boolean isGregorianLeapYear(int year) {
        return (year % 400) == 0 || ((year % 4 == 0) && (year % 100 != 0));
    }

    private static boolean isJulianLeapYear(int year) {
        return (year % 4) == 0;
    }

}
