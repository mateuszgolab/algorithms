package com.hackerrank.algorithms.game_theory;

import java.util.Arrays;
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

    /**
     * 1 2 3 4 5 6 7 8
     * 1 L L W W L L W W
     * 2 L L W W L L W W
     * 3 W W W W W W W W
     * 4 W W W W W W W W
     * 5 L L W W L L W W
     * 6 L L W W L L W W
     * 7 W W W W W W W W
     */
    static String chessboardGame(int x, int y) {
        if (((x % 4) == 0 || (x % 4) == 3) || ((y % 4) == 0 || (y % 4) == 3)) return "First";
        return "Second";
    }


    static String nimGame(int[] pile) {

        int xor = Arrays.stream(pile).reduce((a, b) -> a ^ b).getAsInt();
        if (xor == 0) return "Second";
        else return "First";

    }

    static String misereNimGame(int[] pile) {

        int xor = Arrays.stream(pile).reduce((a, b) -> a ^ b).getAsInt();
        long count1 = Arrays.stream(pile).filter(p -> p == 1).count();

        if (count1 == pile.length) {
            if (count1 % 2 == 1) return "Second";
            else return "First";
        }
        if (xor == 0) return "Second";
        else return "First";

    }

}
