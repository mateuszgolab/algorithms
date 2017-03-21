package com.hackerrank.algorithms.dynamic_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Equal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for(int i = 0; i< x; i++) {
            int n = in.nextInt();
            List<Integer> data = new ArrayList<>(n);
            for(int j = 0; j <n; j++) {
                data.add(in.nextInt());
            }
            Collections.sort(data);
            for(int j = 0; j < n - 1; j++) {
                if(data.get(j) < data.get(j + 1)) {

                }
            }
        }
    }

}
