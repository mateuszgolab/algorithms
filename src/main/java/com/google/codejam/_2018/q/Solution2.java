package com.google.codejam._2018.q;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            int n = in.nextInt();
            List<Integer> list = new ArrayList<>(n);
            for (int j = 1; j <= n; j++) {
                list.add(in.nextInt());
            }

            List<Integer> result = troubleSort2(list);
            int firstUnsortedIndex = getUnsortedIndex(result, result.size() -1);

            if (firstUnsortedIndex < 0) {
                System.out.println("Case #" + i + ": OK");
            } else {
                System.out.println("Case #" + i + ": " + firstUnsortedIndex);
            }

        }

    }

    static List<Integer> troubleSort(List<Integer> list) {

        boolean done = false;

        while (!done) {

            done = true;

            for (int i = 0; i < list.size() - 2; i++) {
                if (list.get(i) > list.get(i + 2)) {
                    done = false;
                    Integer tmp = list.get(i);
                    list.set(i, list.get(i + 2));
                    list.set(i + 2, tmp);
                }
            }

        }

        return list;

    }


    static List<Integer> troubleSort2(List<Integer> list) {

        List<Integer> list1 = new ArrayList<>(list.size() / 2);
        List<Integer> list2 = new ArrayList<>(list.size() / 2);

        for(int i = 0; i < list.size(); i++) {
            if(i % 2 == 0) {
                list1.add(list.get(i));
            } else {
                list2.add(list.get(i));
            }
        }

        Collections.sort(list1);
        Collections.sort(list2);

        List<Integer> result = new ArrayList<>(list.size());

        for(int i = 0; i < list2.size(); i++) {
            result.add(list1.get(i));
            result.add(list2.get(i));
        }

        if(result.size() < list.size()) {
            result.add(list1.get(list1.size() - 1));
        }

        return result;

    }


    private static int getUnsortedIndex(List<Integer> list, int limit) {

        for (int i = 0; i < limit; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return i;
            }
        }

        return -1;

    }

}
