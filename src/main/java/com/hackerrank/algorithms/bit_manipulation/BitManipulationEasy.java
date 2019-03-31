package com.hackerrank.algorithms.bit_manipulation;

import java.util.HashSet;
import java.util.Set;

class BitManipulationEasy {

    static int lonelyinteger(int[] a) {

        Set<Integer> set = new HashSet<>();

        for (int i : a) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }

        return set.iterator().next();

    }

}
