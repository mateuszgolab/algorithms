package com.hackerrank.algorithms.greedy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class GreedyEasy {

    static int minimumAbsoluteDifference(int[] arr) {

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            min = Math.min(min, Math.abs(arr[i] - arr[i + 1]));
        }

        return min;

    }

    static long marcsCakewalk(int[] calorie) {

        Arrays.sort(calorie);

        long result = 0;

        for (int i = 0; i < calorie.length; i++) {
            result += Math.pow(2.0, i) * calorie[calorie.length - 1 - i];
        }

        return result;

    }

    static String gridChallenge(String[] grid) {

        List<int[]> sortedStrings = Arrays.stream(grid).
                map(s -> s.chars().sorted().toArray()).
                collect(Collectors.toList());

        for (int i = 0; i < sortedStrings.get(0).length; i++) {
            for (int j = 0; j < sortedStrings.size() - 1; j++) {
                if (sortedStrings.get(j)[i] > sortedStrings.get(j + 1)[i]) {
                    return "NO";
                }
            }
        }

        return "YES";

    }

    static int luckBalance(int k, int[][] contests) {

        List<Integer> important = new ArrayList<>();
        int counter = 0;

        for (int[] contest : contests) {
            if (contest[1] == 1) {
                important.add(contest[0]);
            }
            counter += contest[0];
        }

        important.sort(null);

        for (int i = 0; i < important.size() - k; i++) {
            counter -= 2 * important.get(i);
        }

        return counter;

    }

    static int[] maximumPerimeterTriangle(int[] sticks) {

        Arrays.sort(sticks);

        long max = 0;
        int A = 0;
        int B = 0;
        int C = 0;

        for (int a = 0; a < sticks.length; a++) {
            for (int b = a + 1; b < sticks.length; b++) {
                for (int c = b + 1; c < sticks.length; c++) {
                    if (sticks[c] < (sticks[a] + sticks[b])) {
                        long sum = (long) sticks[a] + (long) sticks[b] + (long) sticks[c];
                        if (sum > max) {
                            A = sticks[a];
                            B = sticks[b];
                            C = sticks[c];
                            max = sum;
                        } else if (sum == max) {
                            if (sticks[c] > C || (sticks[c] == C && sticks[a] > A)) {
                                A = sticks[a];
                                B = sticks[b];
                                C = sticks[c];
                                max = sum;
                            }
                        }
                    }
                }
            }
        }

        if (max == 0) return new int[]{-1};
        else return new int[]{A, B, C};

    }

    static int beautifulPairs(int[] A, int[] B) {

        Map<Integer, Long> Amap = Arrays.stream(A).
                boxed().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Integer, Long> Bmap = Arrays.stream(B).
                boxed().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int count = Arrays.stream(A).
                distinct().
                map(a -> (int) Math.min(Amap.get(a), Bmap.getOrDefault(a, 0L))).
                sum();


        if (count == A.length) count--;
        else count++;

        return count;

    }

}
