package com.tesco.technology;

public class Demo {

    public int solution(int[] A) {

        int right = 0;

        for(int a : A) {
            right += a;
        }

        int left = 0;
        for(int i = 0; i < A.length; i++) {
            right -= A[i];

            if(left == right) {
                return i;
            } else {
                left += A[i];
            }
        }

        return -1;
    }

}
