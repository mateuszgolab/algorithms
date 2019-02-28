package com.hackerrank.algorithms.search;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

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

    static int[] missingNumbers(int[] arr, int[] brr) {

        Map<Integer, Long> array1 = Arrays.stream(arr).boxed().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Integer, Long> array2 = Arrays.stream(brr).boxed().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Set<Integer> result = new HashSet<>();

        for(int a2: brr) {
            long diff = array2.getOrDefault(a2, 0L) - array1.getOrDefault(a2, 0L);
            if(diff > 0){
                result.add(a2);
            }
        }

        return result.stream().mapToInt(i -> i).sorted().toArray();


    }

}
