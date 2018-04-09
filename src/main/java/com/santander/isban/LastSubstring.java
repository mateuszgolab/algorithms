package com.santander.isban;

class LastSubstring {

    static String compute(String s) {

        Character highestChar = s.charAt(0);
        int index = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) > highestChar) {

                highestChar = s.charAt(i);
                index = i;

            } else if (s.charAt(i) == highestChar) {

                String currentHighest = s.substring(index, s.length());
                String candidate = s.substring(i, s.length());

                if (candidate.compareTo(currentHighest) > 0) {
                    index = i;
                }
            }
        }

        return s.substring(index, s.length());

    }

}
