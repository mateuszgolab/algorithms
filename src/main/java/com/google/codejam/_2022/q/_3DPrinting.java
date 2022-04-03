package com.google.codejam._2022.q;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3DPrinting {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            List<List<Integer>> paints = new ArrayList<>(3);
            for (int printer = 0; printer < 3; printer++) {
                List<Integer> printerData = new ArrayList<>(4);
                for (int color = 0; color < 4; color++) {
                    printerData.add(in.nextInt());
                }
                paints.add(printerData);
            }

            String output = _3DPrintingFunction(paints);
            System.out.println("Case #:" + i + output);

        }
    }

    static String _3DPrintingFunction(List<List<Integer>> paints) {

        int sum = 0;

        List<Integer> result = new ArrayList<>(4);
        for (int i = 0; i < 4; i++) {
            result.add(Math.min(Math.min(paints.get(0).get(i), paints.get(1).get(i)), paints.get(2).get(i)));
            sum += result.get(i);
        }

        if (sum >= 1000000) {
            int counter = 1000000;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                if (counter > 0) {
                    if (result.get(i) <= counter) {
                        sb.append(" ").append(result.get(i));
                        counter -= result.get(i);
                    } else {
                        sb.append(" ").append(counter);
                        counter -= result.get(i);
                    }
                } else {
                    sb.append(" 0");
                }
            }

            return sb.toString();

        } else return " IMPOSSIBLE";
    }
}
