package com.google.codejam._2019._1c;

import java.util.*;

public class Solution1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            int a = in.nextInt();
            List<String> robots = new ArrayList<>();
            for (int j = 0; j < a; j++) {
                robots.add(in.next());
            }

            String output = robotProgrammingStrategy(robots);

            System.out.println("Case #" + i + ": " + output);

        }
    }

    static String robotProgrammingStrategy(List<String> robots) {

        Set<Character> currentMove = new HashSet<>();
        StringBuilder winningMove = new StringBuilder();

//         int maxLength = robots.stream().map(String::length).max(Integer::compareTo).get();

        // int limit = (int) (Math.log(robots.size() + 1) / Math.log(2));
        int i = 0;

//        for(int i = 0; i > 0; i++ ) {
        while (true) {

            for (String robot : robots) {
                currentMove.add(robot.charAt(i % robot.length()));
            }

            if (currentMove.size() == 3) {
                return "IMPOSSIBLE";
            } else if (currentMove.size() == 1) {
                if (currentMove.contains('R')) {
                    winningMove.append('P');
                } else if (currentMove.contains('P')) {
                    winningMove.append('S');
                } else if (currentMove.contains('S')) {
                    winningMove.append('R');
                }
                return winningMove.toString();
            } else {

                List<String> robotsCopy = new ArrayList<>();

                if (!currentMove.contains('P')) {
                    winningMove.append('R');
                    for (String robot : robots) {
                        if (robot.charAt(i % robot.length()) != 'S') {
                            robotsCopy.add(robot);
                        }
                    }
                } else if (!currentMove.contains('R')) {
                    winningMove.append('S');
                    for (String robot : robots) {
                        if (robot.charAt(i % robot.length()) != 'P') {
                            robotsCopy.add(robot);
                        }
                    }
                } else if (!currentMove.contains('S')) {
                    winningMove.append('P');
                    for (String robot : robots) {
                        if (robot.charAt(i % robot.length()) != 'R') {
                            robotsCopy.add(robot);
                        }
                    }
                }
                currentMove.clear();
                robots = robotsCopy;
                i++;

            }
        }

        // return winningMove.toString();

    }


}
