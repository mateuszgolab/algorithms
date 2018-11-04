package com.hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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

    static String catAndMouse(int x, int y, int z) {

        int catA = Math.abs(z - x);
        int catB = Math.abs(z - y);

        if (catA < catB) {
            return "Cat A";
        } else if (catB < catA) {
            return "Cat B";
        } else {
            return "Mouse C";
        }

    }

    static int pickingNumbers(List<Integer> a) {

        Collections.sort(a);
        int max = 0;

        for (int i = 0; i < a.size() - 1; i++) {
            int tmp = 1;
            for (int j = i + 1; j < a.size(); j++) {
                if (Math.abs(a.get(i) - a.get(j)) < 2) tmp++;
                else break;
            }

            if (tmp > max) max = tmp;

        }

        return max;


    }

    static int hurdleRace(int k, int[] height) {
        return Math.max(Arrays.stream(height).max().getAsInt() - k, 0);
    }

    static int designerPdfViewer(int[] h, String word) {

        int max = 0;
        for (Character ch : word.toCharArray()) {
            int index = ch - (int) 'a';
            max = Math.max(max, h[index]);
        }

        return word.length() * max;

    }

    static int utopianTree(int n) {

        int result = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) result *= 2;
            else result++;
        }

        return result;

    }

    static String angryProfessor(int k, int[] a) {

        if (Arrays.stream(a).filter(v -> v <= 0).count() >= k) {
            return "NO";
        } else {
            return "YES";
        }

    }


    private static boolean isGregorianLeapYear(int year) {
        return (year % 400) == 0 || ((year % 4 == 0) && (year % 100 != 0));
    }

    private static boolean isJulianLeapYear(int year) {
        return (year % 4) == 0;
    }

}
