package com.codility.lessons.lesson2;

public class CyclicRotation {


    public int[] solution(int[] A, int K) {

        if(A.length == 0) return A;

        K = K % A.length;
        int start = A.length - K;
        if (start == A.length) return A;

        int[] result = new int[A.length];
        int index = 0;

        for (int i = start; i < A.length; i++, index++) {
            result[index] = A[i];
        }

        for (int i = 0; index < A.length; index++, i++) {
            result[index] = A[i];
        }

        return result;
    }

}
