package com.codility.lessons.lesson1;

class BinaryGap {

    int solution(int N) {

        String binary = Integer.toBinaryString(N);

        int counter = 0;
        int max = 0;
        boolean readyToCountZeros = false;

        for (char ch : binary.toCharArray()) {
            if (readyToCountZeros) {
                if (ch == '0') {
                    counter++;
                } else {
                    max = max < counter ? counter : max;
                    counter = 0;
                }
            } else {
                if (ch == '1') {
                    readyToCountZeros = true;
                }
            }
        }

        return max;

    }
}
