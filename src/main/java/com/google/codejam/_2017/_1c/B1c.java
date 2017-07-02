package com.google.codejam._2017._1c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1c {


    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            int result;
            int Ac = in.nextInt();
            int Aj = in.nextInt();

            List<Activity> AcList = new ArrayList<>();
            List<Activity> AjList = new ArrayList<>();

            for (int j = 0; j < Ac; j++) {
                AcList.add(new Activity(in.nextInt(), in.nextInt()));
            }

            for (int j = 0; j < Aj; j++) {
                AjList.add(new Activity(in.nextInt(), in.nextInt()));
            }

            if (Ac > 0 && Aj > 0) {
                result = 2;
            } else if (Ac > 1) {
                if (isBackToBack(AcList)) {
                    result = 2;
                } else {
                    result = 4;
                }
            } else if (Aj > 1) {
                if (isBackToBack(AjList)) {
                    result = 2;
                } else {
                    result = 4;
                }
            } else{
                result = 2;
            }


            System.out.println("Case #" + i + ": " + result);

        }
    }

    private static boolean isBackToBack(List<Activity> list) {

        if((list.get(0).getStop() == list.get(1).getStart() || list.get(0).getStart() == list.get(1).getStop())) {
            return true;
        }

        if(list.get(0).getStart() < list.get(1).getStart()) {
            if(list.get(1).getStop() - list.get(0).getStart() <= 720) {
                return true;
            }
        } else{
            if(list.get(0).getStop() - list.get(1).getStart() <= 720) {
                return true;
            }
        }


        return false;

    }


    static class Activity {
        private int start;
        private int stop;


        Activity(int start, int stop) {
            this.start = start;
            this.stop = stop;
        }

        int getStart() {
            return start;
        }

        int getStop() {
            return stop;
        }
    }

}
