package com.hackerrank.algorithms.competitions.hour_rank_22;

import java.util.*;

public class SuperMancunian {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();


        Map<Integer, List<Edge>> graph = new HashMap<>(n);
        List<Edge> edges = new ArrayList<>(n);
        Map<Integer, Boolean> visited = new HashMap<>(n);


        for (int a0 = 0; a0 < m; a0++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int w = in.nextInt();

            edges.add(new Edge(a, b, w));

            List<Edge> listA = graph.get(a);

            if (listA == null) {
                listA = new ArrayList<>();
            }

            listA.add(new Edge(a, b, w));
            graph.put(a, listA);

            List<Edge> listB = graph.get(b);

            if (listB == null) {
                listB = new ArrayList<>();
            }

            listB.add(new Edge(b, a, w));
            graph.put(b, listB);
        }

        Collections.sort(edges);


        int minCost = 0;
        int counter = 0;
        int lastestValue = 0;
        int totalCounter = 0;

        for (Edge e : edges) {
            if (!visited.containsKey(e.a) || !visited.containsKey(e.b)) {
                minCost += e.w;
                counter++;
                lastestValue = e.w;
                visited.put(e.a, true);
                visited.put(e.b, true);
            }
            if (counter == n) {
                break;
            }
        }


        for (int i = 0; i < n; i++) {

            Edge e = edges.get(i);

            List<Edge> reducedList = new ArrayList<>(edges);
            reducedList.remove(i);
            reducedList.add(0, new Edge(e));


//            Map<Integer, List<Edge>> graphReduced = copy(graph);
//            graphReduced = removeEdge(graphReduced, e);
            visited = new HashMap<>(n);


            int minCost2 = 0;
            counter = 0;

            for (Edge ee : edges) {
                if (!visited.containsKey(ee.a) || !visited.containsKey(ee.b)) {
                    minCost2 += ee.w;
                    counter++;
                    visited.put(ee.a, true);
                    visited.put(ee.b, true);
                }
                if (counter == n) {
                    break;
                }
            }


            if (minCost2 == minCost) {
                totalCounter++;
            }


        }


        System.out.println(minCost - lastestValue + " " + (totalCounter - 1));

    }


    private static Map<Integer, List<Edge>> removeEdge(Map<Integer, List<Edge>> graphReduced, Edge e) {


        List<Edge> edgesA = graphReduced.get(e.a);
        edgesA.remove(e);

        List<Edge> edgesB = graphReduced.get(e.b);
        edgesB.remove(e);

        graphReduced.put(e.a, edgesA);
        graphReduced.put(e.b, edgesB);

        return graphReduced;

    }


    private static Map<Integer, List<Edge>> copy(Map<Integer, List<Edge>> graph) {

        Map<Integer, List<Edge>> copy = new HashMap<>();
        for (Map.Entry<Integer, List<Edge>> entry : graph.entrySet()) {
            copy.put(entry.getKey(), new ArrayList<>(entry.getValue()));
        }
        return copy;
    }


    private static class Edge implements Comparable<Edge> {

        int a;
        int b;
        int w;


        Edge(int a, int b, int w) {
            this.a = a;
            this.b = b;
            this.w = w;
        }

        Edge(Edge e) {
            this.a = e.a;
            this.b = e.b;
            this.w = 0;
        }

        @Override
        public int compareTo(Edge o) {
            if (w < o.w) return -1;
            if (w > o.w) return 1;
            return 0;
        }
    }
}
