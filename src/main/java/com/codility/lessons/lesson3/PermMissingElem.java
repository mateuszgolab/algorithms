package com.codility.lessons.lesson3;

public class PermMissingElem {

    public int solution(int[] A) {

        long total = (A.length + 1);
        total *= (A.length + 2);
        total /=2;

        for (int i : A) {
            total -= i;
        }

        return (int) total;

    }
}
