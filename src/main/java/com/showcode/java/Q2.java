package com.showcode.java;

import java.util.HashMap;
import java.util.Map;

class Q2 {


    private static Map<Character, Integer> romanToArabic;

    static {
        romanToArabic = new HashMap<>();
        romanToArabic.put('I', 1);
        romanToArabic.put('V', 5);
        romanToArabic.put('X', 10);
        romanToArabic.put('L', 50);
        romanToArabic.put('C', 100);
        romanToArabic.put('D', 500);
        romanToArabic.put('M', 1000);
    }


    static int ParseRomanNumerals(String input) {

        int sum = 0;
        int index = 0;

        while (index < input.length() - 1) {

            Character current = input.charAt(index);
            Character next = input.charAt(index + 1);

            if (romanToArabic.get(next) > romanToArabic.get(current)) {
                sum += (romanToArabic.get(next) - romanToArabic.get(current));
                index += 2;
            } else {
                sum += romanToArabic.get(current);
                index++;
            }
        }

        if (index < input.length()) {
            sum += romanToArabic.get(input.charAt(input.length() - 1));
        }

        return sum;

    }

}
