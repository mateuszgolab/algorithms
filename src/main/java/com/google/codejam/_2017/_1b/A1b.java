package com.google.codejam._2017._1b;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class A1b {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            double d = in.nextDouble();
            int n = in.nextInt();

            List<Integer> k = new ArrayList<Integer>();
            List<Integer> s = new ArrayList<Integer>();

            for (int j = 0; j < n; j++) {
                k.add(in.nextInt());
                s.add(in.nextInt());
            }

            double totalTime = 0.0;

            if (n == 1) {
                double diff = d - k.get(0);
                totalTime = diff / s.get(0);
            } else {

                int j = 0;
                for (; j < n - 1; j++) {

                    if (Objects.equals(s.get(j), s.get(j + 1))) {
                        int minDistance = Math.min(k.get(j), k.get(j + 1));
                        double diff = d - minDistance;
                        totalTime += diff / s.get(j);
                        break;

                    } else {

                        double distance = k.get(j + 1) - k.get(j);
                        int speed = s.get(j) - s.get(j + 1);
                        double time = distance / speed;

                        if (totalTime < 0 || (k.get(j) + s.get(j) * time > d)) {
                            if (k.get(j) < k.get(j + 1)) {
                                double diff = d - k.get(j);
                                totalTime += diff / s.get(j);
                            } else {
                                double diff = d - k.get(j + 1);
                                totalTime += diff / s.get(j + 1);
                            }

                            break;

                        } else {
                            totalTime += time;
                        }
                    }
                }

                if (j == n - 1) {

//                    double slowSpeed = Math.min(s.get(n-2), s.get(n-1));
//                    double meetingPoint = k.get(0) + s.get(0) * time;

                    totalTime += (d - k.get(n - 1)) / s.get(n - 1);
                }
            }

            System.out.println("Case #" + i + ": " + new DecimalFormat("#0.000000").format(d / totalTime));

        }
    }

}
