package com.hackerrank.algorithms.search;

import java.util.*;

class SearchEasy {

    static int[] icecreamParlor(int m, int[] arr) {

        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < m) {
                Set<Integer> set = map.get(arr[i]);
                if (set == null) {
                    set = new HashSet<>();
                    set.add(i + 1);
                    map.put(arr[i], set);
                } else {
                    set.add(i + 1);
                    map.put(arr[i], set);
                }
            }
        }

        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            int candidate = m - arr[i];
            Set<Integer> values = map.get(candidate);
            if (values != null) {
                for (Integer v : values) {
                    if (v != (i + 1)) {
                        result[0] = i + 1;
                        result[1] = v;
                        Arrays.sort(result);
                        return result;
                    }
                }
            }

        }

        return new int[]{};

    }


}
