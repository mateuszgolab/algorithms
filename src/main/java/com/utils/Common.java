package com.utils;

import java.util.Collection;

public class Common {

    static int[] collectionIntegerToArrayInt(Collection<Integer> collection) {
        return collection.stream().mapToInt(i -> i).toArray();
    }


    public static boolean isPalindrome(String text) {

        String part2 = new StringBuilder(text.substring((text.length() + 1)/2)).reverse().toString();
        String part1 = text.substring(0, text.length() / 2);

        return part1.equals(part2);

    }

}
