package com.utils;

import java.util.Collection;

public class Utils {

    static int[] collectionIntegerToArrayInt(Collection<Integer> collection) {
        return collection.stream().mapToInt(i -> i).toArray();
    }


}
