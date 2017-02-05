package com.codility.lessons.lesson2;

import java.util.Set;
import java.util.HashSet;

public class OddOccurrencesInArray {

    public int solution(int[] A) {

        Set<Integer> set = new HashSet<>();

        for(int i : A) {
            if(!set.remove(i)) {
                set.add(i);
            }
        }

        for(Integer result : set) {
            return result;
        }

        return 0;

    }
}
