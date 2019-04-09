package com.google.codejam._2019.q;

import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            int n = in.nextInt();
            String p = in.next();
            String output = youCanGoYourOwnWay(n, p);

            System.out.println("Case #" + i + ": " + output);

        }
    }

    static String youCanGoYourOwnWay(int n, String p) {

        StringBuilder sb = new StringBuilder(2*n - 2);

        for(char c : p.toCharArray()){

            if(c == 'S') sb.append("E");
            else sb.append("S");

        }

        return sb.toString();

    }


}
