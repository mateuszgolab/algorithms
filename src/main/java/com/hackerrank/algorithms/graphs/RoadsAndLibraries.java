package com.hackerrank.algorithms.graphs;

import java.util.*;

public class RoadsAndLibraries {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int n = in.nextInt();
            int m = in.nextInt();
            long cityCost = in.nextInt();
            long roadCost = in.nextInt();

            Map<Integer, List<Integer>> graph = new HashMap<>(n);
            for (int i = 1; i <= n; i++) {
                graph.put(i, new ArrayList<>());
            }

            for (int a1 = 0; a1 < m; a1++) {
                int c1 = in.nextInt();
                int c2 = in.nextInt();

                graph.get(c1).add(c2);
                graph.get(c2).add(c1);
            }

            long result = 0;

            if (cityCost <= roadCost) {
                result = cityCost * n;
            } else {

                Map<Integer, Boolean> visited = new HashMap<>();
                Stack<Integer> stack = new Stack<>();
                for (int i = n; i > 0; i--) {
                    stack.push(i);
                    visited.put(i, false);
                }

                while (!stack.empty()) {
                    Integer node = stack.pop();
                    if (!visited.get(node)) {
                        long cost = cityCost;
                        for (int v : graph.get(node)) {
                            if (visited.get(v)) {
                                cost = roadCost;
                            } else {
                                stack.push(v);
                            }
                        }

                        visited.put(node, true);
                        result += cost;
                    }
                }
            }

            System.out.println(result);
        }

    }

}
