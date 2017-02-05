package com.tesco.technology;

import java.util.*;

public class Task2 {


    public boolean solution(String S, String T) {

        long counterS = 0;
        long counterT = 0;
        long shift = 0;
        Map<Long, Character> mapS = new HashMap<>();

        Set<Character> numbers = new HashSet<>();
        numbers.addAll(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', '0'));

        StringBuilder number = new StringBuilder();

        // map S
        for (int i = 0; i < S.length(); i++) {
            if (numbers.contains(S.charAt(i))) {
                number.append(S.charAt(i));
            } else {

                if (number.length() > 0) {
                    shift = Long.parseLong(number.toString());
                    counterS += shift;
                    number = new StringBuilder();
                }

                mapS.put(counterS, S.charAt(i));
                counterS++;
            }
        }

        if (number.length() > 0) {
            shift = Long.parseLong(number.toString());
            counterS += shift;
        }
        number = new StringBuilder();

        // iterate through T and compare
        for (int i = 0; i < T.length(); i++) {
            if (numbers.contains(T.charAt(i))) {
                number.append(T.charAt(i));
            } else {

                if (number.length() > 0) {
                    shift = Long.parseLong(number.toString());
                    counterT += shift;
                    number = new StringBuilder();
                }

                Character character = mapS.get(counterT);
                if (character != null && character != T.charAt(i)) {
                    return false;
                }
                counterT++;
            }
        }

        if (number.length() > 0) {
            shift = Long.parseLong(number.toString());
            counterT += shift;
        }

        return counterS == counterT;

    }

}
