package com.codility.lessons.lesson4;

public class PermCheck {

    public int solution(int[] A) {

        boolean[] hash = new boolean[A.length + 1];

        for(int a: A) {
            if(a < hash.length && !hash[a]) {
                hash[a] = true;
            } else {
                return 0;
            }
        }

        return 1;

    }
}
