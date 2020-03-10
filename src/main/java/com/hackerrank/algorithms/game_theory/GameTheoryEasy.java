package com.hackerrank.algorithms.game_theory;

import java.util.HashMap;
import java.util.Map;

class GameTheoryEasy {

    static String gameOfStones(int n) {

        Map<Integer, Boolean> map = new HashMap<>();
        map.put(1, false);

        for (int i = 2; i < 7; i++) {
            map.put(i, true);
        }

        if (n < 7) return map.get(n) ? "First" : "Second";

        for (int i = 7; i <= n; i++) {
            if (map.get(i - 5) && map.get(i - 3) && map.get(i - 2)) {
                map.put(i, false);
            } else {
                map.put(i, true);
            }
        }

        return map.get(n) ? "First" : "Second";

    }

    static int towerBreakers(int n, int m) {

        if (n % 2 == 0 || m == 1) return 2;
        else return 1;

    }

}
