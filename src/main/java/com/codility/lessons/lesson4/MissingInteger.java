package com.codility.lessons.lesson4;

public class MissingInteger {

    public int solution(int[] A) {

        boolean[] hashTable = new boolean[A.length+1];

        for(int a : A) {
            if(a > 0 && a < hashTable.length) {
                hashTable[a] = true;
            }
        }

        for(int i = 1; i < hashTable.length; i++) {
            if(!hashTable[i]) {
                return i;
            }
        }

        return hashTable.length;

    }
}
