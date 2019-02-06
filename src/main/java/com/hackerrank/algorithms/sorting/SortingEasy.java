package com.hackerrank.algorithms.sorting;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Integer.MIN_VALUE;

class SortingEasy {


    static String[] bigSorting(String[] unsorted) {

        Arrays.sort(unsorted, (o1, o2) -> {
            if (o1.length() == o2.length()) return o1.compareTo(o2);
            else return o1.length() - o2.length();
        });

        return unsorted;

    }

    static List<List<Integer>> insertionSort1(int n, int[] arr) {

        List<List<Integer>> results = new ArrayList<>(n);
        int min = arr[arr.length - 1];
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] >= min) {
                list.set(i + 1, arr[i]);
                results.add(list);
                list = new ArrayList<>(list);
            } else {
                list.set(i + 1, min);
                results.add(list);
                min = MIN_VALUE;
                return results;
            }
        }

        if (min > MIN_VALUE) {
            list = new ArrayList<>(list);
            list.set(0, min);
            results.add(list);
        }

        return results;

    }

    static List<List<Integer>> insertionSort2(int n, int[] arr) {

        List<List<Integer>> results = new ArrayList<>(n);
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for (int i = 1; i < n; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = n - 1; j > i; j--) stack.push(list.get(j));

            int current = list.get(i);

            for (int j = i - 1; j >= 0; j--) {
                if (current > list.get(j)) {
                    stack.push(current);
                    for (int k = j; k >= 0; k--) stack.push(list.get(k));
                    break;
                } else {
                    stack.push(list.get(j));
                }
            }

            if (stack.size() < n) stack.push(current);


            list = new ArrayList<>(n);
            while (!stack.isEmpty()) {
                list.add(stack.pop());
            }

            results.add(list);

        }

        return results;


    }

    static int runningTime(int[] arr) {

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        int counter = 0;
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (list.get(i) < list.get(j)) {
                    Integer value = list.remove(i);
                    list.add(j, value);
                    counter += (i - j);
                    break;
                }
            }
        }

        return counter;

    }

    static int[] quickSort(int[] arr) {

        List<Integer> left = new ArrayList<>(arr.length);
        List<Integer> right = new ArrayList<>(arr.length);

        for (int i : arr) {
            if (i < arr[0]) left.add(i);
            else if (i > arr[0]) right.add(i);
        }

        left.add(arr[0]);
        left.addAll(right);

        return left.stream().mapToInt(i -> i).toArray();

    }

    static int[] countingSort(int[] arr) {

        final int limit = 100;

        Map<Integer, Integer> map = new HashMap<>(limit);

        for (int i : arr) {
            map.merge(i, 1, (a, b) -> a + b);
        }

        int[] result = new int[limit];

        for (int i = 0; i < limit; i++) {
            Integer value = map.get(i);
            result[i] = (value == null) ? 0 : value;
        }

        return result;

    }

    static int[] countingSort2(int[] arr) {

        final int limit = 100;

        Map<Integer, Integer> map = new HashMap<>(limit);

        for (int i : arr) {
            map.merge(i, 1, (a, b) -> a + b);
        }

        int[] result = new int[arr.length];

        for (int i = 0, j = 0; i < limit; i++) {
            Integer value = map.get(i);

            if (value != null) {
                for (int k = 0; k < value; k++) {
                    result[j++] = i;
                }
            }

        }

        return result;

    }

}
