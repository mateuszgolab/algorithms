package com.google.codejam._2019._1c;

import java.util.*;

public class Solution2 {

    public static void main(String[] args) {

        System.out.println("Started");
        System.out.flush();

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            int f = in.nextInt();

            Map<Character, Integer> mapCharToInt = new HashMap<>();
            Map<Integer, Character> mapIntToChar = new HashMap<>();
            Set<Integer> requests = new HashSet<>();
            Random r = new Random();
            List<Character> letters = Arrays.asList('A','B', 'C', 'D', 'E');

            for(int j = 1; j <= f; j++){

                System.out.println(j);
                System.out.flush();

                String response = in.next();

                requests.add(j);
                mapCharToInt.put(response.charAt(0), j);
                mapIntToChar.put(j, response.charAt(0));

            }

            System.out.println("ABCDE");
            System.out.flush();

            in.next();

//            String output = powerArrangers(f);

//            System.out.println("Case #" + i + ": " + output);

        }
    }



}
