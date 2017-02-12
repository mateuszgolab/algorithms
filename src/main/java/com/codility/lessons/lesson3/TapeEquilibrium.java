package com.codility.lessons.lesson3;

public class TapeEquilibrium {

    public int solution(int[] A) {

        long total = 0;
        for (int i : A) {
            total += i;
        }

        long left = 0;
        long min = Integer.MAX_VALUE;

        for (int i = 0; i < (A.length -1); i++) {
            left += A[i];
            total -= A[i];

            long difference = Math.abs(left - total);
            min = (difference < min) ? difference : min;
        }

        return (int) min;
    }

}
