package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = Integer.MIN_VALUE;
        int maxCount = 0;

        for(int height_i=0; height_i < n; height_i++){
            int height = in.nextInt();
            if(height > max) {
                max = height;
                maxCount = 1;
            } else if(height == max) {
                maxCount++;
            }
        }

        System.out.println(maxCount);
    }

}
