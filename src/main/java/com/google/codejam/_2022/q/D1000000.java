package com.google.codejam._2022.q;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class D1000000 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            int n = in.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(in.nextInt());
            }

            System.out.println("Case #" + i + ": " + d1000000(list));

        }
    }

    static int d1000000(List<Integer> list) {

        Collections.sort(list);
        int current = 1;
        for (int i = 1; i <= list.size(); i++) {
            if (current <= list.get(i - 1)) {
                current++;
            }
        }
        return current - 1;

    }
}
