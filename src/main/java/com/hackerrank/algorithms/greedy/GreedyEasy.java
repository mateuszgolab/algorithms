package com.hackerrank.algorithms.greedy;


import java.util.*;
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

    static String decentNumber(int n) {

        if (n < 8 && (n % 3 > 0) && (n % 5 > 0)) return "-1";

        switch (n % 3) {
            case 0:
                return String.join("", Collections.nCopies(n / 3, "555"));
            case 1:
                return String.join("", Collections.nCopies((n - 10) / 3, "555")) + "3333333333";
            case 2:
                return String.join("", Collections.nCopies((n - 5) / 3, "555")) + "33333";
            default:
                return "-1";
        }

    }

    static int toys(int[] w) {

        Arrays.sort(w);

        int counter = 0;

        for (int i = 0; i < w.length; ) {
            counter++;
            int start = i;
            for (int j = start; j < w.length && (w[j] < (w[start] + 5)); j++) {
                i++;
            }
        }

        return counter;

    }

    static int[] largestPermutation(int k, int[] arr) {

        int[] sorted = Arrays.stream(arr).
                boxed().
                sorted(Comparator.reverseOrder()).
                mapToInt(i -> i).
                toArray();


        if (k >= arr.length) {
            return sorted;
        }


        Map<Integer, Integer> map = new HashMap<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }


        for (int i = 0; k > 0 && i < arr.length; i++) {
            int max = sorted[i];
            int index = map.get(max);

            if (i != index) {
                k--;
                arr[index] = arr[i];
                map.put(arr[i], index);
                arr[i] = max;

            }
        }

        return arr;

    }

    static int maximumToys(int[] prices, int k) {

        Arrays.sort(prices);

        int numberOfToys = 0;
        int counter = 0;

        for (int p : prices) {
            if (counter + p > k) return numberOfToys;
            numberOfToys++;
            counter += p;
        }

        return numberOfToys;
    }

    static int[] jimOrders(int[][] orders) {

        Set<Integer> summary = new HashSet<>(orders.length);
        Map<Integer, List<Integer>> mapSummaryToIndex = new HashMap<>();
        int i = 1;
        for (int[] o : orders) {
            int sum = o[0] + o[1];
            summary.add(sum);
            List<Integer> list = mapSummaryToIndex.getOrDefault(sum, new ArrayList<>());
            list.add(i++);
            mapSummaryToIndex.put(sum, list);
        }

        List<Integer> summaryList = new ArrayList<>(summary);
        Collections.sort(summaryList);
        int[] result = new int[orders.length];

        int counter = 0;
        for (int s : summaryList) {
            List<Integer> list = mapSummaryToIndex.get(s);
            Collections.sort(list);
            for (int l : list) {
                result[counter++] = l;
            }
        }

        return result;

    }

    static String twoArrays(int k, int[] A, int[] B) {

        Arrays.sort(A);
        B = Arrays.stream(B).
                boxed().
                sorted(Comparator.reverseOrder()).
                mapToInt(i -> i).
                toArray();

        for (int i = 0; i < A.length; i++) {
            if (A[i] + B[i] < k) return "NO";
        }

        return "YES";
    }

}
