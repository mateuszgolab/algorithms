package com.utils;

import java.util.List;

public class Utils {

    static int[] listIntegerToArrayInt(List<Integer> list) {
        return list.stream().mapToInt(i -> i).toArray();
    }


}
