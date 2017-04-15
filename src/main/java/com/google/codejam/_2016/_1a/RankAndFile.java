package com.google.codejam._2016._1a;

import java.util.*;

public class RankAndFile {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            int n = in.nextInt();

            Map<Integer, Integer> map = new HashMap<>(2500);

            for (int j = 0; j < (2 * n - 1); j++) {
                for (int k = 0; k < n; k++) {
                    int val = in.nextInt();
                    Integer value = map.get(val);
                    if (value == null) {
                        map.put(val, 1);
                    } else {
                        map.put(val, value + 1);
                    }
                }
            }


            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 2500; j++) {
                if (map.containsKey(j)) {
                    if ((map.get(j) % 2) == 1) {
                        sb.append(j);
                        sb.append(" ");
                    }
                }
            }

            System.out.println("Case #" + i + ": " + sb.substring(0, sb.length()-1));

        }

    }
}
